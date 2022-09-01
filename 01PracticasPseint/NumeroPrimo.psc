Algoritmo NumeroPrimo
	//Nombre del alumno: Rosas Martinez Edgar Cain 
	//Un algoritmo que sea capaz de identificar si un numero es primo.
	Repetir
		Escribir"Binevenido al algoritmo de numeros primos"
		Escribir "Ingrese un numero"
		leer a
		
		contador<-0
		
		Para i<-1 Hasta a Hacer
			si a%i==0 Entonces
				contador<-contador+1
			FinSi
		FinPara
		si contador = 2 Entonces
			Escribir "El numero " , a, " es un numero primo"
		SiNo
			Escribir "El numero " , a, " no es un numero primo"
		FinSi
		Escribir "Deseas repetir el programa Si / No"
		leer respuesta
	Hasta Que respuesta == "no"
	Escribir "Gracias por usar el programa"
	
FinAlgoritmo
