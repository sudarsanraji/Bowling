
/**
 * @author Venkat Raji
 *
 */


package com.bnpp.bowl;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * This test class is created to define a test cases using junit framework.
 * we cover the all required cases
 *
 */


public class BowlingGameTest {

	private BowlingGame bowlingGame;

	  @Before
	  public void setUp() throws Exception {
	    bowlingGame = new BowlingGame();
	  }

	  @Test
	  public void noSpareAndNoStrike() throws Exception {
	    int score = bowlingGame.getScore("12345123451234512345");

	    assertThat(score, is(60));
	  }

	  
	  @Test
	  public void allStrikes() throws Exception {
	    int score = bowlingGame.getScore("XXXXXXXXXXXX");

	    assertThat(score, is(300));
	  }

	  @Test
	  public void allSpares() throws Exception {
	    int score = bowlingGame.getScore("5/5/5/5/5/5/5/5/5/5/5");

	    assertThat(score, is(150));
	  }

	  @Test
	  public void ninePinsDownEachRound() throws Exception {
	    int score = bowlingGame.getScore("9-9-9-9-9-9-9-9-9-9-9");

	    assertThat(score, is(90));
	  }

	  @Test
	  public void compoundedCase() throws Exception {
	    int score = bowlingGame.getScore("125-3/XX12345123XXX");

	    assertThat(score, is(113));
	  }

}
