package controller;

import model.People;
import model.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<People> listPeople = peopleService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listPeople", listPeople);
        return mav;
    }

    @RequestMapping("/new")
    public String newCustomerForm(Map<String, Object> model) {
        People people = new People();
        model.put("people", people);
        return "new_people";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("people") People people) {
        peopleService.save(people);
        return "redirect:/";
    }
}
