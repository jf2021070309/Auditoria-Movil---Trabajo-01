package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzauc {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzatw[] zze = new zzatw[100];
    private final zzatw[] zza = new zzatw[1];

    public zzauc(boolean z, int i) {
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

    public final synchronized zzatw zzc() {
        zzatw zzatwVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzatw[] zzatwVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzatwVar = zzatwVarArr[i2];
            zzatwVarArr[i2] = null;
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
            int i = this.zzd;
            this.zzd = i + 1;
            zzatwVarArr3[i] = zzatwVar;
        }
        this.zzc -= zzatwVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzave.zze(this.zzb, 65536) - this.zzc);
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
