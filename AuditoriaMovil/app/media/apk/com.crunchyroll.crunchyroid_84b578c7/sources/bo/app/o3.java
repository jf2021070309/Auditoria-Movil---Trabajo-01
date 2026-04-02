package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public final class o3 implements IPutIntoJson, y1 {
    public static final b f = new b(null);
    private final String b;
    private final Boolean c;
    private final Boolean d;
    private final n3 e;

    /* loaded from: classes.dex */
    public static final class a {
        private String a;
        private Boolean b;
        private Boolean c;
        private n3 d;

        public a(String str, Boolean bool, Boolean bool2, n3 n3Var) {
            this.a = str;
            this.b = bool;
            this.c = bool2;
            this.d = n3Var;
        }

        public final void a(String str) {
            this.a = str;
        }

        public final a b(String str) {
            this.a = str;
            return this;
        }

        public final a c() {
            this.c = Boolean.TRUE;
            return this;
        }

        public final a a(n3 n3Var) {
            com.amazon.aps.iva.yb0.j.f(n3Var, "outboundConfigParams");
            this.d = n3Var;
            return this;
        }

        public final a b() {
            this.b = Boolean.TRUE;
            return this;
        }

        public final o3 a() {
            return new o3(this.a, this.b, this.c, this.d, null);
        }

        public /* synthetic */ a(String str, Boolean bool, Boolean bool2, n3 n3Var, int i, com.amazon.aps.iva.yb0.e eVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : n3Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ o3(String str, Boolean bool, Boolean bool2, n3 n3Var, com.amazon.aps.iva.yb0.e eVar) {
        this(str, bool, bool2, n3Var);
    }

    @Override // bo.app.y1
    public boolean isEmpty() {
        n3 n3Var;
        com.amazon.aps.iva.if0.c forJsonPut = forJsonPut();
        if (forJsonPut.length() == 0) {
            return true;
        }
        if (this.c == null && this.d == null && (n3Var = this.e) != null) {
            return n3Var.isEmpty();
        }
        if (forJsonPut.length() == 1) {
            return forJsonPut.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        boolean z;
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        String str = this.b;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            cVar.put("user_id", this.b);
        }
        Boolean bool = this.c;
        if (bool != null) {
            cVar.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.d;
        if (bool2 != null) {
            cVar.put("triggers", bool2.booleanValue());
        }
        n3 n3Var = this.e;
        if (n3Var != null) {
            cVar.put("config", n3Var.forJsonPut());
        }
        return cVar;
    }

    public final boolean v() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z;
        String str = this.b;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    private o3(String str, Boolean bool, Boolean bool2, n3 n3Var) {
        this.b = str;
        this.c = bool;
        this.d = bool2;
        this.e = n3Var;
    }
}
