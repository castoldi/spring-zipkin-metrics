package com.castoldi.zipkin.service;

import org.springframework.cloud.sleuth.annotation.NewSpan;

public interface IProcess1Service {

	@NewSpan
	void process1();

}