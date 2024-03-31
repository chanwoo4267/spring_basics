package com.example.springbasic.discount;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP는 10% DISCOUNT")
    void vip_o() {
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        int discounted = discountPolicy.discount(memberVIP, 10000);
        assertThat(discounted).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 X")
    void vip_x() {
        Member memberVIP = new Member(1L, "memberBASIC", Grade.BASIC);
        int discounted = discountPolicy.discount(memberVIP, 10000);
        assertThat(discounted).isEqualTo(0);
    }
}