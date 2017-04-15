package com.tianjian.ehrp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianjian.ehrp.model.Rule;

public interface RuleDAO extends JpaRepository<Rule, Integer> {

}
