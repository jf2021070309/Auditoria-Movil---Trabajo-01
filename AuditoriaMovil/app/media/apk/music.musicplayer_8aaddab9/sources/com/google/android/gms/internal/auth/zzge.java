package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzge extends zzgl {
    public zzge(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgl
    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzb(); i2++) {
                Map.Entry zzg = zzg(i2);
                if (((zzek) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzek) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
