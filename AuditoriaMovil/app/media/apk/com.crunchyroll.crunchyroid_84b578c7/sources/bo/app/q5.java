package bo.app;

import android.content.Context;
import com.amazon.aps.iva.ne0.u;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class q5 extends i6 {
    public static final b m = new b(null);
    private r1 i;
    private String j;
    private final List k;
    private long l;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.b);
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

    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i4.values().length];
            try {
                iArr[i4.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i4.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i4.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof String);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (String) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Posting templating request after delay of " + q5.this.n().o() + " seconds.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        this.k = new ArrayList();
        this.l = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(cVar), 3, (Object) null);
        this.i = r1Var;
        com.amazon.aps.iva.if0.c jSONObject = cVar.getJSONObject("data");
        String string = jSONObject.getString("trigger_id");
        com.amazon.aps.iva.yb0.j.e(string, "dataObject.getString(TRIGGER_ID)");
        this.j = string;
        com.amazon.aps.iva.if0.a optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, i4.IMAGE);
        }
        com.amazon.aps.iva.if0.a optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, i4.ZIP);
        }
        com.amazon.aps.iva.if0.a optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            a(optJSONArray3, i4.FILE);
        }
    }

    public final long A() {
        return this.l;
    }

    @Override // bo.app.q2
    public void a(Context context, z1 z1Var, l2 l2Var, long j) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        this.l = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(), 3, (Object) null);
        this.i.a(this, l2Var);
    }

    @Override // bo.app.q2
    public List l() {
        return new ArrayList(this.k);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c u = super.u();
            if (u == null) {
                return null;
            }
            u.put("type", "templated_iam");
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("trigger_id", this.j);
            com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
            com.amazon.aps.iva.if0.a aVar2 = new com.amazon.aps.iva.if0.a();
            com.amazon.aps.iva.if0.a aVar3 = new com.amazon.aps.iva.if0.a();
            for (h4 h4Var : this.k) {
                int i = c.a[h4Var.a().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            aVar3.put(h4Var.b());
                        }
                    } else {
                        aVar2.put(h4Var.b());
                    }
                } else {
                    aVar.put(h4Var.b());
                }
            }
            cVar.put("prefetch_image_urls", aVar);
            cVar.put("prefetch_zip_urls", aVar2);
            cVar.put("prefetch_file_urls", aVar3);
            u.put("data", cVar);
            return u;
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f.b);
            return null;
        }
    }

    public final String z() {
        return this.j;
    }

    private final void a(com.amazon.aps.iva.if0.a aVar, i4 i4Var) {
        Iterator aVar2;
        if (aVar == null) {
            aVar2 = com.amazon.aps.iva.lb0.y.b;
        } else {
            aVar2 = new u.a(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.lb0.x.k0(com.amazon.aps.iva.aq.j.T(0, aVar.e())), new d(aVar)), new e(aVar)));
        }
        while (aVar2.hasNext()) {
            this.k.add(new h4(i4Var, (String) aVar2.next()));
        }
    }
}
