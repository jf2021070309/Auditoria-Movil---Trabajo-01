package com.amazon.aps.iva.sv;

import android.content.Context;
import com.amazon.aps.iva.sv.i;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import java.util.LinkedHashSet;
/* compiled from: LocalVideosManagerFactory.kt */
/* loaded from: classes2.dex */
public final class l2 {
    public final c a;
    public final com.amazon.aps.iva.pw.a b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final com.amazon.aps.iva.wg.a d;
    public final m e;
    public final Context f;
    public LocalVideosManagerQueue g;
    public final LinkedHashSet h;
    public com.amazon.aps.iva.bw.e i;
    public q1 j;
    public com.amazon.aps.iva.nw.e k;

    /* compiled from: LocalVideosManagerFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            LinkedHashSet<com.amazon.aps.iva.xb0.a> linkedHashSet = l2.this.h;
            for (com.amazon.aps.iva.xb0.a aVar : linkedHashSet) {
                aVar.invoke();
            }
            linkedHashSet.clear();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public l2(Context context, d dVar, com.amazon.aps.iva.pw.c cVar, i.e eVar, com.amazon.aps.iva.rw.e eVar2, com.ellation.crunchyroll.downloading.e eVar3) {
        this.a = dVar;
        this.b = cVar;
        this.c = eVar;
        this.d = eVar2;
        this.e = eVar3;
        Context applicationContext = context.getApplicationContext();
        com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
        this.f = applicationContext;
        this.h = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r2.isStarted() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r26) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.l2.a(com.amazon.aps.iva.xb0.a):com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue");
    }
}
