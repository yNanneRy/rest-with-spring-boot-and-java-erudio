package br.com.organizacao;

public class Greeting {

	private final long ID;
	private final String content;
 
	public Greeting(long incrementAndGet, String format) {
		ID = incrementAndGet;
		this.content = format;
	}

	public long getID() {
		return ID;
	}

	public String getContent() {
		return content;
	}
}
