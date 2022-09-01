Algoritmo NumeroParImpar
	//Nombre del alumno: Rosas Martinez Edgar Cain 
	//Un algoritmo que capaz de identificar si un numero es par o impar
	Repetir
		Escribir "Ingrese un numero"
		Leer a
		
		si a mod 2=0 Entonces
			Escribir "El numero ", a " es un numero par"
		SiNo
			Escribir "El numero ", a " es un numero impar"
		FinSi
		a<- 0
		Escribir "Deseas repetir el programa Si / No"
		leer respuesta
	Hasta Que respuesta== "no"
	Escribir "Gracias por usar el programa"
FinAlgoritmo