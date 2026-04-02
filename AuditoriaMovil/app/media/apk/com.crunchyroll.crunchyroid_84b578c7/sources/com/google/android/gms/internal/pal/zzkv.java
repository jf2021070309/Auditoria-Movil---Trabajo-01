package com.google.android.gms.internal.pal;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzkv {
    private final Object zza;
    private final byte[] zzb;
    private final int zzc;
    private final zzka zzd;
    private final zzks zze;
    private final int zzf;
    private final int zzg;

    public zzkv(Object obj, byte[] bArr, int i, int i2, int i3, zzka zzkaVar, zzks zzksVar) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzf = i;
        this.zzg = i2;
        this.zzc = i3;
        this.zzd = zzkaVar;
        this.zze = zzksVar;
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzks zzb() {
        return this.zze;
    }

    public final Object zzc() {
        return this.zza;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzg;
    }
}
