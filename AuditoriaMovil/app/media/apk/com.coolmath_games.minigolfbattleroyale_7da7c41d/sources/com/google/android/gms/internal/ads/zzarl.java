package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzarl {
    public final String zza;
    public final boolean zzb;

    public zzarl(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzarl.class) {
            zzarl zzarlVar = (zzarl) obj;
            if (TextUtils.equals(this.zza, zzarlVar.zza) && this.zzb == zzarlVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.zzb ? 1237 : 1231);
    }
}
