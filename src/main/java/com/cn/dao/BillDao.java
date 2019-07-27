package com.cn.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 19:22
 */
@Repository//
public class BillDao {
    public void pay(Double money){
        System.out.println("bill dao.....");
        System.out.println("支付："+money);
    }
}
