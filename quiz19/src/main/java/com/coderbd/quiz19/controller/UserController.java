package com.coderbd.quiz19.controller;


import com.coderbd.quiz19.entity.Privilize;
import com.coderbd.quiz19.entity.Role;
import com.coderbd.quiz19.entity.User;
import com.coderbd.quiz19.repo.PrivilizeRepo;
import com.coderbd.quiz19.repo.RoleRepo;
import com.coderbd.quiz19.repo.UserRepo;
import com.coderbd.quiz19.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.*;


@Controller
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    RoleRepo roleRepo;

    @Autowired
    UserRepo userRepo;
@Autowired
    PrivilizeRepo privilizeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @RequestMapping(value = "/user/create.do", method = RequestMethod.GET)
    public ModelAndView getuser(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.addObject("users", service.getAllUsers(page, perPage));
        modelAndView.addObject("allRoles", roleRepo.findAll());

        Set<Privilize> privilizes=new HashSet<>();
        privilizes.add(new Privilize("READ"));
        privilizes.add(new Privilize("WRITE"));
        privilizeRepo.saveAll(privilizes);

        List<Role> roleList=new ArrayList<>();
        Role role=new Role("ADMIN");
        role.setPrivilizes(privilizes);
        roleList.add(role);
        Role role2=new Role("USER");
        role2.setPrivilizes(privilizes);
        roleList.add(role2);
        roleRepo.saveAll(roleList);

        List<User> users=new ArrayList<>();
        Set<Role> roles=new HashSet<>();
        roles.add(new Role("ADMIN"));
                  //(String userName,String password, String firstName, String lastName, String email,String mobile, Date joiningDate, boole
        users.add(new User("admin",passwordEncoder.encode("12345678"),"Rajaul", "Islam","rajaul.cse@gmail.com", "01686239146",new Date(),true, "0","0",roles));
        users.add(new User("sami",passwordEncoder.encode("12345678"),"Samiun", "Islam","sami.cse@gmail.com", "01686239145",new Date(),true, "0","0",roles));
        userRepo.saveAll(users);



        modelAndView.setViewName("create-user");
        return modelAndView;
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public ModelAndView saveuser(@Valid User user, BindingResult bindingResult, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage, @RequestParam("checkRoles") String[] markedRoles) {

        Set<Role> roles = new HashSet<>();
        for (String s : markedRoles) {
            Role role = new Role();
            role.setId(Long.parseLong(s));
            roles.add(role);
        }
        user.setRoles(roles);
       user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setJoiningDate(new Date());
        user.setActivated(true);
        ModelAndView modelAndView = new ModelAndView();
        User userNameExit = service.isUserNameAlreadyExist(user.getUserName());
        User emailExit = service.isEmailAlreadyExist(user.getEmail());
        User mobileExit = service.isMobileAlreadyExist(user.getMobile());
        System.out.println("===== " + user.getRoles().toString());
        if (userNameExit != null  && user.getId() == null) {
            bindingResult.rejectValue("userName", "error.user", "This User Name already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }else if (emailExit != null  && user.getId() == null) {
            bindingResult.rejectValue("email", "error.user", "This Email already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }else if (mobileExit != null  && user.getId() == null) {
            bindingResult.rejectValue("mobile", "error.user", "This Mobile Number already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }

        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("create-user");
        } else {
            if (user.getId() != null) {
                service.update(user);
                modelAndView.addObject("successMessage", "Update Success");

            } else {
                service.save(user);
                modelAndView.addObject("successMessage", "Insert Success");

            }


            modelAndView.addObject("user", new User());
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
            modelAndView.setViewName("create-user");

        }

        return modelAndView;
    }

    @RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
    public String updateuser(@PathVariable Long id, Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        Optional<User> user1 = service.getUser(id);
        User user = new User();
        user.setRoles(user1.get().getRoles());
        user.setId(id);
        System.out.println("======" + user.getId() + ", " + user.getUserName());
        model.addAttribute("user", user);
        model.addAttribute("users", service.getAllUsers(page, perPage));
        model.addAttribute("allRoles", roleRepo.findAll());
        return "create-user";
    }

    @RequestMapping(value = "/user/del/{id}", method = RequestMethod.GET)
    public String deluser(@PathVariable Long id, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        service.delete(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        modelAndView.addObject("users", service.getAllUsers(page, perPage));
        modelAndView.addObject("allRoles", roleRepo.findAll());
        return "redirect:/user/create";
    }



}