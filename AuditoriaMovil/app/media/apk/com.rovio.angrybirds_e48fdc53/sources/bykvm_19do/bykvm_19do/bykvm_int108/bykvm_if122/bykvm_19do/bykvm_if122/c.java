package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122.b;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class c implements Runnable, Comparable<c>, b {
    private b.a a = b.a.NORMAL;

    public c() {
        r0 = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        if (a().a() < cVar.a().a()) {
            return 1;
        }
        return a().a() > cVar.a().a() ? -1 : 0;
    }

    public b.a a() {
        return this.a;
    }
}
