package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzko {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzkb[] zze = new zzkb[100];
    private final zzkb[] zza = new zzkb[1];

    public zzko(boolean z, int i) {
    }

    public final synchronized void zza() {
        zzb(0);
    }

    public final synchronized void zzb(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzf();
        }
    }

    public final synchronized zzkb zzc() {
        zzkb zzkbVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzkb[] zzkbVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzkbVar = zzkbVarArr[i2];
            if (zzkbVar != null) {
                zzkbVarArr[i2] = null;
            } else {
                throw null;
            }
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
            int i = this.zzd;
            this.zzd = i + 1;
            zzkbVarArr3[i] = zzkbVar;
        }
        this.zzc -= zzkbVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzamq.zzw(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zze, max, i, (Object) null);
        this.zzd = max;
    }

    public final synchronized int zzg() {
        return this.zzc * 65536;
    }
}
