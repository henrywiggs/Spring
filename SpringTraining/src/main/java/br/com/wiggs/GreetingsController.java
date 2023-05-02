package br.com.wiggs;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class GreetingsController {

	private static String template = "Hello, %s!";
	private static AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greetings")
	public Greetings greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greetings(counter.incrementAndGet(), String.format(template, name));
	}
	
}
