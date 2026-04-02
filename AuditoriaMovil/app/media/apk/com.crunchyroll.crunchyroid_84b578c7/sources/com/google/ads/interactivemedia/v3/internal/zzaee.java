package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.http2.Settings;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaee {
    private final Object zza;
    private final int zzb;

    public zzaee(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaee)) {
            return false;
        }
        zzaee zzaeeVar = (zzaee) obj;
        if (this.zza != zzaeeVar.zza || this.zzb != zzaeeVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
