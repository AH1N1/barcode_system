package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long did;
   // private XXX dtype; // what kind of shit will it be?

    //foreign key
   // private Product dproduct;
}
