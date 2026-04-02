package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqz {
    private HashMap zza = new HashMap();

    public final zzrb zza() {
        if (this.zza != null) {
            zzrb zzrbVar = new zzrb(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzrbVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
