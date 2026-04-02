package com.google.android.gms.measurement.internal;

import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzja extends zzam {
    public final /* synthetic */ zzjo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzja(zzjo zzjoVar, zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = zzjoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzc() {
        a.H(this.zza.zzs, "Tasks have been queued for a long time");
    }
}
