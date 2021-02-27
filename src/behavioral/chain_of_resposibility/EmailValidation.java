package behavioral.chain_of_resposibility;

public class EmailValidation implements Validation {

    private Validation nextValidation;

    public void setNextValidation(Validation nextValidation) {
        this.nextValidation = nextValidation;
    }

    @Override
    public void validate() {
        if (this.nextValidation == null)
            System.out.println("Email validation.");
        else {
            System.out.println("Forwards the request from email validation...");
            this.nextValidation.validate();
        }
    }
}
