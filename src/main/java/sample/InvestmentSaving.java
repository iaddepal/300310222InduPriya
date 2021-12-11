package sample;

public class InvestmentSaving {

    public String custNo;
    public String custName;
    public double cDep;
    public int nYears;
    public String savType;

    public InvestmentSaving(String custno, String custname, double cdep, int nyears, String savtype) {
        this.custNo = custno;
        this.custName = custname;
        this.cDep = cdep;
        this.nYears = nyears;
        this.savType = savtype;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getcDep() {
        return cDep;
    }

    public void setcDep(double cDep) {
        this.cDep = cDep;
    }

    public int getnYears() {
        return nYears;
    }

    public void setnYears(int nYears) {
        this.nYears = nYears;
    }

    public String getSavType() {
        return savType;
    }

    public void setSavType(String savType) {
        this.savType = savType;
    }
}
