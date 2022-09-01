Algoritmo Coprimos
	//Nombre del alumno: Rosas Martinez Edgar Cain 
	//Un algoritmo que sea capaz de identificar los coprimos de 2 numeros diferentes de maximo 4 cifras.
	Repetir
		Escribir"Binevenido al algoritmo de numeros coprimos"
		Escribir "Escriba un numero"
		leer num
		num1<-""
		para p<-1 Hasta num Hacer
			cont<-0
			para s<-1 Hasta p Hacer
				Si p%s = 0 Entonces
					cont<-cont+1
					
				FinSi
			FinPara
			Si cont<=2 Entonces
				num1<-num1+","+ConvertirATexto(p)
			FinSi
		FinPara
		Escribir "Esta en la lista de numeros coprimos: " , num1
		
		Escribir "Deseas repetir el programa Si / No"
		leer respuesta
	Hasta Que respuesta== "no"
	Escribir "Gracias por usar el programa"
FinAlgoritmo
