package com.revature.project2backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.CardLogic.Card52;
import com.revature.CardLogic.Deck52;

@SpringBootApplication
public class Project2BackendApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Project2BackendApplication.class, args);

		Deck52 deck1 = new Deck52().shuffle();
		Deck52 deck2 = new Deck52().shuffle();
		Deck52 deck3 = new Deck52().shuffle();
		Deck52 nonRandom = new Deck52();

		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);

		System.out.println(nonRandom);
	}
}
