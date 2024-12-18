package com.my_day_data_service.service.mongodb;

import com.my_day_data_service.service.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public String retrieveData() {
        return "Run in the morning";
    }
}
