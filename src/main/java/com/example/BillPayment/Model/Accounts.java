package com.example.BillPayment.Model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "accounts",
        uniqueConstraints = {
                @UniqueConstraint(name = "emailid", columnNames = "emailid")
        }
)
public class Accounts {

	@Id
	private Long consumeraccountno;
	private String accname;
	private String emailid;
	private Long currentbal;
	
	
	// mapping with user
	@ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "sequenceid",
            referencedColumnName = "sequenceid"
    )
    private Users user;
	
	
}
