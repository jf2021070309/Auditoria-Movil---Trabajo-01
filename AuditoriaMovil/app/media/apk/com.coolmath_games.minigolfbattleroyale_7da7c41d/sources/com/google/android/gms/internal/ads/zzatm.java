package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzatm extends zzatq {
    private final AtomicReference<zzatl> zza;

    public zzatm() {
        this(null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    protected final zzatk[] zzb(zzans[] zzansVarArr, zzatg[] zzatgVarArr, int[][][] iArr) throws zzamy {
        boolean z;
        zzatn zzatnVar;
        zzatf zzatfVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z2;
        int i;
        int zzh;
        int i2 = 2;
        zzatk[] zzatkVarArr = new zzatk[2];
        zzatl zzatlVar = this.zza.get();
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            int i4 = 1;
            if (i3 >= i2) {
                break;
            }
            if (zzansVarArr[i3].zza() == i2) {
                if (!z3) {
                    zzans zzansVar = zzansVarArr[i3];
                    zzatg zzatgVar = zzatgVarArr[i3];
                    int[][] iArr3 = iArr[i3];
                    int i5 = zzatlVar.zzd;
                    int i6 = zzatlVar.zze;
                    int i7 = zzatlVar.zzf;
                    boolean z4 = zzatlVar.zzc;
                    boolean z5 = zzatlVar.zzb;
                    int i8 = zzatlVar.zzi;
                    int i9 = zzatlVar.zzj;
                    boolean z6 = zzatlVar.zzk;
                    boolean z7 = zzatlVar.zzg;
                    boolean z8 = zzatlVar.zzh;
                    int i10 = 0;
                    zzatf zzatfVar2 = null;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    while (i10 < zzatgVar.zzb) {
                        zzatf zza = zzatgVar.zza(i10);
                        int i15 = zza.zza;
                        ArrayList arrayList2 = new ArrayList(i4);
                        int i16 = 0;
                        while (true) {
                            int i17 = zza.zza;
                            if (i16 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i16));
                            i16++;
                        }
                        int[] iArr4 = iArr3[i10];
                        int i18 = i14;
                        int i19 = 0;
                        while (true) {
                            int i20 = zza.zza;
                            if (i19 <= 0) {
                                zzatg zzatgVar2 = zzatgVar;
                                if (zza(iArr4[i19], true)) {
                                    zzanm zza2 = zza.zza(i19);
                                    if (arrayList2.contains(Integer.valueOf(i19))) {
                                        int i21 = zza2.zzj;
                                        int i22 = zza2.zzk;
                                        int i23 = zza2.zzb;
                                        zzatfVar = zza;
                                        z2 = true;
                                    } else {
                                        zzatfVar = zza;
                                        z2 = false;
                                    }
                                    if (true != z2) {
                                        arrayList = arrayList2;
                                        i = 1;
                                    } else {
                                        arrayList = arrayList2;
                                        i = 2;
                                    }
                                    iArr2 = iArr4;
                                    boolean zza3 = zza(iArr4[i19], false);
                                    if (zza3) {
                                        i += 1000;
                                    }
                                    boolean z9 = i > i12;
                                    if (i == i12) {
                                        if (zza2.zzk() != i18) {
                                            zzh = zzh(zza2.zzk(), i18);
                                        } else {
                                            zzh = zzh(zza2.zzb, i13);
                                        }
                                        z9 = !(zza3 && z2) ? zzh >= 0 : zzh <= 0;
                                    }
                                    if (z9) {
                                        i13 = zza2.zzb;
                                        i18 = zza2.zzk();
                                        i12 = i;
                                        i11 = i19;
                                        zzatfVar2 = zzatfVar;
                                    }
                                } else {
                                    zzatfVar = zza;
                                    iArr2 = iArr4;
                                    arrayList = arrayList2;
                                }
                                i19++;
                                zzatgVar = zzatgVar2;
                                zza = zzatfVar;
                                arrayList2 = arrayList;
                                iArr4 = iArr2;
                            }
                        }
                        i10++;
                        i4 = 1;
                        i14 = i18;
                    }
                    zzatn zzatnVar2 = zzatfVar2 == null ? null : new zzatn(zzatfVar2, i11, 0, null);
                    zzatkVarArr[i3] = zzatnVar2;
                    z3 = zzatnVar2 != null;
                }
                int i24 = zzatgVarArr[i3].zzb;
            }
            i3++;
            i2 = 2;
        }
        int i25 = 0;
        boolean z10 = false;
        while (i25 < i2) {
            if (zzansVarArr[i25].zza() == 1 && !z10) {
                zzatg zzatgVar3 = zzatgVarArr[i25];
                int[][] iArr5 = iArr[i25];
                String str = zzatlVar.zza;
                boolean z11 = zzatlVar.zzh;
                boolean z12 = zzatlVar.zzb;
                int i26 = -1;
                int i27 = -1;
                int i28 = 0;
                int i29 = 0;
                while (i28 < zzatgVar3.zzb) {
                    zzatf zza4 = zzatgVar3.zza(i28);
                    int[] iArr6 = iArr5[i28];
                    int i30 = i29;
                    int i31 = i27;
                    int i32 = i26;
                    int i33 = 0;
                    while (true) {
                        int i34 = zza4.zza;
                        if (i33 <= 0) {
                            if (zza(iArr6[i33], true)) {
                                zzanm zza5 = zza4.zza(i33);
                                int i35 = iArr6[i33];
                                int i36 = 1 != (zza5.zzx & 1) ? 1 : i2;
                                if (zza(i35, false)) {
                                    i36 += 1000;
                                }
                                if (i36 > i30) {
                                    i31 = i33;
                                    i32 = i28;
                                    i30 = i36;
                                }
                            }
                            i33++;
                            i2 = 2;
                        }
                    }
                    i28++;
                    i26 = i32;
                    i27 = i31;
                    i29 = i30;
                    i2 = 2;
                }
                if (i26 == -1) {
                    zzatnVar = null;
                    z = false;
                } else {
                    z = false;
                    zzatnVar = new zzatn(zzatgVar3.zza(i26), i27, 0, null);
                }
                zzatkVarArr[i25] = zzatnVar;
                z10 = zzatnVar != null ? true : z;
            }
            i25++;
            i2 = 2;
        }
        return zzatkVarArr;
    }

    public zzatm(zzatr zzatrVar) {
        this.zza = new AtomicReference<>(new zzatl());
    }
}
