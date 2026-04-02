package com.amazon.aps.iva.s9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.r;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ WorkDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ androidx.work.impl.foreground.a d;

    public b(androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, String str) {
        this.d = aVar;
        this.b = workDatabase;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p i = ((r) this.b.n()).i(this.c);
        if (i != null && i.b()) {
            synchronized (this.d.d) {
                this.d.g.put(this.c, i);
                this.d.h.add(i);
                androidx.work.impl.foreground.a aVar = this.d;
                aVar.i.b(aVar.h);
            }
        }
    }
}
