package EX02;
//emp
public class test2VO {
	 private int empno;			
	 private  String ename;	
	 private String job;	
	 private int mgr;
	 private String date;
	 private int sal;	
	 private int comm;
	 private int deptno;
	 
	 
	 
	 
	 
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}






	@Override
	public String toString() {
		return "test2VO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", date=" + date
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	


}
