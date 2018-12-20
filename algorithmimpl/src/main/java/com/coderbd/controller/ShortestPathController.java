package com.coderbd.controller;

import com.coderbd.entity.ShortestPath;
import com.coderbd.repo.ShortestPathRepo;
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
@RequestMapping("/shortestpath/")
public class ShortestPathController {
    @Autowired
    private ShortestPathRepo repo;

    @Autowired
    private LoggedInUser loggedInUser;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new ShortestPath());
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("shortestpaths/create");
        return modelAndView;
    }

    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public String saveOrUpdate(@Valid @ModelAttribute("obj") ShortestPath obj, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "shortestpaths/create";
        } else {
            repo.save(obj);
            model.addAttribute("obj", obj);
            model.addAttribute("successMessage", "Insert Success");
            model.addAttribute("list", repo.findAll());
            return "shortestpaths/create";
        }
    }


    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Long id, Model model) {
        Optional<ShortestPath> obj1 = repo.findById(id);
        model.addAttribute("obj", obj1);
        return "shortestpaths/create";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/shortestpath/create.do";
    }
}


