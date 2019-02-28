public enum DeptEnum {
BE(“BACHELOR OF ENGINEERING”, 1), BCOM(“BACHELOR OF COMMERCE”, 2),
BSC(“BACHELOR OF SCIENCE”,
3), BARCH(“BACHELOR OF ARCHITECTURE”, 4),
DEFAULT(“BACHELOR”, 0);
private String accronym;
private int deptNo;
DeptEnum(String accr, int deptNo) {
this.accronym = accr;
this.deptNo = deptNo;
}

public String getAccronym() {
return accronym;
}
public int getDeptNo() {
return deptNo;
}

public static void main(String[] args) {
// Fetching the Enum using Enum name as string
DeptEnum env = DeptEnum.valueOf(“BE”);
System.out.println(env.getAccronym() + “ : “ + env.getDeptNo());
// Printing all the values of Enum
for (DeptEnum e : DeptEnum.values()) {
System.out.println(e.getAccronym() + “ : “ + e.getDeptNo()); }
// Compare the two enums using the the equals() method or using //the
== operator.
System.out.println(DeptEnum.BE == DeptEnum.valueOf(“BE”));
}
}