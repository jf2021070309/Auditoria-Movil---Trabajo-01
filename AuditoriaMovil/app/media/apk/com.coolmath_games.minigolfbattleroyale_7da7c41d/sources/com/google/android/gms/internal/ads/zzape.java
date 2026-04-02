package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzape {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    private final MediaCodec.CryptoInfo zzg;
    private final zzapd zzh;

    public zzape() {
        this.zzg = zzave.zza >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzh = zzave.zza >= 24 ? new zzapd(this.zzg, null) : null;
    }

    public final void zza(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = 1;
        if (zzave.zza >= 16) {
            this.zzg.numSubSamples = this.zzf;
            this.zzg.numBytesOfClearData = this.zzd;
            this.zzg.numBytesOfEncryptedData = this.zze;
            this.zzg.key = this.zzb;
            this.zzg.iv = this.zza;
            this.zzg.mode = this.zzc;
            if (zzave.zza >= 24) {
                zzapd.zza(this.zzh, 0, 0);
            }
        }
    }

    public final MediaCodec.CryptoInfo zzb() {
        return this.zzg;
    }
}
