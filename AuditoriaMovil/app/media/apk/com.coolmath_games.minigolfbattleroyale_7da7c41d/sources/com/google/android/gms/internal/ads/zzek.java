package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzek implements Executor {
    private final Handler zza;

    private zzek(Handler handler) {
        this.zza = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zza(Handler handler) {
        return new zzek(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
