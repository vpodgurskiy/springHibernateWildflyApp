package controller;

import model.People;
import model.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
}
