Algoritmo Ejercicio6
	nA <- 0
	nB <- 0
	result = 0
	Repetir
		Escribir 'Introduce dos números enteros'
		Leer nA
		Leer nB
		compA <- nA-redon(nA)
		compB <- nB-redon(nB)
	Hasta Que compA=Entero Y compB=Entero
	Para j<-1 Hasta nA Con Paso 1 Hacer
		result = result + nB
	FinPara
	Escribir "El producto de " nA " *" nb " es "  result
FinAlgoritmo
