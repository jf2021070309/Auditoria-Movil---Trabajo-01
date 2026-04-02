package e.b.a.a.z;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g implements e {

    /* renamed from: b  reason: collision with root package name */
    public final a f5403b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5404c;

    /* renamed from: g  reason: collision with root package name */
    public final e.b.a.a.c0.a f5408g;
    public final Object a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5405d = false;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f5407f = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public final j[] f5406e = new j[i.MAX_PRIORITY + 1];

    public g(e.b.a.a.c0.a aVar, c cVar) {
        this.f5403b = new a(cVar);
        this.f5404c = cVar;
        this.f5408g = aVar;
    }

    @Override // e.b.a.a.z.e
    public void a(b bVar) {
        synchronized (this.a) {
            this.f5405d = true;
            int i2 = bVar.f5400b.priority;
            j[] jVarArr = this.f5406e;
            if (jVarArr[i2] == null) {
                c cVar = this.f5404c;
                jVarArr[i2] = new j(cVar, "queue_" + bVar.f5400b.name());
            }
            this.f5406e[i2].a(bVar);
            e.b.a.a.c0.a aVar = this.f5408g;
            Object obj = this.a;
            Objects.requireNonNull(aVar);
            obj.notifyAll();
        }
    }
}
