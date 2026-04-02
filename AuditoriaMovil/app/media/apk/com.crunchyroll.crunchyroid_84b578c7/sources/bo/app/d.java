package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class d {
    public static final e k = new e(null);
    private final com.amazon.aps.iva.if0.c a;
    private final Map b;
    private final y c;
    private final IInAppMessage d;
    private final List e;
    private final y4 f;
    private final List g;
    private final com.amazon.aps.iva.if0.a h;
    private final com.amazon.aps.iva.if0.a i;
    private final g2 j;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Encountered Exception processing Content Cards response: " + d.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Found " + d.this.j().size() + " triggered actions in server response.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Got server config: " + JsonUtils.getPrettyPrintedString(this.b);
        }
    }

    /* renamed from: bo.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0070d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0070d(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Encountered Exception processing server config: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public /* synthetic */ e(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final g2 a(com.amazon.aps.iva.if0.c cVar, s1 s1Var) {
            com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
            com.amazon.aps.iva.yb0.j.f(s1Var, "request");
            String optionalString = JsonUtils.getOptionalString(cVar, "error");
            com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("auth_error");
            if (optJSONObject != null) {
                return new t4(s1Var, optJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject, "reason"), optionalString);
            } else if (com.amazon.aps.iva.yb0.j.a(optionalString, "invalid_api_key")) {
                return new y2(optionalString, s1Var);
            } else {
                if (optionalString != null) {
                    return new g(optionalString, s1Var);
                }
                return null;
            }
        }

        private e() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.amazon.aps.iva.kb0.j r10, bo.app.s1 r11, bo.app.r1 r12) {
        /*
            r9 = this;
            java.lang.String r0 = "responseData"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            java.lang.String r0 = "request"
            com.amazon.aps.iva.yb0.j.f(r11, r0)
            java.lang.String r0 = "brazeManager"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            r9.<init>()
            A r0 = r10.b
            com.amazon.aps.iva.if0.c r0 = (com.amazon.aps.iva.if0.c) r0
            r9.a = r0
            B r10 = r10.c
            java.util.Map r10 = (java.util.Map) r10
            r9.b = r10
            java.lang.String r10 = "feed"
            com.amazon.aps.iva.if0.a r10 = r0.optJSONArray(r10)
            r9.i = r10
            bo.app.d$e r10 = bo.app.d.k
            bo.app.g2 r10 = r10.a(r0, r11)
            r9.j = r10
            r1 = 0
            if (r10 != 0) goto L48
            boolean r10 = r11 instanceof bo.app.a0
            if (r10 == 0) goto L48
            bo.app.y r10 = new bo.app.y     // Catch: java.lang.Exception -> L3b
            r10.<init>(r0)     // Catch: java.lang.Exception -> L3b
            goto L49
        L3b:
            r10 = move-exception
            com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r0 = com.braze.support.BrazeLogger.Priority.W
            bo.app.d$a r2 = new bo.app.d$a
            r2.<init>()
            r11.brazelog(r9, r0, r10, r2)
        L48:
            r10 = r1
        L49:
            r9.c = r10
            com.amazon.aps.iva.if0.c r10 = r9.a
            java.lang.String r11 = "triggers"
            com.amazon.aps.iva.if0.a r10 = r10.optJSONArray(r11)
            bo.app.e6 r11 = bo.app.e6.a
            java.util.List r10 = r11.a(r10, r12)
            r9.e = r10
            if (r10 == 0) goto L6d
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.V
            bo.app.d$b r6 = new bo.app.d$b
            r6.<init>()
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r9
            com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8)
        L6d:
            com.amazon.aps.iva.if0.c r10 = r9.a
            java.lang.String r11 = "config"
            com.amazon.aps.iva.if0.c r10 = r10.optJSONObject(r11)
            if (r10 == 0) goto L9f
            bo.app.y4 r11 = new bo.app.y4     // Catch: java.lang.Exception -> L8f
            r11.<init>(r10)     // Catch: java.lang.Exception -> L8f
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L8d
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.V     // Catch: java.lang.Exception -> L8d
            r5 = 0
            bo.app.d$c r6 = new bo.app.d$c     // Catch: java.lang.Exception -> L8d
            r6.<init>(r10)     // Catch: java.lang.Exception -> L8d
            r7 = 2
            r8 = 0
            r3 = r9
            com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L8d
            goto La0
        L8d:
            r0 = move-exception
            goto L92
        L8f:
            r11 = move-exception
            r0 = r11
            r11 = r1
        L92:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.d$d r4 = new bo.app.d$d
            r4.<init>(r10)
            r2.brazelog(r9, r3, r0, r4)
            goto La0
        L9f:
            r11 = r1
        La0:
            r9.f = r11
            com.amazon.aps.iva.if0.c r10 = r9.a
            java.lang.String r11 = "templated_message"
            com.amazon.aps.iva.if0.c r10 = r10.optJSONObject(r11)
            bo.app.e6 r11 = bo.app.e6.a
            com.braze.models.inappmessage.IInAppMessage r10 = r11.a(r10, r12)
            r9.d = r10
            com.amazon.aps.iva.if0.c r10 = r9.a
            java.lang.String r11 = "geofences"
            com.amazon.aps.iva.if0.a r10 = r10.optJSONArray(r11)
            if (r10 == 0) goto Lc0
            java.util.List r1 = com.braze.support.e.a(r10)
        Lc0:
            r9.g = r1
            com.amazon.aps.iva.if0.c r10 = r9.a
            java.lang.String r11 = "feature_flags"
            com.amazon.aps.iva.if0.a r10 = r10.optJSONArray(r11)
            r9.h = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.d.<init>(com.amazon.aps.iva.kb0.j, bo.app.s1, bo.app.r1):void");
    }

    public final y a() {
        return this.c;
    }

    public final g2 b() {
        return this.j;
    }

    public final com.amazon.aps.iva.if0.a c() {
        return this.h;
    }

    public final com.amazon.aps.iva.if0.a d() {
        return this.i;
    }

    public final List e() {
        return this.g;
    }

    public final Map f() {
        return this.b;
    }

    public final com.amazon.aps.iva.if0.c g() {
        return this.a;
    }

    public final y4 h() {
        return this.f;
    }

    public final IInAppMessage i() {
        return this.d;
    }

    public final List j() {
        return this.e;
    }
}
