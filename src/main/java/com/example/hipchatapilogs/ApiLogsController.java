package com.example.hipchatapilogs;

import com.example.hipchatapilogs.beans.InputBean;
import com.example.hipchatapilogs.beans.ResponseBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiLogsController {

	private RestTemplate restTemplate = new RestTemplate();

	@PostMapping("/addlogs1")
	public String addLog(@RequestBody InputBean inputBean) {

		return "hello Chetan " + inputBean.toString();
	}

	@PostMapping("/newlog")
	//	@ResponseStatus(HttpStatus.LENGTH_REQUIRED)
	public ResponseBean hello(@RequestBody InputBean roomBean) {

		ResponseBean responseBean = ResponseBean.builder()
				.color("blue")
				.message("Pahoch gaya bhai pahoch gya..!!")
				.notify("false")
				.message_format("text").build();
		return responseBean;

		//		restTemplate.getForObject("https://rakuten.hipchat.com/v2/room/3414429/notification?auth_token=ZSoNLeJr0d8Nte6gJ3qoXknq6xgzOem6ANzO3NXO",ResponseBean.class);
	}
}


