package e.b.a.a.z;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class j {
    public static final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final String f5415b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5416c;

    /* renamed from: d  reason: collision with root package name */
    public b f5417d = null;

    /* renamed from: e  reason: collision with root package name */
    public b f5418e = null;

    public j(c cVar, String str) {
        this.f5416c = cVar;
        StringBuilder A = e.a.d.a.a.A(str, "_");
        A.append(a.incrementAndGet());
        this.f5415b = A.toString();
    }

    public void a(b bVar) {
        e.b.a.a.y.c.a.a("[%s] post message %s", this.f5415b, bVar);
        b bVar2 = this.f5418e;
        if (bVar2 == null) {
            this.f5417d = bVar;
            this.f5418e = bVar;
            return;
        }
        bVar2.f5401c = bVar;
        this.f5418e = bVar;
    }

    public void b() {
        while (true) {
            b bVar = this.f5417d;
            if (bVar == null) {
                this.f5418e = null;
                return;
            } else {
                this.f5417d = bVar.f5401c;
                this.f5416c.b(bVar);
            }
        }
    }

    public b c() {
        b bVar = this.f5417d;
        e.b.a.a.y.c.a.a("[%s] remove message %s", this.f5415b, bVar);
        if (bVar != null) {
            this.f5417d = bVar.f5401c;
            if (this.f5418e == bVar) {
                this.f5418e = null;
            }
        }
        return bVar;
    }
}
