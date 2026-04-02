package com.amazon.aps.iva.r;

import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                c.s().a.b.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
