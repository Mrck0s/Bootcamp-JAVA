import java.util.ArrayList;

public class Portfolio {

  private ArrayList<Project> projects;

  public Portfolio() {
    projects = new ArrayList<Project>();
  }

  public Double getPortfolioCost() {
    double costTotal = 0;
    for (int i = 0; i < projects.size(); i++) {
      Project project = projects.get(i);
      double cost = project.getCost();
      costTotal += cost;
    }
    return costTotal;
  }

  public static void main(String[] args) {
    Portfolio portfolio = new Portfolio();

    portfolio.projects.add(new Project("Detergente", 230.5, "Vegano"));
    portfolio.projects.add(new Project("Jabon", 130.4, "Vegano"));
    portfolio.projects.add(new Project("Dentifrico", 140.7, "Vegano"));
    double totalCost = Math.floor(portfolio.getPortfolioCost());
    System.out.println("Total portfolio cost: " + totalCost);
  }
}
