package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class EmpregadoList_Aula96 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> listFunc = new ArrayList<>();
		
		System.out.print("Entre com o n�mero de profissionais que ir� cadastrar: ");
		int funcion�rio = sc.nextInt();
		
		for(int i=0; i < funcion�rio; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(listFunc, id)) {
				System.out.println("O ID j� foi cadastrado: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double salary = sc.nextDouble();
			
			Empregado emp = new Empregado(id, name, salary);
			
			listFunc.add(emp);
			
		}
		
		System.out.print("Entre com o ID do funcion�rio que deseja realizar o aumento: ");
		int idSalario = sc.nextInt();
		
		Empregado emp = listFunc.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("N�o existe funcion�rio com esse Id");
		} else {
			System.out.print("Entre com a porcentagem de aumento: ");
			Double porcent = sc.nextDouble();
			emp.calculaAumento(porcent);
		}

		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for (Empregado e : listFunc) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Empregado> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
