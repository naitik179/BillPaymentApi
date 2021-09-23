package com.example.BillPayment.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountTransaction {

	@Id
	@SequenceGenerator(
            name = "transaction_ref",
            sequenceName = "transaction_ref",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_ref"
    )
	private Long transaction_ref;
	private Date time;
	private Long amount;
	private String type;
	private String description;
	
	
//	@ManyToOne(
//            //cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "seqid",
//            referencedColumnName = "sequenceid"
//    )
//	private Accounts seqid;
	private Long seqid;
	private Long consumeraccountno;
	
	
	// to be mapped with bills - billid
	@OneToOne(
            //cascade = CascadeType.ALL,
            //fetch = FetchType.LAZY,
            //optional = false
    )
    @JoinColumn(
            name = "billid",
            referencedColumnName = "billid"
    )
	private Bills billid;
	
}
