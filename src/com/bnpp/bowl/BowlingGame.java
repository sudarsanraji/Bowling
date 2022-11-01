/**
 * @author Venkat Raji
 *
 */
package com.bnpp.bowl;

public class BowlingGame {
	
	  int getScore(String input) {
		    FramesBuilder framesBuilder = new FramesBuilder();
		    BowlingScoreCal bowlingCalculator = new BowlingScoreCal();
		    return bowlingCalculator.calculate(framesBuilder.build(input));
		  }


}