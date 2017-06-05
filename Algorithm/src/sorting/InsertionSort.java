package sorting;

import java.util.Scanner;

/**
 * [작성자]
 * minju Kim
 * 
 * [작성일]
 * 2017.06.05
 * 
 * [Insertion Sort]
 * 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 자신의 위치를 찾아 삽입하는 정렬 알고리즘
 * 
 * [시간 복잡도]
 * 전체 원소의 개수가 n이라고 할 때, 총 비교 횟수는 1 + 2 + ... + (n-1)
 * O(n^2)
 * */

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//테스트 케이스 입력
		int n = scan.nextInt();
		
		int[] data = new int[n];
		
		//데이터 입력
		for(int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		
		//크기 비교를 위해 임시 저장 변수 생성
		int temp = 0;
		
		for(int i = 1; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if(data[j-1] > data[j]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				} else break;
				//왼쪽은 이미 정렬되어 있기 때문에 바로 전 요소보다 큰 경우에는 바로 루프 탈출
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
}
