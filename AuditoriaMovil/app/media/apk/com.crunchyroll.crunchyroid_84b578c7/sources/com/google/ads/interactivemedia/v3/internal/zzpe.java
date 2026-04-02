package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.e4.e;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzpe extends zzpa {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzpe(String str, boolean z, boolean z2, zzpd zzpdVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpa) {
            zzpa zzpaVar = (zzpa) obj;
            if (this.zza.equals(zzpaVar.zzb()) && this.zzb == zzpaVar.zzd() && this.zzc == zzpaVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.zzc) {
            i2 = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ i2;
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        return e.c(sb, z2, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final boolean zzd() {
        return this.zzb;
    }
}
