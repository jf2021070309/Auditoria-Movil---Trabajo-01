package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class a3 implements a2 {
    private final a2 a;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.kb0.e b;
        final /* synthetic */ q4 c;
        final /* synthetic */ a3 d;
        final /* synthetic */ Map e;
        final /* synthetic */ com.amazon.aps.iva.if0.c f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.kb0.e eVar, q4 q4Var, a3 a3Var, Map map, com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = eVar;
            this.c = q4Var;
            this.d = a3Var;
            this.e = map;
            this.f = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            String str;
            StringBuilder sb = new StringBuilder("\n                |Making request with id => \"");
            sb.append((String) this.b.getValue());
            sb.append("\"\n                |to url: ");
            sb.append(this.c);
            sb.append("\n                \n                |with headers:\n                ");
            sb.append(this.d.a(this.e));
            sb.append("\n                |\n                |");
            if (this.f == null) {
                str = "";
            } else {
                str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(this.f);
            }
            sb.append(str);
            sb.append("\n                ");
            return com.amazon.aps.iva.oe0.i.U(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.kb0.e b;
        final /* synthetic */ q4 c;
        final /* synthetic */ long d;
        final /* synthetic */ a3 e;
        final /* synthetic */ Map f;
        final /* synthetic */ com.amazon.aps.iva.if0.c g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.kb0.e eVar, q4 q4Var, long j, a3 a3Var, Map map, com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = eVar;
            this.c = q4Var;
            this.d = j;
            this.e = a3Var;
            this.f = map;
            this.g = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.oe0.i.U("\n                |Made request with id => \"" + ((String) this.b.getValue()) + "\"\n                |to url: " + this.c + "\n                |took: " + this.d + "ms\n                \n                |with response headers:\n                " + this.e.a(this.f) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(this.g) + "\n                ");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q4 b;
        final /* synthetic */ Map c;
        final /* synthetic */ com.amazon.aps.iva.if0.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q4 q4Var, Map map, com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = q4Var;
            this.c = map;
            this.d = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.braze.support.g.a(this.b, this.c, this.d);
        }
    }

    public a3(a2 a2Var) {
        com.amazon.aps.iva.yb0.j.f(a2Var, "httpConnector");
        this.a = a2Var;
    }

    @Override // bo.app.a2
    public com.amazon.aps.iva.kb0.j a(q4 q4Var, Map map, com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(q4Var, "requestTarget");
        com.amazon.aps.iva.yb0.j.f(map, "requestHeaders");
        com.amazon.aps.iva.yb0.j.f(cVar, "payload");
        com.amazon.aps.iva.kb0.m b2 = com.amazon.aps.iva.kb0.f.b(new e(q4Var, map, cVar));
        a(q4Var, map, b2, cVar);
        long currentTimeMillis = System.currentTimeMillis();
        com.amazon.aps.iva.kb0.j a2 = this.a.a(q4Var, map, cVar);
        a(b2, q4Var, (Map) a2.c, (com.amazon.aps.iva.if0.c) a2.b, System.currentTimeMillis() - currentTimeMillis);
        return a2;
    }

    private final void a(q4 q4Var, Map map, com.amazon.aps.iva.kb0.e eVar, com.amazon.aps.iva.if0.c cVar) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(eVar, q4Var, this, map, cVar), 3, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
        }
    }

    private final void a(com.amazon.aps.iva.kb0.e eVar, q4 q4Var, Map map, com.amazon.aps.iva.if0.c cVar, long j) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(eVar, q4Var, j, this, map, cVar), 3, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + '\"');
        }
        return com.amazon.aps.iva.lb0.x.B0(arrayList, "\n", null, null, null, 62);
    }
}
