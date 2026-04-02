package com.ellation.crunchyroll.downloading.bulk;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
/* compiled from: BulkDownloadsModule.kt */
/* loaded from: classes2.dex */
public final class g {
    public final Context a;
    public final com.amazon.aps.iva.vv.c b = new com.amazon.aps.iva.vv.c();
    public final m c = com.amazon.aps.iva.kb0.f.b(new b());
    public final m d = com.amazon.aps.iva.kb0.f.b(new a());

    /* compiled from: BulkDownloadsModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.tv.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.tv.a invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            Context context = g.this.a;
            j.f(context, "context");
            if (q.a.a == null) {
                q.a.a = new r(context);
            }
            r rVar = q.a.a;
            j.c(rVar);
            return new com.amazon.aps.iva.tv.b(rVar);
        }
    }

    /* compiled from: BulkDownloadsModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<BulkDownloadsManager> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final BulkDownloadsManager invoke() {
            h hVar = h.a.a;
            if (hVar != null) {
                InternalDownloadsManager a = hVar.a();
                com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
                if (bVar != null) {
                    com.amazon.aps.iva.uv.d G = x.G(bVar.F());
                    com.amazon.aps.iva.vv.c cVar = g.this.b;
                    com.amazon.aps.iva.wu.b bVar2 = com.amazon.aps.iva.wu.b.a;
                    j.f(a, "downloadManager");
                    j.f(cVar, "coroutineScope");
                    return new BulkDownloadsManagerImpl(a, G, cVar);
                }
                j.m("dependencies");
                throw null;
            }
            j.m("instance");
            throw null;
        }
    }

    public g(Context context) {
        this.a = context;
    }

    public final BulkDownloadsManager a() {
        return (BulkDownloadsManager) this.c.getValue();
    }
}
