package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.id.a;
import java.util.HashMap;
import java.util.List;
/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public final class q {
    public final s a;
    public final a b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: classes.dex */
    public static class a {
        public final HashMap a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.amazon.aps.iva.rc.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0676a<Model> {
            public final List<o<Model, ?>> a;

            public C0676a(List<o<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public q(a.c cVar) {
        s sVar = new s(cVar);
        this.b = new a();
        this.a = sVar;
    }
}
