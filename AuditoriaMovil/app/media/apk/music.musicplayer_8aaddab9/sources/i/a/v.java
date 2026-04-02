package i.a;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class v {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final h f9173b;

    /* renamed from: c  reason: collision with root package name */
    public final h.o.b.l<Throwable, h.k> f9174c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9175d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f9176e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, h hVar, h.o.b.l<? super Throwable, h.k> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f9173b = hVar;
        this.f9174c = lVar;
        this.f9175d = obj2;
        this.f9176e = th;
    }

    public v(Object obj, h hVar, h.o.b.l lVar, Object obj2, Throwable th, int i2) {
        hVar = (i2 & 2) != 0 ? null : hVar;
        lVar = (i2 & 4) != 0 ? null : lVar;
        obj2 = (i2 & 8) != 0 ? null : obj2;
        th = (i2 & 16) != 0 ? null : th;
        this.a = obj;
        this.f9173b = hVar;
        this.f9174c = lVar;
        this.f9175d = obj2;
        this.f9176e = th;
    }

    public static v a(v vVar, Object obj, h hVar, h.o.b.l lVar, Object obj2, Throwable th, int i2) {
        Object obj3 = (i2 & 1) != 0 ? vVar.a : null;
        if ((i2 & 2) != 0) {
            hVar = vVar.f9173b;
        }
        h hVar2 = hVar;
        h.o.b.l<Throwable, h.k> lVar2 = (i2 & 4) != 0 ? vVar.f9174c : null;
        Object obj4 = (i2 & 8) != 0 ? vVar.f9175d : null;
        if ((i2 & 16) != 0) {
            th = vVar.f9176e;
        }
        Objects.requireNonNull(vVar);
        return new v(obj3, hVar2, lVar2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return h.o.c.j.a(this.a, vVar.a) && h.o.c.j.a(this.f9173b, vVar.f9173b) && h.o.c.j.a(this.f9174c, vVar.f9174c) && h.o.c.j.a(this.f9175d, vVar.f9175d) && h.o.c.j.a(this.f9176e, vVar.f9176e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f9173b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h.o.b.l<Throwable, h.k> lVar = this.f9174c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f9175d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f9176e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CompletedContinuation(result=");
        y.append(this.a);
        y.append(", cancelHandler=");
        y.append(this.f9173b);
        y.append(", onCancellation=");
        y.append(this.f9174c);
        y.append(", idempotentResume=");
        y.append(this.f9175d);
        y.append(", cancelCause=");
        y.append(this.f9176e);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
