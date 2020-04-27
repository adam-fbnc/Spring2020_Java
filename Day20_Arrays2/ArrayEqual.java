package Day20_Arrays2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
    int[] a1={1,2,3,4};
    int[] a2={1,2,3,4,5};

    boolean eq= Arrays.equals(a1,a2);
    System.out.println(eq);

    char[] ch1="Cybertek School".toCharArray();
    char[] ch2="School Cybertek".toCharArray();
    
}
}
