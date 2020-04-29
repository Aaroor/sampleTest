package com.test.sampleTest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sampleTest.request.CardRequest;
import com.test.sampleTest.response.Response;

@RestController
@RequestMapping("/api")
public class RestServiceController {
	@PostMapping(value = "/add-cart-payment")
	public Response addCartPayment(@ModelAttribute CardRequest request, HttpServletRequest serveletRequest) {
		System.out.println("Request : "+request);
		Response response = new Response("Done", request);
		return response;
	}
}
