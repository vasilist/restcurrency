package com.comquent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 20.10.2016.
 */
@RestController
public class ExchangeController {
public static final String SVC_PATH_USD="/usd/exchange-rate";
    public static final String SVC_PATH_PLN="/pln/exchange-rate";

    @RequestMapping(value=SVC_PATH_USD, method=RequestMethod.GET )
    public String getUsd(){return "1.00";}

    @RequestMapping(value=SVC_PATH_PLN, method=RequestMethod.GET )
    public String getPln(){return "not supported";}
}
