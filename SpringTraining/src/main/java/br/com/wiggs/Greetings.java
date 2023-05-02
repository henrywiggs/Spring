package br.com.wiggs;

public class Greetings {

	private final long id;
	private final String msg;
	
	
	public Greetings(long id, String msg) {
		this.id = id;
		this.msg = msg;
	}
	public long getId() {
		return id;
	}
	public String getMsg() {
		return msg;
	}
	
}
