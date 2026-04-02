package com.google.android.gms.internal.pal;

import okhttp3.internal.http2.Settings;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzacl {
    private final Object zza;
    private final int zzb;

    public zzacl(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzacl)) {
            return false;
        }
        zzacl zzaclVar = (zzacl) obj;
        if (this.zza != zzaclVar.zza || this.zzb != zzaclVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
