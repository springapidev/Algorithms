package com.coderbd.quiz19.controller;


import com.coderbd.quiz19.entity.Question;
import com.coderbd.quiz19.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;


@Controller
@RequestMapping("/ques/")
public class QuestionController {
    @Autowired
    private QuestionRepo repo;

    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Question());
        modelAndView.setViewName("questions/create");
        return modelAndView;
    }

    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid Question obj, BindingResult bindingResult) {
        ModelAndView modelAndView=new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("questions/create");
        } else {
                repo.save(obj);
                modelAndView.addObject("successMessage", "Insert Success");
            }
            modelAndView.addObject("obj", new Question());
            modelAndView.setViewName("questions/create");
        return modelAndView;
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Long id, Model model) {
        Optional<Question> obj1 = repo.findById(id);
        model.addAttribute("obj",obj1);
        return "questions/create";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/ques/create";
    }

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("questions/list");
        return modelAndView;
    }
}
