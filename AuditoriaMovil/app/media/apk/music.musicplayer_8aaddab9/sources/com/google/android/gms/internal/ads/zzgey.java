package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgey extends zzgfc {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgey(byte[] bArr, int i2, int i3, boolean z, zzgfa zzgfaVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i3 + i2;
        this.zzh = i2;
        this.zzi = i2;
    }

    private final void zzI() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = i2 - this.zzi;
        int i4 = this.zzk;
        if (i3 <= i4) {
            this.zzg = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzg = i5;
        this.zzf = i2 - i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzA(int i2) {
        this.zzk = i2;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzB() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzC() {
        return this.zzh - this.zzi;
    }

    public final byte zzD() throws IOException {
        int i2 = this.zzh;
        if (i2 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 1;
            return bArr[i2];
        }
        throw zzggm.zzd();
    }

    public final void zzE(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (i2 <= i3 - i4) {
                this.zzh = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzggm.zzd();
        }
        throw zzggm.zze();
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
            if (this.zzf - this.zzh < 10) {
                while (i4 < 10) {
                    if (zzD() < 0) {
                        i4++;
                    }
                }
                throw zzggm.zzf();
            }
            while (i4 < 10) {
                byte[] bArr = this.zze;
                int i5 = this.zzh;
                this.zzh = i5 + 1;
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
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzu <= i2 - i3) {
                String str = new String(this.zze, i3, zzu, zzggk.zza);
                this.zzh += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw zzggm.zze();
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzu <= i2 - i3) {
                String zzj = zzgjd.zzj(this.zze, i3, zzu);
                this.zzh += zzu;
                return zzj;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= 0) {
            throw zzggm.zze();
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final zzgex zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzu <= i2 - i3) {
                zzgex zzs = zzgex.zzs(this.zze, i3, zzu);
                this.zzh += zzu;
                return zzs;
            }
        }
        if (zzu != 0) {
            if (zzu > 0) {
                int i4 = this.zzf;
                int i5 = this.zzh;
                if (zzu <= i4 - i5) {
                    int i6 = zzu + i5;
                    this.zzh = i6;
                    return zzgex.zzu(Arrays.copyOfRange(this.zze, i5, i6));
                }
            }
            if (zzu <= 0) {
                throw zzggm.zze();
            }
            throw zzggm.zzd();
        }
        return zzgex.zzb;
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
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6c:
            long r0 = r5.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgey.zzu():int");
    }

    public final long zzv() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.zzh;
        int i4 = this.zzf;
        if (i4 != i3) {
            byte[] bArr = this.zze;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzh = i5;
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
                                                    this.zzh = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.zzh = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.zzh = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.zzh = i6;
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
        int i2 = this.zzh;
        if (this.zzf - i2 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzggm.zzd();
    }

    public final long zzy() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzz(int i2) throws zzggm {
        if (i2 >= 0) {
            int i3 = (this.zzh - this.zzi) + i2;
            if (i3 >= 0) {
                int i4 = this.zzk;
                if (i3 <= i4) {
                    this.zzk = i3;
                    zzI();
                    return i4;
                }
                throw zzggm.zzd();
            }
            throw zzggm.zzk();
        }
        throw zzggm.zze();
    }
}
