package sorting;

import java.util.Scanner;

/**
 * [�ۼ���]
 * �����
 * 
 * [�ۼ���]
 * 2017.06.05
 * 
 * [Bubble Sort]
 * ������ �� ���� ���Ͽ� ū ���� �ڷ� ������ ������ ���� �˰���
 * 
 * [�ð� ���⵵]
 * ��ü ������ ������ n�̶�� �� ��, �� �� Ƚ���� (n-1) + (n-2) + ... + 1
 * O(n^2)
 * */

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//�׽�Ʈ ���̽� �Է�
		int n = scan.nextInt();
		
		int[] data = new int[n];
		
		//������ �Է�
		for(int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		
		//ũ�� �񱳸� ���� �ӽ� ���� ���� ����
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) {
				if(data[j-1] > data[j]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
			//�� ���� �� ������ ���� ū ���� �����ʿ� ä������ ������ ���Ŀ��� �� ��󿡼� ����
		}
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
}
