package com.coderbd.quiz19.controller;


import com.coderbd.quiz19.entity.Category;
import com.coderbd.quiz19.entity.Level;
import com.coderbd.quiz19.repo.CategoryRepo;
import com.coderbd.quiz19.repo.LevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.Optional;


@Controller
@RequestMapping("/level/")
public class LevelController {
    @Autowired
    private LevelRepo repo;

    @Autowired
    private CategoryRepo categoryRepo;

    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Level());
        modelAndView.addObject("catlist", categoryRepo.findAll());
        System.out.println("size: "+categoryRepo.findAll().size());
        modelAndView.setViewName("level/create");
        return modelAndView;
    }

    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid Level obj, BindingResult bindingResult, @RequestParam("catID") String categoryID) {
        ModelAndView modelAndView=new ModelAndView();
        Category category=new Category();
        category.setId(Long.parseLong(categoryID));
        obj.setCategory(category);
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("level/create");
        } else {
                repo.save(obj);
                modelAndView.addObject("successMessage", "Insert Success");
            }
            modelAndView.addObject("obj", new Level());
            modelAndView.setViewName("level/create");
        return modelAndView;
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Long id, Model model) {
        Optional<Level> obj1 = repo.findById(id);
        model.addAttribute("obj",obj1);
        return "level/create";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/level/create";
    }

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("level/list");
        return modelAndView;
    }
}
