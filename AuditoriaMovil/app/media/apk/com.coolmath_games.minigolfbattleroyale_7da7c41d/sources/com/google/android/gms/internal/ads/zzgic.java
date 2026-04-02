package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgic extends zzgik {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgic(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza() {
        if (!zzd()) {
            for (int i = 0; i < zze(); i++) {
                Map.Entry zzf = zzf(i);
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
