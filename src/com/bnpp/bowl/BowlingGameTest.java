

/**
 * @author Venkat Raji
 *
 */


package com.bnpp.bowl;

public class BowlingGameTest {
	
	private BowlingGame bowlingGame;

	  @Before
	  public void setUp() throws Exception {
	    bowlingGame = new BowlingGame();
	  }

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


}
