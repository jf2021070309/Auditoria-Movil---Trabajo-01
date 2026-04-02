package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qw.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: SubtitlesDownloadSynchronizer.kt */
/* loaded from: classes2.dex */
public final class d implements a {
    public final AtomicInteger a;
    public final com.amazon.aps.iva.xb0.l<List<g.a>, q> b;
    public final com.amazon.aps.iva.xb0.l<Exception, q> c;
    public final List<g.a> d;
    public final AtomicBoolean e;

    public d(AtomicInteger atomicInteger, j jVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "failure");
        this.a = atomicInteger;
        this.b = jVar;
        this.c = lVar;
        List<g.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        com.amazon.aps.iva.yb0.j.e(synchronizedList, "synchronizedList<Subtitl…etadata>(mutableListOf())");
        this.d = synchronizedList;
        this.e = new AtomicBoolean(false);
    }

    @Override // com.amazon.aps.iva.qw.a
    public final void a(g.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "metadata");
        List<g.a> list = this.d;
        list.add(aVar);
        if (this.a.decrementAndGet() == 0) {
            this.b.invoke(list);
        }
    }

    @Override // com.amazon.aps.iva.qw.a
    public final void b(Exception exc) {
        com.amazon.aps.iva.yb0.j.f(exc, "exception");
        if (!this.e.getAndSet(true)) {
            this.c.invoke(exc);
        }
    }

    public final boolean c() {
        return this.e.get();
    }
}
