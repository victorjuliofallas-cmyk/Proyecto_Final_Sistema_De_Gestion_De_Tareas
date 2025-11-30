# Proyecto_Final_Sistema_De_Gestion_De_Tareas
Aplicación de consola en Java para la gestión de tareas (To-Do List). Proyecto final implementando Programación Orientada a Objetos (POO), ArrayList y arquitectura por capas.
# 📝 Sistema de Gestión de Tareas (Java)

## 📖 Descripción del Proyecto
Este repositorio contiene el **Proyecto Final** del curso de Programación. Se trata de una aplicación de consola desarrollada en **Java** que simula un gestor de tareas inteligente (To-Do List).

El objetivo principal del proyecto fue aplicar conceptos fundamentales de **Programación Orientada a Objetos (POO)** y manejo de **Estructuras de Datos Dinámicas**.

## 🚀 Funcionalidades Principales
El sistema permite realizar un ciclo completo de gestión (CRUD):
* ✅ **Agregar Tareas:** Permite ingresar ID, título y descripción.
* 📋 **Listar Tareas:** Muestra todas las tareas registradas con su estado actual (Pendiente/Completada).
* ✅ **Marcar como Completada:** Actualiza el estado de una tarea específica mediante su ID.
* 🗑️ **Eliminar Tareas:** Remueve tareas de la lista dinámicamente.
* 🔙 **Navegación Segura:** Opción de cancelar acciones (volver al menú) para evitar errores de usuario.
* 💾 **Datos de Prueba:** El sistema inicia con datos precargados para facilitar la demostración.

## 🛠️ Tecnologías y Conceptos Aplicados
Este proyecto demuestra el dominio de los siguientes conceptos técnicos:

* **Lenguaje:** Java (JDK 21).
* **Estructuras de Datos:** Uso de `ArrayList<Tarea>` para el manejo dinámico de la memoria (sin límites fijos como los arreglos).
* **POO (Programación Orientada a Objetos):**
    * **Encapsulamiento:** Uso de atributos `private` y métodos `Getters/Setters`.
    * **Clases y Objetos:** Modelado de la entidad `Tarea`.
* **Arquitectura de Software:** Separación de responsabilidades en 3 capas:
    1.  **Modelo (`Tarea.java`):** Define la estructura de los datos.
    2.  **Controlador (`GestorTareas.java`):** Contiene la lógica de negocio (agregar, buscar, eliminar).
    3.  **Vista (`Main.java`):** Maneja la interacción con el usuario (Menú y Scanner).

## 📂 Estructura del Proyecto
```text
src/
├── Tarea.java          # Definición del objeto Tarea (Atributos y Constructor)
├── GestorTareas.java   # Lógica para administrar el ArrayList
└── Main.java           # Punto de entrada y Menú Interactivo
