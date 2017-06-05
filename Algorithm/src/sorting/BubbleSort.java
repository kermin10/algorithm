package sorting;

import java.util.Scanner;

/**
 * [작성자]
 * 김민주
 * 
 * [작성일]
 * 2017.06.05
 * 
 * [Bubble Sort]
 * 인접한 두 수를 비교하여 큰 수를 뒤로 보내는 간단한 정렬 알고리즘
 * 
 * [시간 복잡도]
 * 전체 원소의 개수가 n이라고 할 때, 총 비교 횟수는 (n-1) + (n-2) + ... + 1
 * O(n^2)
 * */

public class BubbleSort {

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
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) {
				if(data[j-1] > data[j]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
			//한 바퀴 돌 때마다 가장 큰 수가 오른쪽에 채워지기 때문에 이후에는 비교 대상에서 제외
		}
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
}
