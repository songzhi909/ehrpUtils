package com.tianjian.ehrp.rule;

/**
 * 行政区规则
 * @author songzhi
 *
 */
public class LocationRule implements Rule {
	
	private Integer type;	//1:省, 2: 市, 3: 县
	private String commConfigLocationId1;	//省
	private String commConfigLocationId2;	//市
	
	@Override
	public String genRule() {
		String rule = "";
		switch (type) {
		case 1:
			rule = " in (select id from CommConfigLocation where level = 1)";
			break;
		case 2:
			rule = " in (select id from CommConfigLocation where level = 1)";
			break;
		case 3:
			rule = " in (select id from CommConfigLocation where level = 1)";
			break;
		default:
			throw new RuntimeException("no type");
		}
		return rule;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCommConfigLocationId1() {
		return commConfigLocationId1;
	}

	public void setCommConfigLocationId1(String commConfigLocationId1) {
		this.commConfigLocationId1 = commConfigLocationId1;
	}

	public String getCommConfigLocationId2() {
		return commConfigLocationId2;
	}

	public void setCommConfigLocationId2(String commConfigLocationId2) {
		this.commConfigLocationId2 = commConfigLocationId2;
	}

	
}
