package annotations;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String name;
	private int code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
