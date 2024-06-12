package com.javarush.task.jdk13.task41.task4114;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", processor::multiply);
        operationMap.put("/", processor::divide);
    }

    public void calculate(int a, String b, int c) {
        Operation operation = operationMap.get(b);
        if (operation == null) {
            throw new IllegalStateException("no operation registered for '" + b + "'");
        }else if (b != null) {
            operation.execute(a, c);
        }
    }
}
