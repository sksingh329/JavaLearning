package basics.operators;

public class Practice {
    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x++ + ++x);
        /**
         * int x = 5;: This line declares an integer variable x and initializes it with the value 5.
         *
         * System.out.println(x++ + ++x);: This is where the main action happens.
         *
         * x++ is the post-increment operator. It increments the value of x by 1 but returns the original value of x (which is 5 in this case) for the current operation.
         *
         * ++x is the pre-increment operator. It increments the value of x by 1 and returns the updated value (which is 7 in this case) for the current operation.
         *
         * So, in this expression, you have 5 + 7, which equals 12.
         */
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";
        String str4 = str1+str2;
        str4 = str4.intern();

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        /**
         * You use the intern method on str4. The intern method is used to place a string in the string pool. If another string with the same value already exists in the pool, the reference to the existing string is returned. If not, a new string is added to the pool, and the reference to that new string is returned. In this case, str4 is placed in the string pool.
         *
         * You compare str3 and str4 using both the == operator and the equals method.
         *
         * str3 == str4: This checks if str3 and str4 reference the same string object in memory. In this case, they are the same because both were derived from string literals.
         * str3.equals(str4): This checks if the contents of str3 and str4 are the same, regardless of whether they reference the same object in memory. The equals method returns true because the content of str3 and str4 is "HelloWorld."
         */
    }
}
