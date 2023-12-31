package com.laioffer.foodMaster.controller;


import com.laioffer.foodMaster.entity.MenuItem;
import com.laioffer.foodMaster.entity.Restaurant;
import com.laioffer.foodMaster.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class MenuInfoController {

    @Autowired
    private MenuInfoService service;

    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuItem> getMenus(@PathVariable(value = "restaurantId") int restaurantId) {
        return service.getAllMenuItem(restaurantId);
    }



    /*
    @ResponseBody
    Use the @ResponseBody annotation on a method to
    indicate that the return value should be
    written straight to the HTTP response body,
    and it will be automatically convert to
    json format.

     */
    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants(){
        return service.getRestaurants();
    }
}
