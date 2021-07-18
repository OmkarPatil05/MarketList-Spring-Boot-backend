package com.ompatil.marketlistapp.service;

import com.ompatil.marketlistapp.entity.MarketList;
import com.ompatil.marketlistapp.repository.MarketListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketListServiceImpl implements MarketListService{

    @Autowired
    MarketListRepository marketListRepository;

    @Override
    public List<MarketList> fetchAllMarketList() {
        return marketListRepository.findAll();
    }

    @Override
    public MarketList saveMarketList(MarketList markList) {
        return marketListRepository.save(markList);
    }

    @Override
    public void deleteMarketListById(Long id) {
         marketListRepository.deleteById(id);
    }


}
