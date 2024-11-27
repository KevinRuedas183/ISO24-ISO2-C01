public class MapaActivoDatos {

	private int id;
	private string nombre;
	private string descripcion;
	private string calidad;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(string descripcion) {
		this.descripcion = descripcion;
	}

	public string getCalidad() {
		return this.calidad;
	}

	/**
	 * 
	 * @param calidad
	 */
	public void setCalidad(string calidad) {
		this.calidad = calidad;
	}

	public string optenerDatos() {
		// TODO - implement MapaActivoDatos.optenerDatos
		throw new UnsupportedOperationException();
	}

}