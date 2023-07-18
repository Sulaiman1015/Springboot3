package com.sm.features;

import com.sm.features.bean.Employee;
import com.sm.features.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootFeaturesApplicationTests {

    @Autowired
    ApplicationContext ac;
    @Test
    void testProfiles() {
        Employee em = new Employee(1,"Tim","man");
        User u = new User(2,"Tom","man");

        String[] profiles = ac.getEnvironment().getActiveProfiles();
        List<String> list = Arrays.asList(profiles);
        //System.out.println(profiles[0]);
        if(list.contains("dev")){
            System.out.println(em);
        }
        if(list.contains("test")){
            System.out.println(u);
        }

    }

}
