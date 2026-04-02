package com.google.android.gms.measurement.internal;

import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzkf extends zzam {
    public final /* synthetic */ zzkg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkf(zzkg zzkgVar, zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = zzkgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzc() {
        this.zza.zza();
        a.G(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzV();
    }
}
