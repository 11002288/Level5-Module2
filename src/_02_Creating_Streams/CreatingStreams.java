package _02_Creating_Streams;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
		//1. Create a stream out of the following collections.
	public static void main(String[] args) {
		String[] strArr = {"one", "two", "three", "four"};
		Stream.of(strArr);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.stream();
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.stream();
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		dQueue.stream();
	}
}
