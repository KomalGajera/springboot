package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import springboot.entiry.Users;
import springboot.service.UserService;

@Controller
public class UserController {
	 
	
	  @Autowired  
	   UserService userService;	 
	  
	  
      @GetMapping("/")
      public String alluser(Model model) {
    	  model.addAttribute("users", userService.getUser());
          return "show-user";
      }
      
	  
	  @GetMapping("/signup")
	    public String showSignUpForm(Users user) {
	        return "add-user";
	    }
	  
	  
      @PostMapping("/adduser")
      public String addUser(Users user, BindingResult result, Model model) {           
          userService.createUser(user);
          model.addAttribute("users", userService.getUser());
          return "show-user";
      }
      
      @GetMapping("/delete/{userId}")
      public String deleteUser(@PathVariable("userId") long id, Model model) {
          Users user = userService.findById(id);
           
          userService.delete(user);
          model.addAttribute("users", userService.getUser());
          return "show-user";
      }
    
      @PostMapping("/update/{userId}")
      public String updateUser(@PathVariable("userId") long userid,Users user, 
        BindingResult result, Model model) {
         user.setUserId(userid);  
          userService.createUser(user);
          model.addAttribute("users", userService.getUser());
          return "index";
      }
      
      @GetMapping("/edit/{userId}")
      public String showUpdateForm(@PathVariable("userId") long id, Model model) {
          Users user = userService.findById(id);   
          System.out.println("password is"+user.getPassword());
          model.addAttribute("users", user);
          return "add-user";
      }
  	
	  
}
