package theory.sorting;

import java.util.Scanner;

/**
 * [작성자]
 * minju Kim
 * 
 * [작성일]
 * 2017.06.05
 * 
 * [Merge Sort]
 * 분할정복법에 근거하여 전체 데이터를 하나의 단위로 분할한 후 분할한 데이터를 다시 병합하는 정렬 알고리즘
 * 
 * [시간 복잡도]
 * O(n*logn)
 * */

public class MergeSort {

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
		mergeSort(data, 0, n-1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void mergeSort(int[] data, int left, int right) {
		
		//최소 단위가 아니면 계속 분할
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(data, left, mid);
			mergeSort(data, mid+1, right);
			
			//분할 후 병합 시작
			merge(data, left, mid, right);
		}
	}
	
	public static void merge(int[] data, int left, int mid, int right) {
		
		int i = left;
		int j = mid+1;
		int k = left;
		
		//병합 하면서 사용할 임시 저장 변수 생성
		int[] temp = new int[data.length];
		
		//왼쪽 블록과 오른쪽 블록 비교, 둘 중 작은 것부터 차례대로 temp[]에 저장
		while(i <= mid && j <= right) {
			if(data[i] < data[j]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[j++];
			}
		}
		
		//왼쪽 블록의 모든 요소는 temp[]에 저장되었으나 오른쪽 블록의 요소가 남아있는 경우 -> 차례대로 temp[]에 이어서 저장
		if(i > mid) {
			for(int a = j; a <= right; a++) {
				temp[k++] = data[a];
			}
		} else { //오른쪽 블록의 모든 요소는 temp[]에 저장되었으나 왼쪽 블록의 요소가 남아있는 경우 -> 차례대로 temp[]에 이어서 저장
			for(int a = i; a <= mid; a++) {
				temp[k++] = data[a];
			}
		}
		
		//temp[]를 data[]로 복사
		for(int a = left; a <= right; a++) {
			data[a] = temp[a];
		}
	}
}
