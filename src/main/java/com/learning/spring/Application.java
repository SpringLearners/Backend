package com.learning.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Application {

	//Rozwiązanie prawie dobre, wyodrębnij to do odzielnnej klasy, Spróbuj wykorzystać @RequestMapping do pozbycia się (/hello) z
	//każdej metody
	@RestController
	public class MyController {
		
		// Zrób jak Beti by było world i parametry w jednym
		@RequestMapping(path = "/hello", method = RequestMethod.GET)
		public String hello() {
			return "Hello Word!";
		}
		@RequestMapping(path = "/hello/greetings", method = RequestMethod.GET)
		public String method(@RequestParam (value="name", defaultValue = "World")String zmienna) {
			return "Hello "+zmienna;
		}
		@RequestMapping(path = "/hello/post", method = RequestMethod.POST)
		public String answerPost(@RequestBody String name) {

			return "Hello "+name;
		}
		@RequestMapping(path = "/hello/greetings2", method = RequestMethod.GET)
		public String method2(@RequestParam (value="name", defaultValue = "World") String zmienna,@RequestParam(value="name2",defaultValue = "World")String zmienna2) {
			return "Hello "+zmienna+" "+zmienna2;
		}

		// Dorzuć kontroę błędów i będzie ok :)
		@RequestMapping(path = "/task/second", method =RequestMethod.GET)
		public String method3(@RequestParam (value="name", defaultValue = "World") String zmienna) {
			int repeat = Integer.parseInt(zmienna);
			String out="lo";
			for (int i = 0; i <repeat ; i++) {
				out+="o";
			}
			out+="ng word";
			return out;
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
