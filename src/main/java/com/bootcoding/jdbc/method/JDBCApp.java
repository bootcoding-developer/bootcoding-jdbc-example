package com.bootcoding.jdbc.method;

import java.util.Map;

public class JDBCApp {
    public static void main(String[] args) {
        JdbcUsingMethod jum = new JdbcUsingMethod();
        Map<Integer, Integer> salesmanCountMap = jum.getCustomerCountBySalesmanId();

        for(Integer key : salesmanCountMap.keySet()){
            Integer value = salesmanCountMap.get(key);
            System.out.println("KEY="+ key + " and Value = " + value);
        }
        System.out.println("");
    }
}
