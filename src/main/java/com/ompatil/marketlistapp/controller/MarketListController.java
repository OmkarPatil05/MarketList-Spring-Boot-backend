package com.ompatil.marketlistapp.controller;

import com.ompatil.marketlistapp.entity.MarketList;
import com.ompatil.marketlistapp.service.MarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class MarketListController {

    @Autowired
    MarketListService marketListService;

    @GetMapping("/marketlist")
    public List<MarketList> fetchAllMarketList(){
        return marketListService.fetchAllMarketList();
    }

    @PostMapping("/marketlist")
    public MarketList saveMarketList(@RequestBody MarketList marketList){
        return marketListService.saveMarketList(marketList);
    }

    @DeleteMapping("/marketlist/{id}")
    public String deleteMarketListById(@PathVariable("id") Long id){
         marketListService.deleteMarketListById(id);
        return "List Deleted Successfully";
    }
}
