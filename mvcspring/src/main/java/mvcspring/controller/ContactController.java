package mvcspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvcspring.model.User;
import mvcspring.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonData(Model model) {

		model.addAttribute("Header", "register to lern spring mvc");
		model.addAttribute("desc", "with jack");
	}

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public
	 * String handleForm( HttpServletRequest req){ String
	 * email=req.getParameter("email");
	 * System.out.println("mail id is : "+email); return ""; }
	 */
	// alternative way

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST)
	 * public String handleForm(@RequestParam("email") String
	 * email, @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String password,Model model) {
	 * System.out.println("email is : "+email);
	 * System.out.println("username  : "+userName);
	 * System.out.println("user password  : "+password); User user=new User();
	 * user.setEmail(email); user.setUserName(userName);
	 * user.setPassword(password);
	 * 
	 * System.out.println(user);
	 * 
	 * model.addAttribute("userName",userName); model.addAttribute("email",
	 * email); model.addAttribute("password",password);
	 * 
	 * model.addAttribute("user",user); return "success"; }
	 */

	// another alternative way

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println("by the help of model attribute");
		System.out.println(user);
		
		this.userService.createUser(user);
		return "success";
	}

}
