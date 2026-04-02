package com.amazon.aps.iva.la0;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.da0.f;
import com.amazon.aps.iva.fa0.t;
import com.amazon.aps.iva.fa0.v;
import com.amazon.aps.iva.fa0.w;
import com.amazon.aps.iva.fa0.x;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.yb0.j;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: BandwidthMetrics.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final /* synthetic */ l<Object>[] k = {q.a(b.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0), q.a(b.class, "collector", "getCollector()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", 0)};
    public final List<d> a;
    public final com.amazon.aps.iva.ba0.a b;
    public final com.amazon.aps.iva.ba0.a c;
    public final c d;
    public long e;
    public long f;
    public final int g;
    public int h;
    public int i;
    public int j;

    /* JADX WARN: Multi-variable type inference failed */
    public b(m mVar, y yVar, List<? extends d> list) {
        j.f(mVar, "player");
        j.f(yVar, "collector");
        this.a = list;
        this.b = new com.amazon.aps.iva.ba0.a(mVar);
        this.c = new com.amazon.aps.iva.ba0.a(yVar);
        this.d = new c(mVar, yVar);
        this.e = 1000L;
        this.f = -1L;
        this.g = 10;
    }

    public final void a(com.amazon.aps.iva.ga0.b bVar, t tVar) {
        f fVar;
        long j = 1000;
        if (bVar.h() != null) {
            Long h = bVar.h();
            j.e(h, "data.requestMediaDuration");
            if (h.longValue() >= 1000) {
                Long h2 = bVar.h();
                j.e(h2, "{\n        data.requestMediaDuration\n      }");
                j = h2.longValue();
            }
        }
        this.e = j;
        boolean z = false;
        if (System.currentTimeMillis() - this.f > this.e) {
            this.f = System.currentTimeMillis();
            this.h = 0;
            this.i = 0;
            this.j = 0;
        }
        if (tVar instanceof w) {
            this.h++;
        }
        if (tVar instanceof v) {
            this.i++;
        }
        if (tVar instanceof x) {
            this.j++;
        }
        int i = this.h;
        int i2 = this.g;
        if (i <= i2 && this.i <= i2 && this.j <= i2) {
            z = true;
        }
        if (z) {
            tVar.g = bVar;
            y b = b();
            if (b != null && (fVar = b.b) != null) {
                fVar.a(tVar);
            }
        }
    }

    public final y b() {
        return (y) this.c.getValue(this, k[1]);
    }

    public final m c() {
        return (m) this.b.getValue(this, k[0]);
    }

    public final void d(com.amazon.aps.iva.ga0.b bVar, Map<String, ? extends List<String>> map) {
        Hashtable hashtable;
        boolean z;
        int i;
        if (map.isEmpty()) {
            hashtable = null;
        } else {
            Hashtable hashtable2 = new Hashtable();
            for (String str : map.keySet()) {
                synchronized (this) {
                    Iterator<d> it = this.a.iterator();
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().a(str)) {
                            z = true;
                        }
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
                if (z) {
                    List<String> list = map.get(str);
                    j.c(list);
                    List<String> list2 = list;
                    if (list2.size() == 1) {
                        hashtable2.put(str, list2.get(0));
                    } else if (list2.size() > 1) {
                        String str2 = list2.get(0);
                        int size = list2.size();
                        for (i = 1; i < size; i++) {
                            StringBuilder b = com.amazon.aps.iva.b6.x.b(str2, ", ");
                            b.append(list2.get(i));
                            str2 = b.toString();
                        }
                        hashtable2.put(str, str2);
                    }
                }
            }
            hashtable = hashtable2;
        }
        if (hashtable != null) {
            String str3 = (String) hashtable.get("x-request-id");
            if (str3 != null) {
                bVar.b("qid", str3);
            }
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            for (String str4 : hashtable.keySet()) {
                cVar.put(str4, hashtable.get(str4));
            }
            bVar.a.put("qrphe", cVar);
        }
    }
}
