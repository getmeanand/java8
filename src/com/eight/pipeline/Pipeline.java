package com.eight.pipeline;

import java.util.Optional;

public class Pipeline {

	public static void main(String[] args) {
		// TODO: get an input String
		// 		 take two chars from that string
		//		 convert into upper-case
		// 		 check it has a character 'S'
		//	     Replace with 'A'
		
		String input = "This is a line";

		System.out.println(
				
				Optional.ofNullable(input)
						.map(fetchTwo -> fetchTwo.substring(5, 7))
						.map(upper -> upper.toUpperCase())
						.filter(checkS -> checkS.contains("S"))
						.map(replaceS -> replaceS.replace('S', 'A'))
						.orElse("default")
			);
	}

}
