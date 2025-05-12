package com.asmr.assignment3.mvp_product.view

import com.asmr.assignment3.mvp_product.model.Product

interface ProductView {
    fun displayProducts(products: List<Product>)
}
