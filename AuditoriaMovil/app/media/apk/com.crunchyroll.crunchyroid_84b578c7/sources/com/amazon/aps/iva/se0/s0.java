package com.amazon.aps.iva.se0;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public final class s0 implements t0 {
    public final Future<?> b;

    public s0(ScheduledFuture scheduledFuture) {
        this.b = scheduledFuture;
    }

    @Override // com.amazon.aps.iva.se0.t0
    public final void dispose() {
        this.b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.b + ']';
    }
}
