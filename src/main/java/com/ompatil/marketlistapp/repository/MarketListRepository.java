package com.ompatil.marketlistapp.repository;

import com.ompatil.marketlistapp.entity.MarketList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketListRepository extends JpaRepository<MarketList,Long> {
}
