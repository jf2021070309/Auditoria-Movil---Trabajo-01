package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class zzgez extends zzgfc {
    private final Iterable<ByteBuffer> zze;
    private final Iterator<ByteBuffer> zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzgez(Iterable iterable, Iterable<ByteBuffer> iterable2, int i2, boolean z) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = iterable2;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (iterable2 != 0) {
            zzJ();
            return;
        }
        this.zzg = zzggk.zzd;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final void zzI() throws zzggm {
        if (!this.zzf.hasNext()) {
            throw zzggm.zzd();
        }
        zzJ();
    }

    private final void zzJ() {
        ByteBuffer next = this.zzf.next();
        this.zzg = next;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = next.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zzs = zzgiy.zzs(this.zzg);
        this.zzm += zzs;
        this.zzn += zzs;
        this.zzo += zzs;
    }

    private final void zzK() {
        int i2 = this.zzh + this.zzi;
        this.zzh = i2;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i2 - i4;
    }

    private final void zzL(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 > zzM()) {
            if (i3 > 0) {
                throw zzggm.zzd();
            }
            return;
        }
        int i4 = i3;
        while (i4 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzI();
            }
            int min = Math.min(i4, (int) (this.zzo - this.zzm));
            long j2 = min;
            zzgiy.zzq(this.zzm, bArr, i3 - i4, j2);
            i4 -= min;
            this.zzm += j2;
        }
    }

    private final int zzM() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzA(int i2) {
        this.zzj = i2;
        zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzB() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzC() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    public final byte zzD() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzI();
        }
        long j2 = this.zzm;
        this.zzm = 1 + j2;
        return zzgiy.zzr(j2);
    }

    public final void zzE(int i2) throws IOException {
        if (i2 < 0 || i2 > ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
            if (i2 >= 0) {
                throw zzggm.zzd();
            }
            throw zzggm.zze();
        }
        while (i2 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzI();
            }
            int min = Math.min(i2, (int) (this.zzo - this.zzm));
            i2 -= min;
            this.zzm += min;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw zzggm.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzb(int i2) throws zzggm {
        if (this.zzk != i2) {
            throw zzggm.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzc(int i2) throws IOException {
        int zza;
        int i3 = i2 & 7;
        if (i3 == 0) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw zzggm.zzf();
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
            long j2 = zzu;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[zzu];
                zzgiy.zzq(j4, bArr, 0L, j2);
                String str = new String(bArr, zzggk.zza);
                this.zzm += j2;
                return str;
            }
        }
        if (zzu > 0 && zzu <= zzM()) {
            byte[] bArr2 = new byte[zzu];
            zzL(bArr2, 0, zzu);
            return new String(bArr2, zzggk.zza);
        } else if (zzu == 0) {
            return "";
        } else {
            if (zzu < 0) {
                throw zzggm.zze();
            }
            throw zzggm.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j2 = zzu;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                String zzi = zzgjd.zzi(this.zzg, (int) (j4 - this.zzn), zzu);
                this.zzm += j2;
                return zzi;
            }
        }
        if (zzu >= 0 && zzu <= zzM()) {
            byte[] bArr = new byte[zzu];
            zzL(bArr, 0, zzu);
            return zzgjd.zzj(bArr, 0, zzu);
        } else if (zzu == 0) {
            return "";
        } else {
            if (zzu <= 0) {
                throw zzggm.zze();
            }
            throw zzggm.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final zzgex zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j2 = zzu;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[zzu];
                zzgiy.zzq(j4, bArr, 0L, j2);
                this.zzm += j2;
                return zzgex.zzu(bArr);
            }
        }
        if (zzu > 0 && zzu <= zzM()) {
            byte[] bArr2 = new byte[zzu];
            zzL(bArr2, 0, zzu);
            return zzgex.zzu(bArr2);
        } else if (zzu == 0) {
            return zzgex.zzb;
        } else {
            if (zzu < 0) {
                throw zzggm.zze();
            }
            throw zzggm.zzd();
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgiy.zzr(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgiy.zzr(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgiy.zzr(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgez.zzu():int");
    }

    public final long zzv() throws IOException {
        long zzr;
        long j2;
        long j3;
        int i2;
        long j4 = this.zzm;
        if (this.zzo != j4) {
            long j5 = j4 + 1;
            byte zzr2 = zzgiy.zzr(j4);
            if (zzr2 >= 0) {
                this.zzm++;
                return zzr2;
            } else if (this.zzo - this.zzm >= 10) {
                long j6 = j5 + 1;
                int zzr3 = zzr2 ^ (zzgiy.zzr(j5) << 7);
                if (zzr3 >= 0) {
                    long j7 = j6 + 1;
                    int zzr4 = zzr3 ^ (zzgiy.zzr(j6) << 14);
                    if (zzr4 >= 0) {
                        zzr = zzr4 ^ 16256;
                    } else {
                        j6 = j7 + 1;
                        int zzr5 = zzr4 ^ (zzgiy.zzr(j7) << 21);
                        if (zzr5 < 0) {
                            i2 = zzr5 ^ (-2080896);
                        } else {
                            j7 = j6 + 1;
                            long zzr6 = zzr5 ^ (zzgiy.zzr(j6) << 28);
                            if (zzr6 < 0) {
                                long j8 = j7 + 1;
                                long zzr7 = zzr6 ^ (zzgiy.zzr(j7) << 35);
                                if (zzr7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    zzr6 = zzr7 ^ (zzgiy.zzr(j8) << 42);
                                    if (zzr6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        zzr7 = zzr6 ^ (zzgiy.zzr(j7) << 49);
                                        if (zzr7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            zzr = (zzr7 ^ (zzgiy.zzr(j8) << 56)) ^ 71499008037633920L;
                                            if (zzr < 0) {
                                                long j9 = 1 + j7;
                                                if (zzgiy.zzr(j7) >= 0) {
                                                    j6 = j9;
                                                    this.zzm = j6;
                                                    return zzr;
                                                }
                                            }
                                        }
                                    }
                                }
                                zzr = zzr7 ^ j2;
                                j6 = j8;
                                this.zzm = j6;
                                return zzr;
                            }
                            j3 = 266354560;
                            zzr = zzr6 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.zzm = j6;
                    return zzr;
                }
                i2 = zzr3 ^ (-128);
                zzr = i2;
                this.zzm = j6;
                return zzr;
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
        int zzD;
        byte zzD2;
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 >= 4) {
            this.zzm = 4 + j3;
            zzD = (zzgiy.zzr(j3) & 255) | ((zzgiy.zzr(1 + j3) & 255) << 8) | ((zzgiy.zzr(2 + j3) & 255) << 16);
            zzD2 = zzgiy.zzr(j3 + 3);
        } else {
            zzD = (zzD() & 255) | ((zzD() & 255) << 8) | ((zzD() & 255) << 16);
            zzD2 = zzD();
        }
        return zzD | ((zzD2 & 255) << 24);
    }

    public final long zzy() throws IOException {
        long zzD;
        byte zzD2;
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 >= 8) {
            this.zzm = 8 + j3;
            zzD = (zzgiy.zzr(j3) & 255) | ((zzgiy.zzr(1 + j3) & 255) << 8) | ((zzgiy.zzr(2 + j3) & 255) << 16) | ((zzgiy.zzr(3 + j3) & 255) << 24) | ((zzgiy.zzr(4 + j3) & 255) << 32) | ((zzgiy.zzr(5 + j3) & 255) << 40) | ((zzgiy.zzr(6 + j3) & 255) << 48);
            zzD2 = zzgiy.zzr(j3 + 7);
        } else {
            zzD = (zzD() & 255) | ((zzD() & 255) << 8) | ((zzD() & 255) << 16) | ((zzD() & 255) << 24) | ((zzD() & 255) << 32) | ((zzD() & 255) << 40) | ((zzD() & 255) << 48);
            zzD2 = zzD();
        }
        return zzD | ((zzD2 & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzz(int i2) throws zzggm {
        if (i2 >= 0) {
            int zzC = zzC() + i2;
            int i3 = this.zzj;
            if (zzC <= i3) {
                this.zzj = zzC;
                zzK();
                return i3;
            }
            throw zzggm.zzd();
        }
        throw zzggm.zze();
    }
}
