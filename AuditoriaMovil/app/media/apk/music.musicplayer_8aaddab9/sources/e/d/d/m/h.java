package e.d.d.m;

import e.d.d.m.j.j.n0;
import e.d.d.m.j.j.y;
import e.d.d.m.j.j.z;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class h implements Callable<Void> {
    public final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f7136b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.d.d.m.j.p.e f7137c;

    public h(boolean z, z zVar, e.d.d.m.j.p.e eVar) {
        this.a = z;
        this.f7136b = zVar;
        this.f7137c = eVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        if (this.a) {
            z zVar = this.f7136b;
            n0.b(zVar.f7231k, new y(zVar, this.f7137c));
            return null;
        }
        return null;
    }
}
