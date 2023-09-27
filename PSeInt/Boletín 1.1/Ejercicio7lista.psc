Algoritmo Ejercicio7Conlista
	Definir i Como Entero
	Definir cant Como Entero
	Definir sum Como Entero
	Escribir 'Introduce la cantidad de numeros que querias'
	Leer cant
	Dimensionar num(cant)
	
	Mientras cant<=0 Hacer
		Escribir 'Tiene que ser una cantidad positiva'
		Leer cant
	FinMientras
	
	Escribir "Introduce los " ,cant ," números"  
	Para i<-1 Hasta cant Con Paso 1 Hacer
		Leer num[i]
		sum = sum + num[i]
	FinPara
	result = sum / cant
	Escribir "La media te da " result
FinAlgoritmo
