package com.amazon.aps.iva.tl;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.es.y;
import com.amazon.aps.iva.js.z;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.oe0.q;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ReportProblemAnalytics.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nk.j> a;
    public final com.amazon.aps.iva.xb0.a<w> b;
    public final com.amazon.aps.iva.ye.j c;
    public final com.amazon.aps.iva.ds.a d;
    public final a e;

    public e(g.e eVar, g.f fVar, com.amazon.aps.iva.ye.j jVar, com.amazon.aps.iva.ds.a aVar, a aVar2) {
        this.a = eVar;
        this.b = fVar;
        this.c = jVar;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // com.amazon.aps.iva.tl.d
    public final void a(String str, String str2, String str3) {
        PlayableAsset playableAsset;
        String str4;
        boolean z;
        z zVar;
        z zVar2;
        String str5;
        com.amazon.aps.iva.yb0.j.f(str, "issueId");
        com.amazon.aps.iva.yb0.j.f(str2, "issueTitle");
        com.amazon.aps.iva.yb0.j.f(str3, "issueText");
        w invoke = this.b.invoke();
        com.amazon.aps.iva.ye.j jVar = this.c;
        com.amazon.aps.iva.ye.b castSession = jVar.getCastSession();
        if (castSession != null) {
            playableAsset = castSession.getMetadataPlayableAsset();
        } else {
            playableAsset = null;
        }
        if (jVar.isCastConnected()) {
            if (playableAsset != null) {
                str4 = playableAsset.getStreamHref();
            } else {
                str4 = null;
            }
        } else {
            str4 = this.a.invoke().h.p;
        }
        if (str4 != null && !com.amazon.aps.iva.oe0.m.b0(str4)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            zVar2 = null;
        } else {
            if (this.e.a(str4)) {
                zVar = z.b.a;
            } else {
                zVar = z.a.a;
            }
            zVar2 = zVar;
        }
        String obj = q.O0(str3).toString();
        com.amazon.aps.iva.ye.b castSession2 = jVar.getCastSession();
        if (castSession2 != null) {
            str5 = castSession2.getDeviceName();
        } else {
            str5 = null;
        }
        this.d.e(new y(invoke, str, str2, obj, zVar2, str5));
    }
}
