package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public class zzgr extends zzgq {
    protected final byte[] zza;

    public zzgr(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgu) || zzd() != ((zzgu) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            int zzk = zzk();
            int zzk2 = zzgrVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzgrVar.zzd()) {
                if (zzd <= zzgrVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgrVar.zza;
                    zzgrVar.zzc();
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
                throw new IllegalArgumentException(j0.e("Ran off end of other: 0, ", zzd, ", ", zzgrVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final int zze(int i, int i2, int i3) {
        return zzic.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final zzgu zzf(int i, int i2) {
        int zzj = zzgu.zzj(0, i2, zzd());
        if (zzj == 0) {
            return zzgu.zzb;
        }
        return new zzgn(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final void zzh(zzgj zzgjVar) throws IOException {
        ((zzgz) zzgjVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgu
    public final boolean zzi() {
        return zzkt.zze(this.zza, 0, zzd());
    }
}
