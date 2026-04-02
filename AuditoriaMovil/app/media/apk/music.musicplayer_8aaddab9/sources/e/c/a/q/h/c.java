package e.c.a.q.h;

import android.graphics.drawable.Drawable;
import ch.qos.logback.classic.Level;
import e.c.a.s.j;
/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6008b;

    /* renamed from: c  reason: collision with root package name */
    public e.c.a.q.b f6009c;

    public c() {
        if (!j.i(Level.ALL_INT, Level.ALL_INT)) {
            throw new IllegalArgumentException(e.a.d.a.a.g("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", Level.ALL_INT, " and height: ", Level.ALL_INT));
        }
        this.a = Level.ALL_INT;
        this.f6008b = Level.ALL_INT;
    }

    @Override // e.c.a.q.h.h
    public final void a(g gVar) {
    }

    @Override // e.c.a.q.h.h
    public final void c(e.c.a.q.b bVar) {
        this.f6009c = bVar;
    }

    @Override // e.c.a.q.h.h
    public void d(Drawable drawable) {
    }

    @Override // e.c.a.q.h.h
    public void e(Drawable drawable) {
    }

    @Override // e.c.a.q.h.h
    public final e.c.a.q.b f() {
        return this.f6009c;
    }

    @Override // e.c.a.q.h.h
    public final void h(g gVar) {
        ((e.c.a.q.g) gVar).a(this.a, this.f6008b);
    }

    @Override // e.c.a.n.i
    public void onDestroy() {
    }

    @Override // e.c.a.n.i
    public void onStart() {
    }

    @Override // e.c.a.n.i
    public void onStop() {
    }
}
