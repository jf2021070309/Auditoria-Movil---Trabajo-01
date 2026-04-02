package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzad {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzac zzc;

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i3);
        }
    }

    public final zzad zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzw.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzad zzb(Iterable iterable) {
        zzd(iterable.size() + this.zzb);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzae zzc() {
        zzac zzacVar = this.zzc;
        if (zzacVar == null) {
            zzal zzf = zzal.zzf(this.zzb, this.zza, this);
            zzac zzacVar2 = this.zzc;
            if (zzacVar2 == null) {
                return zzf;
            }
            throw zzacVar2.zza();
        }
        throw zzacVar.zza();
    }
}
