package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzou {
    public static final zzou zza = new zzou(0, 0);
    public final long zzb;
    public final long zzc;

    public zzou(long j2, long j3) {
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzou.class == obj.getClass()) {
            zzou zzouVar = (zzou) obj;
            if (this.zzb == zzouVar.zzb && this.zzc == zzouVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j2 = this.zzb;
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j2);
        sb.append(", position=");
        return a.q(sb, j3, "]");
    }
}
