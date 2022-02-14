package com.wz.mall.coupon.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ward.wang
 * @since 2022/1/5 21:10
 */

public class test {
 public static void main(String[] args) {
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  Date now = new Date();
  String format = sdf.format(now);
  System.out.println(format);
 }
}
