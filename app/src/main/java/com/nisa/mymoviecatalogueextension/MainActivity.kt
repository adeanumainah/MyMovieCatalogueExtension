package com.nisa.mymoviecatalogueextension

import android.app.Activity
import android.content.Intent
import com.nisa.mymoviecatalogueextension.base.view.BaseActivity
import com.nisa.mymoviecatalogueextension.databinding.ActivityMainBinding
import com.nisa.mymoviecatalogueextension.presentation.main.MainViewModel
import com.nisa.mymoviecatalogueextension.presentation.splash.SplashActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutResourceId: Int = R.layout.activity_main
    override val classTypeOfViewModel: Class<MainViewModel> = MainViewModel::class.java


    companion object{
        fun start(activity: SplashActivity){
            activity.startActivity(Intent(activity, MainActivity::class.java))
        }
    }



}