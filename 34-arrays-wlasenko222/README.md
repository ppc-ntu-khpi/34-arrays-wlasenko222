# Практична робота "Масиви, вирази, керування виконанням програми"

## Завдання: Знайти в масиві число, яке повторюється найбільшу кількість разів

### Методи классу ```Exercise```
<details>
  <summary>find</summary>
	
  ```java
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
  ```
  
</details>
<details>
  <summary>generateArray</summary>
	
  ```java
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
  ```
  
</details>

Результат:
----

![Gitter](https://github.com/ppc-ntu-khpi/34-arrays-coldbeatz/blob/master/Screenshot_17.png)<br><br>
![Gitter](https://github.com/ppc-ntu-khpi/34-arrays-coldbeatz/blob/master/Screenshot_18.png)<br><br>
![Gitter](https://github.com/ppc-ntu-khpi/34-arrays-coldbeatz/blob/master/Screenshot_20.png)<br>
