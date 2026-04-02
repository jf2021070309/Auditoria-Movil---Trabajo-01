package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzvc {
    private final zzso zza;

    public /* synthetic */ zzvc(boolean z, zzso zzsoVar, zzvb zzvbVar) {
        this.zza = zzsoVar;
    }

    public final zzvq zza(Callable callable, Executor executor) {
        return new zzur(this.zza, false, executor, callable);
    }
}
