package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class zzj {
    public static final zzadw<zzj> zze = zzi.zza;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;
    private int zzf;

    public zzj(int i2, int i3, int i4, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = bArr;
    }

    @Pure
    public static int zza(int i2) {
        if (i2 != 1) {
            if (i2 != 9) {
                return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int zzb(int i2) {
        if (i2 != 1) {
            if (i2 != 16) {
                if (i2 != 18) {
                    return (i2 == 6 || i2 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzj.class == obj.getClass()) {
            zzj zzjVar = (zzj) obj;
            if (this.zza == zzjVar.zza && this.zzb == zzjVar.zzb && this.zzc == zzjVar.zzc && Arrays.equals(this.zzd, zzjVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzd) + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31);
            this.zzf = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        boolean z = this.zzd != null;
        StringBuilder w = a.w(55, "ColorInfo(", i2, ", ", i3);
        w.append(", ");
        w.append(i4);
        w.append(", ");
        w.append(z);
        w.append(")");
        return w.toString();
    }
}
