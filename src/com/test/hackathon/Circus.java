/**Q33. A circus is designing a tower routine consisting of people standing atop
one another’s shoulders. For practical and aesthetic reasons, each person must be both 
shorter and lighter than the person below him or her. Given the heights and weights of 
each person in the circus, write a method to compute the largest possible number of people
in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95)
(68, 110) Output: The longest tower is length 6 and includes from top to bottom: (56, 90) 
(60,95) (65,100) (68,110) (70,150) (75,190) **/
package com.test.hackathon;

public class Circus {

	public static void main(String[] args) {
		int[][] htwt = { { 65, 100 }, { 70, 150 }, { 56, 90 }, { 75, 190 }, { 60, 95 }, { 68, 110 } };
		sort(htwt);
		System.out.println("The tower will be designed from top to bottom in the below order");
		for (int i = 0; i < htwt.length; i++) {
			for (int j = 0; j < htwt[i].length; j++) {
				System.out.print(htwt[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length - 1; j++) {
				if (m[j][0] > m[j + 1][0]) {
					int temp = m[j][0];
					int temp1 = m[j][1];
					m[j][0] = m[j + 1][0];
					m[j][1] = m[j + 1][1];
					m[j + 1][0] = temp;
					m[j + 1][1] = temp1;
				}

				if (m[j][0] == m[j + 1][0]) {
					if (m[j][1] > m[j + 1][1]) {
						int temp3 = m[j][1];
						m[j][1] = m[j + 1][1];
						m[j + 1][1] = temp3;
					}
				}

			}
		}
		return m;
	}

}
