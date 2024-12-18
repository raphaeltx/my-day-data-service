package com.my_day_data_service.service.insight;

import com.my_day_data_service.service.DataService;
import org.springframework.stereotype.Component;

@Component
public class InsightService {

    private DataService dataService;

    public InsightService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public String findInsight() {
        return dataService.retrieveData();
    }
}
