package com.amazon.aps.iva.k9;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public b(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder b = defpackage.c.b(str);
        b.append(this.a.incrementAndGet());
        return new Thread(runnable, b.toString());
    }
}
