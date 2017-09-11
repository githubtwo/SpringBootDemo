package com.zick.controller;

import java.util.List;

import com.zick.common.ServerResponse;
import com.zick.model.User;
import com.zick.service.IRedisService;
import com.zick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ExampleController {

	@Autowired
	private UserService userService;

	@Resource
	private StringRedisTemplate redis;

	@Autowired
	private IRedisService redisService;
	
	@RequestMapping("/getAll")
	public ServerResponse<List<User>> users(){
		ServerResponse<List<User>> listServerResponse = userService.getAll();
		return listServerResponse;
	}
	
	@GetMapping("/redis/set")
	public ServerResponse redisSet(@RequestParam("value")String value){
		redis.boundValueOps( "name").set(value);
	//	boolean isOk = redisService.set("name", value);
		//if(isOk){
			return ServerResponse.createBySuccessMessage("set Successful");
	/*	}
		return ServerResponse.createByErrorMessage("set Fail");*/
	}
	
	@GetMapping("/redis/get")
	public ServerResponse redisGet(){
		String name = redis.boundValueOps( "name").get();//redisService.get("name");
		return ServerResponse.createBySuccessMessage(name);
	}
	
}
