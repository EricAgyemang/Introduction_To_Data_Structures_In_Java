package edu.ilstu;

public class SearchTest{
    private int[] myArray;
    private int target;
    private int start;
    private int end;
    private int expectedOutput;
    private Class exception;

    private static final int [] myArray1 = {5, 12, 15, 4, 15, 12, 15, 9, 11, 6};
    private static final int [] myArray2 = {10};
    private static final int [] myArray3 = new int[0];
    private static final int [] myArray4 = null;

    public SearchTest(int[]myArray, int target, int start, int end, int expectedOutput){
        this.myArray=myArray;
        this.target = target;
        this.start=start;
        this.end=end;
        this.expectedOutput=expectedOutput;
    }

    public static boolean doTestFor(SearchTest sT){
        boolean pass = true;
        try{
        int expectedOutput = ArraySearch.search(sT.myArray, sT.target, sT.start, sT.end);
        pass = pass && (expectedOutput==sT.expectedOutput) && (sT.exception==null);

        }catch(Throwable ex){
            if(ex.getClass()==sT.exception){
                return true;
            }else{
                System.err.println("Unexpected Exception");
                ex.printStackTrace();
                return false;
            }
        }
        return pass;
    }


    private static SearchTest[] testCase ={new SearchTest(myArray1, 5, 0, 9, 0),   //The target is the first element in the array
                                           new SearchTest(myArray1, 6, 5, 9, 9), //The target is the last element in the array
                                           new SearchTest(myArray1, 12, 0, 9, 1),//The target is somewhere in the middle
                                           new SearchTest(myArray1, 100, 0, 9, -1),  //The target element is not in the array
                                           new SearchTest(myArray1, 15, 0, 9, 2), //There are more than one occurrences of the target element, and we find the first occurrence
                                           new SearchTest(myArray2, 90, 0,0,-1),   //The array has only one element and it is not the target.
                                           new SearchTest(myArray2, 80, 0,0,0),   //The array has only one element and it is the target.
                                           new SearchTest(myArray3, 5, 0, 4,-1),   //The array has no elements.
                                           new SearchTest(myArray4, 5, 0, 4,-1),   //The array has no elements.
                                          };

    public static void main(String[] args) {
        boolean allPass = true;
        for(int i=0; i<testCase.length; i++){
            boolean pass = doTestFor(testCase[i]);
            if(pass){
                System.out.println("\nTest "+ i + " Passed. Target is found!");
            }else{
                System.out.println("\nTest " + i + " Failed. Target is not found!\n");
            }
            allPass = allPass && pass;
        }
         if(allPass){
            System.out.println("\nAll Tests Passed. All Targets are found!");
         }
    }
}
