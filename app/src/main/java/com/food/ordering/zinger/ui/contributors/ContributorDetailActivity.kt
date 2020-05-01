package com.food.ordering.zinger.ui.contributors

import android.animation.LayoutTransition
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.food.ordering.zinger.R
import com.food.ordering.zinger.data.local.PreferencesHelper
import com.food.ordering.zinger.databinding.ActivityContactUsBinding
import com.food.ordering.zinger.databinding.ActivityContributorDetailBinding
import com.food.ordering.zinger.databinding.ActivityContributorsBinding
import com.food.ordering.zinger.databinding.ActivityPaymentBinding
import com.food.ordering.zinger.ui.placeorder.PlaceOrderActivity
import com.food.ordering.zinger.utils.AppConstants
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class ContributorDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContributorDetailBinding
    private val preferencesHelper: PreferencesHelper by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        setListener()
    }

    private fun initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contributor_detail)
        binding.layoutContent.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    }

    private fun setListener(){
        binding.imageClose.setOnClickListener {
            onBackPressed()
        }
    }

}
