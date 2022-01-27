
/*;===============================================================================
Title: create a GUI scientific calculator(JAVA)
Author: Soham manjrekar , tanya mishra ,prayag mayekar
Date:   18 Nov 2021
;=================================================================================*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GuiCalculator implements ActionListener {
  int operator = 0;
  double a = 0, b = 0, result = 0;
  Operation obj = new Operation();
  JLabel Name, SLab;
  JButton _1, _2, _3, _4, _5, _6, _7, _8, _9, _0, clear, plus, negative, sin, divide, multi, cos, log, fact, tan, sqrt,
      total;
  JTextField Result;
  JFrame frame;
  JPanel panel;
  JRadioButton type, type1;
  Font text, text1;
  ButtonGroup jodouble;

  GuiCalculator() {
    Result = new JTextField();
    _1 = new JButton("1");
    _2 = new JButton("2");
    _3 = new JButton("3");
    _4 = new JButton("4");
    _5 = new JButton("5");
    _6 = new JButton("6");
    _7 = new JButton("7");
    _8 = new JButton("8");
    _9 = new JButton("9");
    _0 = new JButton("0");
    cos = new JButton("Cos");
    clear = new JButton("Clear");
    plus = new JButton("+");
    log = new JButton("Log");
    sin = new JButton("Sin");
    divide = new JButton("/");
    multi = new JButton("*");
    negative = new JButton("-");
    fact = new JButton("n!");
    tan = new JButton("Tan");
    sqrt = new JButton("sqrt");
    total = new JButton("=");
    type = new JRadioButton("Radian", true);
    type1 = new JRadioButton("Degree");
    jodouble = new ButtonGroup();
    jodouble.add(type);
    jodouble.add(type1);
    SLab = new JLabel("");

    // setFont
    text = new Font("Sansserif", Font.BOLD, 35);
    text1 = new Font("Sansserif", Font.BOLD, 18);
    _1.setFont(text1);
    _2.setFont(text1);
    _3.setFont(text1);
    _4.setFont(text1);
    _5.setFont(text1);
    _6.setFont(text1);
    _7.setFont(text1);
    _8.setFont(text1);
    _9.setFont(text1);
    _0.setFont(text1);
    cos.setFont(text1);
    clear.setFont(text1);
    plus.setFont(text1);
    log.setFont(text1);
    // sin.setFont(text1);
    divide.setFont(text1);
    negative.setFont(text1);
    multi.setFont(text1);
    tan.setFont(text1);
    // sqrt.setFont(text1);
    fact.setFont(text1);
    total.setFont(text1);
    Result.setFont(text);
    // color
    Result.setBackground(Color.black);
    Result.setToolTipText("Enter The Value");
    Result.setForeground(Color.orange);
    _1.setBackground(Color.yellow);
    _2.setBackground(Color.yellow);
    _3.setBackground(Color.yellow);
    _4.setBackground(Color.yellow);
    _5.setBackground(Color.yellow);
    _6.setBackground(Color.yellow);
    _7.setBackground(Color.yellow);
    _8.setBackground(Color.yellow);
    _9.setBackground(Color.yellow);
    _0.setBackground(Color.yellow);
    cos.setBackground(Color.yellow);
    clear.setBackground(Color.orange);
    plus.setBackground(Color.yellow);
    log.setBackground(Color.yellow);
    divide.setBackground(Color.yellow);
    sin.setBackground(Color.yellow);
    multi.setBackground(Color.yellow);
    negative.setBackground(Color.yellow);
    fact.setBackground(Color.yellow);
    tan.setBackground(Color.yellow);
    sqrt.setBackground(Color.yellow);
    total.setBackground(Color.red);
    total.setToolTipText("Click for Toal");
    type.setBackground(Color.yellow);
    type.setForeground(Color.black);
    type1.setBackground(Color.yellow);
    type1.setForeground(Color.black);
    // setBounds
    SLab.setBounds(0, 10, 100, 10);
    Result.setBounds(30, 40, 395, 70);
    type.setBounds(260, 120, 70, 30);
    type1.setBounds(350, 120, 70, 30);
    _1.setBounds(30, 160, 50, 40);
    _2.setBounds(90, 160, 50, 40);
    _3.setBounds(150, 160, 50, 40);
    _4.setBounds(30, 210, 50, 40);
    _5.setBounds(90, 210, 50, 40);
    _6.setBounds(150, 210, 50, 40);
    _7.setBounds(30, 260, 50, 40);
    _8.setBounds(90, 260, 50, 40);
    _9.setBounds(150, 260, 50, 40);
    _0.setBounds(30, 310, 110, 40);
    clear.setBounds(30, 360, 170, 40);
    cos.setBounds(240, 360, 110, 40);
    plus.setBounds(150, 310, 50, 40);
    log.setBounds(240, 160, 110, 40);
    sin.setBounds(360, 160, 60, 40);
    divide.setBounds(240, 210, 50, 40);
    multi.setBounds(300, 210, 50, 40);
    negative.setBounds(240, 260, 50, 40);
    fact.setBounds(300, 260, 50, 40);
    tan.setBounds(240, 310, 110, 40);
    sqrt.setBounds(360, 210, 60, 40);
    total.setBounds(360, 260, 60, 140);
    // action
    _1.addActionListener(this);
    _2.addActionListener(this);
    _3.addActionListener(this);
    _4.addActionListener(this);
    _5.addActionListener(this);
    _6.addActionListener(this);
    _7.addActionListener(this);
    _8.addActionListener(this);
    _9.addActionListener(this);
    _0.addActionListener(this);
    clear.addActionListener(this);
    cos.addActionListener(this);
    plus.addActionListener(this);
    log.addActionListener(this);
    sin.addActionListener(this);
    divide.addActionListener(this);
    multi.addActionListener(this);
    negative.addActionListener(this);
    fact.addActionListener(this);
    tan.addActionListener(this);
    sqrt.addActionListener(this);
    total.addActionListener(this);
    // panel
    panel = new JPanel();
    panel.setLayout(null);
    panel.setVisible(true);
    panel.setBackground(Color.black);
    panel.add(Result);
    panel.add(_1);
    panel.add(_2);
    panel.add(_3);
    panel.add(_4);
    panel.add(_5);
    panel.add(_6);
    panel.add(_7);
    panel.add(_8);
    panel.add(_9);
    panel.add(_0);
    panel.add(clear);
    panel.add(cos);
    panel.add(plus);
    panel.add(log);
    panel.add(sin);
    panel.add(divide);
    panel.add(multi);
    panel.add(negative);
    panel.add(fact);
    panel.add(tan);
    panel.add(sqrt);
    panel.add(total);
    panel.add(type);
    panel.add(type1);
    panel.add(SLab);
    // Frame
    frame = new JFrame("Calculator ");
    frame.setBounds(600, 300, 460, 470);
    frame.setVisible(true);
    frame.getContentPane().add(panel);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == _1) {
      Result.setText(Result.getText().concat("1"));
    } else if (ae.getSource() == _2) {
      Result.setText(Result.getText().concat("2"));
    } else if (ae.getSource() == _3) {
      Result.setText(Result.getText().concat("3"));
    } else if (ae.getSource() == _4) {
      Result.setText(Result.getText().concat("4"));
    } else if (ae.getSource() == _5) {
      Result.setText(Result.getText().concat("5"));
    } else if (ae.getSource() == _6) {
      Result.setText(Result.getText().concat("6"));
    } else if (ae.getSource() == _7) {
      Result.setText(Result.getText().concat("7"));
    } else if (ae.getSource() == _8) {
      Result.setText(Result.getText().concat("8"));
    } else if (ae.getSource() == _9) {
      Result.setText(Result.getText().concat("9"));
    } else if (ae.getSource() == _0) {
      Result.setText(Result.getText().concat("0"));
    } else if (ae.getSource() == plus) {
      a = Double.parseDouble(Result.getText());
      operator = 1;
      Result.setText("");
    } else if (ae.getSource() == log) {
      a = Double.parseDouble(Result.getText());
      result = obj.LogValue(a);
      Result.setText("" + result);
    } else if (ae.getSource() == sin) {
      if (type.isSelected()) {
        a = Double.parseDouble(Result.getText());
        result = obj.SinValue1(a);
        Result.setText("" + result);
      }
      if (type1.isSelected()) {
        result = obj.SinValue(a);
        a = Double.parseDouble(Result.getText());
        Result.setText("" + result);
      }
    } else if (ae.getSource() == cos) {
      if (type.isSelected()) {
        a = Double.parseDouble(Result.getText());
        result = obj.CosValue1(a);
        Result.setText("" + result);
      }
      if (type1.isSelected()) {
        result = obj.CosValue(a);
        a = Double.parseDouble(Result.getText());
        Result.setText("" + result);
      }
    } else if (ae.getSource() == divide) {
      a = Double.parseDouble(Result.getText());
      operator = 4;
      Result.setText("");
    } else if (ae.getSource() == multi) {
      a = Double.parseDouble(Result.getText());
      operator = 5;
      Result.setText("");
    } else if (ae.getSource() == negative) {
      a = Double.parseDouble(Result.getText());
      operator = 6;
      Result.setText("");
    } else if (ae.getSource() == fact) {
      a = Double.parseDouble(Result.getText());
      result = obj.Factorial(a);
      Result.setText("" + result);
    } else if (ae.getSource() == tan) {
      if (type.isSelected()) {
        a = Double.parseDouble(Result.getText());
        result = obj.TanValue1(a);
        Result.setText("" + result);
      }
      if (type1.isSelected()) {
        result = obj.TanValue(a);
        a = Double.parseDouble(Result.getText());
        Result.setText("" + result);
      }
    } else if (ae.getSource() == sqrt) {
      a = Double.parseDouble(Result.getText());
      result = obj.SquareRoot(a);
      Result.setText("" + result);
      // operator=9;
      // Result.setText("");
    } else if (ae.getSource() == total) {
      b = Double.parseDouble(Result.getText());
      switch (operator) {
      case 1:
        result = obj.Add(a, b);
        break;
      case 2:
        break;
      /*
       * case 3: result=obj.SinValue(); break;
       */
      case 4:
        result = obj.Divide(a, b);
        break;
      case 5:
        result = obj.Multi(a, b);
        break;
      case 6:
        result = obj.Sub(a, b);
        break;
      case 7:
        break;/*
               * case 8: result=obj.TanValue(); break; case 9: break;
               */
      }
      Result.setText("" + result);
    } else if (ae.getSource() == clear) {
      Result.setText("");
    }
  }
}

