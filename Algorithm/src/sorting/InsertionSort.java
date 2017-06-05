package sorting;

import java.util.Scanner;

/**
 * [�ۼ���]
 * minju Kim
 * 
 * [�ۼ���]
 * 2017.06.05
 * 
 * [Insertion Sort]
 * �迭�� ��� ��Ҹ� �տ������� ���ʴ�� �̹� ���ĵ� �迭 �κа� ���Ͽ� �ڽ��� ��ġ�� ã�� �����ϴ� ���� �˰���
 * 
 * [�ð� ���⵵]
 * ��ü ������ ������ n�̶�� �� ��, �� �� Ƚ���� 1 + 2 + ... + (n-1)
 * O(n^2)
 * */

public class InsertionSort {

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
		
		for(int i = 1; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if(data[j-1] > data[j]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				} else break;
				//������ �̹� ���ĵǾ� �ֱ� ������ �ٷ� �� ��Һ��� ū ��쿡�� �ٷ� ���� Ż��
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
}
