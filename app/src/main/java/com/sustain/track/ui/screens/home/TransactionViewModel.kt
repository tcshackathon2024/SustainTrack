package com.sustain.track.ui.screens.home

import androidx.lifecycle.ViewModel
import com.sustain.track.R
import com.sustain.track.modal.home.IconConfig
import com.sustain.track.modal.home.TransactionItem


class TransactionViewModel : ViewModel() {


val transactions = listOf(
    TransactionItem(
        vendor = "ICA",
        category = "Groceries",
        date = "2022-01-01",
        amount = 203.00,
        carbonPoints = 2.44,
        iconConfig = IconConfig(
            iconDrawable = R.drawable.transactions_home_ellipse_1,
            iconBgColor = R.drawable.transactions_home_vector2
        )
    ),
    TransactionItem(
        vendor = "Uber",
        category = "Fuel",
        date = "2023-01-01",
        amount = 500.00,
        carbonPoints = 5.44,
        iconConfig = IconConfig(
            iconDrawable = R.drawable.transactions_home_ellipse_2,
            iconBgColor = R.drawable.transactions_home_vector2
        )
    ),
    TransactionItem(
        vendor = "Apotek",
        category = "Medical",
        date = "2022-11-01",
        amount = 103.00,
        carbonPoints = 1.44,
        iconConfig = IconConfig(
            iconDrawable = R.drawable.transactions_home_ellipse_3,
            iconBgColor = R.drawable.transactions_home_vector2
        )
    ),
    TransactionItem(
        vendor = "ICA",
        category = "Groceries",
        date = "2022-01-01",
        amount = 203.00,
        carbonPoints = 2.44,
        iconConfig = IconConfig(
            iconDrawable = R.drawable.transactions_home_ellipse_4,
            iconBgColor = R.drawable.transactions_home_vector2
        )
    ),
    TransactionItem(
        vendor = "SL card",
        category = "Public Transportation",
        date = "2022-01-01",
        amount = 1203.00,
        carbonPoints = 0.44,
        iconConfig = IconConfig(
            iconDrawable = R.drawable.transactions_home_ellipse_3,
            iconBgColor = R.drawable.transactions_home_vector2
        )
    )
)
}