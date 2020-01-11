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
        tag.setChange(tagForm.getChange());
        tag.setChangePercent(tagForm.getChangePercent());
        tag.setEmail(tagForm.getEmail());
        tag.setExchange(tagForm.getExchange());
        tag.setHigh(tagForm.getHigh());
        tag.setLatestPrice(tagForm.getLatestPrice());
        tag.setLow(tagForm.getLow());
        tag.setName(tagForm.getName());
        tag.setOpen(tagForm.getOpen());
        tag.setWeek52High(tagForm.getWeek52High());
        tag.setWeek52Low(tagForm.getWeek52Low());
        tag.setYtdChange(tagForm.getYtdChange());
        
        return tag;
    }
}