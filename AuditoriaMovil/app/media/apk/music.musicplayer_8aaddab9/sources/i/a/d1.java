package i.a;
/* loaded from: classes2.dex */
public final class d1 extends h {
    public final h.o.b.l<Throwable, h.k> a;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(h.o.b.l<? super Throwable, h.k> lVar) {
        this.a = lVar;
    }

    @Override // i.a.i
    public void a(Throwable th) {
        this.a.invoke(th);
    }

    @Override // h.o.b.l
    public h.k invoke(Throwable th) {
        this.a.invoke(th);
        return h.k.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("InvokeOnCancel[");
        y.append(e.j.d.w.J(this.a));
        y.append('@');
        y.append(e.j.d.w.M(this));
        y.append(']');
        return y.toString();
    }
}
