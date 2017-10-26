package com.cts.controller;


import com.cts.pojo.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping("/vehicle_info")
    public ModelAndView getVehicleInfo(){
        ModelAndView view=new ModelAndView("index");
        Vehicle vehicle=new Vehicle("yamaha","bike",2);
        view.addObject("myObj",vehicle);
        return view;

    }
}
