package theory.sorting;

import java.util.Scanner;

/**
 * [�ۼ���]
 * minju Kim
 * 
 * [�ۼ���]
 * 2017.06.05
 * 
 * [Quick Sort]
 * ������������ �ٰ��Ͽ� ��ü �����͸� �� �κ����� �����ϰ� ������ pivot���� �񱳸� ��������� ȣ���ϴ� ���� �˰���
 * 
 * [�ð� ���⵵]
 * ���: O(n*logn)
 * �־�: O(n^2)
 * */

public class QuickSort {

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
		quickSort(data, 0, n-1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void quickSort(int[] data, int left, int right) {
		
		int i = left;
		int j = right;
		
		//pivot ���� ����
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
		
		//���ҵ� �κп� ���� ��� ȣ��(pivot���� ���� �迭�� ������ �迭)
		if(j > left) quickSort(data, left, j);
		if(i < right) quickSort(data, i, right);
	}
}
