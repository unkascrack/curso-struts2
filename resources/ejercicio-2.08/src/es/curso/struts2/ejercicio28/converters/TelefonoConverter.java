package es.curso.struts2.ejercicio28.converters;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

import es.curso.struts2.ejercicio28.model.Telefono;

@SuppressWarnings("rawtypes")
public class TelefonoConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		String telefonoString = values[0];
		if (telefonoString != null && telefonoString.length() > 0 && !Telefono.isTelefono(telefonoString)) {
			throw new TypeConversionException(
					"Formato número teléfono incorrecto (XXX-XXX-XXX).");
		}
		return new Telefono(telefonoString);
	}

	@Override
	public String convertToString(Map context, Object o) {
		return o != null ? ((Telefono)o).getValue() : null;
	}

}
