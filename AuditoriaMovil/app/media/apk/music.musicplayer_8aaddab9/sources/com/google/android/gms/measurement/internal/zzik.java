package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzik implements Runnable {
    public final /* synthetic */ zzio zza;

    public zzik(zzio zzioVar) {
        this.zza = zzioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzih zzihVar;
        zzio zzioVar = this.zza;
        zzihVar = zzioVar.zzh;
        zzioVar.zza = zzihVar;
    }
}
