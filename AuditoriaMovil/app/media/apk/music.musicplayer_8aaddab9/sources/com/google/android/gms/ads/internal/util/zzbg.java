package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbg {
    private final List<String> zza = new ArrayList();
    private final List<Double> zzb = new ArrayList();
    private final List<Double> zzc = new ArrayList();

    public final zzbg zzd(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.zza.size()) {
            double doubleValue = this.zzc.get(i2).doubleValue();
            double doubleValue2 = this.zzb.get(i2).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i2++;
        }
        this.zza.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d2));
        this.zzb.add(i2, Double.valueOf(d3));
        return this;
    }

    public final zzbi zze() {
        return new zzbi(this, null);
    }
}
