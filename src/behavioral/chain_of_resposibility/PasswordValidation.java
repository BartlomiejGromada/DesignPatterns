package behavioral.chain_of_resposibility;

public class PasswordValidation implements Validation {

    private Validation nextValidation;

    public void setNextValidation(Validation nextValidation) {
        this.nextValidation = nextValidation;
    }

    @Override
    public void validate() {
        if(this.nextValidation == null) {
            System.out.println("Password validation.");
        } else {
            System.out.println("Forwards the request from password validation...");
            this.nextValidation.validate();
        }
    }
}
