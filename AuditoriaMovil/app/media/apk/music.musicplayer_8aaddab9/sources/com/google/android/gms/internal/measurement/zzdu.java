package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzdu extends zzch {
    private final com.google.android.gms.measurement.internal.zzgv zza;

    public zzdu(com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j2) {
        this.zza.interceptEvent(str, str2, bundle, j2);
    }
}
