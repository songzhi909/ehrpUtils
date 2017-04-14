package com.tianjian.ehrp.validate;

import java.util.List;

import com.tianjian.ehrp.rule.Rule;

/**
 * 数据校验工具
 * @author songzhi
 *
 */
public interface DataValidater {

	/**
	 * 根据规则校验
	 * @param rules
	 * @return
	 */
	public boolean validate(List<Rule> rules);
}
