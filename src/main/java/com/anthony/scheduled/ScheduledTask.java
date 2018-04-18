package com.anthony.scheduled;

import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@PropertySource("classpath:config.yml")
@Component
public class ScheduledTask {

//    private int i=1;

    @Scheduled(cron = "${bbbb}" )
    public void test()
    {
        System.out.println("tttttttttttttttttttttt");
    }
}
