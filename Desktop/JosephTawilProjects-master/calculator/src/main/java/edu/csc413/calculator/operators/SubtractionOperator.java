package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractionOperator extends Operator
{
    private int priortiy_val = 1;


    public int priority() {
        return priortiy_val;
    }


    public Operand execute(Operand op1, Operand op2)
    {
        int value1 = op1.getValue();
        int value2 = op2.getValue();
        return(new Operand(value1 - value2));
    }
}
