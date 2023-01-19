package ejercicioRepaso01;

public class Principal
{

	public static void main(String[] args)
	{
	Raza raza1 = new Raza ("Pastor Belga");
	Raza raza2 = new Raza ("Pastor Aleman");
	Raza raza3 = new Raza ("Gran Danes");
	
	Perro perro1 = new Perro (raza1, 1.2f, 10, "marron");
	Perro perro2 = new Perro (raza2, 2.2f, 18, "negro");
	Perro perro3 = new Perro (raza3, 0.2f, 4, "blanco");

	System.out.println("La raza del perro es: "+perro1.getRaza()+", su tamaño es: "+perro1.getTamano()+", su edad es: "+perro1.getEdad()+" y es de color "+perro1.getColor());
	System.out.println("La raza del perro es: "+perro2.getRaza()+", su tamaño es: "+perro2.getTamano()+", su edad es: "+perro2.getEdad()+" y es de color "+perro2.getColor());
	System.out.println("La raza del perro es: "+perro3.getRaza()+", su tamaño es: "+perro3.getTamano()+", su edad es: "+perro3.getEdad()+" y es de color "+perro3.getColor());

	System.out.println("La raza del perro es: "+perro1.getRaza()+", su tamaño es: "+perro1.getTamano()+", su edad es: "+perro1.getEdad()+" y es de color "+perro1.getColor());

	}
}
