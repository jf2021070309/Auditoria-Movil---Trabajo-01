package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
/* loaded from: classes.dex */
public final class zzon {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i2) {
        boolean zzl;
        int i3;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        int[] iArr;
        int zzm;
        int[] iArr2;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        zzl = zzoo.zzl(i2);
        if (!zzl || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i3;
        strArr = zzoo.zza;
        this.zzb = strArr[3 - i4];
        iArr = zzoo.zzb;
        int i9 = iArr[i6];
        this.zzd = i9;
        if (i3 == 2) {
            this.zzd = i9 / 2;
        } else if (i3 == 0) {
            this.zzd = i9 / 4;
        }
        int i10 = (i2 >>> 9) & 1;
        zzm = zzoo.zzm(i3, i4);
        this.zzg = zzm;
        if (i4 == 3) {
            if (i3 == 3) {
                iArr6 = zzoo.zzc;
                i8 = iArr6[i5 - 1];
            } else {
                iArr5 = zzoo.zzd;
                i8 = iArr5[i5 - 1];
            }
            this.zzf = i8;
            this.zzc = (((i8 * 12) / this.zzd) + i10) * 4;
        } else {
            int i11 = SyslogConstants.LOG_LOCAL2;
            if (i3 == 3) {
                if (i4 == 2) {
                    iArr4 = zzoo.zze;
                    i7 = iArr4[i5 - 1];
                } else {
                    iArr3 = zzoo.zzf;
                    i7 = iArr3[i5 - 1];
                }
                this.zzf = i7;
                this.zzc = ((i7 * SyslogConstants.LOG_LOCAL2) / this.zzd) + i10;
            } else {
                iArr2 = zzoo.zzg;
                int i12 = iArr2[i5 - 1];
                this.zzf = i12;
                if (i4 == 1) {
                    i11 = 72;
                }
                this.zzc = ((i11 * i12) / this.zzd) + i10;
            }
        }
        this.zze = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
