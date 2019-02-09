// Temple A. Corson IV
// NID: te789951
// Assignment 7: RunLikeHell
// Due: 04/23/2017
// COP 3503, Spring 2017

import java.io.*;
import java.lang.*;
import java.util.*;


public class RunLikeHell
{

public static int maxGain(int [] blocks)
{

	int n = blocks.length;		//size of blocks array

	if(n < 1)					//dont start iteration if there are one or no elements in the blocks array
		return 0;
	else if(n < 2)
		return blocks[0];
	else
	{
		//array to hold gain values for the number of elements in a blocks array
		int [] array = new int[n + 1]; 		

		array[0] = 0;					//a blocks array with 0 elements has no gain
		array[1] = blocks[0];			//single element blocks array gain is equal to that element
	
		//iterative loop to continously find and placve the maximum gains into the array
		//build from bottom up using the max gains from early elements to inform
		//the max gains of coming elements, as apposed to the recursive solution where we started 
		//with the later element, then used the two previous elments to find the max gain
		for(int i=2;i<=n;i++)
			array[i] = Math.max((array[i-1]), (array[i-2] + blocks[i-1]));

		return array[n];
	}

}



/*
public static int maxGainRE(int [] blocks)
{
	// front door method to feed the recursive method
	int gain = 0;
	return maxGain(blocks, gain, blocks.length);
}

private static int maxGainRE(int [] blocks, int gain, int k)
{
	if(k <= 0)
		return gain;		//when there are no more blocks, stop and return what we have

	//pop off two recursive calls, one for if we take the current block and one if we leave it
	//return the max of those recursive trees

	gain = Math.max((maxGain(blocks, (gain + blocks[k-1]), (k - 2))), (maxGain(blocks, gain, (k - 1))));

	return gain;
}
*/

public static double difficultyRating()
{
	return 3.5;
}

public static double hoursSpent()
{
	return 12.4;
}


}


















