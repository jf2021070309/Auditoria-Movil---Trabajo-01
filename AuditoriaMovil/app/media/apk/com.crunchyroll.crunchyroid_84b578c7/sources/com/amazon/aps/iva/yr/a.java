package com.amazon.aps.iva.yr;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ContextualScopeManager.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.fb0.a {
    public static final ThreadLocal<b> c = new ThreadLocal<>();
    public final LinkedList a = new LinkedList();
    public final com.amazon.aps.iva.wr.b b;

    public a(com.amazon.aps.iva.wr.b bVar) {
        new CopyOnWriteArrayList();
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.fb0.a
    public final com.amazon.aps.iva.fb0.b b() {
        synchronized (this.a) {
            for (c cVar : this.a) {
                if (cVar.a()) {
                    return cVar.b();
                }
            }
            b bVar = c.get();
            if (bVar == null) {
                return null;
            }
            return bVar.span();
        }
    }
}
