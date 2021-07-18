package com.ompatil.marketlistapp.service;

import com.ompatil.marketlistapp.entity.MarketList;

import java.util.List;

public interface MarketListService {
    public List<MarketList> fetchAllMarketList();
    public MarketList saveMarketList(MarketList markList);
    public void deleteMarketListById(Long id);
}
