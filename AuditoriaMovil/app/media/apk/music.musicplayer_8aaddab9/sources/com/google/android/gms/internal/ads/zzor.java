package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
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
        if (obj != null && zzor.class == obj.getClass()) {
            zzor zzorVar = (zzor) obj;
            if (this.zza.equals(zzorVar.zza) && this.zzb.equals(zzorVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String zzouVar = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        return a.t(new StringBuilder(concat.length() + zzouVar.length() + 2), "[", zzouVar, concat, "]");
    }
}
