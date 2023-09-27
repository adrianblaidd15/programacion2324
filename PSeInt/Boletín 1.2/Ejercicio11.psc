Algoritmo Ejercicio11
	Escribir "Dime tu edad"
	Leer edad
	Escribir "Dime un planeta entre Marte, Júpiter y Mercurio"
	Leer planet
	Si planet == "Júpiter" Entonces
		Escribir "Tu edad en Júpiter seria de " edad/11.86
	SiNo
		Si planet == "Marte" Entonces
			Escribir "Tu edad en Marte es de " edad/1.88
		SiNo
			Si planet == "Mercurio" Entonces
				Escribir "Tu edad en Mercurio seria de " edad/0.24
			SiNo
				Escribir "Te he dicho uno de esos planetas, no fui diseñado para otra cosa"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
