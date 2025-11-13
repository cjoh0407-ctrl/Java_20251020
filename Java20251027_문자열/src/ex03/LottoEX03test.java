package ex03;

import java.util.Arrays;

public class LottoEX03test {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];
		int count = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			
			int num = (int)(Math.random()*45)+1;  // 숫자 뽑아서 num에 대입
			lotto[i] = num;		// num을 배열 방에 대입
			++count;
			
			for(int j = 0; j < i; j++) {	// 중복확인
				if(lotto[j] == num) {	// num값과 배열 j(0 ~~) 방을 비교
					--i;	// 중복이면 i를 마이너스 시키고 j++을 하지 않기위해 브레이크로 다시 돌아감
					break;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(lotto));
		System.out.println("반복횟수 : " + count);
		
	}

}
