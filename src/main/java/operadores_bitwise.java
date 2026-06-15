
public class operadores_bitwise{
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("The first number is %S. It's represented in binary as %S  \n", value1,binary1);
        
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        var resultOr = value1 | value2;
        var binaryResultOr = Integer.toBinaryString(resultOr);
        System.out.printf("The second number is %S. It's represented in binary as %S  \n", value2, binary2);
        System.out.printf("%s | %s = %s It's represented in binary as (%s) \n",value1 , value2, value1 | value2, binaryResultOr);
        
        /*The first number is 6. It's represented in binary as     (110).
             The second number is 5. It's represented in binary as (101).
             BITWISE 0R: 6 | 5 = 3. It's represented in binary as  (111).*/
        
        /***************************************USING THE BITWISE AND OPERATOR****************************************************/
        var value3 = 3;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("The first number is %s it represents the binary number %s \n", value3, binary3);
        var value4 = 11;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("The second number is %s it represents the binary number %s \n", value4, binary4);
        var resultAnd = value3 & value4;
        var binaryResultAnd = Integer.toBinaryString(resultAnd);
        System.out.printf("%s & %s = %s it's respresented the binary number (%s) \n",value3, value4,resultAnd,binaryResultAnd);
        
       /*      The first number is 3. It's represented in binary as (0011).
             The first number is %s it represents the binary number %s \n(1011).
             BITWISE AND: 3 & 11 = 3. It's represented in binary as (0011).*/
        
        /************************USING THE BITWISE XOR OPERATOR *************************************************************************/
        
        var value5 = 6;
        var binary5 = Integer.toBinaryString(value5);
        System.out.printf("The first number is %s . it represented in binary as %s \n", value5, binary5);
        var value6 = 2;
        var binary6 = Integer.toBinaryString(value6);
        System.out.printf("The second number is %s it represents the binary number %s \n", value6, binary6);
        var resultXor = value5 ^ value6;
        var binaryResultXor = Integer.toBinaryString(resultXor);
        System.out.printf("%s ^ %s = %s it's respresented the binary number (%s) \n",value5, value6,resultXor,binaryResultXor);
        
        /*The first number is 9 . it represented in binary as       1001 
            The second number is 12 it represents the binary number 1100 
        BITWISE XOR  9 ^ 12 = 5 it's respresented the binary number (101)*/
        
        
        /*****************************USING THE BITWISE LEFT SHIFT OPERATOR********************************************************/
        var value7 = 9;
        var binary7 = Integer.toBinaryString(value7);
        System.out.printf("The first number is %s . it represented in binary as %s \n", value7, binary7);
        var value8 = 2;
        var binary8 = Integer.toBinaryString(value8);
        System.out.printf("The second number is %s it represents the binary number %s \n", value8, binary8);
        var resultLeft = value7 >> value8;
        var binaryResultLeft = Integer.toBinaryString(resultLeft);
        System.out.printf("%s >> %s = %s it's respresented the binary number (%s) \n",value7, value8,resultLeft,binaryResultLeft);
        
        
    }
}