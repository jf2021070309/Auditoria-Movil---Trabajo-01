package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfco implements zzfcm {
    private final String zza;

    public zzfco(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcm
    public final boolean equals(Object obj) {
        if (obj instanceof zzfco) {
            return this.zza.equals(((zzfco) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfcm
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
