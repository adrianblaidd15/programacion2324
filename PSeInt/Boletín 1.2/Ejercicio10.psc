Algoritmo Ejercicio10
	num = 0
	Escribir "Bienvenido a Hogwarts, para saber de que casa eres tendras que responderme tres preguntas,¿Cúal es tu animal favorito entre, gato, sapo y lechuza?"
	Leer animal
	Escribir "Dime que color es tu favorito entre estos, rojo, verde, azul y amarillo"
	Leer color
	Escribir "¿Cúal es tu asignatura favorita? Encantamientos, Herbología o Pociones"
	Leer asig
	Si animal == "gato" Entonces
		num = num + 10
	SiNo
		Si animal == "sapo" Entonces
			num = num + 5
		SiNo
			Si animal == "lechuza" Entonces
				num = num + 0
			FinSi
		FinSi
	FinSi
	Si color == "" Entonces
	
	SiNo
		Si condicion Entonces
		
		SiNo
			Si condicion Entonces
			
			FinSi
		FinSi
	FinSi
FinAlgoritmo
