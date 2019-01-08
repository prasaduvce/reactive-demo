package com.example.spring.reactive.reactivedemo.client;

public class ClientCaller {

	public static void main(String[] args) {

		GreetingWebClient greetingWebClient = new GreetingWebClient();
		System.out.println("Reactive Response ===> " + greetingWebClient.getResult());

	}
}
