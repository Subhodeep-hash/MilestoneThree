package com.example.RelationalDBAPI.Controller;

import com.example.RelationalDBAPI.Model.RequestObjectSearch;
import com.example.RelationalDBAPI.Model.RequestObjectShow;
import com.example.RelationalDBAPI.Model.ResponseObjectShow;
import com.example.RelationalDBAPI.Service.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class NetflixController {

    @Autowired ServiceUtils service;

    @PostMapping("/netflix/addShows")
    public void addShow(@RequestBody RequestObjectShow show){
        service.saveShows(show);
    }

    @PostMapping("/netflixSearch")
    public ResponseObjectShow getResources(@RequestBody RequestObjectSearch title){
        ResponseObjectShow responseObjectShow = service.getResources(title);
        return responseObjectShow;
    }
}
