package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzauc {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzatw[] zze = new zzatw[100];
    private final zzatw[] zza = new zzatw[1];

    public zzauc(boolean z, int i2) {
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

    public final synchronized zzatw zzc() {
        zzatw zzatwVar;
        this.zzc++;
        int i2 = this.zzd;
        if (i2 > 0) {
            zzatw[] zzatwVarArr = this.zze;
            int i3 = i2 - 1;
            this.zzd = i3;
            zzatwVar = zzatwVarArr[i3];
            zzatwVarArr[i3] = null;
        } else {
            zzatwVar = new zzatw(new byte[65536], 0);
        }
        return zzatwVar;
    }

    public final synchronized void zzd(zzatw zzatwVar) {
        zzatw[] zzatwVarArr = this.zza;
        zzatwVarArr[0] = zzatwVar;
        zze(zzatwVarArr);
    }

    public final synchronized void zze(zzatw[] zzatwVarArr) {
        int length = this.zzd + zzatwVarArr.length;
        zzatw[] zzatwVarArr2 = this.zze;
        int length2 = zzatwVarArr2.length;
        if (length >= length2) {
            this.zze = (zzatw[]) Arrays.copyOf(zzatwVarArr2, Math.max(length2 + length2, length));
        }
        for (zzatw zzatwVar : zzatwVarArr) {
            byte[] bArr = zzatwVar.zza;
            zzatw[] zzatwVarArr3 = this.zze;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            zzatwVarArr3[i2] = zzatwVar;
        }
        this.zzc -= zzatwVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzave.zze(this.zzb, 65536) - this.zzc);
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
