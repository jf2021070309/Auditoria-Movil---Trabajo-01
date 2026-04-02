package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzcf implements Callable<String> {
    public final /* synthetic */ Context zza;

    public zzcf(zzch zzchVar, Context context) {
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences = this.zza.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            zze.zza("User agent is already initialized on Google Play Services.");
            return string;
        }
        zze.zza("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.zza);
        SharedPreferencesUtils.publishWorldReadableSharedPreferences(this.zza, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
