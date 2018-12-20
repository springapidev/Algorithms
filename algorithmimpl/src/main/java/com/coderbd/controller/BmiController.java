package com.coderbd.controller;


import com.coderbd.entity.Bmi;
import com.coderbd.repo.BmiRepo;
import com.coderbd.service.UserService;
import com.coderbd.utils.LoggedInUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.Optional;


@Controller
@RequestMapping("/bmi/")
public class BmiController {
    @Autowired
    private BmiRepo repo;

    @Autowired
    private LoggedInUser loggedInUser;

    @Autowired
    private UserService userService;

    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METER_PER_INCH = 0.0254;
    final double POUNDS_PER_KILOGRAMS = 2.20462;


    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Bmi());
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("bmi/create");
        return modelAndView;
    }

    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public String saveOrUpdate(@Valid @ModelAttribute("obj") Bmi obj, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "bmi/create";
        } else {
            double weightInKilograms = obj.getWeight() * KILOGRAMS_PER_POUND;
            double heightInMeter = obj.getHeight() * METER_PER_INCH;
            double bmi = weightInKilograms / (heightInMeter * heightInMeter);
            obj.setBmiScore(bmi);
            if (bmi < 18.5) {
                obj.setStatus("Underweight");
               obj.setNeedToIncreaseWeight((18.5 - bmi) * ( heightInMeter * heightInMeter)* POUNDS_PER_KILOGRAMS);
            } else if (bmi < 25) {
                obj.setStatus("Healthy");
            } else if (bmi < 30) {
                obj.setStatus("Overweight");
                obj.setNeedToReduceWeight((25 - bmi) * ( heightInMeter * heightInMeter) * POUNDS_PER_KILOGRAMS  );
            } else {
                obj.setStatus("Obecity");
                obj.setNeedToReduceWeight((25 - bmi) * ( heightInMeter * heightInMeter) * POUNDS_PER_KILOGRAMS);
            }
            obj.setMeasureDate(new Date());
            repo.save(obj);
            model.addAttribute("obj", obj);
            model.addAttribute("successMessage", "Insert Success");
            model.addAttribute("list", repo.findAll());
            return "bmi/create";
        }
    }


    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Long id, Model model) {
        Optional<Bmi> obj1 = repo.findById(id);
        model.addAttribute("obj", obj1);
        return "bmi/create";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/bmi/create";
    }
}


