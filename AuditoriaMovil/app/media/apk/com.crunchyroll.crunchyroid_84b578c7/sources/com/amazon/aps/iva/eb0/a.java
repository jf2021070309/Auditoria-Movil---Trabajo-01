package com.amazon.aps.iva.eb0;

import com.amazon.aps.iva.eb0.f;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: BlockingMetadataBootstrappingGuard.java */
/* loaded from: classes4.dex */
public final class a<T extends f> {
    public final com.amazon.aps.iva.ab0.a a;
    public final com.amazon.aps.iva.db0.b b;
    public final T c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public a(com.amazon.aps.iva.ab0.a aVar, com.amazon.aps.iva.db0.b bVar, T t) {
        this.a = aVar;
        this.b = bVar;
        this.c = t;
    }

    public final T a(String str) {
        if (!this.d.containsKey(str)) {
            synchronized (this) {
                if (!this.d.containsKey(str)) {
                    try {
                        for (com.amazon.aps.iva.ab0.f fVar : this.b.a(this.a.b(str))) {
                            this.c.a(fVar);
                        }
                        this.d.put(str, str);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw new IllegalStateException("Failed to read file " + str, e);
                    }
                }
            }
        }
        return this.c;
    }
}
