package com.example.yunzhi.service.choreography.demo;

import com.alibaba.fastjson.JSON;
import com.taobao.pandora.boot.PandoraBootstrap;
import com.yunzhi.xiaoyuanhao.service.choreography.facade.ServiceChoreographyFacade;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Map;
import java.util.Objects;

@RestController
@SpringBootApplication
public class YunzhiServiceChoreographyDemoApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(YunzhiServiceChoreographyDemoApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }

    @Autowired
    private ServiceChoreographyFacade serviceChoreographyFacade;

    @RequestMapping("/test")
    public Object test() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("b.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
        String param = "{\"org_id\":\"440101-S000011\",\"user_id\":\"1B52BDB7FF2664D34AAC031B23BCC348B\"}";


        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }

    @RequestMapping("/test1")
    public Object test1() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("a.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
        String param = "{\"orgId\":\"440101-S000011\",\"isFetchParent\":false}";

        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }

    @RequestMapping("/test2")
    public Object test2() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("c.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
        String param = "{\"orgIds\":[\"440101-S000011\"]}";

        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }

    @RequestMapping("/test3")
    public Object test3() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("d.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
        String param = "{\"orgIds\":[\"440101-S000011\"]}";

        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }

    @RequestMapping("/test4")
    public Object test4() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("e.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
        String param = "{\"deptId\":\"228891204B02461B875CEE137E0EFF8B\",\"orgId\":\"440101-S000011\"}";

        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }

    @RequestMapping("/test5")
    public Object test5() throws Exception {
        String path = Objects.requireNonNull(YunzhiServiceChoreographyDemoApplication.class.getClassLoader().getResource("f.json")).getPath();
        File file = new File(path);
        String jsonStr = FileUtils.readFileToString(file);
//        String param = "{\"deptId\":[\"228891204B02461B875CEE137E0EFF8B\"],\"workContext\":{\"orgId\":\"440101-S000011\"}}";
        String param = "{\"userId\":\"769fe83321c34145bccc280be4aa59cd\",\"orgId\":\"440101-S000011\"}";

        Map<String, Object> process = serviceChoreographyFacade.process(jsonStr, param);
        System.out.println(JSON.toJSONString(process));
        return process;
    }
}