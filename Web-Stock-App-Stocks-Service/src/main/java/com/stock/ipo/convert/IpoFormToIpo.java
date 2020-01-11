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
        ipo.setAmount(ipoForm.getAmount());
        ipo.setBusinessDesc(ipoForm.getBusinessDesc());
        ipo.setCeo(ipoForm.getCeo());
        ipo.setCity(ipoForm.getCity());
        ipo.setCompanyDesc(ipoForm.getCompanyDesc());
        ipo.setCompetition(ipoForm.getCompetition());
        ipo.setEmail(ipoForm.getEmail());
        ipo.setMarket(ipoForm.getMarket());
        ipo.setName(ipoForm.getName());
        ipo.setNetIncome(ipoForm.getNetIncome());
        ipo.setPercentOffered(ipoForm.getPercentOffered());
        ipo.setPriceHigh(ipoForm.getPriceHigh());
        ipo.setPriceLow(ipoForm.getPriceLow());
        ipo.setRevenue(ipoForm.getRevenue());
        ipo.setSharedOffered(ipoForm.getSharedOffered());
        ipo.setState(ipoForm.getState());
        ipo.setStockHolderEquity(ipoForm.getStockHolderEquity());
        ipo.setSymbol(ipoForm.getSymbol());
        ipo.setTotalAssets(ipoForm.getTotalAssets());
        ipo.setUrl(ipoForm);
        ipo.setUseOfProceeds(ipoForm.getUseOfProceeds());
        
        return ipo;
    }
}