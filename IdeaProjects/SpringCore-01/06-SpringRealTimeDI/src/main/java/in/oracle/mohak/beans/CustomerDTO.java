package in.oracle.mohak.beans;

public class CustomerDTO {
    String name;
    String address;
    Float principalAmount;
    Float interestRate;
    Float timePeriod;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Float getPrincipalAmount() {
        return principalAmount;
    }
    public void setPrincipalAmount(Float principalAmount){
        this.principalAmount = principalAmount;
    }
    public Float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Float interestRate){
        this.interestRate = interestRate;
    }
    public Float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Float timePeriod) {
        this.timePeriod = timePeriod;
    }
    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", principalAmount=" + principalAmount +
                ", interestRate=" + interestRate +
                ", timePeriod=" + timePeriod +
                '}';
    }
}
