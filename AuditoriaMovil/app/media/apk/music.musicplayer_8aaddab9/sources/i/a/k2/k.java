package i.a.k2;

import e.j.d.w;
/* loaded from: classes2.dex */
public final class k extends i {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f9128c;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f9128c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f9128c.run();
        } finally {
            this.f9127b.r();
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Task[");
        y.append(w.J(this.f9128c));
        y.append('@');
        y.append(w.M(this.f9128c));
        y.append(", ");
        y.append(this.a);
        y.append(", ");
        y.append(this.f9127b);
        y.append(']');
        return y.toString();
    }
}
