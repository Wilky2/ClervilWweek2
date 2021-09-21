package core.playbook;

import core.model.course.Course;
import core.model.human.Professor;
import core.model.human.Student;
import core.model.material.Material;
import core.view.features.Features;

public class PlayBook {

	public static void main(String[] args) {
		
		Features.display("Voici un exmple pour de test pour nos classes.\n\n");
		
		Student wilky = new Student("Wilky","Clervil",010101);
		Features.display(wilky.toString()+"\n\n");
		
		Professor clervil = new Professor("Clervil","Wilky",2010202);
		Features.display(clervil.toString()+"\n\n");
		
		Course java = new Course(0102303,"Java",4,"Cours de programmation "
				+ "orienté objet avec Java");
		Features.display(java.toString()+"\n\n");
		
		Material jdk = new Material(1029101,"JDK","16.0.2","Oracle","ensemble de bibliothèques "
				+ "logicielles de base du langage "
				+ "de programmation Java","Framework et EDI",2021);
		
		Features.display(jdk.toString() + "\n\n");
	}

}
