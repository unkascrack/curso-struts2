package es.curso.struts2.ejercicio29.actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("unused")
public class ExceptionAction extends ActionSupport {

	private static final long serialVersionUID = -6606871320651806785L;

	static final Log log = LogFactory.getLog(ExceptionAction.class);

	public String exception1() throws Exception {
		if (true) {
			throw new Exception(
					"Exception producido en el método 'exception1()' del Action 'ExceptionAction'.");
		}
		return SUCCESS;
	}

	public String exception2() throws Exception {
		if (true) {
			throw new SecurityException(
					"SecurityException producido en el método 'exception2()' del Action 'ExceptionAction'.");
		}
		return SUCCESS;
	}

	public String exception3() throws Throwable {
		if (true) {
			throw new Throwable(
					"Throwable producido en el método 'exception3()' del Action 'ExceptionAction'.");
		}
		return SUCCESS;
	}

}
