package es.curso.struts2.ejercicio51.actions;

import java.io.File;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = -4550144045263169245L;

	static final Log LOG = LogFactory.getLog(FileUploadAction.class);

	public String execute() {
		String textos[] = {};
		for (String t : texto) {
			if (StringUtils.isNotBlank(t)) {
				textos = (String[]) ArrayUtils.add(textos, t);
			}
		}
		setTexto(textos.length == 0 ? null : textos);

		addActionMessage("Se ha enviado el formulario correctamente.");
		return SUCCESS;
	}

	private String[] texto;
	private File[] archivo;
	private String[] archivoFileName;
	private String[] archivoContentType;

	public String[] getTexto() {
		return texto;
	}

	public void setTexto(String[] texto) {
		this.texto = texto;
	}

	public File[] getArchivo() {
		return archivo;
	}

	public void setArchivo(File[] archivo) {
		this.archivo = archivo;
	}

	public String[] getArchivoFileName() {
		return archivoFileName;
	}

	public void setArchivoFileName(String[] archivoFileName) {
		this.archivoFileName = archivoFileName;
	}

	public String[] getArchivoContentType() {
		return archivoContentType;
	}

	public void setArchivoContentType(String[] archivoContentType) {
		this.archivoContentType = archivoContentType;
	}
}
