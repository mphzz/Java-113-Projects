package edu.miracosta.cs113;
import java.util.LinkedList;

public class Term implements Cloneable, Comparable<Term> {
  public static final int DEFAULT_EXPONENT = 1;
  public static final int DEFAULT_COEFFICIENT = 1;
  private final static char VARIABLE_SYMBOL = 'x';
  private final static char EXPONENT_SYMBOL = '^';
  private final static char PLUS_SYMBOL = '+';
  private final static char MINUS_SYMBOL = '-';
  // public static final String BREAKER1 = "t";

  public int exponent, coefficient;

  public Term() {
    this.coefficient = DEFAULT_COEFFICIENT;
    this.exponent = DEFAULT_EXPONENT;
  }
  public Term(int coefficient, int exponent) {
    this.coefficient = coefficient;
    this.exponent = exponent;
    String exp = String.valueOf(coefficient);
    String coef = String.valueOf(exponent);
    String together = exp + "x^" + coef;
    String final1 = String.valueOf(together);
    String stringed = final1;
  }
  public Term(Term other) {
    if (other == null) {
      throw new NullPointerException();
    } else {
      this.setAll(other.getCoefficient(), other.getExponent());
    }
  }

  public int getExponent() {
    return this.exponent;
  }
  public int getCoefficient() {
    return this.coefficient;
  }
  public void setExponent(int exponent) {
    this.exponent = exponent;
  }
  public void setCoefficient(int coefficient) {
    this.coefficient = coefficient;
  }
  public void setAll(int coefficient, int exponent) {
    this.coefficient = coefficient;
    this.exponent = exponent;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || this.getClass() != o.getClass())
      return false;
    Term that = (Term) o;
    return this.coefficient == that.coefficient
        && this.exponent == that.exponent;
  }

  public int compareTo(Term te) {
    if (exponent == te.exponent)
      return 0;
    else if (exponent < te.exponent)
      return -1;
    else {
      return 1;
    }
  }

  public Term plus(Term other) {
    return sumOf(this, other);
  }

  public static Term sumOf(Term termA, Term termB) {
    Term temp = null;
    int coefficientSum;

    // if exponents match
    if (termA.exponent == termB.exponent) {
      // Add both coefficients
      coefficientSum = termA.coefficient + termB.coefficient;

      if (coefficientSum == 0) {
        return null;
      } else {
        temp = new Term(coefficientSum, termA.exponent);
      }

      // temp = new Term(termA.coefficient + termB.coefficient, termA.exponent);
    }

    return temp;
  }

  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public String toString() {
    String temp = "";

    // Will not run if coefficient is zero
    if (this.coefficient != 0) {
      // Handles Coefficient
      if (coefficient > 0) { // Adds plus symbol where needed
        temp += PLUS_SYMBOL;
        if (coefficient > 1) {
          temp += this.coefficient;
        }
      } else { // Add minus symbol where needed
        if (coefficient == -1) {
          temp += MINUS_SYMBOL;
        } else {
          temp += this.coefficient;
        }
      }
      // Handles Exponent
      if (this.exponent != 0) {
        temp += VARIABLE_SYMBOL;

        if (this.exponent > 1 || this.exponent < -1) {
          temp += EXPONENT_SYMBOL + "" + this.exponent;
        }
      }
    }
    return temp;
  }

  public Term(String term) {
    int coefficient, exponent;

    if (!term.isEmpty()) {
      // Term contains variable
      if (term.contains(Character.toString(VARIABLE_SYMBOL))) {
        // Split string in between X variable
        String[] splitTerm = term.split(Character.toString(VARIABLE_SYMBOL));

        // Parse left side of variable X
        coefficient = parseCoefficientString(splitTerm[0]);

        // if right side of variable X is available
        if (splitTerm.length == 2) {
          exponent = parseExponentString(splitTerm[1]);
        } else {
          exponent = 1;
        }
      } else { // Term does not contain variable
        coefficient = parseCoefficientString(term);
        exponent = 0;
      }

    } else // String is empty assign both coefficient and exponent to zero
    {
      coefficient = exponent = 0;
    }

    this.setAll(coefficient, exponent);
  }

  private int parseExponentString(String str) {
    return Integer.parseInt(str.substring(1));
  }

  private int parseCoefficientString(String str) {
    if (str.length() == 1 && str.charAt(0) == MINUS_SYMBOL) {
      return -1;
    } else if (str.length() == 1 && str.charAt(0) == PLUS_SYMBOL) {
      return 1;
    } else {
      return Integer.parseInt(str);
    }
  }
}
