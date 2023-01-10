package application;

import java.io.Serializable;

public class Score implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int score;
	private String name;
	
	public Score(String name, int score) {
		this.score = score;
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
}
