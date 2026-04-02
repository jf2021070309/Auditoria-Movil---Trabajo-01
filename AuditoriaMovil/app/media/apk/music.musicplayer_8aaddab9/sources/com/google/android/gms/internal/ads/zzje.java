package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzje extends zzjg {
    private final zzki zzd;
    private final zzfoj<zzjc> zze;
    private final zzaku zzf;

    public zzje(zzq zzqVar, int[] iArr, int i2, zzki zzkiVar, long j2, long j3, long j4, float f2, float f3, List<zzjc> list, zzaku zzakuVar) {
        super(zzqVar, iArr, 0);
        this.zzd = zzkiVar;
        this.zze = zzfoj.zzp(list);
        this.zzf = zzakuVar;
    }

    public static /* synthetic */ zzfoj<zzfoj<zzjc>> zza(zzju[] zzjuVarArr) {
        int i2;
        int i3;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        int i4 = 0;
        while (true) {
            i2 = 2;
            i3 = 1;
            if (i4 >= 2) {
                break;
            }
            zzju zzjuVar = zzjuVarArr[i4];
            if (zzjuVar == null || zzjuVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfog zzu = zzfoj.zzu();
                zzu.zze((zzfog) new zzjc(0L, 0L));
                arrayList.add(zzu);
            }
            i4++;
        }
        long[][] jArr = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            zzju zzjuVar2 = zzjuVarArr[i5];
            if (zzjuVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzjuVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    if (i6 >= zzjuVar2.zzb.length) {
                        break;
                    }
                    jArr[i5][i6] = zzjuVar2.zza.zza(iArr[i6]).zzh;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzf(arrayList, jArr2);
        zzfoy zza = zzfpr.zzc(zzfpw.zzb()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i2) {
            int length = jArr[i8].length;
            if (length > i3) {
                double[] dArr = new double[length];
                int i9 = 0;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    double d2 = 0.0d;
                    if (i9 >= jArr4.length) {
                        break;
                    }
                    long j2 = jArr4[i9];
                    if (j2 != -1) {
                        d2 = Math.log(j2);
                    }
                    dArr[i9] = d2;
                    i9++;
                }
                int i10 = length - 1;
                double d3 = dArr[i10] - dArr[c2];
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    zza.zzh(Double.valueOf(d3 == 0.0d ? 1.0d : (((dArr[i11] + dArr[i12]) * 0.5d) - dArr[c2]) / d3), Integer.valueOf(i8));
                    i11 = i12;
                    c2 = 0;
                }
            }
            i8++;
            c2 = 0;
            i2 = 2;
            i3 = 1;
        }
        zzfoj zzp = zzfoj.zzp(zza.zzt());
        for (int i13 = 0; i13 < zzp.size(); i13++) {
            int intValue = ((Integer) zzp.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr2[intValue] = jArr[intValue][i14];
            zzf(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j3 = jArr2[i15];
                jArr2[i15] = j3 + j3;
            }
        }
        zzf(arrayList, jArr2);
        zzfog zzu2 = zzfoj.zzu();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfog zzfogVar = (zzfog) arrayList.get(i16);
            zzu2.zze((zzfog) (zzfogVar == null ? zzfoj.zzi() : zzfogVar.zzf()));
        }
        return zzu2.zzf();
    }

    private static void zzf(List<zzfog<zzjc>> list, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j2 += jArr[i2];
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzfog<zzjc> zzfogVar = list.get(i3);
            if (zzfogVar != null) {
                zzfogVar.zze((zzfog<zzjc>) new zzjc(j2, jArr[i3]));
            }
        }
    }
}
