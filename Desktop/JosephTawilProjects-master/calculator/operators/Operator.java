package edu.csc413.calculator.operators;



import edu.csc413.calculator.evaluator.Operand;

import java.util.HashMap;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );
    private static final HashMap<String, Operator> operators = new HashMap<>();
    static {
        operators.put("+", new AddOperator());
        operators.put("-", new SubtractionOperator());
        operators.put("/", new DivideOperator());
        operators.put("*", new MultiplyOperator());
        operators.put("^", new PowerOperator());
        operators.put("(", new LeftParanthesisOperator());
        operators.put(")", new RightParanthesisOperator());
    }
    public abstract int priority();
    public Operand execute(Operand op1, Operand op2 )
    {
        return null;
    }

    /**
     * determines if a given token is a valid operator.
     * please do your best to avoid static checks
     * for example token.equals("+") and so on.
     * Think about what happens if we add more operators.
     */
    public static boolean check( String token )
    {
        return operators.containsKey(token);
    }


    public static Operator getOperator(String token)
    {
        return(operators.getOrDefault(token,null));
    }
}
