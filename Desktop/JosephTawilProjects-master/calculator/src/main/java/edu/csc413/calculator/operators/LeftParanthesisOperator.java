package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class LeftParanthesisOperator extends Operator
{
    private int priority_val = 0;

    public int priority() {
        return priority_val;
    }


    public Operand execute(Operand op1, Operand op2) {
        return null;
    }
}
