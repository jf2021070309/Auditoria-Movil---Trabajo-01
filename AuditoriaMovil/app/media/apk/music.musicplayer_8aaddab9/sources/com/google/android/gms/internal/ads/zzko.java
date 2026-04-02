package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzko {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzkb[] zze = new zzkb[100];
    private final zzkb[] zza = new zzkb[1];

    public zzko(boolean z, int i2) {
    }

    public final synchronized void zza() {
        zzb(0);
    }

    public final synchronized void zzb(int i2) {
        int i3 = this.zzb;
        this.zzb = i2;
        if (i2 < i3) {
            zzf();
        }
    }

    public final synchronized zzkb zzc() {
        zzkb zzkbVar;
        this.zzc++;
        int i2 = this.zzd;
        if (i2 > 0) {
            zzkb[] zzkbVarArr = this.zze;
            int i3 = i2 - 1;
            this.zzd = i3;
            zzkbVar = zzkbVarArr[i3];
            Objects.requireNonNull(zzkbVar);
            zzkbVarArr[i3] = null;
        } else {
            zzkbVar = new zzkb(new byte[65536], 0);
        }
        return zzkbVar;
    }

    public final synchronized void zzd(zzkb zzkbVar) {
        zzkb[] zzkbVarArr = this.zza;
        zzkbVarArr[0] = zzkbVar;
        zze(zzkbVarArr);
    }

    public final synchronized void zze(zzkb[] zzkbVarArr) {
        int length = this.zzd + zzkbVarArr.length;
        zzkb[] zzkbVarArr2 = this.zze;
        int length2 = zzkbVarArr2.length;
        if (length >= length2) {
            this.zze = (zzkb[]) Arrays.copyOf(zzkbVarArr2, Math.max(length2 + length2, length));
        }
        for (zzkb zzkbVar : zzkbVarArr) {
            zzkb[] zzkbVarArr3 = this.zze;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            zzkbVarArr3[i2] = zzkbVar;
        }
        this.zzc -= zzkbVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzamq.zzw(this.zzb, 65536) - this.zzc);
        int i2 = this.zzd;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.zze, max, i2, (Object) null);
        this.zzd = max;
    }

    public final synchronized int zzg() {
        return this.zzc * 65536;
    }
}
