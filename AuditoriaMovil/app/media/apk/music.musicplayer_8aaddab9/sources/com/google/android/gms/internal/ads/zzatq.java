package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class zzatq extends zzatu {
    private final SparseArray<Map<zzatg, zzatp>> zza = new SparseArray<>();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzato zzc;

    public abstract zzatk[] zzb(zzans[] zzansVarArr, zzatg[] zzatgVarArr, int[][][] iArr) throws zzamy;

    public final void zzc(int i2, boolean z) {
        if (this.zzb.get(i2) == z) {
            return;
        }
        this.zzb.put(i2, z);
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatu
    public final zzatv zzd(zzans[] zzansVarArr, zzatg zzatgVar) throws zzamy {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzatf[][] zzatfVarArr = new zzatf[3];
        int[][][] iArr3 = new int[3][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzatgVar.zzb;
            zzatfVarArr[i2] = new zzatf[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            zzansVarArr[i5].zzq();
            iArr4[i5] = 4;
        }
        int i6 = 0;
        while (i6 < zzatgVar.zzb) {
            zzatf zza = zzatgVar.zza(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 2;
            while (true) {
                if (i7 >= i4) {
                    i7 = i9;
                    break;
                }
                zzans zzansVar = zzansVarArr[i7];
                int i10 = 0;
                while (true) {
                    int i11 = zza.zza;
                    if (i10 <= 0) {
                        int zzG = zzansVar.zzG(zza.zza(i10)) & 3;
                        if (zzG > i8) {
                            if (zzG == 3) {
                                break;
                            }
                            i9 = i7;
                            i8 = zzG;
                        }
                        i10++;
                    }
                }
                i7++;
                i4 = 2;
            }
            if (i7 == 2) {
                int i12 = zza.zza;
                iArr = new int[1];
            } else {
                zzans zzansVar2 = zzansVarArr[i7];
                int i13 = zza.zza;
                int[] iArr5 = new int[1];
                for (int i14 = 0; i14 <= 0; i14++) {
                    iArr5[i14] = zzansVar2.zzG(zza.zza(i14));
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzatfVarArr[i7][i15] = zza;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i6++;
            i4 = 2;
        }
        zzatg[] zzatgVarArr = new zzatg[2];
        int[] iArr6 = new int[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = iArr2[i16];
            zzatgVarArr[i16] = new zzatg((zzatf[]) Arrays.copyOf(zzatfVarArr[i16], i18));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i18);
            iArr6[i16] = zzansVarArr[i16].zza();
            i16++;
        }
        zzatg zzatgVar2 = new zzatg((zzatf[]) Arrays.copyOf(zzatfVarArr[2], iArr2[2]));
        zzatk[] zzb = zzb(zzansVarArr, zzatgVarArr, iArr3);
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            if (this.zzb.get(i19)) {
                zzb[i19] = null;
            } else {
                zzatg zzatgVar3 = zzatgVarArr[i19];
                Map<zzatg, zzatp> map = this.zza.get(i19);
                if ((map == null ? null : map.get(zzatgVar3)) != null) {
                    throw null;
                }
            }
            i19++;
        }
        zzato zzatoVar = new zzato(iArr6, zzatgVarArr, iArr4, iArr3, zzatgVar2);
        zzant[] zzantVarArr = new zzant[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzantVarArr[i21] = zzb[i21] != null ? zzant.zza : null;
        }
        return new zzatv(zzatgVar, new zzats(zzb, null), zzatoVar, zzantVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzatu
    public final void zze(Object obj) {
        this.zzc = (zzato) obj;
    }
}
