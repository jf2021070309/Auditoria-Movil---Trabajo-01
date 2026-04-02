package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzagr extends zzadr {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzadr zzd;
    private final zzadr zze;
    private final int zzf;
    private final int zzg;

    private static zzadr zzA(zzadr zzadrVar, zzadr zzadrVar2) {
        int zzd = zzadrVar.zzd();
        int zzd2 = zzadrVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzadrVar.zzw(bArr, 0, 0, zzd);
        zzadrVar2.zzw(bArr, 0, zzd, zzd2);
        return new zzado(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static zzadr zzz(zzadr zzadrVar, zzadr zzadrVar2) {
        if (zzadrVar2.zzd() == 0) {
            return zzadrVar;
        }
        if (zzadrVar.zzd() == 0) {
            return zzadrVar2;
        }
        int zzd = zzadrVar2.zzd() + zzadrVar.zzd();
        if (zzd < 128) {
            return zzA(zzadrVar, zzadrVar2);
        }
        if (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            if (zzadrVar2.zzd() + zzagrVar.zze.zzd() < 128) {
                return new zzagr(zzagrVar.zzd, zzA(zzagrVar.zze, zzadrVar2));
            } else if (zzagrVar.zzd.zzf() > zzagrVar.zze.zzf() && zzagrVar.zzg > zzadrVar2.zzf()) {
                return new zzagr(zzagrVar.zzd, new zzagr(zzagrVar.zze, zzadrVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1)) {
            return new zzagr(zzadrVar, zzadrVar2);
        }
        return zzagn.zza(new zzagn(null), zzadrVar, zzadrVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzadr)) {
            return false;
        }
        zzadr zzadrVar = (zzadr) obj;
        if (this.zzc != zzadrVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzq = zzq();
        int zzq2 = zzadrVar.zzq();
        if (zzq != 0 && zzq2 != 0 && zzq != zzq2) {
            return false;
        }
        zzagp zzagpVar = new zzagp(this, null);
        zzadn next = zzagpVar.next();
        zzagp zzagpVar2 = new zzagp(zzadrVar, null);
        zzadn next2 = zzagpVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (i == 0) {
                zzg = next.zzg(next2, i2, min);
            } else {
                zzg = next2.zzg(next, i, min);
            }
            if (!zzg) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzagpVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzd2) {
                next2 = zzagpVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzagl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zza(int i) {
        zzadr.zzv(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zze.zze(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadr zzk(int i, int i2) {
        int zzp = zzadr.zzp(i, i2, this.zzc);
        if (zzp == 0) {
            return zzadr.zzb;
        }
        if (zzp == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzadr zzadrVar = this.zzd;
        return new zzagr(zzadrVar.zzk(i, zzadrVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadv zzl() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final String zzm(Charset charset) {
        return new String(zzx(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zzn(zzadh zzadhVar) throws IOException {
        this.zzd.zzn(zzadhVar);
        this.zze.zzn(zzadhVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzo() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzadr zzadrVar = this.zze;
        if (zzadrVar.zzj(zzj, 0, zzadrVar.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadm zzr() {
        return new zzagl(this);
    }

    private zzagr(zzadr zzadrVar, zzadr zzadrVar2) {
        this.zzd = zzadrVar;
        this.zze = zzadrVar2;
        int zzd = zzadrVar.zzd();
        this.zzf = zzd;
        this.zzc = zzadrVar2.zzd() + zzd;
        this.zzg = Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1;
    }
}
