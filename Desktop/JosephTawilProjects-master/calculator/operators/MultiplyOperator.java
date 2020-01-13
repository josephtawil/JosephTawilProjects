package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class MultiplyOperator extends Operator
{
    private int priority_val = 2;
    public int priority()
    {
       return priority_val;
    }
    public Operand execute(Operand op1, Operand op2)
    {
        int value1= op1.getValue();
        int value2 = op2.getValue();
        return (new Operand(value1*value2));
    }
}
