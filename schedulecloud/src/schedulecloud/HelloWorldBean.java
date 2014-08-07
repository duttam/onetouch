package schedulecloud;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="helloWorld")
@ViewScoped
public class HelloWorldBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;
	private String stringFromWPCBranch;
	@PostConstruct
	public void init(){
		string = "this is a sinple demo test";
		stringFromWPCBranch = "We added this string from WPC Branch";
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getStringFromWPCBranch() {
		return stringFromWPCBranch;
	}

	public void setStringFromWPCBranch(String stringFromWPCBranch) {
		this.stringFromWPCBranch = stringFromWPCBranch;
	}
	
	
}
