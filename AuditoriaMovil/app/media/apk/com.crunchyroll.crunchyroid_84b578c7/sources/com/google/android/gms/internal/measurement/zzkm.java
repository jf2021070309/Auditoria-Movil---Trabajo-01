package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzkm {
    private final Object zza;
    private final int zzb;

    public zzkm(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        if (this.zza != zzkmVar.zza || this.zzb != zzkmVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
