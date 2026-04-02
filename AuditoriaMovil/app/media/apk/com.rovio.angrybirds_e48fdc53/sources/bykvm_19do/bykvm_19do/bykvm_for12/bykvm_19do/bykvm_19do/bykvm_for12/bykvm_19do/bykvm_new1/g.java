package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1;

import java.util.UUID;
/* loaded from: classes.dex */
public abstract class g implements Runnable, Comparable<g> {
    private int a;

    public g(String str) {
        this.a = 0;
        this.a = 5;
        String str2 = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
    }

    public int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(g gVar) {
        if (a() < gVar.a()) {
            return 1;
        }
        return a() >= gVar.a() ? -1 : 0;
    }

    public void a(int i) {
        this.a = i;
    }
}
