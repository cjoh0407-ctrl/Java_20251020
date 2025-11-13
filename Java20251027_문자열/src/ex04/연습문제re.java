package ex04;

import java.util.Arrays;

public class 연습문제re {

	public static void main(String[] args) {

		/* 
		 * 1. 배열 10개 방에 랜덤하게 1 ~ 100 사이 값을 저장
		 * 2. 배열에서 최대값, 최소값을 구하기
		 * 3. 배열 10개의 값에 총점/평균을 구하기
		 * 4. 10개 값을 오름차순 정렬하기
		 */
		
		int[] iArr = new int[10];
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(iArr));
		
		
		
		
		int max, min;
		max = min = iArr[0];
		
		for(int i=0; i<iArr.length; i++) {
			
			if(max < iArr[i])
				max = iArr[i];
			
			if(min > iArr[i])
				min = iArr[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		int sum = 0;
		double avg; 
		
		for(int i=0; i<iArr.length; i++) {
			sum += iArr[i];
		}
		
		avg = (double)sum/iArr.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		for(int i=0; i<iArr.length; i++) {
			
			for(int j=0; j<iArr.length -i -1; j++) {
			
				if(iArr[j]>iArr[j+1]) {
					
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
				}// if end
			} // j for end
		} // i for end
		
		System.out.println("정렬 : " + Arrays.toString(iArr));
		
		
		
		
		
		
		
	}

}
