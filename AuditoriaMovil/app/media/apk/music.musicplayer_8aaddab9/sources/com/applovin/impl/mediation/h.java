package com.applovin.impl.mediation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class h {
    private final List<a> a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.a.a aVar);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b(a aVar) {
        this.a.remove(aVar);
    }
}
