package com.asmr.assignment3.mvp_product.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.asmr.assignment3.R
import com.asmr.assignment3.mvp_product.model.Product
import com.asmr.assignment3.mvp_product.presenter.ProductPresenter

class ProductActivity : AppCompatActivity(), ProductView {

    private lateinit var presenter: ProductPresenter
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        listView = findViewById(R.id.productListView)
        presenter = ProductPresenter(this)
        presenter.loadProducts()
    }

    override fun displayProducts(products: List<Product>) {
        Toast.makeText(this, "Loaded ${products.size} products", Toast.LENGTH_SHORT).show()
        val productNames = products.map { "${it.name} - $${it.price}" }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, productNames)
        listView.adapter = adapter
    }
}
