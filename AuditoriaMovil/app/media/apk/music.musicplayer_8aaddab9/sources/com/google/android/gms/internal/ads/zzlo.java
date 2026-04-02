package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class zzlo {
    private static final Comparator<zzln> zza = zzlk.zza;
    private static final Comparator<zzln> zzb = zzll.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzln[] zzd = new zzln[5];
    private final ArrayList<zzln> zzc = new ArrayList<>();
    private int zze = -1;

    public zzlo(int i2) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i2, float f2) {
        zzln zzlnVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i3 = this.zzh;
        if (i3 > 0) {
            zzln[] zzlnVarArr = this.zzd;
            int i4 = i3 - 1;
            this.zzh = i4;
            zzlnVar = zzlnVarArr[i4];
        } else {
            zzlnVar = new zzln(null);
        }
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        zzlnVar.zza = i5;
        zzlnVar.zzb = i2;
        zzlnVar.zzc = f2;
        this.zzc.add(zzlnVar);
        this.zzg += i2;
        while (true) {
            int i6 = this.zzg;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            zzln zzlnVar2 = this.zzc.get(0);
            int i8 = zzlnVar2.zzb;
            if (i8 <= i7) {
                this.zzg -= i8;
                this.zzc.remove(0);
                int i9 = this.zzh;
                if (i9 < 5) {
                    zzln[] zzlnVarArr2 = this.zzd;
                    this.zzh = i9 + 1;
                    zzlnVarArr2[i9] = zzlnVar2;
                }
            } else {
                zzlnVar2.zzb = i8 - i7;
                this.zzg -= i7;
            }
        }
    }

    public final float zzc(float f2) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f3 = this.zzg * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.size(); i3++) {
            zzln zzlnVar = this.zzc.get(i3);
            i2 += zzlnVar.zzb;
            if (i2 >= f3) {
                return zzlnVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<zzln> arrayList = this.zzc;
        return arrayList.get(arrayList.size() - 1).zzc;
    }
}
