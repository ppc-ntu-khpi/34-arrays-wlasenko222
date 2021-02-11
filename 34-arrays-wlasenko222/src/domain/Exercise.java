package domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise {
	
	private static final ThreadLocalRandom rnd = ThreadLocalRandom.current();
	
	/**
	 * Створює массив за вказаною довжиною і генерує його значення
	 * @param size довжина массива
	 * @return массив
	 */
	public static int[] generateArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt(10);
		}
		return array;
	}
	
	/**
	 * Знаходить в массиві число, яке повторюється найбільшу кількість разів
	 * 
	 * @param arr массив
	 * @return Повертає число, яке в массиві повторюються найбільшу кількість разів
	 */
	public static int find(int[] arr) {
		Map<Integer, Integer> nums = new HashMap<>();
		for (int number : arr) {
			Integer i = nums.get(number);
			nums.put(number, i == null ? 1 : i+1);
		}
		
		int max = Collections.max(nums.values());
		for (Map.Entry<Integer, Integer> number : nums.entrySet()) {
			if (number.getValue() == max)
				return number.getKey();
		}
		return -1;
	}
}
