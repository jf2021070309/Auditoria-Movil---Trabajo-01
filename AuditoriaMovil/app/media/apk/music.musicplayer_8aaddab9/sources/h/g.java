package h;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class g<T> implements Serializable {

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {
        public final Throwable a;

        public a(Throwable th) {
            h.o.c.j.e(th, "exception");
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && h.o.c.j.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Failure(");
            y.append(this.a);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }
}
