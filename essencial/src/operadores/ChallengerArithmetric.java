public class ChallengerArithmetric {
    public static void main(String[] args) {     
    double firstNumerator = (6 * (3 + 2));
    double firstNumeratorRaised = Math.pow(firstNumerator, 2);
    double firstDenominator = 3 * 2;
    double firstFormula = firstNumeratorRaised / firstDenominator;

    double secondNumerator = (1 - 5) * (2 - 7);
    double secondDenominator = 2;
    double secondFormula = secondNumerator / secondDenominator;
    double secondFormulaRaised = Math.pow(secondFormula, 2);

    double formula = (firstFormula - (secondFormulaRaised));
    double formulaFinal = Math.pow(formula, 3);

    System.out.println(formulaFinal);
    }
    

}
