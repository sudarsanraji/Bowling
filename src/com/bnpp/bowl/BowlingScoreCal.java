
/**
 * @author Venkat Raji
 *
 */

package com.bnpp.bowl;

import java.util.List;



public class BowlingScoreCal {
	
	int calculate(List<FrameDojo> frames) {
	    int totalScore = 0;
	    for (int index = 0; index < frames.size(); index++) {
	      totalScore += calculateEachFrame(frames, index);
	    }
	    return totalScore;
	  }


}
