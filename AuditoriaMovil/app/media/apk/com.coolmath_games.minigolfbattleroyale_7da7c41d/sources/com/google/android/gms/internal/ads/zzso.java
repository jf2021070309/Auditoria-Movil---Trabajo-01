package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzso extends zzsm {
    private zzsn zza;
    private int zzb;
    private boolean zzc;
    private zzpb zzd;
    private zzoz zze;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        if ((zzamfVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzamfVar.zzi()[0];
        zzsn zzsnVar = this.zza;
        zzakt.zze(zzsnVar);
        int i = !zzsnVar.zzd[(b >> 1) & (255 >>> (8 - zzsnVar.zze))].zza ? zzsnVar.zza.zze : zzsnVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzamfVar.zzj() < zzamfVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze() + 4);
            zzamfVar.zzb(copyOf, copyOf.length);
        } else {
            zzamfVar.zzf(zzamfVar.zze() + 4);
        }
        byte[] zzi = zzamfVar.zzi();
        zzi[zzamfVar.zze() - 4] = (byte) (j & 255);
        zzi[zzamfVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzamfVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzamfVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzpb zzpbVar = this.zzd;
        this.zzb = zzpbVar != null ? zzpbVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) throws IOException {
        zzsn zzsnVar;
        int i;
        zzoy zzoyVar;
        int i2;
        zzoy zzoyVar2;
        boolean z;
        zzoy zzoyVar3;
        if (this.zza != null) {
            if (zzskVar.zza != null) {
                return false;
            }
            throw null;
        }
        zzpb zzpbVar = this.zzd;
        boolean z2 = true;
        if (zzpbVar == null) {
            zzpc.zzc(1, zzamfVar, false);
            int zzC = zzamfVar.zzC();
            int zzn = zzamfVar.zzn();
            int zzC2 = zzamfVar.zzC();
            int zzw = zzamfVar.zzw();
            int i3 = zzw <= 0 ? -1 : zzw;
            int zzw2 = zzamfVar.zzw();
            int i4 = zzw2 <= 0 ? -1 : zzw2;
            int zzw3 = zzamfVar.zzw();
            int i5 = zzw3 <= 0 ? -1 : zzw3;
            int zzn2 = zzamfVar.zzn();
            this.zzd = new zzpb(zzC, zzn, zzC2, i3, i4, i5, (int) Math.pow(2.0d, zzn2 & 15), (int) Math.pow(2.0d, (zzn2 & 240) >> 4), 1 == (zzamfVar.zzn() & 1), Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze()));
        } else {
            zzoz zzozVar = this.zze;
            if (zzozVar == null) {
                this.zze = zzpc.zzb(zzamfVar, true, true);
            } else {
                byte[] bArr = new byte[zzamfVar.zze()];
                System.arraycopy(zzamfVar.zzi(), 0, bArr, 0, zzamfVar.zze());
                int i6 = zzpbVar.zza;
                int i7 = 5;
                zzpc.zzc(5, zzamfVar, false);
                int zzn3 = zzamfVar.zzn() + 1;
                zzoy zzoyVar4 = new zzoy(zzamfVar.zzi());
                zzoyVar4.zzc(zzamfVar.zzg() * 8);
                int i8 = 0;
                while (i8 < zzn3) {
                    if (zzoyVar4.zzb(24) != 5653314) {
                        int zzd = zzoyVar4.zzd();
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(zzd);
                        throw zzaha.zzb(sb.toString(), null);
                    }
                    int zzb = zzoyVar4.zzb(16);
                    int zzb2 = zzoyVar4.zzb(24);
                    long[] jArr = new long[zzb2];
                    long j2 = 0;
                    if (!zzoyVar4.zza()) {
                        boolean zza = zzoyVar4.zza();
                        int i9 = 0;
                        while (i9 < zzb2) {
                            if (zza) {
                                if (zzoyVar4.zza()) {
                                    zzoyVar3 = zzoyVar4;
                                    jArr[i9] = zzoyVar4.zzb(i7) + 1;
                                } else {
                                    zzoyVar3 = zzoyVar4;
                                    jArr[i9] = 0;
                                }
                                zzoyVar2 = zzoyVar3;
                                z = true;
                            } else {
                                int i10 = i7;
                                zzoyVar2 = zzoyVar4;
                                z = true;
                                jArr[i9] = zzoyVar2.zzb(i10) + 1;
                            }
                            i9++;
                            zzoyVar4 = zzoyVar2;
                            i7 = 5;
                        }
                        zzoyVar = zzoyVar4;
                    } else {
                        int i11 = i7;
                        zzoyVar = zzoyVar4;
                        int zzb3 = zzoyVar.zzb(i11) + 1;
                        int i12 = 0;
                        while (i12 < zzb2) {
                            int zzb4 = zzoyVar.zzb(zzpc.zza(zzb2 - i12));
                            int i13 = 0;
                            while (i13 < zzb4 && i12 < zzb2) {
                                jArr[i12] = zzb3;
                                i12++;
                                i13++;
                                zzozVar = zzozVar;
                                bArr = bArr;
                            }
                            zzb3++;
                            zzozVar = zzozVar;
                            bArr = bArr;
                        }
                    }
                    zzoz zzozVar2 = zzozVar;
                    byte[] bArr2 = bArr;
                    int zzb5 = zzoyVar.zzb(4);
                    if (zzb5 <= 2) {
                        if (zzb5 != 1) {
                            if (zzb5 == 2) {
                                zzb5 = 2;
                            } else {
                                i2 = zzn3;
                                i8++;
                                zzoyVar4 = zzoyVar;
                                zzn3 = i2;
                                zzozVar = zzozVar2;
                                bArr = bArr2;
                                i7 = 5;
                                z2 = true;
                            }
                        }
                        zzoyVar.zzc(32);
                        zzoyVar.zzc(32);
                        int zzb6 = zzoyVar.zzb(4) + 1;
                        zzoyVar.zzc(1);
                        if (zzb5 != 1) {
                            i2 = zzn3;
                            j2 = zzb2 * zzb;
                        } else if (zzb != 0) {
                            i2 = zzn3;
                            j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                        } else {
                            i2 = zzn3;
                        }
                        zzoyVar.zzc((int) (zzb6 * j2));
                        i8++;
                        zzoyVar4 = zzoyVar;
                        zzn3 = i2;
                        zzozVar = zzozVar2;
                        bArr = bArr2;
                        i7 = 5;
                        z2 = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(zzb5);
                        throw zzaha.zzb(sb2.toString(), null);
                    }
                }
                zzoz zzozVar3 = zzozVar;
                byte[] bArr3 = bArr;
                zzoy zzoyVar5 = zzoyVar4;
                int i14 = 6;
                int zzb7 = zzoyVar5.zzb(6) + 1;
                for (int i15 = 0; i15 < zzb7; i15++) {
                    if (zzoyVar5.zzb(16) != 0) {
                        throw zzaha.zzb("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i16 = 1;
                int zzb8 = zzoyVar5.zzb(6) + 1;
                int i17 = 0;
                while (true) {
                    int i18 = 3;
                    if (i17 < zzb8) {
                        int zzb9 = zzoyVar5.zzb(16);
                        if (zzb9 == 0) {
                            int i19 = 8;
                            zzoyVar5.zzc(8);
                            zzoyVar5.zzc(16);
                            zzoyVar5.zzc(16);
                            zzoyVar5.zzc(6);
                            zzoyVar5.zzc(8);
                            int zzb10 = zzoyVar5.zzb(4) + 1;
                            int i20 = 0;
                            while (i20 < zzb10) {
                                zzoyVar5.zzc(i19);
                                i20++;
                                i19 = 8;
                            }
                        } else if (zzb9 == i16) {
                            int zzb11 = zzoyVar5.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i21 = -1;
                            for (int i22 = 0; i22 < zzb11; i22++) {
                                int zzb12 = zzoyVar5.zzb(4);
                                iArr[i22] = zzb12;
                                if (zzb12 > i21) {
                                    i21 = zzb12;
                                }
                            }
                            int i23 = i21 + 1;
                            int[] iArr2 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                iArr2[i24] = zzoyVar5.zzb(i18) + 1;
                                int zzb13 = zzoyVar5.zzb(2);
                                if (zzb13 > 0) {
                                    i = 8;
                                    zzoyVar5.zzc(8);
                                } else {
                                    i = 8;
                                }
                                int i25 = 0;
                                for (int i26 = 1; i25 < (i26 << zzb13); i26 = 1) {
                                    zzoyVar5.zzc(i);
                                    i25++;
                                    i = 8;
                                }
                                i24++;
                                i18 = 3;
                            }
                            zzoyVar5.zzc(2);
                            int zzb14 = zzoyVar5.zzb(4);
                            int i27 = 0;
                            int i28 = 0;
                            for (int i29 = 0; i29 < zzb11; i29++) {
                                i27 += iArr2[iArr[i29]];
                                while (i28 < i27) {
                                    zzoyVar5.zzc(zzb14);
                                    i28++;
                                }
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(52);
                            sb3.append("floor type greater than 1 not decodable: ");
                            sb3.append(zzb9);
                            throw zzaha.zzb(sb3.toString(), null);
                        }
                        i17++;
                        i14 = 6;
                        i16 = 1;
                    } else {
                        int i30 = 1;
                        int zzb15 = zzoyVar5.zzb(i14) + 1;
                        int i31 = 0;
                        while (i31 < zzb15) {
                            if (zzoyVar5.zzb(16) <= 2) {
                                zzoyVar5.zzc(24);
                                zzoyVar5.zzc(24);
                                zzoyVar5.zzc(24);
                                int zzb16 = zzoyVar5.zzb(i14) + i30;
                                int i32 = 8;
                                zzoyVar5.zzc(8);
                                int[] iArr3 = new int[zzb16];
                                for (int i33 = 0; i33 < zzb16; i33++) {
                                    iArr3[i33] = ((zzoyVar5.zza() ? zzoyVar5.zzb(5) : 0) * 8) + zzoyVar5.zzb(3);
                                }
                                int i34 = 0;
                                while (i34 < zzb16) {
                                    int i35 = 0;
                                    while (i35 < i32) {
                                        if ((iArr3[i34] & (1 << i35)) != 0) {
                                            zzoyVar5.zzc(i32);
                                        }
                                        i35++;
                                        i32 = 8;
                                    }
                                    i34++;
                                    i32 = 8;
                                }
                                i31++;
                                i14 = 6;
                                i30 = 1;
                            } else {
                                throw zzaha.zzb("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int zzb17 = zzoyVar5.zzb(i14) + 1;
                        for (int i36 = 0; i36 < zzb17; i36++) {
                            int zzb18 = zzoyVar5.zzb(16);
                            if (zzb18 != 0) {
                                StringBuilder sb4 = new StringBuilder(52);
                                sb4.append("mapping type other than 0 not supported: ");
                                sb4.append(zzb18);
                                Log.e("VorbisUtil", sb4.toString());
                            } else {
                                int zzb19 = zzoyVar5.zza() ? zzoyVar5.zzb(4) + 1 : 1;
                                if (zzoyVar5.zza()) {
                                    int zzb20 = zzoyVar5.zzb(8) + 1;
                                    for (int i37 = 0; i37 < zzb20; i37++) {
                                        int i38 = i6 - 1;
                                        zzoyVar5.zzc(zzpc.zza(i38));
                                        zzoyVar5.zzc(zzpc.zza(i38));
                                    }
                                }
                                if (zzoyVar5.zzb(2) != 0) {
                                    throw zzaha.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (zzb19 > 1) {
                                    for (int i39 = 0; i39 < i6; i39++) {
                                        zzoyVar5.zzc(4);
                                    }
                                }
                                for (int i40 = 0; i40 < zzb19; i40++) {
                                    zzoyVar5.zzc(8);
                                    zzoyVar5.zzc(8);
                                    zzoyVar5.zzc(8);
                                }
                            }
                        }
                        int zzb21 = zzoyVar5.zzb(6) + 1;
                        zzpa[] zzpaVarArr = new zzpa[zzb21];
                        for (int i41 = 0; i41 < zzb21; i41++) {
                            zzpaVarArr[i41] = new zzpa(zzoyVar5.zza(), zzoyVar5.zzb(16), zzoyVar5.zzb(16), zzoyVar5.zzb(8));
                        }
                        if (zzoyVar5.zza()) {
                            zzsnVar = new zzsn(zzpbVar, zzozVar3, bArr3, zzpaVarArr, zzpc.zza(zzb21 - 1));
                        } else {
                            throw zzaha.zzb("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        zzsnVar = null;
        this.zza = zzsnVar;
        if (zzsnVar == null) {
            return true;
        }
        zzpb zzpbVar2 = zzsnVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzpbVar2.zzg);
        arrayList.add(zzsnVar.zzc);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/vorbis");
        zzaftVar.zzI(zzpbVar2.zzd);
        zzaftVar.zzJ(zzpbVar2.zzc);
        zzaftVar.zzaa(zzpbVar2.zza);
        zzaftVar.zzab(zzpbVar2.zzb);
        zzaftVar.zzP(arrayList);
        zzskVar.zza = zzaftVar.zzah();
        return true;
    }
}
