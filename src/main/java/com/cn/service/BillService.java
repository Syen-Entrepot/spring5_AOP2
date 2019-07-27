package com.cn.service;

import com.cn.dao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 19:21
 */
@Service
public class BillService {
    @Autowired//自动注入billDao对象
    private BillDao billDao;

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }

    public void pay(Double money){
        System.out.println("bill service pay");
        billDao.pay(money);
    }

}
