package theory.sorting;

import java.util.Scanner;

/**
 * [�ۼ���]
 * minju Kim
 * 
 * [�ۼ���]
 * 2017.06.05
 * 
 * [Merge Sort]
 * ������������ �ٰ��Ͽ� ��ü �����͸� �ϳ��� ������ ������ �� ������ �����͸� �ٽ� �����ϴ� ���� �˰���
 * 
 * [�ð� ���⵵]
 * O(n*logn)
 * */

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//�׽�Ʈ ���̽� �Է�
		int n = scan.nextInt();
		
		int[] data = new int[n];
		
		//������ �Է�
		for(int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		
		//���� ȣ��
		mergeSort(data, 0, n-1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void mergeSort(int[] data, int left, int right) {
		
		//�ּ� ������ �ƴϸ� ��� ����
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(data, left, mid);
			mergeSort(data, mid+1, right);
			
			//���� �� ���� ����
			merge(data, left, mid, right);
		}
	}
	
	public static void merge(int[] data, int left, int mid, int right) {
		
		int i = left;
		int j = mid+1;
		int k = left;
		
		//���� �ϸ鼭 ����� �ӽ� ���� ���� ����
		int[] temp = new int[data.length];
		
		//���� ��ϰ� ������ ��� ��, �� �� ���� �ͺ��� ���ʴ�� temp[]�� ����
		while(i <= mid && j <= right) {
			if(data[i] < data[j]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[j++];
			}
		}
		
		//���� ����� ��� ��Ҵ� temp[]�� ����Ǿ����� ������ ����� ��Ұ� �����ִ� ��� -> ���ʴ�� temp[]�� �̾ ����
		if(i > mid) {
			for(int a = j; a <= right; a++) {
				temp[k++] = data[a];
			}
		} else { //������ ����� ��� ��Ҵ� temp[]�� ����Ǿ����� ���� ����� ��Ұ� �����ִ� ��� -> ���ʴ�� temp[]�� �̾ ����
			for(int a = i; a <= mid; a++) {
				temp[k++] = data[a];
			}
		}
		
		//temp[]�� data[]�� ����
		for(int a = left; a <= right; a++) {
			data[a] = temp[a];
		}
	}
}
