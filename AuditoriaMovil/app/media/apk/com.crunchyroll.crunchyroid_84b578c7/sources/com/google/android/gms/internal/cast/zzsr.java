package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
class zzsr extends zzsq {
    protected final byte[] zza;

    public zzsr(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzsu) || zzd() != ((zzsu) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzsr) {
            zzsr zzsrVar = (zzsr) obj;
            int zzk = zzk();
            int zzk2 = zzsrVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzsrVar.zzd()) {
                if (zzd <= zzsrVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzsrVar.zza;
                    zzsrVar.zzc();
                    int i = 0;
                    int i2 = 0;
                    while (i < zzd) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(j0.e("Ran off end of other: 0, ", zzd, ", ", zzsrVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final int zze(int i, int i2, int i3) {
        return zzty.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final zzsu zzf(int i, int i2) {
        zzsu.zzj(0, i2, zzd());
        if (i2 == 0) {
            return zzsu.zzb;
        }
        return new zzso(this.zza, 0, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final void zzh(zzsk zzskVar) throws IOException {
        ((zzsz) zzskVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.cast.zzsu
    public final boolean zzi() {
        return zzwn.zze(this.zza, 0, zzd());
    }
}
