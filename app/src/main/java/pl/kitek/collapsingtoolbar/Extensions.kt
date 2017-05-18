@file:JvmName("ExtensionsUtils")

package pl.kitek.collapsingtoolbar

import android.content.res.Resources

fun dp2px(dp: Int): Float = dp * Resources.getSystem().displayMetrics.density
