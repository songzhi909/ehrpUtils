package com.tianjian.ehrp.rule;

/**
 * 非空
 * @author songzhi
 *
 */
public class NotBlankRule implements Rule {

	@Override
	public String genRule() {
		return "is not null";
	}

}
