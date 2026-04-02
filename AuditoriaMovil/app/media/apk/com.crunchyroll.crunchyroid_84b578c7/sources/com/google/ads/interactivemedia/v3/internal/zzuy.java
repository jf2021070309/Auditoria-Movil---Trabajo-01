package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzuy extends zzuw implements zzvq {
    @Override // com.google.ads.interactivemedia.v3.internal.zzuw
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract zzvq zzc();

    @Override // com.google.ads.interactivemedia.v3.internal.zzvq
    public final void zzm(Runnable runnable, Executor executor) {
        zzc().zzm(runnable, executor);
    }
}
