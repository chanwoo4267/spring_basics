package com.example.springbasic;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import com.example.springbasic.member.MemberService;
import com.example.springbasic.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  MemberApp {
    public static void main(String[] args) {
//        AppConfig appconfig = new AppConfig();
//        MemberService memberService = appconfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member result = memberService.findMember(1L);
        System.out.println("new member = " + memberA.getName());
        System.out.println("find member = " + result.getName());
    }
}
