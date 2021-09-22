package com.example.BillPayment.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bills {
	
	@Id
	@GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "bills_sequence"
    )
	private Long billid;
	private String billercode;
	
	@ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "billerid",
            referencedColumnName = "billerid"
    )
    private RegisteredBillers billerid;
	private Long amount;
	private Date duedate;
	private Boolean status;


}
