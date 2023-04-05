package com.castoldi.zipkin.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class Process2Service implements IProcess2Service {
	private final RandomService randomService;

	@Override
	public void process2() {
		log.debug("process 2 is starting");
		randomService.sleep();
	}
}
