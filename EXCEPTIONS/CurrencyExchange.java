package EXCEPTIONS;
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
class CurrencyExchangeSystem {
    private static final double TRANSACTION_FEE_LIMIT = 0.03; // 3%

    public static void validateExchangeRate(double exchangeRate) throws InvalidTransactionException {
        if (exchangeRate <= 0) {
            throw new InvalidTransactionException("Exchange rate cannot be zero or negative.");
        }
    }
    public static void validateTransactionFee(double transactionAmount, double transactionFee) throws InvalidTransactionException {
        if (transactionFee > transactionAmount * TRANSACTION_FEE_LIMIT) {
            throw new InvalidTransactionException("Transaction fee exceeds allowable limit.");
        }
    }
    public static void checkBalance(double accountBalance, double withdrawalAmount, double transactionFee) throws InvalidTransactionException {
        if (withdrawalAmount + transactionFee > accountBalance) {
            throw new InvalidTransactionException("Insufficient balance for the withdrawal");
        }
    }
}
public class CurrencyExchange {
    public static void main(String[] args) {
        double exchangeRate = 1.2;
        double transactionAmount = 1000;
        double transactionFee = 40; // Example fee
        double accountBalance = 1500;
        try {
            CurrencyExchangeSystem.validateExchangeRate(exchangeRate);
            CurrencyExchangeSystem.validateTransactionFee(transactionAmount, transactionFee);
            CurrencyExchangeSystem.checkBalance(accountBalance, transactionAmount, transactionFee);
            System.out.println("Transaction approved.");
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
