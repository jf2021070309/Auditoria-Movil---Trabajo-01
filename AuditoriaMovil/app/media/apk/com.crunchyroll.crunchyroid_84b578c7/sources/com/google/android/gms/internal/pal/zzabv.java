package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public class zzabv extends zzabu {
    protected final byte[] zza;

    public zzabv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaby) || zzd() != ((zzaby) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzabv) {
            zzabv zzabvVar = (zzabv) obj;
            int zzm = zzm();
            int zzm2 = zzabvVar.zzm();
            if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzabvVar.zzd()) {
                if (zzd <= zzabvVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzabvVar.zza;
                    zzabvVar.zzc();
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
                throw new IllegalArgumentException(j0.e("Ran off end of other: 0, ", zzd, ", ", zzabvVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final int zzf(int i, int i2, int i3) {
        return zzadg.zzd(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final zzaby zzg(int i, int i2) {
        int zzl = zzaby.zzl(0, i2, zzd());
        if (zzl == 0) {
            return zzaby.zzb;
        }
        return new zzabs(this.zza, 0, zzl);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final zzacc zzh() {
        return zzacc.zzu(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final void zzj(zzabo zzaboVar) throws IOException {
        ((zzace) zzaboVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean zzk() {
        return zzafx.zzf(this.zza, 0, zzd());
    }
}
