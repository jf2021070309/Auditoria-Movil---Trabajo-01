package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.n4.a;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaz extends zzaw {
    private final String zza;
    private final String zzb;
    private final boolean zzc;

    public zzaz(String str, String str2, boolean z) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = z;
            return;
        }
        throw new NullPointerException("Null advertisingId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.zza.equals(zzawVar.zza()) && this.zzb.equals(zzawVar.zzb()) && this.zzc == zzawVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003;
        if (true != this.zzc) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return e.c(a.b("AdvertisingIdInfo{advertisingId=", str, ", advertisingIdType=", str2, ", isLimitAdTracking="), this.zzc, "}");
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final boolean zzc() {
        return this.zzc;
    }
}
