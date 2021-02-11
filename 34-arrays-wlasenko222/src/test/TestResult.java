package test;

import java.util.Arrays;

import static domain.Exercise.*;

public class TestResult {

    public static void main(String[] args) {
    	int[] arr = generateArray(10);
		System.out.println(Arrays.toString(arr));
		
		int count = find(arr);
		System.out.println(count);
    }
}
