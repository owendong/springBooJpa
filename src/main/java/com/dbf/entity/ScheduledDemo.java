package com.dbf.entity;

import com.dbf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledDemo {

    @Autowired
    private UserService us;

    /*
    *  定时任务
    *   @Scheduled 设置定时任务
    *   cron 表达式 来定义触发的时间
    * */
    @Scheduled(cron = "0/2 * * * * ?" )
    public void  scheduledMethod(){
        System.out.println("定时器触发");
        us.getCron();
    }


}
