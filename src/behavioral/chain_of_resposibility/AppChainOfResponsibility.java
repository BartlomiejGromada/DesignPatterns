package behavioral.chain_of_resposibility;

public class AppChainOfResponsibility {

    public static void main(String[] args) {

        EmailValidation emailValidation = new EmailValidation();
        PasswordValidation passwordValidation = new PasswordValidation();

        emailValidation.setNextValidation(passwordValidation);
        emailValidation.validate();
    }
}
