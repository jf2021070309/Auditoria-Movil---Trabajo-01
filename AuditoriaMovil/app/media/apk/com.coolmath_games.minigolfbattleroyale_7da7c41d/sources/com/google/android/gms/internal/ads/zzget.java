package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzget extends zzges {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzget(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
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
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgex
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final boolean zzh(zzgex zzgexVar, int i, int i2) {
        if (i2 > zzgexVar.zzc()) {
            int zzc = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzgexVar.zzc()) {
            int zzc2 = zzgexVar.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zzc2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzgexVar instanceof zzget) {
            zzget zzgetVar = (zzget) zzgexVar;
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgetVar.zza;
            int zzd = zzd() + i2;
            int zzd2 = zzd();
            int zzd3 = zzgetVar.zzd() + i;
            while (zzd2 < zzd) {
                if (bArr[zzd2] != bArr2[zzd3]) {
                    return false;
                }
                zzd2++;
                zzd3++;
            }
            return true;
        } else {
            return zzgexVar.zzi(i, i3).equals(zzi(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgex zzi(int i, int i2) {
        int zzE = zzE(i, i2, zzc());
        return zzE == 0 ? zzgex.zzb : new zzgeq(this.zza, zzd() + i, zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final void zzk(zzgem zzgemVar) throws IOException {
        ((zzgfe) zzgemVar).zzp(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzm() {
        int zzd = zzd();
        return zzgjd.zzb(this.zza, zzd, zzc() + zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzn(int i, int i2, int i3) {
        int zzd = zzd() + i2;
        return zzgjd.zzc(i, this.zza, zzd, i3 + zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzo(int i, int i2, int i3) {
        return zzggk.zzh(i, this.zza, zzd() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgfc zzp() {
        return zzgfc.zzF(this.zza, zzd(), zzc(), true);
    }
}
