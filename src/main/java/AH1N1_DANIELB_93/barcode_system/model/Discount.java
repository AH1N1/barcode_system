package AH1N1_DANIELB_93.barcode_system.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "discount_id")
    private Long did;
    private String dtype; // what kind of shit will it be?

    @OneToMany(cascade = CascadeType.ALL)
    //@Column(name = "product")
    @JoinTable(name="Product_Discount", joinColumns={@JoinColumn(name="discount_id", referencedColumnName="discount_id")} , inverseJoinColumns={@JoinColumn(name="product_id", referencedColumnName="product_id")})
    private Collection<Product> dproducts;

    public Discount() {
    }

    public Discount(String dtype, Collection<Product> dproducts) {
        this.dtype = dtype;
        this.dproducts = dproducts;
    }

    public Discount(Collection<Product> dproducts) {
        this.dproducts = dproducts;
    }

    public Collection<Product> getDproducts() {
        return dproducts;
    }

    public void setDproduct(Product product) {
        this.dproducts.add(product);
    }

    public void setDproducts(HashSet<Product> dproducts) {
        this.dproducts = dproducts;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public void setDproducts(Collection<Product> dproducts) {
        this.dproducts = dproducts;
    }
}
