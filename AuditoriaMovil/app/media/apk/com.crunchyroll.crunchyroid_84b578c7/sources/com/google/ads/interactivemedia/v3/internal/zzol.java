package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.common.internal.ShowFirstParty;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzol extends Exception {
    private final int zza;

    public zzol(int i) {
        super(c0.a("Signal SDK error code: ", i));
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }
}
