package com.skcc.lazybook.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skcc.lazybook.sample.service.SampleService;
/**
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/sample/*")
public class SampleController {

    // applcation.properties에서 읽어온 property 값 
    @Value("${application.message:Hello World}")
    private String propertyMessage;

    @Autowired
    private SampleService service;

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    // (샘플 1) 리턴타입 String
    @RequestMapping("/first")
    public String sampleFirst(Model model) {

        String serviceMessage = service.doSomethingWithSample();
        // Logback logger 활용한 로그 찍기
        logger.debug("myMessage:{}", propertyMessage);

        model.addAttribute("propertyMessage", propertyMessage);
        model.addAttribute("serviceMessage", serviceMessage);


        // src/main/webapp/WEB-INF/jsp/ 경로 아래, "sample".jsp 로 변형하여 실행
        return "sampleFirst";
    }

    // (샘플 2) 리턴 타입 ModelAndView
    @RequestMapping(value = "/second")
    public ModelAndView sampleSecond() {

        ModelAndView view = new ModelAndView();
        view.setViewName("sampleSecond");
        view.addObject("title", "푸른 푸른 푸른 하늘");
        view.addObject("number", 100);

        return view;
    }

}