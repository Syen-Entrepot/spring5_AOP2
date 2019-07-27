package com.cn;

import com.cn.config.SpringConfig;
import com.cn.dao.BillDao;
import com.cn.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 19:07
 */
public class TestConfig {
    @Test
    public void m1(){
        //如何获取上下文对象
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
      Girl girl=  context.getBean("girl",Girl.class);
      System.out.println(girl.getName());

    }
    @Test
    public void m2(){
        //如何获取上下文对象
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BillService billService=context.getBean("billService",BillService.class);
        BillDao billDao=context.getBean("billDao",BillDao.class);
        billService.setBillDao(billDao);
        billService.pay(33.0);


    }
    @Test
    public void m3(){
        //如何获取上下文对象
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BillService billService=context.getBean("billService",BillService.class);

        billService.pay(33.0);


    }
}
