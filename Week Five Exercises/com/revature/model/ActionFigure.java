package com.revature.model;

public class ActionFigure extends Doll{
	private String skill;

	public ActionFigure() {
		super();
		this.skill="Oliver Queen";
	}

	public ActionFigure(String name, String eyeColor, String skill) {
		super(name,eyeColor);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void useSkill() {
		System.out.println( "Ka Pow! I’m using my skill, "+this.skill);
	}
}
