package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
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
