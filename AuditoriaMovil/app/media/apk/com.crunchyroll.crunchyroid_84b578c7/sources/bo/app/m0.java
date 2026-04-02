package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class m0 {
    public static final a e = new a(null);
    public final b a;
    public final p1 b;
    public final e5 c;
    public final s1 d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0079a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0079a b = new C0079a();

            public C0079a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "There should be a session ID here";
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final m0 a(p1 p1Var) {
            com.amazon.aps.iva.yb0.j.f(p1Var, "event");
            return new m0(b.ADD_BRAZE_EVENT, p1Var, null, null, 12, null);
        }

        public final m0 b(p1 p1Var) {
            com.amazon.aps.iva.yb0.j.f(p1Var, "event");
            return new m0(b.ADD_PENDING_BRAZE_EVENT, p1Var, null, null, 12, null);
        }

        private a() {
        }

        public final m0 a(e5 e5Var) {
            if (e5Var == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, C0079a.b, 3, (Object) null);
            }
            return new m0(b.FLUSH_PENDING_BRAZE_EVENTS, null, e5Var, null, 10, null);
        }

        public final m0 a(s1 s1Var) {
            com.amazon.aps.iva.yb0.j.f(s1Var, "request");
            return new m0(b.ADD_REQUEST, null, null, s1Var, 6, null);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENT,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    private m0(b bVar, p1 p1Var, e5 e5Var, s1 s1Var) {
        this.a = bVar;
        this.b = p1Var;
        this.c = e5Var;
        this.d = s1Var;
    }

    public final b a() {
        return this.a;
    }

    public final p1 b() {
        return this.b;
    }

    public final e5 c() {
        return this.c;
    }

    public final s1 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.a == m0Var.a && com.amazon.aps.iva.yb0.j.a(this.b, m0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, m0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, m0Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        p1 p1Var = this.b;
        int i = 0;
        if (p1Var == null) {
            hashCode = 0;
        } else {
            hashCode = p1Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        e5 e5Var = this.c;
        if (e5Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = e5Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        s1 s1Var = this.d;
        if (s1Var != null) {
            i = s1Var.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return com.amazon.aps.iva.oe0.i.T("\n            commandType = " + this.a + "\n            brazeEvent = " + this.b + "\n            sessionId = " + this.c + "\n            brazeRequest = " + this.d + "\n        ");
    }

    public /* synthetic */ m0(b bVar, p1 p1Var, e5 e5Var, s1 s1Var, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(bVar, (i & 2) != 0 ? null : p1Var, (i & 4) != 0 ? null : e5Var, (i & 8) != 0 ? null : s1Var);
    }
}
