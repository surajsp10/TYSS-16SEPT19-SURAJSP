package com.tyss.jpahibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="voter")
public class VoterCard {
	@Id
	@Column(name="vid")
	
	private int vid;
	@Column(name="vname")
	private String vname;
	
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
	
	
	
	
	
	

}
