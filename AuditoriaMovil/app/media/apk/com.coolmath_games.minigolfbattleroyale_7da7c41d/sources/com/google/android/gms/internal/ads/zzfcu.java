package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfcu implements zzfrz<Void> {
    final /* synthetic */ zzfcx zza;
    final /* synthetic */ zzfcy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        int i;
        synchronized (this.zzb) {
            zzfcy.zzb(this.zzb, null);
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            i = this.zzb.zzf;
            if (i == 1) {
                this.zzb.zzh();
            }
        }
    }
}
