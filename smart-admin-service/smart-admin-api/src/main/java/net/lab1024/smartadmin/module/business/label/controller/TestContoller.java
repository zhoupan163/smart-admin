package net.lab1024.smartadmin.module.business.label.controller;


import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.smartadmin.module.business.label.domain.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = {"标注具体任务"})
public class TestContoller {

    @Autowired
    MongoTemplate mongoTemplate;

    @ApiOperation(value = "增加任务",notes = "@author zhoup")
    @RequestMapping("/insert")
    public String insert() {
        Passenger passenger = new Passenger();
        passenger.setName("hello");
        passenger.setPassword("world1");
        passenger = mongoTemplate.insert(passenger);
        if (passenger != null) {
            return "success";
        } else {
            return "false";
        }
    }
    @ApiOperation(value = "查询任务",notes = "@author zhoup")
    @RequestMapping("/query")
    public String query() {
        Query query = Query.query(Criteria.where("name").is("hello").and("password").is("world1"));
        List<Passenger> passengers = mongoTemplate.find(query, Passenger.class);
        return passengers.size() + "";
    }

    @ApiOperation(value = "修改任务",notes = "@author zhoup")
    @RequestMapping("/update")
    public String update() {
        Query query = Query.query(Criteria.where("password").is("world1"));
        Update update = new Update();
        update.set("name", "world2");
        update.set("password", "world2");
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, Passenger.class);
        return "success";
    }
    @ApiOperation(value = "删除任务",notes = "@author zhoup")
    @RequestMapping("/remove")
    public String remove() {
        Query query = Query.query(Criteria.where("password").is("world1"));
        DeleteResult remove = mongoTemplate.remove(query, Passenger.class);
        return "success";
    }
}
