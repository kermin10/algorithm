package theory.sorting;

import java.util.Scanner;

/**
 * [작성자]
 * minju Kim
 * 
 * [작성일]
 * 2017.06.05
 * 
 * [Quick Sort]
 * 분할정복법에 근거하여 전체 데이터를 두 부분으로 분할하고 설정한 pivot과의 비교를 재귀적으로 호출하는 정렬 알고리즘
 * 
 * [시간 복잡도]
 * 평균: O(n*logn)
 * 최악: O(n^2)
 * */

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//테스트 케이스 입력
		int n = scan.nextInt();
		
		int[] data = new int[n];
		
		//데이터 입력
		for(int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		
		//최초 호출
		quickSort(data, 0, n-1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void quickSort(int[] data, int left, int right) {
		
		int i = left;
		int j = right;
		
		//pivot 임의 설정
		int pivot = data[(left+right)/2];
		
		do {
			while(data[i] < pivot) i++;
			while(data[j] > pivot) j--;
			if(i <= j) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		} while(i <= j);
		
		//분할된 부분에 대한 재귀 호출(pivot기준 왼쪽 배열과 오른쪽 배열)
		if(j > left) quickSort(data, left, j);
		if(i < right) quickSort(data, i, right);
	}
}
