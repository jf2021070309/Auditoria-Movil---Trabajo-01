package c.m.b;

import c.m.b.k0;
/* loaded from: classes.dex */
public class j implements Runnable {
    public final /* synthetic */ k0.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0.d f2370b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2371c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.f.a f2372d;

    public j(e eVar, k0.d dVar, k0.d dVar2, boolean z, c.f.a aVar) {
        this.a = dVar;
        this.f2370b = dVar2;
        this.f2371c = z;
        this.f2372d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.a(this.a.f2384c, this.f2370b.f2384c, this.f2371c, this.f2372d, false);
    }
}
