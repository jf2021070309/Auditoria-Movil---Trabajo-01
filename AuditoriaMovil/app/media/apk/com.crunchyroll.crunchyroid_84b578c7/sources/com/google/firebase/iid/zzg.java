package com.google.firebase.iid;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzg implements Executor {
    static final Executor zza = new zzg();

    private zzg() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
