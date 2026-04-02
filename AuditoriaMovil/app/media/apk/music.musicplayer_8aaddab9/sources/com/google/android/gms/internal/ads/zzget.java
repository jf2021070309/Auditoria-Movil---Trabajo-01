package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzget extends zzges {
    public final byte[] zza;

    public zzget(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgex) && zzc() == ((zzgex) obj).zzc()) {
            if (zzc() == 0) {
                return true;
            }
            if (obj instanceof zzget) {
                zzget zzgetVar = (zzget) obj;
                int zzC = zzC();
                int zzC2 = zzgetVar.zzC();
                if (zzC == 0 || zzC2 == 0 || zzC == zzC2) {
                    return zzh(zzgetVar, 0, zzc());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final boolean zzh(zzgex zzgexVar, int i2, int i3) {
        if (i3 > zzgexVar.zzc()) {
            int zzc = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(zzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i2 + i3;
        if (i4 > zzgexVar.zzc()) {
            int zzc2 = zzgexVar.zzc();
            StringBuilder w = a.w(59, "Ran off end of other: ", i2, ", ", i3);
            w.append(", ");
            w.append(zzc2);
            throw new IllegalArgumentException(w.toString());
        } else if (zzgexVar instanceof zzget) {
            zzget zzgetVar = (zzget) zzgexVar;
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgetVar.zza;
            int zzd = zzd() + i3;
            int zzd2 = zzd();
            int zzd3 = zzgetVar.zzd() + i2;
            while (zzd2 < zzd) {
                if (bArr[zzd2] != bArr2[zzd3]) {
                    return false;
                }
                zzd2++;
                zzd3++;
            }
            return true;
        } else {
            return zzgexVar.zzi(i2, i4).equals(zzi(0, i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgex zzi(int i2, int i3) {
        int zzE = zzgex.zzE(i2, i3, zzc());
        return zzE == 0 ? zzgex.zzb : new zzgeq(this.zza, zzd() + i2, zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final void zzk(zzgem zzgemVar) throws IOException {
        ((zzgfe) zzgemVar).zzp(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzm() {
        int zzd = zzd();
        return zzgjd.zzb(this.zza, zzd, zzc() + zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzn(int i2, int i3, int i4) {
        int zzd = zzd() + i3;
        return zzgjd.zzc(i2, this.zza, zzd, i4 + zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzo(int i2, int i3, int i4) {
        return zzggk.zzh(i2, this.zza, zzd() + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgfc zzp() {
        return zzgfc.zzF(this.zza, zzd(), zzc(), true);
    }
}
