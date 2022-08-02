package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val foodFragment = FoodFragment();
    val drinkFragment = DrinksFrag();

    override fun onCreateOptionsMenu(menu:Menu):Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.foodmenu,menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.Food -> supportFragmentManager.beginTransaction().apply{
                replace(R.id.FLFragment,foodFragment)
                commit()
            }
                R.id.Drinks -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FLFragment,drinkFragment)
                    commit()
                }
              }
        return true;
    }

}