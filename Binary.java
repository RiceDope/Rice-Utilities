/**
 * Some general functions that can help when working with binary inside of java
 * 
 * @author Rhys Walker
 * @version 0.1
 * @since 2023-12-21
 */

public class Binary {
    
    /**
     * Converts a whole denary number to binary
     * It will come with leading 0s up to a multiple of four so 4 bit 8 bit and so on
     * 00010101
     * 0001
     * etc
     * 
     * @param num The number we wish to convert
     * @return A string containing the binary representation of the number
     */
    public String toBinary(int num){

        // convert the number to a binary string
        String tempConversion = Integer.toBinaryString(num);

        // calculate how many 0s we need to add
        int remainder = tempConversion.length() % 4;
        int zerosToAdd = 4 - remainder;

        // create the string add leading zeros and add our conversion
        String ultimate = "";
        for(int i = 0; i < zerosToAdd; i++){
            ultimate = ultimate + "0";
        }
        ultimate = ultimate + tempConversion;

        // return the final string
        return ultimate;
    }
}
