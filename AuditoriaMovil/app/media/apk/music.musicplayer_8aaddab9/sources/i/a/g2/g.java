package i.a.g2;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public final class g<T> {
    public static final b a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public static final c f8995b = new c();

    /* loaded from: classes2.dex */
    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && h.o.c.j.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // i.a.g2.g.c
        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Closed(");
            y.append(this.a);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b(h.o.c.f fVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }
}
