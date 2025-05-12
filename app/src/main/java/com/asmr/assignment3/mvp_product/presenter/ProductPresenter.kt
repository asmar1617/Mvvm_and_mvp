package com.asmr.assignment3.mvp_product.presenter

import com.asmr.assignment3.mvp_product.model.Product
import com.asmr.assignment3.mvp_product.view.ProductView

class ProductPresenter(private val view: ProductView) {

    fun loadProducts() {
        val products = listOf(
            Product("Laptop", "1200.0"),
            Product("Smartphone", "800.0"),
            Product("Headphones", "150.0")
        )
        view.displayProducts(products)
    }
}
