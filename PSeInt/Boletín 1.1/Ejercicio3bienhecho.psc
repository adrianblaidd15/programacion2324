Algoritmo Ejercicio3
	cant <- 0
	num <- 0
	Repetir
		Escribir 'Cuantos números quieres introducir'
		Leer cant
	Hasta Que cant>0
	Dimensionar resul(cant)
	Definir resul Como Entero
	Escribir 'Introduce los numeros'
	Para j<-1 Hasta cant Con Paso 1 Hacer
		Leer num
		resul[j] <- num
	FinPara
	Para j<-1 Hasta cant Con Paso 1 Hacer
		Si resul[j] MOD 2=0 Entonces
			Escribir 'El ', resul[j], ' es par'
		SiNo
			Escribir 'El ', resul[j], 'es impar'
		FinSi
	FinPara
FinAlgoritmo
