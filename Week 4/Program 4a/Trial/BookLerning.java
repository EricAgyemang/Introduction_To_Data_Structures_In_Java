package eagyem2;

public class BookLerning {
//Want to search for a target value is in an array x
		public static int search(int [] x, int target) {
			for(int i=0; i<x.length; i++) {
				if(x[i]==target) {
					return i;
				}
				
			}
			return -1;
		}
		
		//Want to check if array x value is same at an index i as that of y at an index i
		public static void isThere(int [] x, int [] y) {
			for(int i=0; i<x.length; i++) {
				if(search(y, x[i])!=-1) {
				//	return false;
				    System.out.println("There is non");
					}
				}
		//	return true;
			System.out.println("There is an index");
		}

		//Want too check if the values of an array are unique
		public static boolean areUnique(int [] x) {
			for(int i=0; i<x.length; i++) {
				for(int j=i+1; j<x.length; j++) {
					if(x[i]==x[j]) {
						return false;
					}
				}
			}
			return true;
		}
	}



