package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaii {
    private final Object zza;
    private final int zzb;

    public zzaii(Object obj) {
        this.zzb = System.identityHashCode(obj);
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaii)) {
            return false;
        }
        zzaii zzaiiVar = (zzaii) obj;
        if (this.zzb != zzaiiVar.zzb || this.zza != zzaiiVar.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzb;
    }
}
