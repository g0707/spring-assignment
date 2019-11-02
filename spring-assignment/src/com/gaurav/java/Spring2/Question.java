package com.gaurav.java.Spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
	private long questionId;
	private String question;
	private List answerList;
	private Set answerSet;
	private Map answerMap;
	
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List answerList) {
		this.answerList = answerList;
	}
	public Set getAnswerSet() {
		return answerSet;
	}
	public void setAnswerSet(Set answerSet) {
		this.answerSet = answerSet;
	}
	public Map getAnswerMap() {
		return answerMap;
	}
	public void setAnswerMap(Map answerMap) {
		this.answerMap = answerMap;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answerList=" + answerList
				+ ", answerSet=" + answerSet + ", answerMap=" + answerMap + "]";
	}
}
