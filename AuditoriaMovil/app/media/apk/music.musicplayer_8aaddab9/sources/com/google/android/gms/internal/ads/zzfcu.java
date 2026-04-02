package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class zzfcu implements zzfrz<Void> {
    public final /* synthetic */ zzfcx zza;
    public final /* synthetic */ zzfcy zzb;

    public zzfcu(zzfcy zzfcyVar, zzfcx zzfcxVar) {
        this.zzb = zzfcyVar;
        this.zza = zzfcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            zzfcy.zzb(this.zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Void r3) {
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zzb) {
            zzfcy.zzb(this.zzb, null);
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            i2 = this.zzb.zzf;
            if (i2 == 1) {
                this.zzb.zzh();
            }
        }
    }
}
