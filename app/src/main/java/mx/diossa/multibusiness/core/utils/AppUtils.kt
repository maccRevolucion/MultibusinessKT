package mx.diossa.multibusiness.core.utils

import android.content.Context

fun getAppVersionName(context: Context): String? {
    return try {
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        packageInfo.versionName
    } catch (e: Exception) {
        "unknown"
    }
}