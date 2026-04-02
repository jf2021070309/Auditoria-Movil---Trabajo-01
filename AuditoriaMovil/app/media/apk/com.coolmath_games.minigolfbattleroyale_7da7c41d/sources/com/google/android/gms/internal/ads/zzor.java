package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzor {
    public final zzou zza;
    public final zzou zzb;

    public zzor(zzou zzouVar, zzou zzouVar2) {
        this.zza = zzouVar;
        this.zzb = zzouVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzor zzorVar = (zzor) obj;
            if (this.zza.equals(zzorVar.zza) && this.zzb.equals(zzorVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 2 + concat.length());
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
