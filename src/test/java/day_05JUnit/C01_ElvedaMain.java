package day_05JUnit;

import org.junit.Ignore;
import org.junit.Test;

public class C01_ElvedaMain {

    @Test
    public void test01(){

        System.out.println("Test 1");

    }
    @Test @Ignore
    
    public void test02(){

        System.out.println("Test 2");

    }
    @Test
    public void test03(){

        System.out.println("Test 3");

    }
}
