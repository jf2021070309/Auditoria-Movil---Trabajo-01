package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbi {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbi(zzbg zzbgVar, zzbh zzbhVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbgVar.zzb;
        int size = list.size();
        list2 = zzbgVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbgVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbgVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = list.get(i2).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d2) {
        this.zze++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i2 >= dArr.length) {
                return;
            }
            double d3 = dArr[i2];
            if (d3 <= d2 && d2 < this.zzb[i2]) {
                int[] iArr = this.zzd;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < d3) {
                return;
            }
            i2++;
        }
    }

    public final List<zzbf> zzb() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.zzc[i2];
            double d3 = this.zzb[i2];
            int i3 = this.zzd[i2];
            double d4 = i3;
            double d5 = this.zze;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new zzbf(str, d2, d3, d4 / d5, i3));
            i2++;
        }
    }
}
