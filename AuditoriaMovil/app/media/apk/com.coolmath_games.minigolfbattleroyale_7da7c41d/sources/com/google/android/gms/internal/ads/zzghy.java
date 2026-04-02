package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzghy extends zzgex {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgex zzd;
    private final zzgex zze;
    private final int zzf;
    private final int zzg;

    private zzghy(zzgex zzgexVar, zzgex zzgexVar2) {
        this.zzd = zzgexVar;
        this.zze = zzgexVar2;
        int zzc = zzgexVar.zzc();
        this.zzf = zzc;
        this.zzc = zzc + zzgexVar2.zzc();
        this.zzg = Math.max(zzgexVar.zzf(), zzgexVar2.zzf()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgex zzF(zzgex zzgexVar, zzgex zzgexVar2) {
        if (zzgexVar2.zzc() == 0) {
            return zzgexVar;
        }
        if (zzgexVar.zzc() == 0) {
            return zzgexVar2;
        }
        int zzc = zzgexVar.zzc() + zzgexVar2.zzc();
        if (zzc < 128) {
            return zzH(zzgexVar, zzgexVar2);
        }
        if (zzgexVar instanceof zzghy) {
            zzghy zzghyVar = (zzghy) zzgexVar;
            if (zzghyVar.zze.zzc() + zzgexVar2.zzc() < 128) {
                return new zzghy(zzghyVar.zzd, zzH(zzghyVar.zze, zzgexVar2));
            } else if (zzghyVar.zzd.zzf() > zzghyVar.zze.zzf() && zzghyVar.zzg > zzgexVar2.zzf()) {
                return new zzghy(zzghyVar.zzd, new zzghy(zzghyVar.zze, zzgexVar2));
            }
        }
        if (zzc >= zzG(Math.max(zzgexVar.zzf(), zzgexVar2.zzf()) + 1)) {
            return new zzghy(zzgexVar, zzgexVar2);
        }
        return zzghv.zza(new zzghv(null), zzgexVar, zzgexVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzG(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private static zzgex zzH(zzgex zzgexVar, zzgex zzgexVar2) {
        int zzc = zzgexVar.zzc();
        int zzc2 = zzgexVar2.zzc();
        byte[] bArr = new byte[zzc + zzc2];
        zzgexVar.zzy(bArr, 0, 0, zzc);
        zzgexVar2.zzy(bArr, 0, zzc, zzc2);
        return new zzget(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean equals(Object obj) {
        boolean zzh;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgex)) {
            return false;
        }
        zzgex zzgexVar = (zzgex) obj;
        if (this.zzc != zzgexVar.zzc()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzC = zzC();
        int zzC2 = zzgexVar.zzC();
        if (zzC != 0 && zzC2 != 0 && zzC != zzC2) {
            return false;
        }
        zzghx zzghxVar = new zzghx(this, null);
        zzges next = zzghxVar.next();
        zzghx zzghxVar2 = new zzghx(zzgexVar, null);
        zzges next2 = zzghxVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzc = next.zzc() - i;
            int zzc2 = next2.zzc() - i2;
            int min = Math.min(zzc, zzc2);
            if (i == 0) {
                zzh = next.zzh(next2, i2, min);
            } else {
                zzh = next2.zzh(next, i, min);
            }
            if (!zzh) {
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
            if (min == zzc) {
                next = zzghxVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzc2) {
                next2 = zzghxVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgex, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzghu(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final byte zza(int i) {
        zzD(i, this.zzc);
        return zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.zze(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzf() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzg() {
        return this.zzc >= zzG(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgex zzi(int i, int i2) {
        int zzE = zzE(i, i2, this.zzc);
        if (zzE == 0) {
            return zzgex.zzb;
        }
        if (zzE == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzi(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzi(i - i3, i2 - i3);
        }
        zzgex zzgexVar = this.zzd;
        return new zzghy(zzgexVar.zzi(i, zzgexVar.zzc()), this.zze.zzi(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final ByteBuffer zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final void zzk(zzgem zzgemVar) throws IOException {
        this.zzd.zzk(zzgemVar);
        this.zze.zzk(zzgemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    protected final String zzl(Charset charset) {
        return new String(zzz(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean zzm() {
        int zzn = this.zzd.zzn(0, 0, this.zzf);
        zzgex zzgexVar = this.zze;
        return zzgexVar.zzn(zzn, 0, zzgexVar.zzc()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzn(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzn(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzn(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzn(this.zzd.zzn(i, i2, i5), 0, i3 - i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgex
    public final int zzo(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzo(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzo(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzo(this.zzd.zzo(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzgfc zzp() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzghx zzghxVar = new zzghx(this, null);
        while (zzghxVar.hasNext()) {
            arrayList.add(zzghxVar.next().zzj());
        }
        int i = zzgfc.zzd;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgez(arrayList, i2, true, null);
        }
        return new zzgfb(new zzggn(arrayList), 4096, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final zzger zzq() {
        return new zzghu(this);
    }
}
