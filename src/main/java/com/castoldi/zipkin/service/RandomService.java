package com.castoldi.zipkin.service;

import java.util.Random;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class RandomService {

	private static final int MAX_MILLISECONDS = 3000;
	private static final int MIN_MILLISECONDS = 500;
	private final Random random;

	@NewSpan
	public void sleep() {
		try {
			int timeInMilliseconds = generateNextInt();
			log.info("Sleeping {} ms", timeInMilliseconds);
			Thread.sleep(timeInMilliseconds);
		} catch (InterruptedException e) {
			log.error("Error on random sleep", e);
		}
	}

	@NewSpan
	public int generateNextInt() {
		return random.nextInt(MAX_MILLISECONDS - MIN_MILLISECONDS) + MIN_MILLISECONDS;
	}

}
