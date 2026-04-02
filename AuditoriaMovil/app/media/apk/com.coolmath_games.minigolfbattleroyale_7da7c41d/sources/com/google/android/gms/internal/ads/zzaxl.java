package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaxl {
    final long zza;
    final String zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxl(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaxl)) {
            zzaxl zzaxlVar = (zzaxl) obj;
            if (zzaxlVar.zza == this.zza && zzaxlVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
