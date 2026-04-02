package com.amazon.aps.iva.ka0;

import android.net.Uri;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.ga0.b;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.q5.y0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ExoPlayerBinding.kt */
/* loaded from: classes4.dex */
public final class h implements com.amazon.aps.iva.b6.b {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {com.amazon.aps.iva.k.q.a(h.class, "bandwidthMetrics", "getBandwidthMetrics()Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;", 0), com.amazon.aps.iva.k.q.a(h.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0)};
    public final y a;
    public final com.amazon.aps.iva.ba0.a b;
    public final com.amazon.aps.iva.ba0.a c;

    public h(com.amazon.aps.iva.a6.m mVar, com.amazon.aps.iva.la0.b bVar, y yVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "player");
        com.amazon.aps.iva.yb0.j.f(yVar, "collector");
        this.a = yVar;
        this.b = new com.amazon.aps.iva.ba0.a(bVar);
        this.c = new com.amazon.aps.iva.ba0.a(mVar);
        com.amazon.aps.iva.ia0.b.a("ExoPlayerBinding", "Listening to ExoPlayer " + mVar);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void A(b.a aVar, com.amazon.aps.iva.q5.v vVar) {
        boolean z;
        int i;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(vVar, "format");
        StringBuilder sb = new StringBuilder("onVideoInputFormatChanged: new format: bitrate ");
        int i2 = vVar.i;
        sb.append(i2);
        sb.append(" and frameRate ");
        float f = vVar.t;
        sb.append(f);
        sb.append(' ');
        com.amazon.aps.iva.ia0.b.a("ExoPlayerBinding", sb.toString());
        Integer valueOf = Integer.valueOf(i2);
        boolean z2 = false;
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        Float valueOf2 = Float.valueOf(f);
        float f2 = 0.0f;
        if (valueOf2.floatValue() >= 0.0f) {
            z2 = true;
        }
        if (!z2) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            f2 = valueOf2.floatValue();
        }
        y yVar = this.a;
        yVar.h = i;
        yVar.i = f2;
        yVar.j = vVar.r;
        yVar.k = vVar.s;
        yVar.a(new com.amazon.aps.iva.fa0.o(null, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.b6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(com.amazon.aps.iva.b6.b.a r19, com.amazon.aps.iva.o6.q r20, com.amazon.aps.iva.o6.t r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ka0.h.C(com.amazon.aps.iva.b6.b$a, com.amazon.aps.iva.o6.q, com.amazon.aps.iva.o6.t):void");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void F(b.a aVar, com.amazon.aps.iva.o6.t tVar) {
        com.amazon.aps.iva.q5.v vVar;
        String str;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(tVar, "mediaLoadData");
        y yVar = this.a;
        if (yVar.d && (vVar = tVar.c) != null && (str = vVar.l) != null) {
            yVar.e = str;
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void G(b.a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
        com.amazon.aps.iva.la0.b V;
        int i;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(qVar, "loadEventInfo");
        com.amazon.aps.iva.yb0.j.f(tVar, "mediaLoadData");
        Uri uri = qVar.b;
        if (uri != null && (V = V()) != null) {
            uri.getPath();
            Map<String, List<String>> map = qVar.c;
            com.amazon.aps.iva.yb0.j.e(map, "loadEventInfo.responseHeaders");
            if (V.c() != null && V.b() != null) {
                com.amazon.aps.iva.la0.c cVar = V.d;
                HashMap hashMap = (HashMap) cVar.d;
                long j = qVar.a;
                com.amazon.aps.iva.ga0.b bVar = (com.amazon.aps.iva.ga0.b) hashMap.get(Long.valueOf(j));
                com.amazon.aps.iva.q5.v vVar = tVar.c;
                if (bVar == null) {
                    bVar = null;
                } else {
                    Long valueOf = Long.valueOf(qVar.d);
                    if (valueOf != null) {
                        bVar.b("qbyld", valueOf.toString());
                    }
                    Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                    if (valueOf2 != null) {
                        bVar.b("qrpen", valueOf2.toString());
                    }
                    List<v0.a> list = (List) cVar.c;
                    if (vVar != null && list != null) {
                        for (v0.a aVar2 : list) {
                            int i2 = aVar2.b;
                            for (int i3 = 0; i3 < i2; i3++) {
                                com.amazon.aps.iva.q5.v c = aVar2.c(i3);
                                com.amazon.aps.iva.yb0.j.e(c, "group.getTrackFormat(trackGroupIndex)");
                                if (vVar.r == c.r && vVar.s == c.s && vVar.i == c.i) {
                                    Integer valueOf3 = Integer.valueOf(i3);
                                    if (valueOf3 != null) {
                                        bVar.b("qcule", valueOf3.toString());
                                    }
                                    com.amazon.aps.iva.ia0.b.a("BandwidthMetrics", "onLoadCompleted: found rendition idx " + i3 + "\nwith format " + c);
                                }
                            }
                        }
                    }
                    hashMap.remove(Long.valueOf(j));
                }
                if (vVar != null && bVar != null && (i = vVar.i) > 0) {
                    com.amazon.aps.iva.ia0.b.a("BandwidthMetrics", "onLoadCompleted: current track bitrate " + i);
                    Integer valueOf4 = Integer.valueOf(i);
                    if (valueOf4 != null) {
                        bVar.b("qlbbi", valueOf4.toString());
                    }
                }
                if (bVar != null) {
                    V.d(bVar, map);
                    V.a(bVar, new com.amazon.aps.iva.fa0.w(null));
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void M(b.a aVar, com.amazon.aps.iva.q5.d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(d0Var, "mediaMetadata");
        k0.i(this.a, d0Var);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void O(b.a aVar, int i) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.a6.m mVar = (com.amazon.aps.iva.a6.m) this.c.getValue(this, d[1]);
        if (mVar != null) {
            k0.h(i, this.a, mVar.k0());
        }
    }

    public final com.amazon.aps.iva.la0.b V() {
        return (com.amazon.aps.iva.la0.b) this.b.getValue(this, d[0]);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void b(b.a aVar, y0 y0Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(y0Var, "videoSize");
        y yVar = this.a;
        yVar.j = y0Var.b;
        yVar.k = y0Var.c;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void c(int i, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        this.a.getClass();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void e(int i, l0.d dVar, l0.d dVar2, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(dVar, "oldPosition");
        com.amazon.aps.iva.yb0.j.f(dVar2, "newPosition");
        y yVar = this.a;
        com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
        if ((i == 1 || i == 2) && yVar.v != 0) {
            if (yVar.c == u.PLAYING) {
                yVar.a(new com.amazon.aps.iva.fa0.r(null, 0));
            }
            yVar.c = u.SEEKING;
            yVar.t = true;
            yVar.a(new com.amazon.aps.iva.fa0.r(null, 1));
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void h(b.a aVar, v0 v0Var) {
        List<? extends b.a> list;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(v0Var, "tracks");
        com.amazon.aps.iva.ia0.b.a("ExoPlayerBinding", "onTracksChanged");
        com.amazon.aps.iva.a6.m mVar = (com.amazon.aps.iva.a6.m) this.c.getValue(this, d[1]);
        ArrayList arrayList = null;
        ImmutableList<v0.a> immutableList = v0Var.b;
        if (mVar != null) {
            y yVar = this.a;
            com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
            y.a aVar2 = new y.a(yVar, mVar, e0.h);
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = y.y;
            com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[0];
            z zVar = yVar.r;
            zVar.c(yVar, lVar, aVar2);
            y.a<?> value = zVar.getValue(yVar, lVarArr[0]);
            if (value != null) {
                com.amazon.aps.iva.se0.i.d(value.d, null, null, new w(value, null), 3);
            }
            com.amazon.aps.iva.yb0.j.e(immutableList, "groups");
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(immutableList));
            for (v0.a aVar3 : immutableList) {
                arrayList2.add(aVar3.c);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((s0) next).b > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((s0) it2.next()).e[0]);
            }
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    String str = ((com.amazon.aps.iva.q5.v) obj).m;
                    if (str != null) {
                        z3 = com.amazon.aps.iva.oe0.q.i0(str, "video", false);
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) obj;
        }
        com.amazon.aps.iva.la0.b V = V();
        if (V != null) {
            com.amazon.aps.iva.ia0.b.a("BandwidthMetrics", "onTracksChanged: Got " + immutableList.size() + " tracks");
            ArrayList arrayList5 = new ArrayList();
            for (v0.a aVar4 : immutableList) {
                if (aVar4.c.d == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList5.add(aVar4);
                }
            }
            V.d.c = arrayList5;
            if (V.c() != null && V.b() != null) {
                ArrayList arrayList6 = new ArrayList();
                for (v0.a aVar5 : immutableList) {
                    if (aVar5.c.d == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList6.add(aVar5);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    v0.a aVar6 = (v0.a) it4.next();
                    com.amazon.aps.iva.yb0.j.e(aVar6, "it");
                    com.amazon.aps.iva.la0.a aVar7 = com.amazon.aps.iva.la0.a.h;
                    com.amazon.aps.iva.yb0.j.f(aVar7, "block");
                    ArrayList arrayList8 = new ArrayList();
                    for (int i = 0; i < aVar6.b; i++) {
                        com.amazon.aps.iva.q5.v c = aVar6.c(i);
                        com.amazon.aps.iva.yb0.j.e(c, "getTrackFormat(i)");
                        arrayList8.add(aVar7.invoke(c));
                    }
                    com.amazon.aps.iva.lb0.t.d0(arrayList7, arrayList8);
                }
                y b = V.b();
                if (b != null) {
                    b.l = arrayList7;
                }
                StringBuilder sb = new StringBuilder("onTracksChanged: ended function with renditions: ");
                y b2 = V.b();
                if (b2 != null && (list = b2.l) != null) {
                    List<? extends b.a> list2 = list;
                    arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                    for (b.a aVar8 : list2) {
                        arrayList.add("{size: [" + aVar8.a + 'x' + aVar8.b + "], " + aVar8.c + "fps, " + aVar8.d + "bps, name: " + aVar8.f + " codec " + aVar8.e + '}');
                    }
                }
                sb.append(arrayList);
                com.amazon.aps.iva.ia0.b.a("BandwidthMetrics", sb.toString());
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void i(int i, b.a aVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.a6.m mVar = (com.amazon.aps.iva.a6.m) this.c.getValue(this, d[1]);
        if (mVar != null) {
            int h = mVar.h();
            y yVar = this.a;
            com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
            if (z) {
                yVar.d();
                if (h == 3) {
                    yVar.e();
                }
            } else if (yVar.c != u.PAUSED) {
                yVar.c();
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void m(b.a aVar, Object obj) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(obj, "output");
        this.a.getClass();
        System.currentTimeMillis();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void n(b.a aVar, com.amazon.aps.iva.q5.b0 b0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        if (b0Var != null) {
            y yVar = this.a;
            com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
            b0.g gVar = b0Var.c;
            if (gVar != null) {
                Uri uri = gVar.b;
                com.amazon.aps.iva.yb0.j.e(uri, "localConfig.uri");
                String authority = uri.getAuthority();
                com.amazon.aps.iva.ga0.n nVar = new com.amazon.aps.iva.ga0.n();
                if (authority != null) {
                    nVar.b("vsodm", authority);
                }
                String uri2 = uri.toString();
                if (uri2 != null) {
                    nVar.b("vsour", uri2);
                }
                a0 a0Var = yVar.a;
                a0Var.getClass();
                com.amazon.aps.iva.ea0.a aVar2 = new com.amazon.aps.iva.ea0.a();
                aVar2.d = nVar;
                com.amazon.aps.iva.ca0.a.a(a0Var.d, aVar2);
            }
            com.amazon.aps.iva.q5.d0 d0Var = b0Var.e;
            com.amazon.aps.iva.yb0.j.e(d0Var, "mediaItem.mediaMetadata");
            k0.i(yVar, d0Var);
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void q(b.a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(qVar, "loadEventInfo");
        com.amazon.aps.iva.yb0.j.f(tVar, "mediaLoadData");
        com.amazon.aps.iva.la0.b V = V();
        if (V != null) {
            qVar.b.getPath();
            Map<String, List<String>> map = qVar.c;
            com.amazon.aps.iva.yb0.j.e(map, "loadEventInfo.responseHeaders");
            if (V.c() != null && V.b() != null) {
                com.amazon.aps.iva.ga0.b bVar = (com.amazon.aps.iva.ga0.b) ((HashMap) V.d.d).get(Long.valueOf(qVar.a));
                if (bVar == null) {
                    bVar = new com.amazon.aps.iva.ga0.b();
                }
                bVar.b("qcb", "genericLoadCanceled");
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                if (valueOf != null) {
                    bVar.b("qrpen", valueOf.toString());
                }
                bVar.b("qcb", "FragLoadEmergencyAborted");
                V.d(bVar, map);
                V.a(bVar, new com.amazon.aps.iva.fa0.v(null));
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void s(b.a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar, IOException iOException) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(qVar, "loadEventInfo");
        com.amazon.aps.iva.yb0.j.f(tVar, "mediaLoadData");
        com.amazon.aps.iva.yb0.j.f(iOException, "error");
        com.amazon.aps.iva.la0.b V = V();
        if (V != null) {
            qVar.b.getPath();
            if (V.c() != null && V.b() != null) {
                com.amazon.aps.iva.la0.c cVar = V.d;
                cVar.getClass();
                com.amazon.aps.iva.ga0.b bVar = (com.amazon.aps.iva.ga0.b) ((HashMap) cVar.d).get(Long.valueOf(qVar.a));
                if (bVar == null) {
                    bVar = new com.amazon.aps.iva.ga0.b();
                }
                String obj = iOException.toString();
                if (obj != null) {
                    bVar.b("qer", obj);
                }
                Integer num = -1;
                if (num != null) {
                    bVar.b("qercd", num.toString());
                }
                String message = iOException.getMessage();
                if (message != null) {
                    bVar.b("qerte", message);
                }
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                if (valueOf != null) {
                    bVar.b("qrpen", valueOf.toString());
                }
                V.a(bVar, new com.amazon.aps.iva.fa0.x(null));
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void u(b.a aVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        r0 r0Var = aVar.b;
        if (r0Var.q() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r0Var = null;
        }
        if (r0Var != null) {
            r0.d dVar = new r0.d();
            r0Var.o(0, dVar);
            long a = dVar.a();
            y yVar = this.a;
            yVar.f = a;
            com.amazon.aps.iva.kb0.m mVar = com.amazon.aps.iva.ma0.c.a;
            if (dVar.b()) {
                yVar.m = Long.valueOf(dVar.g);
                yVar.n = Long.valueOf(com.amazon.aps.iva.ma0.c.a(dVar, "HOLD-BACK"));
                yVar.o = Long.valueOf(com.amazon.aps.iva.ma0.c.a(dVar, "PART-HOLD-BACK"));
                yVar.p = Long.valueOf(com.amazon.aps.iva.ma0.c.a(dVar, "PART-TARGET"));
                yVar.q = Long.valueOf(com.amazon.aps.iva.ma0.c.a(dVar, "EXT-X-TARGETDURATION"));
            }
        }
    }
}
