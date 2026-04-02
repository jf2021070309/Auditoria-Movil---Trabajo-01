package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.zzhw;
import com.google.android.gms.internal.pal.zzic;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class zzo extends Thread {
    final /* synthetic */ String zza;

    public zzo(zzs zzsVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str = this.zza;
        try {
            zzic zza = zzhw.zza();
            URLConnection zzb = zza.zzb(new URL(str), 26624);
            ((HttpURLConnection) zzb).setConnectTimeout(zzat.zzb);
            ((HttpURLConnection) zzb).setReadTimeout(zzat.zzc);
            ((HttpURLConnection) zzb).setDoInput(false);
            ((HttpURLConnection) zzb).setUseCaches(false);
            ((HttpURLConnection) zzb).getResponseCode();
            zza.close();
        } catch (IOException unused) {
        }
    }
}
