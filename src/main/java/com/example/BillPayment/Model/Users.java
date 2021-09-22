package com.example.BillPayment.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
        name = "users"
)
public class Users {

	@Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "user_sequence"
    )
	private Long sequenceid;
	

	private String loginid;
	private String password;
	/* private String linkedaccount; */
	
	
	@ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "roleid",
            referencedColumnName = "roleid"
    )
	private Role role;
	
}
