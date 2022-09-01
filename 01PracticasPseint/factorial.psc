Algoritmo factorial
	//Nombre del alumno: Rosas Martinez Edgar Cain 
	//Un algoritmo que sea capaz de realizar el factorial de un numero.
	
	Repetir
		Escribir"Binevenido al algoritmo del factorial de un numero"
		Definir a, b como numero
		b<-1
		Escribir "Ingrese un numero"
		leer a
		para i<-1 Hasta a con paso 1 Hacer
			b=b*i
		FinPara
		Escribir "El factorial de ", a, " Es: ", b
		Escribir "Deseas repetir el programa Si / No"
		leer respuesta
	Hasta Que respuesta== "no"
	Escribir "Gracias por usar el programa"
	
FinAlgoritmo
