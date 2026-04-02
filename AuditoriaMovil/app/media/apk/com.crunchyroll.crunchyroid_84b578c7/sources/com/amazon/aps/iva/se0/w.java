package com.amazon.aps.iva.se0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: CompletionState.kt */
/* loaded from: classes4.dex */
public class w {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public w(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
