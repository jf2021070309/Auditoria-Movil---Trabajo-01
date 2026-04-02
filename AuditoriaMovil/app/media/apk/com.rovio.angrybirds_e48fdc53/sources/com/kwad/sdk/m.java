package com.kwad.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.SdkConfig;
/* loaded from: classes.dex */
public final class m {
    private static boolean ahA;
    private static long ahB;

    public static void a(Throwable th, String str) {
        l.a(com.kwai.adclient.kscommerciallogger.model.a.aNu, str);
        com.kwad.components.core.d.a.b(th);
        com.kwad.sdk.core.e.c.d("SDKRevertHelper", "onInitError revert");
    }

    public static void av(Context context) {
        if (SystemClock.elapsedRealtime() - ahB < 10000) {
            com.kwad.sdk.core.e.c.d("SDKRevertHelper", "onException revert");
            aw(context);
        }
    }

    private static void aw(Context context) {
        b(context, "curversion", "");
    }

    private static SdkConfig ax(Context context) {
        SdkConfig sdkConfig;
        try {
            sdkConfig = SdkConfig.create(c(context, "sdkconfig", ""));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            sdkConfig = null;
        }
        return sdkConfig == null ? new SdkConfig.Builder().build() : sdkConfig;
    }

    private static void b(Context context, String str, String str2) {
        try {
            context.getSharedPreferences("kssdk_api_pref", 0).edit().putString(str, str2).apply();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    private static String c(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences("kssdk_api_pref", 0).getString(str, str2);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return str2;
        }
    }

    public static void checkInitSDK(Context context) {
        try {
            if (KsAdSDKImpl.get().hasInitFinish()) {
                return;
            }
            KsAdSDK.init(context, ax(context));
        } catch (Throwable th) {
            com.kwad.components.core.d.a.b(th);
        }
    }

    public static void k(Throwable th) {
        a(th, Log.getStackTraceString(th));
    }

    public static void xS() {
        if (ahA) {
            return;
        }
        ahA = true;
        ahB = SystemClock.elapsedRealtime();
    }
}