class Operation { 
  public double Add(double input, double input2) {
    double c = input + input2;
    return (c);
  }

  public double Sub(double input, double input2) {
    double c = input - input2;
    return (c);
  }

  public double Multi(double input, double input2) {
    double c = input * input2;
    return (c);
  }

  public double LogValue(double input) {
    double result = (Math.log10(input));
    return result;
  }

  public double Divide(double input, double input2) {
    double c = input / input2;
    return (c);
  }

  public double Factorial(double input) {
    double factorial = 1;
    for (double j = input; j >= 1; j--) {
      factorial = factorial * j;
    }
    return factorial;
  }

  public double SquareRoot(double input) {
    input = (Math.sqrt(input));
    return input;
  }

  public double SinValue(double input) {
    double degree = Math.toRadians(input);
    input = (Math.sin(degree));
    return input;
  }

  public double SinValue1(double input) {
    input = (Math.sin(input));
    return input;
  }

  public double CosValue(double input) {
    double degree = Math.toRadians(input);
    input = (Math.cos(degree));
    return input;
  }

  public double CosValue1(double input) {
    input = (Math.cos(input));
    return input;
  }

  public double TanValue(double input) {
    double degree = Math.toRadians(input);
    input = (Math.tan(degree));
    return input;
  }

  public double TanValue1(double input) {
    double degree = Math.toRadians(input);
    input = (Math.tan(degree));
    return input;
  }
}

public class Calculator {
  public static void main(String[] arg) {
    new GuiCalculator();
  }
}