package com.gwanghyeonkim7.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	Logger logger =
			LoggerFactory.getLogger(this.getClass());
			
	
	//shift + alt + A : 열편집
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!"); //개발단계어서 확인용
		log.info("info!"); // 운용 상 필요한 정보
		log.warn("warning!"); // 메모리 문제 등 경고
		log.error("error!"); // 치명적인 오류
		
		return "home";
	}
}