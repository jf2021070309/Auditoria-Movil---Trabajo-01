package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.b6.x;
import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public class zzado extends zzadn {
    protected final byte[] zza;

    public zzado(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzadr) || zzd() != ((zzadr) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzado) {
            zzado zzadoVar = (zzado) obj;
            int zzq = zzq();
            int zzq2 = zzadoVar.zzq();
            if (zzq != 0 && zzq2 != 0 && zzq != zzq2) {
                return false;
            }
            return zzg(zzadoVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadn
    public final boolean zzg(zzadr zzadrVar, int i, int i2) {
        if (i2 <= zzadrVar.zzd()) {
            int i3 = i + i2;
            if (i3 <= zzadrVar.zzd()) {
                if (zzadrVar instanceof zzado) {
                    zzado zzadoVar = (zzado) zzadrVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzadoVar.zza;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzadoVar.zzc() + i;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzadrVar.zzk(i, i3).equals(zzk(0, i2));
            }
            int zzd = zzadrVar.zzd();
            StringBuilder a = x.a("Ran off end of other: ", i, ", ", i2, ", ");
            a.append(zzd);
            throw new IllegalArgumentException(a.toString());
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzi(int i, int i2, int i3) {
        return zzafa.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzahy.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadr zzk(int i, int i2) {
        int zzp = zzadr.zzp(i, i2, zzd());
        if (zzp == 0) {
            return zzadr.zzb;
        }
        return new zzadl(this.zza, zzc() + i, zzp);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadv zzl() {
        return zzadv.zzu(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zzn(zzadh zzadhVar) throws IOException {
        ((zzadx) zzadhVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzo() {
        int zzc = zzc();
        return zzahy.zzi(this.zza, zzc, zzd() + zzc);
    }
}
