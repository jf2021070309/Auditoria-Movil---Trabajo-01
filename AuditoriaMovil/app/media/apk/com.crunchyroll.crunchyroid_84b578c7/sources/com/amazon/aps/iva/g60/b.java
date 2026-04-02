package com.amazon.aps.iva.g60;

import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.es.d0;
import com.amazon.aps.iva.es.e0;
import com.amazon.aps.iva.es.f0;
import com.amazon.aps.iva.es.w0;
import com.amazon.aps.iva.es.x0;
import com.amazon.aps.iva.es.y0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: WatchlistItemToggleAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;

    public b(com.amazon.aps.iva.ls.a aVar) {
        c cVar = c.b;
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void a(Panel panel) {
        j.f(panel, "panel");
        this.b.e(new f0(w.w(panel)));
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void b(Panel panel, Throwable th) {
        j.f(th, "error");
        e w = w.w(panel);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.b.e(new e0(w, message));
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void c(Panel panel, com.amazon.aps.iva.fs.b bVar) {
        j.f(panel, "panel");
        j.f(bVar, "view");
        this.b.e(new d0(a.C0456a.c(this.a, bVar), w.w(panel)));
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void d(Panel panel, Throwable th) {
        j.f(th, "error");
        e w = w.w(panel);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.b.e(new x0(w, message));
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void e(Panel panel, com.amazon.aps.iva.fs.b bVar) {
        j.f(panel, "panel");
        j.f(bVar, "view");
        this.b.e(new w0(a.C0456a.c(this.a, bVar), w.w(panel)));
    }

    @Override // com.amazon.aps.iva.g60.a
    public final void f(Panel panel) {
        j.f(panel, "panel");
        this.b.e(new y0(w.w(panel)));
    }
}
