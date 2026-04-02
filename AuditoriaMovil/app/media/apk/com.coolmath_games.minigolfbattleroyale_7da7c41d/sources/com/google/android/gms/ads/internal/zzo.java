package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzcgz;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzo implements Callable<zzaas> {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzaas call() throws Exception {
        zzcgz zzcgzVar;
        Context context;
        zzcgzVar = this.zza.zza;
        String str = zzcgzVar.zza;
        context = this.zza.zzd;
        return new zzaas(zzaar.zzs(str, context, false));
    }
}
