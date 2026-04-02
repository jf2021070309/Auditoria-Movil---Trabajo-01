package com.amazon.aps.iva.ca;

import java.util.ArrayList;
import java.util.List;
/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class h {
    public final ArrayList a;
    public final ArrayList b;
    public final List<com.amazon.aps.iva.ha.g> c;

    public h(List<com.amazon.aps.iva.ha.g> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(new m((List) list.get(i).b.c));
            this.b.add(list.get(i).c.d());
        }
    }
}
