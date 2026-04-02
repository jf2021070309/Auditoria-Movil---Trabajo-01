package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzatq extends zzatu {
    private final SparseArray<Map<zzatg, zzatp>> zza = new SparseArray<>();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzato zzc;

    protected abstract zzatk[] zzb(zzans[] zzansVarArr, zzatg[] zzatgVarArr, int[][][] iArr) throws zzamy;

    public final void zzc(int i, boolean z) {
        if (this.zzb.get(i) == z) {
            return;
        }
        this.zzb.put(i, z);
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatu
    public final zzatv zzd(zzans[] zzansVarArr, zzatg zzatgVar) throws zzamy {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzatf[][] zzatfVarArr = new zzatf[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzatgVar.zzb;
            zzatfVarArr[i] = new zzatf[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzansVarArr[i4].zzq();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzatgVar.zzb) {
            zzatf zza = zzatgVar.zza(i5);
            int i6 = i3;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= i3) {
                    i7 = i6;
                    break;
                }
                zzans zzansVar = zzansVarArr[i7];
                int i9 = 0;
                while (true) {
                    int i10 = zza.zza;
                    if (i9 <= 0) {
                        int zzG = zzansVar.zzG(zza.zza(i9)) & 3;
                        if (zzG > i8) {
                            if (zzG == 3) {
                                break;
                            }
                            i6 = i7;
                            i8 = zzG;
                        }
                        i9++;
                    }
                }
                i7++;
                i3 = 2;
            }
            if (i7 == 2) {
                int i11 = zza.zza;
                iArr = new int[1];
            } else {
                zzans zzansVar2 = zzansVarArr[i7];
                int i12 = zza.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zza.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzansVar2.zzG(zza.zza(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzatfVarArr[i7][i15] = zza;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i5++;
            i3 = 2;
        }
        int i16 = i3;
        zzatg[] zzatgVarArr = new zzatg[i16];
        int[] iArr6 = new int[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            zzatgVarArr[i17] = new zzatg((zzatf[]) Arrays.copyOf(zzatfVarArr[i17], i18));
            iArr3[i17] = (int[][]) Arrays.copyOf(iArr3[i17], i18);
            iArr6[i17] = zzansVarArr[i17].zza();
            i17++;
            i16 = 2;
        }
        int i19 = i16;
        zzatg zzatgVar2 = new zzatg((zzatf[]) Arrays.copyOf(zzatfVarArr[i19], iArr2[i19]));
        zzatk[] zzb = zzb(zzansVarArr, zzatgVarArr, iArr3);
        int i20 = 0;
        while (i20 < i19) {
            if (this.zzb.get(i20)) {
                zzb[i20] = null;
            } else {
                zzatg zzatgVar3 = zzatgVarArr[i20];
                Map<zzatg, zzatp> map = this.zza.get(i20);
                if ((map == null ? null : map.get(zzatgVar3)) != null) {
                    throw null;
                }
            }
            i20++;
            i19 = 2;
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
