package h;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class f<A, B> implements Serializable {
    public final A a;

    /* renamed from: b  reason: collision with root package name */
    public final B f8925b;

    public f(A a, B b2) {
        this.a = a;
        this.f8925b = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return h.o.c.j.a(this.a, fVar.a) && h.o.c.j.a(this.f8925b, fVar.f8925b);
        }
        return false;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b2 = this.f8925b;
        return hashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.a + ", " + this.f8925b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
