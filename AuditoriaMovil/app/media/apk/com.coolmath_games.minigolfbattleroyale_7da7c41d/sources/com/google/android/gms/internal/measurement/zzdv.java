package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
/* loaded from: classes2.dex */
final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzgv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv(com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zzd(String str, String str2, Bundle bundle, long j) {
        this.zza.onEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zze() {
        return System.identityHashCode(this.zza);
    }
}
