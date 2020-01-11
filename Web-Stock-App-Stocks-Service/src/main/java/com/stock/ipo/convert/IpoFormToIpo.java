package com.stock.ipo.convert;

import org.bson.types.ObjectId;
import org.springframework.util.StringUtils;

import com.stock.ipo.command.IpoForm;
import com.stock.ipo.domain.Ipo;

import org.springframework.core.convert.converter.Converter;

public class IpoFormToIpo implements Converter<IpoForm, Ipo> {

    @Override
    public Ipo convert(IpoForm ipoForm) {
    	Ipo ipo = new Ipo();
        if (ipoForm.getId() != null  && !StringUtils.isEmpty(ipoForm.getId())) {
            ipo.setId(new ObjectId(ipoForm.getId()));
        }
        ipo.setAmount(ipo.getAmount());
        ipo.setBusinessDesc(ipo.getBusinessDesc());
        ipo.setCeo(ipo.getCeo());
        ipo.setCity(ipo.getCity());
        ipo.setCompanyDesc(ipo.getCompanyDesc());
        ipo.setCompetition(ipo.getCompetition());
        ipo.setEmail(ipo.getEmail());
        ipo.setMarket(ipo.getMarket());
        ipo.setName(ipo.getName());
        ipo.setNetIncome(ipo.getNetIncome());
        ipo.setPercentOffered(ipo.getPercentOffered());
        ipo.setPriceHigh(ipo.getPriceHigh());
        ipo.setPriceLow(ipo.getPriceLow());
        ipo.setRevenue(ipo.getRevenue());
        ipo.setSharedOffered(ipo.getSharedOffered());
        ipo.setState(ipo.getState());
        ipo.setStockHolderEquity(ipo.getStockHolderEquity());
        ipo.setSymbol(ipo.getSymbol());
        ipo.setTotalAssets(ipo.getTotalAssets());
        ipo.setUrl(ipo.getUrl());
        ipo.setUseOfProceeds(ipo.getUseOfProceeds());
        
        return ipo;
    }
}