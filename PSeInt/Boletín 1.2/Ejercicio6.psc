Algoritmo sin_titulo
	Escribir 'Introduce el tipo de vehiculo'
	Leer vehiculo
	Si vehiculo == "coche" Entonces
		Escribir "Tu velocidad es 120 km/h"
	SiNo
		Si vehiculo == "moto" Entonces
			Escribir "Tu velocidad es de 90 km/h"
		SiNo
			Si vehiculo == "camión" Entonces
				Escribir "Tu velocidad es de 80km/h"
			SiNo
				Escribir "No conozco ese vehiculo"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
