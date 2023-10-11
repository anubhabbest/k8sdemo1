package com.gl.CollegeFestDebateSpring.boot.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.mockito.Mockito;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class QuickBeforeAfterTest {
//
//    @BeforeClass
//    public static void ClassSetup(){
//        System.out.println("before class");
//    }
//
//    @BeforeEach
//    public void setup(){
//        System.out.println("before code");
//    }
//
//    @Test
//    void truncateAInFirst2Positions() {
//        System.out.println("test1 ");
//    }
//
//    @Test
//    void areFirstAndLastTwoCharactersTheSame() {
//        System.out.println("test2 ");
//    }
//
//    @Test
//    void arrayTest(){
//        int[] arr1 = {3,2,1,4};
//        int[] exp = {1,2,3,4};
//        Arrays.sort(arr1);
//        assertArrayEquals(exp, arr1);
//    }
//
//    @Test
//    @Timeout(value = 10,unit = TimeUnit.MILLISECONDS)
//    public void performance(){
//        int[] arr = {5,4,3,2,1};
//        for(int i=0;i<100000;i++)
//        {
//            arr[0] = i;
//            Arrays.sort(arr);
//        }
//    }
}