package es.curso.struts2.ejercicio7.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import es.curso.struts2.ejercicio7.model.Usuario;

public class AutenticationInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 9208738408867646153L;

	public static final String USUARIO = "usuario";

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		Map<String, Object> session = ActionContext.getContext().getSession();
		Usuario usuario = (Usuario) session.get(USUARIO);

		if (usuario == null) {
			return Action.LOGIN;
		}

		return actionInvocation.invoke();
	}

}
