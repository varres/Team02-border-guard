package ee.itcollege.team02.common;

import java.util.List;

import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.SEADUS;

public class Raport {
	public SEADUS seadus;
	
	public SEADUS getSeadus() {
		return seadus;
	}

	public void setSeadus(SEADUS seadus) {
		this.seadus = seadus;
	}

	public List<INTSIDENT> getIntsidendid() {
		return intsidendid;
	}

	public void setIntsidendid(List<INTSIDENT> intsidendid) {
		this.intsidendid = intsidendid;
	}

	public List<INTSIDENT> intsidendid;
}
