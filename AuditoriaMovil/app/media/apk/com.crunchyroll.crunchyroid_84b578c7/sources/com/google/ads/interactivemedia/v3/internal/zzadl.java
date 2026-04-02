package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzadl extends zzado {
    private final int zzc;
    private final int zzd;

    public zzadl(byte[] bArr, int i, int i2) {
        super(bArr);
        zzadr.zzp(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zza(int i) {
        zzadr.zzv(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
