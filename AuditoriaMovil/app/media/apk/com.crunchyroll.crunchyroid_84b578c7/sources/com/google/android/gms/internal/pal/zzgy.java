package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.common.internal.ShowFirstParty;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzgy extends Exception {
    private final int zza;

    public zzgy(int i) {
        super(c0.a("Signal SDK error code: ", i));
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }
}
