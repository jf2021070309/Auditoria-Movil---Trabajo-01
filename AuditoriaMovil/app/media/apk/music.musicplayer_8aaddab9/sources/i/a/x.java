package i.a;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public final class x {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final h.o.b.l<Throwable, h.k> f9179b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, h.o.b.l<? super Throwable, h.k> lVar) {
        this.a = obj;
        this.f9179b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return h.o.c.j.a(this.a, xVar.a) && h.o.c.j.a(this.f9179b, xVar.f9179b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        return this.f9179b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CompletedWithCancellation(result=");
        y.append(this.a);
        y.append(", onCancellation=");
        y.append(this.f9179b);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
