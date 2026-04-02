package com.google.android.gms.internal.cast_tv;

import okhttp3.internal.http2.Settings;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzhg {
    private final Object zza;
    private final int zzb;

    public zzhg(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhg)) {
            return false;
        }
        zzhg zzhgVar = (zzhg) obj;
        if (this.zza != zzhgVar.zza || this.zzb != zzhgVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
