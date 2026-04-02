package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class m {
    private Map<String, Integer> a = new HashMap();
    private Map<String, Integer> b = new HashMap();

    /* loaded from: classes2.dex */
    public interface a {
        int j();

        String k();
    }

    public m(List<a> list) {
        for (a aVar : list) {
            this.a.put(aVar.k(), 0);
            this.b.put(aVar.k(), Integer.valueOf(aVar.j()));
        }
    }

    public final void a(a aVar) {
        synchronized (this) {
            String k = aVar.k();
            if (this.a.containsKey(k)) {
                this.a.put(k, Integer.valueOf(this.a.get(k).intValue() + 1));
            }
        }
    }

    public final boolean a() {
        for (String str : this.b.keySet()) {
            if (this.a.get(str).intValue() < this.b.get(str).intValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(a aVar) {
        synchronized (this) {
            String k = aVar.k();
            if (this.a.containsKey(k)) {
                return this.a.get(k).intValue() >= aVar.j();
            }
            return false;
        }
    }
}
