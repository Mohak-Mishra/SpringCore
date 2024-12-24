package in.oracle.mohak.beans;

public class CustomerVo {
    private String customerName;
    private String customerAddress;
    private String principalAmount;
    private String rateOfInterest;
    private String timePeriod;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(String rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }
    @Override
    public String toString() {
        return "CoustmerVo{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", principalAmount='" + principalAmount + '\'' +
                ", rateOfInterest='" + rateOfInterest + '\'' +
                ", timePeriod='" + timePeriod + '\'' +
                '}';
    }
}
