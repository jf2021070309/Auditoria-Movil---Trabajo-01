package com.amazon.aps.iva.b60;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.es.a1;
import com.amazon.aps.iva.es.d0;
import com.amazon.aps.iva.es.e0;
import com.amazon.aps.iva.es.f0;
import com.amazon.aps.iva.es.w0;
import com.amazon.aps.iva.es.x0;
import com.amazon.aps.iva.es.y0;
import com.amazon.aps.iva.es.z0;
import com.amazon.aps.iva.ks.a;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: WatchlistItemAnalytics.kt */
/* loaded from: classes2.dex */
public final class n implements m {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;

    public n(com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void a(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.b.e(new f0(w.w(panel)));
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void b(Panel panel, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(th, "error");
        com.amazon.aps.iva.ks.e w = w.w(panel);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.b.e(new e0(w, message));
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void c(Panel panel, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.b.e(new d0(a.C0456a.c(this.a, bVar), w.w(panel)));
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void d(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            this.b.e(new f0(new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void e(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.b.e(new z0(w.w(panel)));
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void f(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            this.b.e(new y0(new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void g(ContentContainer contentContainer, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(th, "error");
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            com.amazon.aps.iva.ks.e eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            this.b.e(new x0(eVar, message));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void h(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.b.e(new a1(w.w(panel)));
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void i(ContentContainer contentContainer, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            this.b.e(new d0(a.C0456a.c(this.a, bVar), new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void j(ContentContainer contentContainer, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            this.b.e(new w0(a.C0456a.c(this.a, bVar), new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.b60.m
    public final void k(ContentContainer contentContainer, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(th, "error");
        com.amazon.aps.iva.xb0.l lVar = w.e;
        if (lVar != null) {
            com.amazon.aps.iva.ks.e eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            this.b.e(new e0(eVar, message));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }
}
