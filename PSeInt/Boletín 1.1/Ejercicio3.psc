Algoritmo Ejercicio3
	cant = 0
	num = 0
	Repetir
		Escribir "¿Cuantos números queires?"
		Leer cant
	Hasta Que cant >0
	Para j<-1 Hasta cant Con Paso 1 Hacer
		Leer num
		Si num %2 = 0 Entonces
			Escribir "Es par"
		SiNo
			Escribir "Es impar"
		FinSi
	FinPara
FinAlgoritmo
