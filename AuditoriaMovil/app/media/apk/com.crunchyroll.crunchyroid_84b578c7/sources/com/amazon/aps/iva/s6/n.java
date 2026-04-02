package com.amazon.aps.iva.s6;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Executor {
    public final /* synthetic */ Handler b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
