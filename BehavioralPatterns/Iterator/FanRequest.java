package BehavioralPatterns.Iterator;

public class FanRequest {

	private String content;
	
	public FanRequest(String content) {
		this.content=content;
	}
	
	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "FanRequest [content=" + content + "]";
	}
	
}
