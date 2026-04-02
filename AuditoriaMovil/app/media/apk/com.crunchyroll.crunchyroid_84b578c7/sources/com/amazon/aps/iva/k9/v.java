package com.amazon.aps.iva.k9;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class v {
    public final UUID a;
    public final com.amazon.aps.iva.t9.p b;
    public final Set<String> c;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends v> {
        public UUID a;
        public com.amazon.aps.iva.t9.p b;
        public final HashSet c;

        public a(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.c = hashSet;
            this.a = UUID.randomUUID();
            this.b = new com.amazon.aps.iva.t9.p(this.a.toString(), cls.getName());
            hashSet.add(cls.getName());
            c();
        }

        public final W a() {
            boolean z;
            W b = b();
            c cVar = this.b.j;
            boolean z2 = true;
            if (cVar.h.a.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !cVar.d && !cVar.b && !cVar.c) {
                z2 = false;
            }
            com.amazon.aps.iva.t9.p pVar = this.b;
            if (pVar.q) {
                if (!z2) {
                    if (pVar.g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            this.a = UUID.randomUUID();
            com.amazon.aps.iva.t9.p pVar2 = new com.amazon.aps.iva.t9.p(this.b);
            this.b = pVar2;
            pVar2.a = this.a.toString();
            return b;
        }

        public abstract W b();

        public abstract B c();
    }

    public v(UUID uuid, com.amazon.aps.iva.t9.p pVar, HashSet hashSet) {
        this.a = uuid;
        this.b = pVar;
        this.c = hashSet;
    }
}
