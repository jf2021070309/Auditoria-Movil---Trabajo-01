package com.amazon.aps.iva.l9;

import android.text.TextUtils;
import com.amazon.aps.iva.k9.p;
import com.amazon.aps.iva.k9.u;
import com.amazon.aps.iva.k9.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class g extends u {
    public final k a;
    public final String b;
    public final com.amazon.aps.iva.k9.f c;
    public final List<? extends v> d;
    public final ArrayList e;
    public final ArrayList f;
    public final List<g> g;
    public boolean h;
    public c i;

    static {
        com.amazon.aps.iva.k9.m.e("WorkContinuationImpl");
    }

    public g() {
        throw null;
    }

    public g(k kVar, String str, com.amazon.aps.iva.k9.f fVar, List<? extends v> list) {
        this(kVar, str, fVar, list, 0);
    }

    public static boolean b(g gVar, HashSet hashSet) {
        hashSet.addAll(gVar.e);
        HashSet c = c(gVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (c.contains((String) it.next())) {
                return true;
            }
        }
        List<g> list = gVar.g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                if (b(gVar2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(gVar.e);
        return false;
    }

    public static HashSet c(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.e);
            }
        }
        return hashSet;
    }

    public final p a() {
        if (!this.h) {
            com.amazon.aps.iva.u9.e eVar = new com.amazon.aps.iva.u9.e(this);
            ((com.amazon.aps.iva.w9.b) this.a.d).a(eVar);
            this.i = eVar.c;
        } else {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.e));
            c.f(new Throwable[0]);
        }
        return this.i;
    }

    public g(k kVar, String str, com.amazon.aps.iva.k9.f fVar, List list, int i) {
        this.a = kVar;
        this.b = str;
        this.c = fVar;
        this.d = list;
        this.g = null;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((v) list.get(i2)).a.toString();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }
}
