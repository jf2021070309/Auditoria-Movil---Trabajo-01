package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzow {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzow(int i2, byte[] bArr, int i3, int i4) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzow.class == obj.getClass()) {
            zzow zzowVar = (zzow) obj;
            if (this.zza == zzowVar.zza && this.zzc == zzowVar.zzc && this.zzd == zzowVar.zzd && Arrays.equals(this.zzb, zzowVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
