package com.jiet;
import com.juet.Pack1; // Importing Pack1

// Extending Pack1 to access protected method
public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        Pack2 obj = new Pack2();
        obj.display(); // This will work because Pack2 extends Pack1
    }
}
