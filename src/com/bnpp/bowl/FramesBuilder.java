
/**
 * @author Venkat Raji
 *
 */


package com.bnpp.bowl;

import java.util.ArrayList;
import java.util.List;

import static com.bnpp.bowl.BowlingConstantCls.STRIKE_SIGNAL;


public class FramesBuilder {
	
	 private static final String EMPTY = "";

	  List<FrameDojo> build(String input) {
	    String[] records = input.split(EMPTY);
	    List<FrameDojo> frames = new ArrayList<>();
	    int index = 0;
	    for (; index < records.length - 1; index++) {
	      if (frames.size() == 10) {
	        break;
	      }
	      frames.add(buildFrame(records, index));
	      if (!isStrike(records[index])) {
	        index++;
	      }
	    }
	    if (hasBonus(index, records.length)) {
	      frames.add(createBonusFrame(records, index));
	    }
	    return frames;
	  }


}
