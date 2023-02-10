package Practices.distribution;

public class SIM {
    private String operatorName;
    private String phoneNumber;

    public SIM(String operatorName, String phoneNumber) {
        this.operatorName = operatorName;
        this.phoneNumber = phoneNumber;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.print("\n -------SIM---------  \n");
        System.out.println("Operadora: "+getOperatorName());
        System.out.println("Número telefónico: "+getPhoneNumber());
    }
}
