package com.drake.softinput.example.base

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.drake.engine.base.EngineActivity
import com.drake.softinput.example.R
import com.drake.softinput.example.ui.activity.MainActivity
import com.drake.softinput.example.ui.activity.SampleDialogActivity
import com.drake.softinput.example.ui.activity.SampleFragmentActivity

/** 为所有子类添加菜单 */
abstract class BaseMenuActivity<B : ViewDataBinding>(@LayoutRes contentLayoutId: Int = 0) : EngineActivity<B>(contentLayoutId) {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_act -> startActivity(Intent(this, MainActivity::class.java))
            R.id.menu_fragment -> startActivity(Intent(this, SampleFragmentActivity::class.java))
            R.id.menu_dialog -> startActivity(Intent(this, SampleDialogActivity::class.java))
        }
        finish()
        return super.onOptionsItemSelected(item)
    }
}