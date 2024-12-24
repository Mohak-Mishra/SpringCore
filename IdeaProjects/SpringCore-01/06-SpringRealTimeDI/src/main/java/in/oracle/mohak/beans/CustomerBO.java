package in.oracle.mohak.beans;

public class CustomerBO {
    private String name;
    private String address;
    private Float intrestRate;
    private Float amount;
    private Float timePeriod;
    private Float IntrestAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(Float intrestRate) {
        this.intrestRate = intrestRate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Float timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Float getIntrestAmount() {
        return IntrestAmount;
    }

    public void setIntrestAmount(Float intrestAmount) {
        IntrestAmount = intrestAmount;
    }
    @Override
    public String toString() {
        return "CustomerBO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", intrestRate=" + intrestRate +
                ", amount=" + amount +
                ", timePeriod=" + timePeriod +
                ", IntrestAmount=" + IntrestAmount +
                '}';
    }
}
