package model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String pname;
    private BigDecimal pprice;
    private int pamount;
    @ManyToOne
    private Discount pdiscount;

    public Product() {
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }

    public int getPamount() {
        return pamount;
    }

    public void setPamount(int pamount) {
        this.pamount = pamount;
    }

    public Discount getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(Discount pdiscount) {
        this.pdiscount = pdiscount;
    }
    

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", pamount=" + pamount +
                ", pdiscount=" + pdiscount +
                '}';
    }
}
