package com.didichuxing.doraemonkit.kit.mc.ability

import com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.AbsDoKitInterceptor
import com.didichuxing.doraemonkit.util.LogHelper
import okhttp3.Interceptor
import okhttp3.Response

/**
 * ================================================
 * 作    者：jint（金台）
 * 版    本：1.0
 * 创建日期：2021/6/7-20:03
 * 描    述：一机多控抓包拦截器
 * 修订历史：
 * ================================================
 */
class DokitMcInterceptor : AbsDoKitInterceptor() {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}