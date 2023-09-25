Algoritmo Ejercicio2
	Repetir
		Escribir 'Introduce un número del 0 al 10'
		Leer N
	Hasta Que N>=0 Y N<=10
	Escribir 'Tabla del ', N
	Para base<-0 Hasta 10 Con Paso 1 Hacer
		resultado <- N*base
		Escribir N, '*', base, ' = ', resultado
	FinPara
FinAlgoritmo
