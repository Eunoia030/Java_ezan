package EX03;
import java.util.List;
public class test3 {
//EMP,DEPT  join table 을 출력하라 (단,Arraylist에 담고 출력하기)
public static void main(String[] args) {
	 test3DAO dao = test3DAO.Instance();
	 List<test3VO> st = dao.empselect();
	 
	 for(test3VO vo :st) {
		 System.out.print(vo.getEmpno()+"\t");
		 System.out.print(vo.getEname()+"\t");
		 System.out.print(vo.getJob()+"\t");
		 System.out.print(vo.getMgr()+"\t");
		 System.out.print(vo.getDate()+"\t");
		 System.out.print(vo.getSal()+"\t");
		 System.out.print(vo.getComm()+"\t");
		 System.out.print(vo.getDeptno()+"\t");
		 System.out.println();
		 
	 }

      }
}





