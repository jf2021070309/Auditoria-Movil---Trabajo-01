package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzt {
    private int zza;
    private final zzjg[] zzb;

    public zzt(zzjg[] zzjgVarArr, byte... bArr) {
        this.zzb = zzjgVarArr;
        int length = zzjgVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzt.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzt) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zza = hashCode;
            return hashCode;
        }
        return i2;
    }
}
