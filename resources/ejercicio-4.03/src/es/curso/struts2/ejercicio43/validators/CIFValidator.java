package es.curso.struts2.ejercicio43.validators;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class CIFValidator extends FieldValidatorSupport {

	private static final String[] LETRAS_CIF_ORGANIZACION = { "A", "B", "C",
			"D", "E", "F", "G", "H", "J", "N", "P", "Q", "S", "R", "U", "V",
			"W" };

	private static final String[] ALFANUMERICO_CIF_DIGITOCONTROL = { "A", "1",
			"B", "2", "C", "3", "D", "4", "E", "5", "F", "6", "G", "7", "H",
			"8", "I", "9", "J", "0" };

	private static final String[] LETRAS_CIF_DIGITOCONTROL = { "J", "A", "B",
			"C", "D", "E", "F", "G", "H", "I" };

	/**
	 * Método que valida si un CIF es correcto, para realizar el calculo hay que
	 * hacer lo siguiente:
	 * 
	 * 1º. Sumar los dígitos de las posiciones pares. Suma = A
	 * 
	 * 2º. Para cada uno de los dígitos de las posiciones impares, multiplicarlo
	 * por 2 y sumar los dígitos del resultado. Ejemplo: (8 * 2 = 16 --> 1 + 6 *
	 * = 7)
	 * 
	 * 3º. Acumular el resultado. Suma = B
	 * 
	 * 4º. Sumar A + B = C
	 * 
	 * 5º. Tomar sólo el dígito de las unidades de C y restárselo a 10. Esta
	 * resta nos da D.
	 * 
	 * 6º. A partir de D ya se obtiene el dígito de control. Si ha de ser
	 * numérico es directamente D y si se trata de una letra se corresponde con
	 * la relación: A = 1, B = 2, C= 3, D = 4, E = 5, F = 6, G = 7, H = 8, I =
	 * 9, J = 0
	 * 
	 */
	@Override
	public void validate(Object object) throws ValidationException {
		String fieldName = getFieldName();
		String value = (String) getFieldValue(fieldName, object);
		if (value != null && value.trim().length() > 0) {
			String organizacion = value.substring(0, 1).toUpperCase();
			String numero = value.substring(1, value.length() - 1);
			String control = value.substring(value.length() - 1).toUpperCase();

			if (!ArrayUtils.contains(LETRAS_CIF_ORGANIZACION, organizacion)
					|| !StringUtils.isNumeric(numero)
					|| numero.length() != 7
					|| !ArrayUtils.contains(ALFANUMERICO_CIF_DIGITOCONTROL,
							control)) {
				addFieldError(fieldName, object);
			} else {

				int sumaPares = 0;
				int sumaImpares = 0;

				try {
					for (int i = 0; i < numero.length(); i++) {
						int digito = Integer.parseInt(numero
								.substring(i, i + 1));
						if (isPar(i + 1)) {
							sumaPares += digito;
						} else {
							int sumaParcial = 2 * digito;
							if (sumaParcial > 9) {
								String aux = String.valueOf(sumaParcial);
								sumaParcial = Integer.parseInt(aux.substring(0,
										1))
										+ Integer.parseInt(aux.substring(1, 2));
							}
							sumaImpares += sumaParcial;
						}
					}

					String sumaTotal = String.valueOf(sumaPares + sumaImpares);
					int digitocontrol = 10 - Integer.parseInt(sumaTotal
							.substring(sumaTotal.length() - 1,
									sumaTotal.length()));
					digitocontrol = digitocontrol == 10 ? 0 : digitocontrol;

					if ((StringUtils.isNumeric(control) && digitocontrol != Integer
							.parseInt(control))
							|| (StringUtils.isAlpha(control) && !control
									.equals(LETRAS_CIF_DIGITOCONTROL[digitocontrol]))) {
						addFieldError(fieldName, object);
					}
				} catch (NumberFormatException e) {
					addFieldError(fieldName, object);
				}
			}
		}
	}

	private boolean isPar(int i) {
		return i % 2 == 0;
	}
}
