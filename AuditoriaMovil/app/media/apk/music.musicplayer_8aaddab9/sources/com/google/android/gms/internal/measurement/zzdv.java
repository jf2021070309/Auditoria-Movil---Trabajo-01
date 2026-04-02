package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzgw zza;

    public zzdv(com.google.android.gms.measurement.internal.zzgw zzgwVar) {
        this.zza = zzgwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j2) {
        this.zza.onEvent(str, str2, bundle, j2);
    }
}
