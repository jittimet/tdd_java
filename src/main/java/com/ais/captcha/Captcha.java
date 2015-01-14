package com.ais.captcha;

import com.sun.javafx.binding.StringFormatter;

public class Captcha {
    private int operator;
    private int leftOperand;
    private int pattern;
    private int rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.pattern = pattern;
        this.rightOperand = rightOperand;
    }

    public String getCaptcha() {
        if(isAlphabetOperatorNumberPattern()) {
            return String.format("%s %s %d", getLeftOperand(), getOperator(), rightOperand);
        }
        return String.format("%d %s %s", leftOperand, getOperator(), getRightOperand());
    }

    private boolean isAlphabetOperatorNumberPattern() {
        return this.pattern == 1;
    }

    public String getOperator() {
        String [] operatorList = { "+" , "*", "-"};
        return operatorList[operator - 1];
    }

    public String getLeftOperand() {
        return getStringOperand(this.leftOperand);
    }

    public String getRightOperand() {
        return getStringOperand(this.rightOperand);
    }

    private String getStringOperand(int operand) {
        String [] displayNumbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return displayNumbers[operand - 1];
    }
}
