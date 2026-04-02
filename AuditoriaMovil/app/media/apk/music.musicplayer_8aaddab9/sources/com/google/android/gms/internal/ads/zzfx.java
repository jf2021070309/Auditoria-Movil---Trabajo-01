package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzfx {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzfx(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzfx.class) {
            zzfx zzfxVar = (zzfx) obj;
            if (TextUtils.equals(this.zza, zzfxVar.zza) && this.zzb == zzfxVar.zzb && this.zzc == zzfxVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a.x(this.zza, 31, 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
