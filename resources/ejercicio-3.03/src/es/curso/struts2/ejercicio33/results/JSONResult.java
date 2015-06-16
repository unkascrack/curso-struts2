package es.curso.struts2.ejercicio33.results;

import java.io.PrintWriter;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class JSONResult extends StrutsResultSupport {

	private static final long serialVersionUID = 1844450535452533420L;

	private String classAlias;

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation)
			throws Exception {
		ServletActionContext.getResponse().setContentType("text/plain");
		PrintWriter responseStream = ServletActionContext.getResponse()
				.getWriter();

		ValueStack valueStack = invocation.getStack();
		Object jsonModel = valueStack.findValue("jsonModel");

		if (jsonModel != null) {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());

			if (classAlias == null) {
				classAlias = "object";
			}
			xstream.alias(classAlias, jsonModel.getClass());
			responseStream.println(xstream.toXML(jsonModel));
		}
	}

	public String getClassAlias() {
		return classAlias;
	}

	public void setClassAlias(String classAlias) {
		this.classAlias = classAlias;
	}
}
