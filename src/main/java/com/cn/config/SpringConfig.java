package com.cn.config;

import com.cn.Girl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 19:10
 */
@Configuration
@ComponentScan(value = "com.cn")
public class SpringConfig {

    @Bean("girl")
public Girl createGirl(){
    Girl g=new Girl();
    g.setName("happy");
    return g;
}
/*@Bean("billService")
public BillService createBillService(){

        BillService billService=new BillService();
        return billService;

}
@Bean("billDao")
public BillDao createBillDao(){
        BillDao billDao=new BillDao();
        return billDao;
}*/

}
