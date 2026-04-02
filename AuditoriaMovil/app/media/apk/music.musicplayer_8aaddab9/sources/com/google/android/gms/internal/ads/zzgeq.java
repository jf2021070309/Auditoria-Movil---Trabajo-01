package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgeq extends zzget {
    private final int zzc;
    private final int zzd;

    public zzgeq(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzgex.zzE(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final byte zza(int i2) {
        zzgex.zzD(i2, this.zzd);
        return ((zzget) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final byte zzb(int i2) {
        return ((zzget) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzget, com.google.android.gms.internal.ads.zzgex
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(((zzget) this).zza, this.zzc + i2, bArr, i3, i4);
    }
}
