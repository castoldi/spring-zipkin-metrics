package com.castoldi.zipkin.service;

import org.springframework.cloud.sleuth.annotation.NewSpan;

public interface IProcess2Service {

	@NewSpan
	void process2();

}