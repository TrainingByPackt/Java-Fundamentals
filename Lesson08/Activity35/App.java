public enum App {
  BE("BACHELOR OF ENGINEERING", 1), BCOM("BACHELOR OF COMMERCE", 2), BSC("BACHELOR OF SCIENCE", 3),
  BARCH("BACHELOR OF ARCHITECTURE", 4), DEFAULT("BACHELOR", 0);

  private String accronym;
  private int deptNo;

  App(String accr, int deptNo) {
    this.accronym = accr;
    this.deptNo = deptNo;
  }

  public String getAccronym() {
    return accronym;
  }

  public int getDeptNo() {
    return deptNo;
  }

  // reverse lookup
  public static App get(String accr) {
    for (App e : App.values()) {
      if (e.getAccronym().equals(accr))
        return e;
    }
    return App.DEFAULT;
  }

  public static void main(String[] args) {
    // Fetching Enum with value of Enum (reverse lookup)
    App noEnum = App.get("BACHELOR OF SCIENCE");
    System.out.println(noEnum.accronym + " : " + noEnum.deptNo);
    // Fetching Enum with value of Enum (reverse lookup)
    System.out.println(App.get("BACHELOR OF SCIENCE").name());
  }
}