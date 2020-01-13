package com.stock.history.service;

import com.stock.history.domain.ActivityHistory;

public interface ActivityHistoryService {

	public ActivityHistory addActivityHistory(final ActivityHistory activityHistory);
	
	public void removeActivityHistory(final String id);

	public ActivityHistory updateActivityHistory(final ActivityHistory activityHistory);
}
