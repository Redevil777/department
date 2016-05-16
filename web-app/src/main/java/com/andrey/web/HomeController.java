package com.andrey.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Created by kobri on 16.05.2016.
 */

@Controller
@RequestMapping("/home")
public class HomeController {

    private Logger LOGGER = LogManager.getLogger(HomeController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home(){

        LOGGER.debug("home page");
        return "homepage";
    }
}
