package k;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class k extends y {

    /* renamed from: e  reason: collision with root package name */
    public y f9625e;

    public k(y yVar) {
        h.o.c.j.e(yVar, "delegate");
        this.f9625e = yVar;
    }

    @Override // k.y
    public y a() {
        return this.f9625e.a();
    }

    @Override // k.y
    public y b() {
        return this.f9625e.b();
    }

    @Override // k.y
    public long c() {
        return this.f9625e.c();
    }

    @Override // k.y
    public y d(long j2) {
        return this.f9625e.d(j2);
    }

    @Override // k.y
    public boolean e() {
        return this.f9625e.e();
    }

    @Override // k.y
    public void f() throws IOException {
        this.f9625e.f();
    }

    @Override // k.y
    public y g(long j2, TimeUnit timeUnit) {
        h.o.c.j.e(timeUnit, "unit");
        return this.f9625e.g(j2, timeUnit);
    }
}
