package EX02;
import java.util.List;

import EX02.test2DAO;
public class test2 {
//EMP table 을 출력하라 (단,Arraylist에 담고 출력하기)
public static void main(String[] args) {
	 test2DAO dao = test2DAO.Instance();
	 List<test2VO> st = dao.empselect();
	 
	 for(test2VO vo :st) {
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





