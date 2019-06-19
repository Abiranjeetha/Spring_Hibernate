package com.pack;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class InjectCollection {
	private List name1;
	private Set name2;
	private Map name3;
	private Properties name4;
	public List getName1() {
		return name1;
	}
	public void setName1(List name1) {
		this.name1 = name1;
	}
	public Set getName2() {
		return name2;
	}
	public void setName2(Set name2) {
		this.name2 = name2;
	}
	public Map getName3() {
		return name3;
	}
	public void setName3(Map name3) {
		this.name3 = name3;
	}
	public Properties getName4() {
		return name4;
	}
	public void setName4(Properties name4) {
		this.name4 = name4;
	}
	
}
