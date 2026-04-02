package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzgic extends zzgik {
    public zzgic(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza() {
        if (!zzd()) {
            for (int i2 = 0; i2 < zze(); i2++) {
                Map.Entry zzf = zzf(i2);
                if (((zzgfq) zzf.getKey()).zzc()) {
                    zzf.setValue(Collections.unmodifiableList((List) zzf.getValue()));
                }
            }
            for (Map.Entry entry : zzg()) {
                if (((zzgfq) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
