//package com.stock.history.convert;
//
//import org.springframework.core.convert.converter.Converter;
//
//import com.stock.history.command.ActivityHistoryForm;
//import com.stock.history.domain.ActivityHistory;
//
//public class ActivityHistoryToActivityHistoryForm implements Converter<ActivityHistory, ActivityHistoryForm> {
//    @Override
//    public ActivityHistoryForm convert(ActivityHistory activityHistory) {
//    	
//    	ActivityHistoryForm activityHistoryForm = new ActivityHistoryForm();
//    	activityHistoryForm.setId(activityHistory.getId().toHexString());
//    	activityHistoryForm.setAction(activityHistory.getAction());
//    	activityHistoryForm.setEmail(activityHistory.getEmail());
//    	activityHistoryForm.setTimeOfAction(activityHistory.getTimeOfAction());
//    	
//    	return activityHistoryForm;
//    }
//}
