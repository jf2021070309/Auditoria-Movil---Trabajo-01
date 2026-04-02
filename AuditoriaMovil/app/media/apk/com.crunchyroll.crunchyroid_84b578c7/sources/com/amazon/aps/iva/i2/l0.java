package com.amazon.aps.iva.i2;

import android.os.Handler;
import android.view.Choreographer;
import com.amazon.aps.iva.f8.f0;
import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Executor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Choreographer choreographer = (Choreographer) obj;
                com.amazon.aps.iva.yb0.j.f(choreographer, "$this_asExecutor");
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.amazon.aps.iva.i2.m0
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
                return;
            case 1:
            default:
                ((f0.d.c) obj).post(runnable);
                return;
            case 2:
                ((Handler) obj).post(runnable);
                return;
        }
    }
}
