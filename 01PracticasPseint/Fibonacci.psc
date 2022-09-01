Algoritmo Fibonacci
	Repetir
		Definir x Como Entero
		Escribir"Binevenido al algoritmo de la serie de fibonacci"
		Escribir "Ingrese el numero maximo de la serie:"
		leer x
		
		num1<-0
		num2<-1
		Para i<-1 Hasta x Hacer
			Escribir num1
			num3<-num1+num2
			num1<-num2
			num2<-num3
		FinPara
		Escribir "Deseas repetir el programa Si / No"
		leer respuesta
	Hasta Que respuesta== "no"
	Escribir "Gracias por usar el programa"
FinAlgoritmo
