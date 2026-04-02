package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.r;
import com.amazon.aps.iva.ka0.a0;
import com.amazon.aps.iva.ka0.e;
import com.amazon.aps.iva.q.i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.da0.b implements e.a {
    public long c;
    public long d;
    public boolean e;
    public r j;
    public ScheduledExecutorService o;
    public final com.amazon.aps.iva.ca0.d r;
    public long f = 0;
    public int g = 0;
    public boolean h = true;
    public boolean i = false;
    public final ArrayList<com.amazon.aps.iva.da0.r> k = new ArrayList<>();
    public final ArrayList<com.amazon.aps.iva.da0.r> l = new ArrayList<>();
    public final com.amazon.aps.iva.ka0.e m = a0.s;
    public String n = null;
    public final HashSet p = new HashSet(Arrays.asList("viewstart", "error", "ended", "viewend"));
    public boolean q = false;
    public long s = 0;
    public com.amazon.aps.iva.ga0.m t = null;
    public final HashSet u = new HashSet(Arrays.asList("ake", "xid", "xsqno", "psqno", "pphti", "pinid", "uti", "mapve", "vid"));

    public d(com.amazon.aps.iva.ca0.d dVar) {
        this.r = dVar;
        dVar.getClass();
        this.j = r.c;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        this.o = newScheduledThreadPool;
        newScheduledThreadPool.scheduleWithFixedDelay(new i1(this, 7), 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.amazon.aps.iva.da0.g
    public final void b(com.amazon.aps.iva.da0.e eVar) {
        com.amazon.aps.iva.da0.r rVar = (com.amazon.aps.iva.da0.r) eVar;
        boolean z = this.q;
        ArrayList<com.amazon.aps.iva.da0.r> arrayList = this.k;
        if (!z) {
            String str = rVar.c;
            boolean equals = str.equals("viewstart");
            r.a aVar = rVar.d;
            if (!equals && !str.equals("viewend") && this.t != null && System.currentTimeMillis() - this.s < 600000) {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(aVar.a.toString());
                com.amazon.aps.iva.ga0.m mVar = new com.amazon.aps.iva.ga0.m();
                for (String str2 : cVar.keySet()) {
                    if (com.amazon.aps.iva.ga0.c.b.contains(str2)) {
                        mVar.a.put(str2, cVar.getJSONObject(str2));
                    } else if (com.amazon.aps.iva.ga0.c.c.contains(str2)) {
                        mVar.a.put(str2, cVar.getJSONArray(str2));
                    } else {
                        String string = cVar.getString(str2);
                        if (this.t.a(str2) == null || !string.equals(this.t.a(str2)) || this.u.contains(str2) || str2.equalsIgnoreCase("e") || str2.startsWith("q") || str2.startsWith("d")) {
                            mVar.b(str2, string);
                            this.t.b(str2, string);
                        }
                    }
                }
                aVar.c(new com.amazon.aps.iva.if0.c(mVar.a.toString()));
            } else {
                com.amazon.aps.iva.ga0.m mVar2 = new com.amazon.aps.iva.ga0.m();
                this.t = mVar2;
                mVar2.e(aVar);
                if (str.equals("viewend")) {
                    this.t = null;
                }
            }
            this.s = System.currentTimeMillis();
            this.q = !e(rVar);
            if (this.p.contains(str) || this.q) {
                if (this.q) {
                    arrayList.add(new com.amazon.aps.iva.da0.d(rVar));
                }
                d(true);
                return;
            }
            return;
        }
        com.amazon.aps.iva.ia0.b.a("MuxStatsEventQueue", "Event not handled, ratelimited: " + this.q + ",queue size: " + arrayList.size() + ", queue limit: 3600");
    }

    @Override // com.amazon.aps.iva.ka0.e.a
    public final void c(Map map, boolean z) {
        List list;
        com.amazon.aps.iva.ia0.b.a("MuxStatsEventQueue", "last batch handler result " + z);
        this.h = true;
        ArrayList<com.amazon.aps.iva.da0.r> arrayList = this.l;
        if (!z) {
            ArrayList<com.amazon.aps.iva.da0.r> arrayList2 = this.k;
            if (arrayList.size() + arrayList2.size() < 3600) {
                arrayList2.addAll(0, arrayList);
                this.g++;
            } else {
                this.e = false;
                this.g = 0;
                com.amazon.aps.iva.ia0.b.a("MuxStatsEventQueue", "event queue too large, dropping events failed to send !!!");
            }
        } else {
            this.c = System.currentTimeMillis() - this.d;
            this.e = true;
            this.g = 0;
            if (map != null && (list = (List) map.get("x-litix-io-beacon-flush-ms")) != null && !list.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt((String) list.get(0));
                    int i = 10000;
                    if (parseInt >= 10000) {
                        i = 60000;
                        if (parseInt <= 60000) {
                            i = parseInt;
                        }
                    }
                    int i2 = 1000;
                    int i3 = (parseInt / 1000) * 30;
                    if (i3 < 300) {
                        i2 = 300;
                    } else if (i3 <= 1000) {
                        i2 = i3;
                    }
                    this.j = new r(i, i2);
                } catch (NumberFormatException unused) {
                }
            }
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x017a A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:13:0x0036, B:15:0x0049, B:17:0x004f, B:20:0x008c, B:22:0x00c2, B:23:0x00c6, B:25:0x00cc, B:27:0x00d8, B:29:0x00dc, B:30:0x00e2, B:31:0x00e5, B:21:0x00a5, B:32:0x00ec, B:34:0x00fa, B:35:0x0101, B:38:0x0113, B:40:0x0122, B:42:0x0158, B:47:0x0164, B:49:0x017a, B:51:0x0187, B:52:0x018c, B:39:0x011b), top: B:56:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:13:0x0036, B:15:0x0049, B:17:0x004f, B:20:0x008c, B:22:0x00c2, B:23:0x00c6, B:25:0x00cc, B:27:0x00d8, B:29:0x00dc, B:30:0x00e2, B:31:0x00e5, B:21:0x00a5, B:32:0x00ec, B:34:0x00fa, B:35:0x0101, B:38:0x0113, B:40:0x0122, B:42:0x0158, B:47:0x0164, B:49:0x017a, B:51:0x0187, B:52:0x018c, B:39:0x011b), top: B:56:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ha0.d.d(boolean):void");
    }

    public final synchronized boolean e(com.amazon.aps.iva.da0.r rVar) {
        int i;
        long random;
        if (this.k.size() < 3600) {
            if (rVar != null) {
                this.k.add(rVar);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f;
            if (this.g == 0) {
                random = this.j.a;
            } else {
                random = (long) (((Math.random() * Math.pow(2.0d, i - 1)) + 1.0d) * this.j.a);
            }
            if (currentTimeMillis > random) {
                d(false);
                this.f = System.currentTimeMillis();
            }
            if (this.k.size() > 3600) {
                return false;
            }
            return true;
        }
        com.amazon.aps.iva.ia0.b.a("MuxStatsEventQueue", "Event not queued, ratelimited: " + this.q + ",queue size: " + this.k.size() + ", queue limit: 3600");
        return false;
    }
}
