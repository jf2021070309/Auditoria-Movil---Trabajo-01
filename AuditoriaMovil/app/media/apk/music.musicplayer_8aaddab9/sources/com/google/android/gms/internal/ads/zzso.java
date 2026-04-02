package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class zzso extends zzsm {
    private zzsn zza;
    private int zzb;
    private boolean zzc;
    private zzpb zzd;
    private zzoz zze;

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
    public final long zzb(zzamf zzamfVar) {
        if ((zzamfVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzamfVar.zzi()[0];
        zzsn zzsnVar = this.zza;
        zzakt.zze(zzsnVar);
        int i2 = !zzsnVar.zzd[(b2 >> 1) & (255 >>> (8 - zzsnVar.zze))].zza ? zzsnVar.zza.zze : zzsnVar.zza.zzf;
        long j2 = this.zzc ? (this.zzb + i2) / 4 : 0;
        if (zzamfVar.zzj() < zzamfVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze() + 4);
            zzamfVar.zzb(copyOf, copyOf.length);
        } else {
            zzamfVar.zzf(zzamfVar.zze() + 4);
        }
        byte[] zzi = zzamfVar.zzi();
        zzi[zzamfVar.zze() - 4] = (byte) (j2 & 255);
        zzi[zzamfVar.zze() - 3] = (byte) ((j2 >>> 8) & 255);
        zzi[zzamfVar.zze() - 2] = (byte) ((j2 >>> 16) & 255);
        zzi[zzamfVar.zze() - 1] = (byte) ((j2 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzamf zzamfVar, long j2, zzsk zzskVar) throws IOException {
        zzsn zzsnVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.zza != null) {
            Objects.requireNonNull(zzskVar.zza);
            return false;
        }
        zzpb zzpbVar = this.zzd;
        if (zzpbVar == null) {
            zzpc.zzc(1, zzamfVar, false);
            int zzC = zzamfVar.zzC();
            int zzn = zzamfVar.zzn();
            int zzC2 = zzamfVar.zzC();
            int zzw = zzamfVar.zzw();
            int i7 = zzw <= 0 ? -1 : zzw;
            int zzw2 = zzamfVar.zzw();
            int i8 = zzw2 <= 0 ? -1 : zzw2;
            int zzw3 = zzamfVar.zzw();
            int i9 = zzw3 <= 0 ? -1 : zzw3;
            int zzn2 = zzamfVar.zzn();
            this.zzd = new zzpb(zzC, zzn, zzC2, i7, i8, i9, (int) Math.pow(2.0d, zzn2 & 15), (int) Math.pow(2.0d, (zzn2 & 240) >> 4), 1 == (zzamfVar.zzn() & 1), Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze()));
        } else {
            zzoz zzozVar = this.zze;
            if (zzozVar == null) {
                this.zze = zzpc.zzb(zzamfVar, true, true);
            } else {
                byte[] bArr = new byte[zzamfVar.zze()];
                System.arraycopy(zzamfVar.zzi(), 0, bArr, 0, zzamfVar.zze());
                int i10 = zzpbVar.zza;
                int i11 = 5;
                zzpc.zzc(5, zzamfVar, false);
                int zzn3 = zzamfVar.zzn() + 1;
                zzoy zzoyVar = new zzoy(zzamfVar.zzi());
                zzoyVar.zzc(zzamfVar.zzg() * 8);
                int i12 = 0;
                while (i12 < zzn3) {
                    if (zzoyVar.zzb(24) != 5653314) {
                        int zzd = zzoyVar.zzd();
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(zzd);
                        throw zzaha.zzb(sb.toString(), null);
                    }
                    int zzb = zzoyVar.zzb(16);
                    int zzb2 = zzoyVar.zzb(24);
                    long[] jArr = new long[zzb2];
                    long j3 = 0;
                    if (zzoyVar.zza()) {
                        i5 = zzn3;
                        int zzb3 = zzoyVar.zzb(5) + 1;
                        int i13 = 0;
                        while (i13 < zzb2) {
                            int zzb4 = zzoyVar.zzb(zzpc.zza(zzb2 - i13));
                            int i14 = 0;
                            while (i14 < zzb4 && i13 < zzb2) {
                                jArr[i13] = zzb3;
                                i13++;
                                i14++;
                                zzozVar = zzozVar;
                                bArr = bArr;
                            }
                            zzb3++;
                            zzozVar = zzozVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zza = zzoyVar.zza();
                        int i15 = 0;
                        while (i15 < zzb2) {
                            if (!zza) {
                                i6 = zzn3;
                                jArr[i15] = zzoyVar.zzb(5) + 1;
                            } else if (zzoyVar.zza()) {
                                i6 = zzn3;
                                jArr[i15] = zzoyVar.zzb(i11) + 1;
                            } else {
                                i6 = zzn3;
                                jArr[i15] = 0;
                            }
                            i15++;
                            zzn3 = i6;
                            i11 = 5;
                        }
                        i5 = zzn3;
                    }
                    zzoz zzozVar2 = zzozVar;
                    byte[] bArr2 = bArr;
                    int zzb5 = zzoyVar.zzb(4);
                    if (zzb5 > 2) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(zzb5);
                        throw zzaha.zzb(sb2.toString(), null);
                    }
                    if (zzb5 != 1) {
                        if (zzb5 == 2) {
                            zzb5 = 2;
                        } else {
                            i12++;
                            zzozVar = zzozVar2;
                            zzn3 = i5;
                            bArr = bArr2;
                            i11 = 5;
                        }
                    }
                    zzoyVar.zzc(32);
                    zzoyVar.zzc(32);
                    int zzb6 = zzoyVar.zzb(4) + 1;
                    zzoyVar.zzc(1);
                    if (zzb5 != 1) {
                        j3 = zzb2 * zzb;
                    } else if (zzb != 0) {
                        double d2 = zzb;
                        Double.isNaN(d2);
                        j3 = (long) Math.floor(Math.pow(zzb2, 1.0d / d2));
                    }
                    zzoyVar.zzc((int) (zzb6 * j3));
                    i12++;
                    zzozVar = zzozVar2;
                    zzn3 = i5;
                    bArr = bArr2;
                    i11 = 5;
                }
                zzoz zzozVar3 = zzozVar;
                byte[] bArr3 = bArr;
                int i16 = 6;
                int zzb7 = zzoyVar.zzb(6) + 1;
                for (int i17 = 0; i17 < zzb7; i17++) {
                    if (zzoyVar.zzb(16) != 0) {
                        throw zzaha.zzb("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i18 = 1;
                int zzb8 = zzoyVar.zzb(6) + 1;
                int i19 = 0;
                while (true) {
                    int i20 = 3;
                    if (i19 < zzb8) {
                        int zzb9 = zzoyVar.zzb(16);
                        if (zzb9 == 0) {
                            int i21 = 8;
                            zzoyVar.zzc(8);
                            zzoyVar.zzc(16);
                            zzoyVar.zzc(16);
                            zzoyVar.zzc(6);
                            zzoyVar.zzc(8);
                            int zzb10 = zzoyVar.zzb(4) + 1;
                            int i22 = 0;
                            while (i22 < zzb10) {
                                zzoyVar.zzc(i21);
                                i22++;
                                i21 = 8;
                            }
                        } else if (zzb9 != i18) {
                            StringBuilder sb3 = new StringBuilder(52);
                            sb3.append("floor type greater than 1 not decodable: ");
                            sb3.append(zzb9);
                            throw zzaha.zzb(sb3.toString(), null);
                        } else {
                            int zzb11 = zzoyVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i23 = -1;
                            for (int i24 = 0; i24 < zzb11; i24++) {
                                int zzb12 = zzoyVar.zzb(4);
                                iArr[i24] = zzb12;
                                if (zzb12 > i23) {
                                    i23 = zzb12;
                                }
                            }
                            int i25 = i23 + 1;
                            int[] iArr2 = new int[i25];
                            int i26 = 0;
                            while (i26 < i25) {
                                iArr2[i26] = zzoyVar.zzb(i20) + 1;
                                int zzb13 = zzoyVar.zzb(2);
                                if (zzb13 > 0) {
                                    i4 = 8;
                                    zzoyVar.zzc(8);
                                } else {
                                    i4 = 8;
                                }
                                int i27 = 0;
                                for (int i28 = 1; i27 < (i28 << zzb13); i28 = 1) {
                                    zzoyVar.zzc(i4);
                                    i27++;
                                    i4 = 8;
                                }
                                i26++;
                                i20 = 3;
                            }
                            zzoyVar.zzc(2);
                            int zzb14 = zzoyVar.zzb(4);
                            int i29 = 0;
                            int i30 = 0;
                            for (int i31 = 0; i31 < zzb11; i31++) {
                                i29 += iArr2[iArr[i31]];
                                while (i30 < i29) {
                                    zzoyVar.zzc(zzb14);
                                    i30++;
                                }
                            }
                        }
                        i19++;
                        i16 = 6;
                        i18 = 1;
                    } else {
                        int i32 = 1;
                        int zzb15 = zzoyVar.zzb(i16) + 1;
                        int i33 = 0;
                        while (i33 < zzb15) {
                            if (zzoyVar.zzb(16) > 2) {
                                throw zzaha.zzb("residueType greater than 2 is not decodable", null);
                            }
                            zzoyVar.zzc(24);
                            zzoyVar.zzc(24);
                            zzoyVar.zzc(24);
                            int zzb16 = zzoyVar.zzb(i16) + i32;
                            int i34 = 8;
                            zzoyVar.zzc(8);
                            int[] iArr3 = new int[zzb16];
                            for (int i35 = 0; i35 < zzb16; i35++) {
                                iArr3[i35] = ((zzoyVar.zza() ? zzoyVar.zzb(5) : 0) * 8) + zzoyVar.zzb(3);
                            }
                            int i36 = 0;
                            while (i36 < zzb16) {
                                int i37 = 0;
                                while (i37 < i34) {
                                    if ((iArr3[i36] & (1 << i37)) != 0) {
                                        zzoyVar.zzc(i34);
                                    }
                                    i37++;
                                    i34 = 8;
                                }
                                i36++;
                                i34 = 8;
                            }
                            i33++;
                            i16 = 6;
                            i32 = 1;
                        }
                        int zzb17 = zzoyVar.zzb(i16) + 1;
                        for (int i38 = 0; i38 < zzb17; i38++) {
                            int zzb18 = zzoyVar.zzb(16);
                            if (zzb18 != 0) {
                                StringBuilder sb4 = new StringBuilder(52);
                                sb4.append("mapping type other than 0 not supported: ");
                                sb4.append(zzb18);
                                Log.e("VorbisUtil", sb4.toString());
                            } else {
                                if (zzoyVar.zza()) {
                                    i2 = 1;
                                    i3 = zzoyVar.zzb(4) + 1;
                                } else {
                                    i2 = 1;
                                    i3 = 1;
                                }
                                if (zzoyVar.zza()) {
                                    int zzb19 = zzoyVar.zzb(8) + i2;
                                    for (int i39 = 0; i39 < zzb19; i39++) {
                                        int i40 = i10 - 1;
                                        zzoyVar.zzc(zzpc.zza(i40));
                                        zzoyVar.zzc(zzpc.zza(i40));
                                    }
                                }
                                if (zzoyVar.zzb(2) != 0) {
                                    throw zzaha.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i3 > 1) {
                                    for (int i41 = 0; i41 < i10; i41++) {
                                        zzoyVar.zzc(4);
                                    }
                                }
                                for (int i42 = 0; i42 < i3; i42++) {
                                    zzoyVar.zzc(8);
                                    zzoyVar.zzc(8);
                                    zzoyVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzoyVar.zzb(6) + 1;
                        zzpa[] zzpaVarArr = new zzpa[zzb20];
                        for (int i43 = 0; i43 < zzb20; i43++) {
                            zzpaVarArr[i43] = new zzpa(zzoyVar.zza(), zzoyVar.zzb(16), zzoyVar.zzb(16), zzoyVar.zzb(8));
                        }
                        if (!zzoyVar.zza()) {
                            throw zzaha.zzb("framing bit after modes not set as expected", null);
                        }
                        zzsnVar = new zzsn(zzpbVar, zzozVar3, bArr3, zzpaVarArr, zzpc.zza(zzb20 - 1));
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

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zzj(long j2) {
        super.zzj(j2);
        this.zzc = j2 != 0;
        zzpb zzpbVar = this.zzd;
        this.zzb = zzpbVar != null ? zzpbVar.zze : 0;
    }
}
