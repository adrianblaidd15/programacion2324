Algoritmo Ejercicio4
	a <- 0
	Escribir 'Dame un número positivo'
	Leer num
	Mientras num<0 Hacer
		Escribir 'Espabila, que te he dicho positivo, ¿y tu tienes la eso?'
		Leer num
	FinMientras
	Para sum<-1 Hasta num Con Paso 1 Hacer
		a = a + sum
	FinPara
	Escribir 'La suma de los ", num , " primeros números es : ', a
FinAlgoritmo
