package com.coderbd.quiz19.controller;


import com.coderbd.quiz19.entity.Category;
import com.coderbd.quiz19.entity.Level;
import com.coderbd.quiz19.entity.Question;
import com.coderbd.quiz19.entity.QuestionStatus;
import com.coderbd.quiz19.repo.CategoryRepo;
import com.coderbd.quiz19.repo.LevelRepo;
import com.coderbd.quiz19.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Controller
@RequestMapping("/ques/")
public class QuestionController {
    @Autowired
    private QuestionRepo repo;
    @Autowired
    private LevelRepo levelRepo;
//@RequestParam("cateID") String categoryID,@RequestParam("levID") String levelID,@RequestParam("typ") String qtype
    @Autowired
    private CategoryRepo categoryRepo;

    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Question());
        modelAndView.addObject("catlist", categoryRepo.findAll());
//        Category category=new Category();
//        category.setId(Long.parseLong(categoryID));
//        if(category.getId() != null ){
//            modelAndView.addObject("levList", levelRepo.findAllByCategory(category));
//        }

        modelAndView.addObject("types", QuestionStatus.values());
        modelAndView.setViewName("questions/create");
        return modelAndView;
    }

    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid Question obj, BindingResult bindingResult,@RequestParam("cateID") String categoryID,@RequestParam("typ") String qtype) {
        System.out.println(obj);
        System.out.println("categoryID: "+categoryID);
        System.out.println("qtype: "+qtype);
        ModelAndView modelAndView=new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("questions/create");
        } else {
                repo.save(obj);
                modelAndView.addObject("successMessage", "Insert Success");
            }
            modelAndView.addObject("obj", new Question());
        modelAndView.addObject("catlist", categoryRepo.findAll());
        modelAndView.addObject("levList", levelRepo.findAll());
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


    @PostMapping("/getLevels")
    public @ResponseBody
    Map<String, String> getCategoryLevelValues(@RequestParam("catID") String  categoryID) {
        Map<String, String> levelValues = new HashMap<>();

        Category category=new Category();
        category.setId(Long.parseLong(categoryID));

         List<Level> list=levelRepo.findAllByCategory(category);


        for(Level level : list){
            levelValues.put(String.valueOf(level.getId()), level.getName());
        }

        return levelValues;
    }

}
