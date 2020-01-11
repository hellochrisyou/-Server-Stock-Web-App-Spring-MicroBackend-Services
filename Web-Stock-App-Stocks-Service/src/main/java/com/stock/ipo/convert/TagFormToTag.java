package com.stock.ipo.convert;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.stock.ipo.command.TagForm;
import com.stock.ipo.domain.Tag;

public class TagFormToTag implements Converter<TagForm, Tag> {

    @Override
    public Tag convert(TagForm tagForm) {
        Tag tag = new Tag();
        if (tagForm.getId() != null  && !StringUtils.isEmpty(tagForm.getId())) {
            tag.setId(new ObjectId(tagForm.getId()));
        }
        tag.setChange(tag.getChange());
        tag.setChangePercent(tag.getChangePercent());
        tag.setEmail(tag.getEmail());
        tag.setExchange(tag.getExchange());
        tag.setHigh(tag.getHigh());
        tag.setLatestPrice(tag.getLatestPrice());
        tag.setLow(tag.getLow());
        tag.setName(tag.getName());
        tag.setOpen(tag.getOpen());
        tag.setWeek52High(tag.getWeek52High());
        tag.setWeek52Low(tag.getWeek52Low());
        tag.setYtdChange(tag.getYtdChange());
        
        return tag;
    }
}