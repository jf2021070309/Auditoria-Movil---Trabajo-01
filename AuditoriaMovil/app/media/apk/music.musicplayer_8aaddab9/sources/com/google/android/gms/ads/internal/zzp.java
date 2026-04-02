package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzp extends AsyncTask<Void, Void, String> {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzp(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (zzs.zze(this.zza) == null || str2 == null) {
            return;
        }
        zzs.zze(this.zza).loadUrl(str2);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzh(zzsVar, (zzaas) zzs.zzc(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e2) {
            e = e2;
            zzcgt.zzj("", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzcgt.zzj("", e);
        } catch (TimeoutException e4) {
            zzcgt.zzj("", e4);
        }
        return this.zza.zzT();
    }
}
