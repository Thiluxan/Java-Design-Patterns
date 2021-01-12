package com.thiluxan;

import com.thiluxan.operations.AddOperation;
import com.thiluxan.operations.DivisionOperation;
import com.thiluxan.operations.MultiplyOperation;
import com.thiluxan.operations.SubtractOperation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = "+context.executeOperation(10,5));

        Context context1 = new Context(new SubtractOperation());
        System.out.println("10 - 5 = "+context1.executeOperation(10,5));

        Context context2 = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = "+context2.executeOperation(10,5));

        Context context3 = new Context(new DivisionOperation());
        System.out.println("10 / 5 = "+context3.executeOperation(10,5));
    }
}
