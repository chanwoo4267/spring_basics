package com.example.springbasic;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import com.example.springbasic.member.MemberServiceImpl;
import com.example.springbasic.member.MemberService;
import com.example.springbasic.order.Order;
import com.example.springbasic.order.OrderService;
import com.example.springbasic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appconfig = new AppConfig();
        MemberService memberService = appconfig.memberService();
        OrderService orderService = appconfig.orderService();

        Long memberID = 1L;
        Member member = new Member(memberID, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberID, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("calculatedPrice = " + order.calculatePrice());
    }
}
