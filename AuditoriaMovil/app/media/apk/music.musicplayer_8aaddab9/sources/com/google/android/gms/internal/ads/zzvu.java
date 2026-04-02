package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzvu {
    private final String zza;
    private final String zzb;

    public zzvu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvu.class == obj.getClass()) {
            zzvu zzvuVar = (zzvu) obj;
            if (TextUtils.equals(this.zza, zzvuVar.zza) && TextUtils.equals(this.zzb, zzvuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        a.M(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
