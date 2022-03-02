/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

/**
 *
 * @author forough
 */
public class BalanceChecker {
    public static boolean checkBalance(String expression){
        StackInterface openDelimiterStack = new StackListBased();
        int characterCount = expression.length();
        boolean isBalanced = true;
        int index = 0;
        char nextCharacter= ' ';
        
        while(isBalanced && (index<characterCount)){
            nextCharacter = expression.charAt(index);
            switch(nextCharacter){
                case'[': case '(': case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ']': case ')': case '}':
                    if(openDelimiterStack.isEmpty()){
                        isBalanced = false;
                    }else{
                        char openDelimeter = (char)openDelimiterStack.pop();
                        isBalanced = isPaired(openDelimeter, nextCharacter);
                    }
                    break;
                    default: break;
                    
            }
            index++;
        }
        if(!openDelimiterStack.isEmpty()){
            isBalanced = false;
        }
        
        
        return isBalanced;
    }
    public static boolean isPaired(char open, char close){
        
        return ( open == '(' && close == ')'||open == '[' && close == ']'|| open == '{' && close == '}');
    }
}

