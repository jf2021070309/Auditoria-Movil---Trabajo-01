package com.amazon.aps.iva.jj;

import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kj.b;
import com.amazon.aps.iva.kj.c;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.nx.e;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.qj.g;
import com.amazon.aps.iva.qj.i;
import com.amazon.aps.iva.qj.j;
import com.amazon.aps.iva.qj.k;
import com.amazon.aps.iva.qj.m;
import com.amazon.aps.iva.qj.u;
import com.amazon.aps.iva.qj.v;
import com.ellation.crunchyroll.api.etp.error.HttpException;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
import java.io.IOException;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PlayerStreamsMappers.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: PlayerStreamsMappers.kt */
    /* renamed from: com.amazon.aps.iva.jj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0419a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static d a(c cVar, i iVar) {
        m mVar;
        j jVar;
        k kVar;
        v vVar;
        u uVar;
        com.amazon.aps.iva.cj.k kVar2 = n.d;
        if (kVar2 != null) {
            e k = kVar2.k();
            com.amazon.aps.iva.yb0.j.f(iVar, "sourceType");
            com.amazon.aps.iva.yb0.j.f(k, "isUserPremium");
            if (cVar instanceof c.b) {
                c.b bVar = (c.b) cVar;
                String str = bVar.e;
                String c = cVar.c();
                String b = cVar.b();
                int[] iArr = C0419a.a;
                b bVar2 = bVar.d;
                int i = iArr[bVar2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        jVar = j.HLS;
                    } else {
                        throw new IllegalArgumentException(bVar2 + " is not supported!");
                    }
                } else {
                    jVar = j.DASH;
                }
                j jVar2 = jVar;
                if (((Boolean) k.invoke()).booleanValue()) {
                    kVar = k.SVOD;
                } else {
                    kVar = k.AVOD;
                }
                k kVar3 = kVar;
                List<com.amazon.aps.iva.kj.d> e = cVar.e();
                ArrayList arrayList = new ArrayList(r.Y(e));
                for (com.amazon.aps.iva.kj.d dVar : e) {
                    arrayList.add(new g(dVar.a, dVar.b));
                }
                String str2 = bVar.g;
                boolean z = bVar.h;
                IOException d = cVar.d();
                if (d != null) {
                    if (d instanceof HttpException) {
                        HttpException httpException = (HttpException) d;
                        vVar = new v.b(q.b(httpException.getRequestPath(), " ", d.getMessage()), Integer.valueOf(httpException.getHttpStatusCode()));
                    } else if (d instanceof ConnectException) {
                        vVar = v.a.a;
                    } else {
                        vVar = new v.b(1, d.getLocalizedMessage());
                    }
                } else {
                    vVar = null;
                }
                boolean z2 = !((Boolean) k.invoke()).booleanValue();
                String a = cVar.a();
                SessionState sessionState = bVar.j;
                if (sessionState != null) {
                    uVar = com.amazon.aps.iva.vj.i.a(sessionState);
                } else {
                    uVar = null;
                }
                return new d.h(str, c, b, jVar2, kVar3, arrayList, str2, z, vVar, iVar, z2, a, uVar);
            } else if (cVar instanceof c.a) {
                c.a aVar = (c.a) cVar;
                com.amazon.aps.iva.o6.v vVar2 = aVar.d;
                String c2 = cVar.c();
                String b2 = cVar.b();
                List<com.amazon.aps.iva.kj.d> e2 = cVar.e();
                ArrayList arrayList2 = new ArrayList(r.Y(e2));
                for (com.amazon.aps.iva.kj.d dVar2 : e2) {
                    arrayList2.add(new g(dVar2.a, dVar2.b));
                }
                com.amazon.aps.iva.qj.d dVar3 = com.amazon.aps.iva.qj.d.LOCAL;
                if (aVar.e) {
                    mVar = m.COMPLETE;
                } else {
                    mVar = m.INCOMPLETE;
                }
                return new d.f(vVar2, c2, b2, arrayList2, iVar, dVar3, mVar, cVar.a());
            } else {
                throw new h();
            }
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
