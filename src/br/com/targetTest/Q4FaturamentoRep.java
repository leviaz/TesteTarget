package br.com.targetTest;



public class Q4FaturamentoRep {
	 public static void main(String[] args) {
		 	Double vlrSp = 67836.43;
		 	Double vlrRj = 36678.66;
		 	Double vlrMg = 29229.88;
		 	Double vlrES = 27165.48;
		 	Double vlrOu = 19849.53;
		 	
		 	Double totEst = vlrSp+vlrRj+vlrMg+vlrES+vlrOu;
		 	
		 	Double repSp =(vlrSp/totEst)*100;
		 	Double repRj =(vlrRj/totEst)*100;
		 	Double repMg =(vlrMg/totEst)*100;
		 	Double repEs =(vlrES/totEst)*100;
		 	Double repOuEst =(vlrOu/totEst)*100;
		 	System.out.println("A representatividade do estado de São Paulo foi de "+repSp+"%");
		 	System.out.println("A representatividade do estado de Rio de Janeiro foi de "+repRj+"%");
		 	System.out.println("A representatividade do estado de Minas Gerais foi de "+repMg+"%");
		 	System.out.println("A representatividade do estado de Espiríto Santo foi de "+repEs+"%");
		 	System.out.println("A representatividade dos outros estados foi de "+repOuEst+"%");
	    }
}
