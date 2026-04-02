package e.h.d;

import e.h.d.e0;
/* loaded from: classes2.dex */
public class l0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0.i f8141b;

    public l0(e0.i iVar, e0.j jVar) {
        this.f8141b = iVar;
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.this.f8100n.remove(((e0.k) this.a).a());
    }
}
