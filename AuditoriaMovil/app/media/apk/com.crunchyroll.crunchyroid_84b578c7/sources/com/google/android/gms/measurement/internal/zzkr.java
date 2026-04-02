package com.google.android.gms.measurement.internal;

import com.amazon.aps.iva.k6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzkr extends zzan {
    final /* synthetic */ zzks zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkr(zzks zzksVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        this.zza.zza();
        p.e(this.zza.zzt, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzX();
    }
}
