package com.stock.history.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.domain.ActivityHistory;
import com.stock.history.repository.ActivityHistoryRepository;
import com.stock.history.service.ActivityHistoryService;

@Service
public class ActivityHistoryServiceImpl implements ActivityHistoryService {

	@Autowired
	private ActivityHistoryRepository activityHistoryRepository;
    
    @Override
    public ActivityHistory addActivityHistory(final ActivityHistory activityHistory) {
        return activityHistoryRepository.save(activityHistory); 
    }

    @Override
    public void removeActivityHistory(final String id) {
        activityHistoryRepository.deleteById(id);
    }
}
