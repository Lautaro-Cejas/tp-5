# Trabajo Práctico 5 - Relaciones UML 1 a 1

## 📋 Descripción
Este trabajo práctico implementa relaciones UML 1 a 1 en Java, incluyendo asociación unidireccional, dependencia de uso y dependencia de creación. Se utilizan diagramas UML con UMLetino y se validan con código.

## 🎯 Objetivos
- Aplicar relaciones UML 1 a 1.
- Diseñar diagramas UML con UMLetino.
- Implementar asociaciones y dependencias en Java.

## 📦 Sistema Implementado
Incluye ejercicios como:
- Ejercicio 1: Pasaporte - Foto - Titular (Composición: Pasaporte → Foto; Asociación bidireccional: Pasaporte ↔ Titular).
- Ejercicio 2: Celular - Batería - Usuario (Agregación: Celular → Batería; Asociación bidireccional: Celular ↔ Usuario).
- Ejercicio 3: Libro - Autor - Editorial (Asociación unidireccional: Libro → Autor; Agregación: Libro → Editorial).
- Ejercicio 4-11: Ejercicios similares con variaciones en asociaciones y dependencias (ej. Reproductor - Canción - Artista con dependencia de uso).
- Ejercicio 12: Calculadora - Impuesto - Contribuyente (Dependencia de uso: Calculadora → Impuesto; Asociación unidireccional: Impuesto → Contribuyente).
- Ejercicio 13: GeneradorQR - CodigoQR - Usuario (Dependencia de creación: GeneradorQR → CodigoQR; Asociación unidireccional: CodigoQR → Usuario).
- Ejercicio 14: EditorVideo - Render - Proyecto (Dependencia de creación: EditorVideo → Render; Asociación unidireccional: Render → Proyecto).

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
