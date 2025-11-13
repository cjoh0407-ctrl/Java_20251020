package ex03;

import java.util.Arrays;

public class LottoEX02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[45];
		
		for(int i=0; i<45; i++)		
			lotto[i] = i+1;
		
		for(int i=0; i<100; i++) {
			int index = (int)(Math.random()*45);
			int tmp = lotto[i%6];
			lotto[i%6] = lotto[index];
			lotto[index] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " ");
				
	}

}
