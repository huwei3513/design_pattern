package com.huwei.platform.designpattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternApplicationTests {

    @Test
    public void contextLoads() {
        int[] a = {1,9,4,3,7,9,0,2,5,7,8,6};
        for(int i =0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] >a[j]){
                   int tem = a[i] ;
                   a[i] = a[j];
                   a[j] = tem;
                }
            }
        }
        Arrays.stream(a).forEach(i ->{
            System.out.println(i);
        });
    }

}
