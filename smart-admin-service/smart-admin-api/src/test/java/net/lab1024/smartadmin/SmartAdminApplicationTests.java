package net.lab1024.smartadmin;


import net.lab1024.smartadmin.common.domain.ResponseDTO;
import net.lab1024.smartadmin.module.business.label.domain.entity.Passenger;
import net.lab1024.smartadmin.module.business.label.domain.entity.LabelTaskDetail;
import net.lab1024.smartadmin.module.business.label.service.LabelTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SmartAdminApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SmartAdminApplicationTests {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void insert() {
        Passenger passenger = new Passenger();
        passenger.setName("nice to meet you");
        passenger.setPassword("world11111");
        passenger = mongoTemplate.insert(passenger);
        if (passenger != null) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
    }
    @Test
    public void query(){
        Query query = Query.query(Criteria.where("name").is("hello").and("password").is("world1"));
        List<Passenger> passengers = mongoTemplate.find(query, Passenger.class);
        Query query1 = Query.query(Criteria.where("passworld").is("world1111"));
        List<Passenger> passengers1 = mongoTemplate.find(query1, Passenger.class);
        System.out.println("success");
    }

    @Test
    public void insertTaskImages() {
        LabelTaskDetail taskDetail=new LabelTaskDetail();
        taskDetail.setTaskId("test0804");
        List<String> list=new ArrayList<>();
        list.add("https://v.jisheji.com/mediapack?id=348");
        list.add("https://img2.baidu.com/it/u=1728522718,1340994382&fm=26&fmt=auto&gp=0.jpg");
        list.add("https://img1.baidu.com/it/u=4041949070,2271085536&fm=11&fmt=auto&gp=0.jpg");
        taskDetail.setTaskImages(list);
        taskDetail=mongoTemplate.insert(taskDetail);
        System.out.println("succ");
    }

    @Test
    public void quereTaskImages() {
        Query query=Query.query(Criteria.where("taskId").is("test0804"));
        List<LabelTaskDetail> list=mongoTemplate.find(query, LabelTaskDetail.class);
        System.out.println("succ");
    }
    @Autowired
    private LabelTaskService labelTaskService;
    @Test
    public  void test1(){
        ResponseDTO<LabelTaskDetail> ressult=labelTaskService.queryTaskDetail("test0804");
        System.out.println("succ");
    }


}
