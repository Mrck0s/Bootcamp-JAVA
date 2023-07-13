class Project {
  private String nombre;
  private String descripcion;
  private Double initialCost;

  public Project() {
  }
  public Project(String nombreParam, Double initialCostParam, String descripcionParam){
    this.nombre = nombreParam;
    this.initialCost = initialCostParam;
    this.descripcion = descripcionParam;
  }

  public String elevatorPitch() {
    return (this.nombre+"(" + this.initialCost+ ")" + ":" + this.descripcion);
  }

  public String elevatorPitch(String nombreParam, Double costParam) {
    this.nombre = nombreParam;
    this.initialCost = costParam;
    return (nombre +"(" + this.initialCost+ ")" + ":" + this.descripcion);
  }

  public String elevatorPitch(String nombreParam, Double costParam, String descripcionParam) {
    this.nombre = nombreParam;
    this.initialCost = costParam;
    this.descripcion = descripcionParam;
    return (nombre +"(" + this.initialCost+ ")" + ":" + this.descripcion);
  }
  public double getCost() {
    return initialCost;
  }

  

}