package com.fyber.inneractive.sdk.g.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class a implements com.fyber.inneractive.sdk.j.i {
    public String a;
    public String b;
    public int c;
    public PriorityQueue<m> e;
    public PriorityQueue<b> f;
    public b g = null;
    public int h = 0;
    public int i = 0;
    Map<r, List<String>> d = new HashMap();

    public a(Comparator<m> comparator, Comparator<b> comparator2) {
        this.e = new PriorityQueue<>(1, comparator);
        this.f = new PriorityQueue<>(1, comparator2);
    }

    @Override // com.fyber.inneractive.sdk.j.i
    public final List<String> a(r rVar) {
        Map<r, List<String>> map;
        if (rVar == null || (map = this.d) == null) {
            return null;
        }
        return map.get(rVar);
    }

    public final m a() {
        return this.e.poll();
    }

    @Override // com.fyber.inneractive.sdk.j.i
    public final void a(r rVar, String str) {
        List<String> list = this.d.get(rVar);
        if (list == null) {
            list = new ArrayList<>();
            this.d.put(rVar, list);
        }
        list.add(str);
    }

    public final List<m> b() {
        return new ArrayList(this.e);
    }
}
