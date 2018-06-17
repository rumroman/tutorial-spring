package com.rum.web;


import com.rum.model.Contact;
import com.rum.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView("all");
        modelAndView.addObject("contacts",contactService.getAll());

        return modelAndView;
    }

    @RequestMapping(value ="/add",method = RequestMethod.GET)
    public ModelAndView showAddForm(){
        return new ModelAndView("add_form","contact", new Contact());
    }

    @RequestMapping(value="/eddit",method = RequestMethod.GET)
    public ModelAndView showEditForm(@RequestParam(required = true) String id){
        return new ModelAndView("add_form","contact",contactService.get(id));
    }


}
