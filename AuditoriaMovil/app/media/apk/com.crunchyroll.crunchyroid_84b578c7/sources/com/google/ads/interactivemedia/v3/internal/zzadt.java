package com.google.ads.interactivemedia.v3.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzadt extends zzadv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzadt(byte[] bArr, int i, int i2, boolean z, zzads zzadsVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
    }

    private final void zzv() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzg = i4;
            this.zzf = i - i4;
            return;
        }
        this.zzg = 0;
    }

    public final byte zza() throws IOException {
        int i = this.zzh;
        if (i != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i + 1;
            return bArr[i];
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzb() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzc(int i) throws zzafc {
        if (i >= 0) {
            int i2 = (this.zzh - this.zzi) + i;
            if (i2 >= 0) {
                int i3 = this.zzk;
                if (i2 <= i3) {
                    this.zzk = i2;
                    zzv();
                    return i3;
                }
                throw zzafc.zzi();
            }
            throw zzafc.zzg();
        }
        throw zzafc.zzf();
    }

    public final int zzd() throws IOException {
        int i = this.zzh;
        if (this.zzf - i >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i + 4;
            int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
            int i4 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
            return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
        }
        throw zzafc.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
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
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
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
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzi()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzadt.zze():int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzf() throws IOException {
        if (zzp()) {
            this.zzj = 0;
            return 0;
        }
        int zze = zze();
        this.zzj = zze;
        if ((zze >>> 3) != 0) {
            return zze;
        }
        throw zzafc.zzc();
    }

    public final long zzg() throws IOException {
        int i = this.zzh;
        if (this.zzf - i >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i + 8;
            long j = bArr[i + 2];
            long j2 = bArr[i + 3];
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzafc.zzi();
    }

    public final long zzh() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << Ascii.SO);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = i9 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.zzh = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.zzh = i5;
                                return j2;
                            }
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.zzh = i5;
                    return j2;
                }
                j2 = i;
                this.zzh = i5;
                return j2;
            }
        }
        return zzi();
    }

    public final long zzi() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zza = zza();
            j |= (zza & Ascii.DEL) << i;
            if ((zza & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw zzafc.zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final zzadr zzj() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                zzadr zzs = zzadr.zzs(this.zze, i2, zze);
                this.zzh += zze;
                return zzs;
            }
        }
        if (zze != 0) {
            if (zze > 0) {
                int i3 = this.zzf;
                int i4 = this.zzh;
                if (zze <= i3 - i4) {
                    int i5 = zze + i4;
                    this.zzh = i5;
                    return new zzado(Arrays.copyOfRange(this.zze, i4, i5));
                }
            }
            if (zze <= 0) {
                throw zzafc.zzf();
            }
            throw zzafc.zzi();
        }
        return zzadr.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzk() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                String str = new String(this.zze, i2, zze, zzafa.zzb);
                this.zzh += zze;
                return str;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze < 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzl() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                String zzg = zzahy.zzg(this.zze, i2, zze);
                this.zzh += zze;
                return zzg;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze <= 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzm(int i) throws zzafc {
        if (this.zzj == i) {
            return;
        }
        throw zzafc.zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzn(int i) {
        this.zzk = i;
        zzv();
    }

    public final void zzo(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzp() throws IOException {
        if (this.zzh == this.zzf) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzq() throws IOException {
        if (zzh() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzr(int i) throws IOException {
        int zzf;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            zzo(4);
                            return true;
                        }
                        throw zzafc.zza();
                    }
                    do {
                        zzf = zzf();
                        if (zzf == 0) {
                            break;
                        }
                    } while (zzr(zzf));
                    zzm(((i >>> 3) << 3) | 4);
                    return true;
                }
                zzo(zze());
                return true;
            }
            zzo(8);
            return true;
        }
        if (this.zzf - this.zzh >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.zze;
                int i4 = this.zzh;
                this.zzh = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzafc.zze();
        }
        while (i3 < 10) {
            if (zza() < 0) {
                i3++;
            }
        }
        throw zzafc.zze();
        return true;
    }
}
