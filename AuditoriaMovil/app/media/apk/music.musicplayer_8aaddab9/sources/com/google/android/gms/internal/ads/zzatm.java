package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class zzatm extends zzatq {
    private final AtomicReference<zzatl> zza;

    public zzatm() {
        this(null);
    }

    public zzatm(zzatr zzatrVar) {
        this.zza = new AtomicReference<>(new zzatl());
    }

    public static boolean zza(int i2, boolean z) {
        int i3 = i2 & 3;
        return i3 == 3 || (z && i3 == 2);
    }

    private static int zzh(int i2, int i3) {
        if (i2 == -1) {
            return i3 != -1 ? -1 : 0;
        } else if (i3 == -1) {
            return 1;
        } else {
            return i2 - i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final zzatk[] zzb(zzans[] zzansVarArr, zzatg[] zzatgVarArr, int[][][] iArr) throws zzamy {
        zzatf zzatfVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        int i2;
        int i3 = 2;
        zzatk[] zzatkVarArr = new zzatk[2];
        zzatl zzatlVar = this.zza.get();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzansVarArr[i4].zza() == i3) {
                if (!z2) {
                    zzans zzansVar = zzansVarArr[i4];
                    zzatg zzatgVar = zzatgVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = zzatlVar.zzd;
                    int i7 = 0;
                    zzatf zzatfVar2 = null;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = -1;
                    int i11 = -1;
                    while (i7 < zzatgVar.zzb) {
                        zzatf zza = zzatgVar.zza(i7);
                        int i12 = zza.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        for (int i13 = 0; i13 <= 0; i13++) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i14 = i11;
                        int i15 = 0;
                        while (i15 <= 0) {
                            zzatg zzatgVar2 = zzatgVar;
                            if (zza(iArr4[i15], true)) {
                                zzanm zza2 = zza.zza(i15);
                                if (arrayList2.contains(Integer.valueOf(i15))) {
                                    int i16 = zza2.zzj;
                                    int i17 = zza2.zzb;
                                    zzatfVar = zza;
                                    z = true;
                                } else {
                                    zzatfVar = zza;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i2 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i2 = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza3 = zza(iArr4[i15], false);
                                if (zza3) {
                                    i2 += 1000;
                                }
                                boolean z3 = i2 > i9;
                                if (i2 == i9) {
                                    int zzh = zza2.zzk() != i14 ? zzh(zza2.zzk(), i14) : zzh(zza2.zzb, i10);
                                    z3 = !(zza3 && z) ? zzh >= 0 : zzh <= 0;
                                }
                                if (z3) {
                                    i10 = zza2.zzb;
                                    i14 = zza2.zzk();
                                    i9 = i2;
                                    i8 = i15;
                                    zzatfVar2 = zzatfVar;
                                }
                            } else {
                                zzatfVar = zza;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i15++;
                            zzatgVar = zzatgVar2;
                            zza = zzatfVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i7++;
                        i11 = i14;
                        i5 = 1;
                    }
                    zzatn zzatnVar = zzatfVar2 == null ? null : new zzatn(zzatfVar2, i8, 0, null);
                    zzatkVarArr[i4] = zzatnVar;
                    z2 = zzatnVar != null;
                }
                int i18 = zzatgVarArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i19 = 0;
        boolean z4 = false;
        while (i19 < i3) {
            if (zzansVarArr[i19].zza() == 1 && !z4) {
                zzatg zzatgVar3 = zzatgVarArr[i19];
                int[][] iArr5 = iArr[i19];
                String str = zzatlVar.zza;
                int i20 = -1;
                int i21 = -1;
                int i22 = 0;
                int i23 = 0;
                while (i22 < zzatgVar3.zzb) {
                    zzatf zza4 = zzatgVar3.zza(i22);
                    int[] iArr6 = iArr5[i22];
                    int i24 = i23;
                    int i25 = i21;
                    int i26 = i20;
                    int i27 = 0;
                    while (true) {
                        int i28 = zza4.zza;
                        if (i27 <= 0) {
                            if (zza(iArr6[i27], true)) {
                                zzanm zza5 = zza4.zza(i27);
                                int i29 = iArr6[i27];
                                int i30 = 1 != (zza5.zzx & 1) ? 1 : 2;
                                if (zza(i29, false)) {
                                    i30 += 1000;
                                }
                                if (i30 > i24) {
                                    i25 = i27;
                                    i26 = i22;
                                    i24 = i30;
                                }
                            }
                            i27++;
                        }
                    }
                    i22++;
                    i20 = i26;
                    i21 = i25;
                    i23 = i24;
                }
                zzatn zzatnVar2 = i20 == -1 ? null : new zzatn(zzatgVar3.zza(i20), i21, 0, null);
                zzatkVarArr[i19] = zzatnVar2;
                z4 = zzatnVar2 != null;
            }
            i19++;
            i3 = 2;
        }
        return zzatkVarArr;
    }
}
