package com.example.BillPayment.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisteredBillers {
	
	@Id
	private Long billerid;
	
	
	// mapped to be bill-consumerno
	private String consumerno;
	private Boolean autopay;
	private Long limitamount;

	@OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "billercode",
            referencedColumnName = "billercode"
    )
	private MasterBillers billercode;
	
	@ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "consumeraccountno",
            referencedColumnName = "consumeraccountno"
    )
    private Accounts consumeraccountno;
}
