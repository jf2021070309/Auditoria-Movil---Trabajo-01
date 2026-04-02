package com.fyber.inneractive.sdk.config;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class s implements Iterable<t> {
    String a;
    public List<t> b = new LinkedList();
    public boolean c = true;

    public final t a() {
        return this.b.get(0);
    }

    @Override // java.lang.Iterable
    public final Iterator<t> iterator() {
        return this.b.iterator();
    }
}
