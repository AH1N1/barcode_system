package AH1N1_DANIELB_93.barcode_system.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long pid;
    @Column(name = "product_name")
    private String pname;
    @Column(name = "product_price")
    private BigDecimal pprice;
    @Column(name = "products_amount")
    private int pamount;
    @Column(name = "product_barcode")
    private Integer pbarcode;
//    @ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "product_id")
//    @ManyToOne
//    private Discount pdiscount;

    public Product() {
    }

    public Integer getPbarcode() {
        return pbarcode;
    }

    public void setPbarcode(Integer pbarcode) {
        this.pbarcode = pbarcode;
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

//    public Discount getPdiscount() {
//        return pdiscount;
//    }
//
//    public void setPdiscount(Discount pdiscount) {
//        this.pdiscount = pdiscount;
//    }

    public Product(String pname, BigDecimal pprice, int pamount, Discount pdiscount, Integer pbarcode) {
        this.pname = pname;
        this.pprice = pprice;
        this.pamount = pamount;
//        this.pdiscount = pdiscount;
        this.pbarcode = pbarcode;

    }

    public Product(String pname, BigDecimal pprice, int pamount, Integer pbarcode) {
        this.pname = pname;
        this.pprice = pprice;
        this.pamount = pamount;
        this.pbarcode = pbarcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", pamount=" + pamount +
//                ", pdiscount=" + pdiscount +
                '}';
    }
}
