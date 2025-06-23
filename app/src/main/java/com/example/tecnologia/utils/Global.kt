package com.example.tecnologia.utils

// Definición de las clases de datos
data class Producto(
    val id: Int,
    val nombre: String,
    val departamento: String,
    val ventasTotales: Double,
    val unidadesVendidas: Int
)

data class VentaProducto(
    val category: String,
    val total_sales: Int,
    val units_sold: Int,
    val sales_period: String
)

// Listas mutables con datos de ejemplo
val productList = mutableListOf(
    Producto(1, "Leche", "Managua", 50000.0, 25000),
    Producto(2, "Yogur", "Masaya", 30000.0, 15000),
    Producto(3, "Queso", "Granada", 20000.0, 10000)
)

val listaVentas = mutableListOf(
    VentaProducto("Leche", 120000, 50000, "2024-Q1"),
    VentaProducto("Yogur", 80000, 40000, "2024-Q1"),
    VentaProducto("Queso", 100000, 45000, "2024-Q1")
)
