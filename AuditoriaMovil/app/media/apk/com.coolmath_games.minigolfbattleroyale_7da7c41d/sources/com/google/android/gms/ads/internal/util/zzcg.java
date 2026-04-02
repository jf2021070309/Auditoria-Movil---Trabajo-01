package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class zzcg implements Callable<String> {
    final /* synthetic */ Context zza;
    final /* synthetic */ Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcg(zzch zzchVar, Context context, Context context2) {
        this.zza = context;
        this.zzb = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.zza != null) {
            zze.zza("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zza.getSharedPreferences("admob_user_agent", 0);
        } else {
            zze.zza("Attempting to read user agent from local cache.");
            sharedPreferences = this.zzb.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zze.zza("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.zzb);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zze.zza("Persisting user agent.");
            }
        }
        return string;
    }
}
