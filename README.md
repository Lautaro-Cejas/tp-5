# Trabajo Práctico 5 - Relaciones UML 1 a 1

## 📋 Descripción
Este trabajo práctico implementa relaciones UML 1 a 1 en Java, incluyendo asociación unidireccional, dependencia de uso y dependencia de creación. Se utilizan diagramas UML con UMLetino y se validan con código.

## 🎯 Objetivos
- Aplicar relaciones UML 1 a 1.
- Diseñar diagramas UML con UMLetino.
- Implementar asociaciones y dependencias en Java.

## 📦 Sistema Implementado
Incluye 14 ejercicios con clases, diagramas UML y relaciones 1 a 1:

- Ejercicio 1: Pasaporte - Foto - Titular (Composición: Pasaporte → Foto; Asociación bidireccional: Pasaporte ↔ Titular).
- Ejercicio 2: Celular - Batería - Usuario (Agregación: Celular → Batería; Asociación bidireccional: Celular ↔ Usuario).
- Ejercicio 3: Libro - Autor - Editorial (Asociación unidireccional: Libro → Autor; Agregación: Libro → Editorial).
- Ejercicio 4: TarjetaDeCrédito - Cliente - Banco (Asociación bidireccional: TarjetaDeCrédito ↔ Cliente; Agregación: TarjetaDeCrédito → Banco).
- Ejercicio 5: Computadora - PlacaMadre - Propietario (Composición: Computadora → PlacaMadre; Asociación bidireccional: Computadora ↔ Propietario).
- Ejercicio 6: Reserva - Cliente - Mesa (Asociación unidireccional: Reserva → Cliente; Agregación: Reserva → Mesa).
- Ejercicio 7: Vehículo - Motor - Conductor (Agregación: Vehículo → Motor; Asociación bidireccional: Vehículo ↔ Conductor).
- Ejercicio 8: Documento - FirmaDigital - Usuario (Composición: Documento → FirmaDigital; Agregación: FirmaDigital → Usuario).
- Ejercicio 9: CitaMédica - Paciente - Profesional (Asociación unidireccional: CitaMédica → Paciente y CitaMédica → Profesional).
- Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular (Composición: CuentaBancaria → ClaveSeguridad; Asociación bidireccional: CuentaBancaria ↔ Titular).
- Ejercicio 11: Reproductor - Canción - Artista (Asociación unidireccional: Canción → Artista; Dependencia de uso: Reproductor → Canción).
- Ejercicio 12: Calculadora - Impuesto - Contribuyente (Asociación unidireccional: Impuesto → Contribuyente; Dependencia de uso: Calculadora → Impuesto).
- Ejercicio 13: GeneradorQR - CodigoQR - Usuario (Asociación unidireccional: CodigoQR → Usuario; Dependencia de creación: GeneradorQR → CodigoQR).
- Ejercicio 14: EditorVideo - Render - Proyecto (Asociación unidireccional: Render → Proyecto; Dependencia de creación: EditorVideo → Render).

## 🚀 Cómo Ejecutar
### Requisitos
- Java JDK 17+.
- UMLetino.
- IDE o terminal.

### Pasos
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Lautaro-Cejas/tp-5.git
   ```
2. Accede al directorio:
   ```bash
   cd tp-5
   ```
3. Compila:
   ```bash
   javac -d bin src/ejercicio*/*.java
   ```
4. Ejecuta:
   ```bash
   java -cp bin Main
   ```

## 📂 Estructura
```
tp-5-uml-1a1/
├── src/
│   ├── *.java
├── docs/
├── README.md
└── .gitignore
```

## 👨‍💻 Autor
Nombre: Lautaro Cejas  
Materia: Programación II  

---
*Tecnicatura Universitaria en Programación - Programación II*

---
