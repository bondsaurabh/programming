package hackerearth.practice;

import java.util.Scanner;

public class SeatArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n ; i++) {
        	int seatNum = scanner.nextInt();
        	int ch = seatNum%12;
        	
        	switch (ch) {
			case 0:
				seatNum -=11;
				System.out.println(seatNum + " WS");
                break;
			case 1:
				seatNum +=11;
				System.out.println(seatNum + " WS");
                break;
			case 2:
				seatNum +=9;
				System.out.println(seatNum + " MS");
                break;
			case 3:
				seatNum +=7;
				System.out.println(seatNum + " AS");
                break;
			case 4:
				seatNum +=5;
				System.out.println(seatNum + " AS");
                break;
			case 5:
				seatNum +=3;
				System.out.println(seatNum + " MS");
                break;
			case 6:
				seatNum +=1;
				System.out.println(seatNum + " WS");
                break;
			case 7:
				seatNum -=1;
				System.out.println(seatNum + " WS");
				break;
			case 8:
				seatNum -=3;
				System.out.println(seatNum + " MS");
                break;
			case 9:
				seatNum -=5;
				System.out.println(seatNum + " AS");
                break;
			case 10:
				seatNum -=7;
				System.out.println(seatNum + " AS");
                break;
			case 11:
				seatNum -=9;
				System.out.println(seatNum + " MS");
                break;
			default:
				break;
			}
        }

	}

}
