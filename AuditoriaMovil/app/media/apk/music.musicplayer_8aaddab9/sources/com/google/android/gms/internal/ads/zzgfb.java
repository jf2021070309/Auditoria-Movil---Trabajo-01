package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzgfb extends zzgfc {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgfb(InputStream inputStream, int i2, zzgfa zzgfaVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        zzggk.zzb(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzI() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    private final void zzJ(int i2) throws IOException {
        if (zzK(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzggm.zzd();
        }
        throw zzggm.zzj();
    }

    private final boolean zzK(int i2) throws IOException {
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i3 + i2 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.zzk;
        if (i2 <= (Integer.MAX_VALUE - i5) - i3 && i5 + i3 + i2 <= this.zzl) {
            if (i3 > 0) {
                if (i4 > i3) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                i5 = this.zzk + i3;
                this.zzk = i5;
                i4 = this.zzg - i3;
                this.zzg = i4;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.zze.getClass());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 91);
                    sb2.append(valueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.zzg += read;
                    zzI();
                    if (this.zzg >= i2) {
                        return true;
                    }
                    return zzK(i2);
                } else {
                    return false;
                }
            } catch (zzggm e2) {
                e2.zzb();
                throw e2;
            }
        }
        return false;
    }

    private final byte[] zzL(int i2, boolean z) throws IOException {
        byte[] zzM = zzM(i2);
        if (zzM != null) {
            return zzM;
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzN = zzN(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzN) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzM(int i2) throws IOException {
        if (i2 == 0) {
            return zzggk.zzc;
        }
        if (i2 >= 0) {
            int i3 = this.zzk;
            int i4 = this.zzi;
            int i5 = i3 + i4 + i2;
            if ((-2147483647) + i5 <= 0) {
                int i6 = this.zzl;
                if (i5 > i6) {
                    zzE((i6 - i3) - i4);
                    throw zzggm.zzd();
                }
                int i7 = this.zzg - i4;
                int i8 = i2 - i7;
                if (i8 >= 4096) {
                    try {
                        if (i8 > this.zze.available()) {
                            return null;
                        }
                    } catch (zzggm e2) {
                        e2.zzb();
                        throw e2;
                    }
                }
                byte[] bArr = new byte[i2];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i7);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i7 < i2) {
                    try {
                        int read = this.zze.read(bArr, i7, i2 - i7);
                        if (read == -1) {
                            throw zzggm.zzd();
                        }
                        this.zzk += read;
                        i7 += read;
                    } catch (zzggm e3) {
                        e3.zzb();
                        throw e3;
                    }
                }
                return bArr;
            }
            throw zzggm.zzj();
        }
        throw zzggm.zze();
    }

    private final List<byte[]> zzN(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.zze.read(bArr, i3, min - i3);
                if (read == -1) {
                    throw zzggm.zzd();
                }
                this.zzk += read;
                i3 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzA(int i2) {
        this.zzl = i2;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzB() throws IOException {
        return this.zzi == this.zzg && !zzK(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzC() {
        return this.zzk + this.zzi;
    }

    public final byte zzD() throws IOException {
        if (this.zzi == this.zzg) {
            zzJ(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    public final void zzE(int i2) throws IOException {
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzi = i4 + i2;
        } else if (i2 < 0) {
            throw zzggm.zze();
        } else {
            int i6 = this.zzk;
            int i7 = i6 + i4;
            int i8 = this.zzl;
            if (i7 + i2 > i8) {
                zzE((i8 - i6) - i4);
                throw zzggm.zzd();
            }
            this.zzk = i7;
            this.zzg = 0;
            this.zzi = 0;
            while (i5 < i2) {
                try {
                    long j2 = i2 - i5;
                    try {
                        long skip = this.zze.skip(j2);
                        if (skip < 0 || skip > j2) {
                            String valueOf = String.valueOf(this.zze.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (skip == 0) {
                            break;
                        } else {
                            i5 += (int) skip;
                        }
                    } catch (zzggm e2) {
                        e2.zzb();
                        throw e2;
                    }
                } finally {
                    this.zzk += i5;
                    zzI();
                }
            }
            if (i5 >= i2) {
                return;
            }
            int i9 = this.zzg;
            int i10 = i9 - this.zzi;
            this.zzi = i9;
            zzJ(1);
            while (true) {
                int i11 = i2 - i10;
                int i12 = this.zzg;
                if (i11 <= i12) {
                    this.zzi = i11;
                    return;
                }
                i10 += i12;
                this.zzi = i12;
                zzJ(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzj = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzj = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw zzggm.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzb(int i2) throws zzggm {
        if (this.zzj != i2) {
            throw zzggm.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzc(int i2) throws IOException {
        int zza;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i4 < 10) {
                    if (zzD() < 0) {
                        i4++;
                    }
                }
                throw zzggm.zzf();
            }
            while (i4 < 10) {
                byte[] bArr = this.zzf;
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzggm.zzf();
            return true;
        } else if (i3 == 1) {
            zzE(8);
            return true;
        } else if (i3 == 2) {
            zzE(zzu());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    zzE(4);
                    return true;
                }
                throw zzggm.zzi();
            }
            return false;
        } else {
            do {
                zza = zza();
                if (zza == 0) {
                    break;
                }
            } while (zzc(zza));
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzl() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (zzu <= i2 - i3) {
                String str = new String(this.zzf, i3, zzu, zzggk.zza);
                this.zzi += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= this.zzg) {
            zzJ(zzu);
            String str2 = new String(this.zzf, this.zzi, zzu, zzggk.zza);
            this.zzi += zzu;
            return str2;
        }
        return new String(zzL(zzu, false), zzggk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzm() throws IOException {
        byte[] zzL;
        int zzu = zzu();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (zzu <= i3 - i2 && zzu > 0) {
            zzL = this.zzf;
            this.zzi = i2 + zzu;
        } else if (zzu == 0) {
            return "";
        } else {
            if (zzu <= i3) {
                zzJ(zzu);
                zzL = this.zzf;
                this.zzi = zzu;
            } else {
                zzL = zzL(zzu, false);
            }
            i2 = 0;
        }
        return zzgjd.zzj(zzL, i2, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final zzgex zzn() throws IOException {
        int zzu = zzu();
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (zzu <= i2 - i3 && zzu > 0) {
            zzgex zzs = zzgex.zzs(this.zzf, i3, zzu);
            this.zzi += zzu;
            return zzs;
        } else if (zzu != 0) {
            byte[] zzM = zzM(zzu);
            if (zzM != null) {
                return zzgex.zzt(zzM);
            }
            int i4 = this.zzi;
            int i5 = this.zzg;
            int i6 = i5 - i4;
            this.zzk += i5;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzN = zzN(zzu - i6);
            byte[] bArr = new byte[zzu];
            System.arraycopy(this.zzf, i4, bArr, 0, i6);
            for (byte[] bArr2 : zzN) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i6, length);
                i6 += length;
            }
            return zzgex.zzu(bArr);
        } else {
            return zzgex.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzs() throws IOException {
        return zzgfc.zzG(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzt() throws IOException {
        return zzgfc.zzH(zzv());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.zzi = r1
            return r0
        L6c:
            long r0 = r5.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgfb.zzu():int");
    }

    public final long zzv() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zzf;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzi = i5;
                return b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b2 ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        j2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ (-2080896);
                        } else {
                            i8 = i6 + 1;
                            long j6 = (bArr[i6] << 28) ^ i10;
                            if (j6 < 0) {
                                int i11 = i8 + 1;
                                long j7 = j6 ^ (bArr[i8] << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i8 = i11 + 1;
                                    j6 = j7 ^ (bArr[i11] << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 1;
                                        j7 = j6 ^ (bArr[i8] << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i8 = i11 + 1;
                                            j2 = (j7 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i11 = i8 + 1;
                                                if (bArr[i8] >= 0) {
                                                    j3 = j2;
                                                    i6 = i11;
                                                    this.zzi = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.zzi = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.zzi = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.zzi = i6;
                return j3;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte zzD = zzD();
            j2 |= (zzD & Byte.MAX_VALUE) << i2;
            if ((zzD & 128) == 0) {
                return j2;
            }
        }
        throw zzggm.zzf();
    }

    public final int zzx() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzJ(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long zzy() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzJ(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzz(int i2) throws zzggm {
        if (i2 >= 0) {
            int i3 = this.zzk + this.zzi + i2;
            int i4 = this.zzl;
            if (i3 <= i4) {
                this.zzl = i3;
                zzI();
                return i4;
            }
            throw zzggm.zzd();
        }
        throw zzggm.zze();
    }
}
