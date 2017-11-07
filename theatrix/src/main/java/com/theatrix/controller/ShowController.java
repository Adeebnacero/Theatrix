package com.theatrix.controller;

import com.theatrix.domain.Show;
import com.theatrix.service.OnlineMovie.ImplService.ShowServicesImpl;
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
@RequestMapping(path="/show")
public class ShowController
{
    @Autowired
    private ShowServicesImpl showService;


    @GetMapping(path="/add")
    public @ResponseBody
    String addNewShow(@RequestParam String showDate, @RequestParam String startTime, @RequestParam String endTime,
                         @RequestParam Long MovieId) {

        Show show = new Show.Builder()
                .showDate(showDate)
                .startTimeVal(startTime)
                .endTimeVal(endTime)
                .movieVal(MovieId)
                .build();

        showService.save(show);
        return "Saved";
    }


    @GetMapping(path="/readOne")
    public @ResponseBody
    Show readOneShow (@RequestParam Long id) {

        return showService.findById(id);
    }

    @GetMapping(path="/update")
    public @ResponseBody
    String updateShow(@RequestParam Long id, @RequestParam String showDate, @RequestParam String startTime,
                      @RequestParam String endTime, @RequestParam Long MovieId) {

        Show show = new Show.Builder()
                .id(id)
                .showDate(showDate)
                .startTimeVal(startTime)
                .endTimeVal(endTime)
                .movieVal(MovieId)
                .build();

        showService.save(show);
        return "updated";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteShow (@RequestParam Long id) {

        Show show = showService.findById(id);
        showService.delete(show);

        return "deleted";
    }

}
