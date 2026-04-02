package c.v;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class j {
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final f f2802b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c.x.a.f.f f2803c;

    public j(f fVar) {
        this.f2802b = fVar;
    }

    public c.x.a.f.f a() {
        this.f2802b.a();
        if (!this.a.compareAndSet(false, true)) {
            return this.f2802b.d(b());
        }
        if (this.f2803c == null) {
            this.f2803c = this.f2802b.d(b());
        }
        return this.f2803c;
    }

    public abstract String b();

    public void c(c.x.a.f.f fVar) {
        if (fVar == this.f2803c) {
            this.a.set(false);
        }
    }
}
