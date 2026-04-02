package com.amazon.aps.iva.cg;

import android.content.Intent;
import android.net.Uri;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
import java.util.List;
/* compiled from: DeepLinkProvider.kt */
/* loaded from: classes.dex */
public final class t implements s {
    public final com.amazon.aps.iva.xb0.a<Intent> a;
    public final h b;
    public final d c;
    public final com.amazon.aps.iva.dg.c d;
    public final com.amazon.aps.iva.eg.a e;
    public com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.dg.a, ? extends IllegalArgumentException> f;
    public q g;

    public t(StartupActivity.b bVar, i iVar, e eVar) {
        com.amazon.aps.iva.dg.d dVar = new com.amazon.aps.iva.dg.d();
        com.amazon.aps.iva.eg.b bVar2 = new com.amazon.aps.iva.eg.b();
        this.a = bVar;
        this.b = iVar;
        this.c = eVar;
        this.d = dVar;
        this.e = bVar2;
    }

    @Override // com.amazon.aps.iva.cg.s
    public final void a(q qVar) {
        this.g = qVar;
        this.b.a(qVar);
    }

    @Override // com.amazon.aps.iva.cg.s
    public final void init() {
        com.amazon.aps.iva.dg.a aVar;
        w wVar;
        String host;
        String str;
        String str2;
        com.amazon.aps.iva.xb0.a<Intent> aVar2 = this.a;
        Uri data = aVar2.invoke().getData();
        Uri data2 = aVar2.invoke().getData();
        e0 e0Var = null;
        if (data2 != null) {
            String uri = data2.toString();
            String scheme = data2.getScheme();
            String authority = data2.getAuthority();
            List<String> pathSegments = data2.getPathSegments();
            if (pathSegments == null) {
                pathSegments = com.amazon.aps.iva.lb0.z.b;
            }
            List<String> list = pathSegments;
            String queryParameter = data2.getQueryParameter("utm_campaign");
            if (queryParameter == null) {
                str = "";
            } else {
                str = queryParameter;
            }
            String queryParameter2 = data2.getQueryParameter("utm_source");
            if (queryParameter2 == null) {
                str2 = "";
            } else {
                str2 = queryParameter2;
            }
            String queryParameter3 = data2.getQueryParameter("utm_medium");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            aVar = new com.amazon.aps.iva.dg.a(uri, scheme, authority, list, str, str2, queryParameter3);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            boolean z = false;
            if (data != null && (host = data.getHost()) != null && com.amazon.aps.iva.oe0.m.Y(host, "sng.link", false)) {
                z = true;
            }
            if (!z) {
                if (com.amazon.aps.iva.yb0.j.a(aVar.b, DrmProxyServiceImpl.ACCOUNTING_ID)) {
                    wVar = this.d;
                } else {
                    wVar = this.e;
                }
                try {
                    e0Var = wVar.a(aVar);
                } catch (IllegalArgumentException e) {
                    this.f = new com.amazon.aps.iva.kb0.j<>(aVar, e);
                }
                if (e0Var != null) {
                    this.b.b(e0Var);
                    return;
                }
                com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.dg.a, ? extends IllegalArgumentException> jVar = this.f;
                if (jVar != null) {
                    this.c.a(jVar.b, (IllegalArgumentException) jVar.c);
                }
                q qVar = this.g;
                if (qVar != null) {
                    qVar.t0();
                    return;
                }
                return;
            }
        }
        q qVar2 = this.g;
        if (qVar2 != null) {
            qVar2.t0();
        }
    }
}
