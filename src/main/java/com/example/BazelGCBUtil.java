/* 
 utility class that does uninteresting things but can be included as a
 dependency for testing
 */

package com.example;

class BazelGCBUtil {
	
	// utility to concatenate strings (yes, it's silly)
	public static String concat(String s1, String s2) {
		return s1 + s2;
	}
}