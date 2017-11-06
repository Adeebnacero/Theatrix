package com.theatrix.controller;

import com.theatrix.domain.Customer;
import com.theatrix.domain.Theatre;
import com.theatrix.service.OnlineMovie.ImplService.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kino on 2017-11-06.
 */
@Controller
@RequestMapping(path="/Theatre")
public class TheatreController
{
    @Autowired
    private TheatreServiceImpl theatreService;


    @GetMapping(path="/add")
    public @ResponseBody
    String addNewTheatre(@RequestParam String name, @RequestParam String address, @RequestParam String maxAdience,
                          @RequestParam String minAdience) {

        Theatre theatre = new Theatre.Builder()
                .nameVal(name)
                .addressVal(address)
                .maxAdienceVal(maxAdience)
                .minAdienceVal(minAdience)
                .build();

        theatreService.save(theatre);
        return "Saved";
    }

    @GetMapping(path="/readOne")
    public @ResponseBody
    Theatre readOneTheatre(@RequestParam Long id) {

        return theatreService.findById(id);
    }

    @GetMapping(path="/update")
    public @ResponseBody
    String updateTheatre(@RequestParam long id, @RequestParam String name, @RequestParam String address,
                         @RequestParam String maxAdience, @RequestParam String minAdience) {

        Theatre theatre = new Theatre.Builder()
                .idVal(id)
                .nameVal(name)
                .addressVal(address)
                .maxAdienceVal(maxAdience)
                .minAdienceVal(minAdience)
                .build();

        theatreService.save(theatre);
        return "Saved";
    }


    @GetMapping(path="/delete")
    public @ResponseBody String deleteTheatre (@RequestParam Long id) {

        Theatre theatre =  theatreService.findById(id);
        theatreService.delete(theatre);

        return "deleted";
    }




}
