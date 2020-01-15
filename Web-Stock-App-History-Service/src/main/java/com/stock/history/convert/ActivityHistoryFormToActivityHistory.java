//package com.stock.history.convert;
//
//import org.bson.types.ObjectId;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.util.StringUtils;
//
//import com.stock.history.command.ActivityHistoryForm;
//import com.stock.history.domain.ActivityHistory;
//
//public class ActivityHistoryFormToActivityHistory implements Converter<ActivityHistoryForm, ActivityHistory> {
//
//    @Override
//    public ActivityHistory convert(ActivityHistoryForm activityHistoryForm) {
//    	ActivityHistory activityHistory = new ActivityHistory();
//        if (activityHistoryForm.getId() != null  && !StringUtils.isEmpty(activityHistoryForm.getId())) {
//        	activityHistory.setId(new ObjectId(activityHistoryForm.getId()));
//        }
//        activityHistory.setAction(activityHistoryForm.getAction());
//        activityHistory.setEmail(activityHistoryForm.getEmail());
//        activityHistory.setTimeOfAction(activityHistoryForm.getTimeOfAction());
//        
//        return activityHistory;
//    }
//}