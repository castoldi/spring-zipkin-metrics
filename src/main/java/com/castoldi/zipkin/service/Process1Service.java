package com.castoldi.zipkin.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class Process1Service implements IProcess1Service {
	private final RandomService randomService;
	private final Process2Service process2Service;

	@Override
	public void process1() {
		log.debug("process 1 is starting");
		randomService.sleep();
		
		process2Service.process2();
	}
}
