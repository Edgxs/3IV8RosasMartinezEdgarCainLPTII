Algoritmo trabajadores
	//pago de nomina quincinal
	
	horas<-0
	dias<-0
	salario<-0
	total<-0
	
	Escribir "Cuantas horas trabajo al dia"
	Leer horas
	Si horas < 11 Entonces
		Si horas > 8 Entonces
			horasextra<-horas-8
			Escribir "Cuantos dias trabajo"
			Leer dias
			Si dias < 15
				Escribir "Cual es el su salario al dia"
				leer salario
				totalhorasextra<-(horasextra*salario*2*dias)
				totaln<-horas*dias*salario
				total<-totalhorasextra+totaln
				Escribir total
			SiNo
				Escribir "El maximo de sus dias es 15"
			FinSi
			
		FinSi
	SiNo
		Escribir "No puedes haber trabajado mas horas"
	FinSi
	
FinAlgoritmo
