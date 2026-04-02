package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class r4 implements h2 {
    public static final a i = new a(null);
    private final long b;
    private final long c;
    private final int d;
    private final int e;
    private final int f;
    private final d2 g;
    private final int h;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
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
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public r4(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        this.b = cVar.optLong("start_time", -1L);
        this.c = cVar.optLong("end_time", -1L);
        this.d = cVar.optInt("priority", 0);
        this.h = cVar.optInt("min_seconds_since_last_trigger", -1);
        this.e = cVar.optInt("delay", 0);
        this.f = cVar.optInt("timeout", -1);
        this.g = new g4(cVar);
    }

    @Override // bo.app.h2
    public long a() {
        return this.b;
    }

    @Override // bo.app.h2
    public d2 i() {
        return this.g;
    }

    @Override // bo.app.h2
    public int j() {
        return this.d;
    }

    @Override // bo.app.h2
    public int k() {
        return this.f;
    }

    @Override // bo.app.h2
    public int o() {
        return this.e;
    }

    @Override // bo.app.h2
    public long p() {
        return this.c;
    }

    @Override // bo.app.h2
    public int r() {
        return this.h;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c cVar = (com.amazon.aps.iva.if0.c) i().forJsonPut();
            if (cVar == null) {
                return null;
            }
            cVar.put("start_time", a());
            cVar.put("end_time", p());
            cVar.put("priority", j());
            cVar.put("min_seconds_since_last_trigger", r());
            cVar.put("timeout", k());
            cVar.put("delay", o());
            return cVar;
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            return null;
        }
    }
}
