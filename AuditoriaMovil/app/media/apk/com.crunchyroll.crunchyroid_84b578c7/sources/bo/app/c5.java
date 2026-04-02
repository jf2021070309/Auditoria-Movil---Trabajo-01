package bo.app;

import bo.app.e5;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
/* loaded from: classes.dex */
public class c5 implements IPutIntoJson {
    public static final a f = new a(null);
    private final e5 b;
    private final double c;
    private volatile Double d;
    private volatile boolean e;

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
        final /* synthetic */ double b;
        final /* synthetic */ c5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d, c5 c5Var) {
            super(0);
            this.b = d;
            this.c = c5Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "End time '" + this.b + "' for session is less than the start time '" + this.c.x() + "' for this session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public c5(e5 e5Var, double d, Double d2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(e5Var, "sessionId");
        this.b = e5Var;
        this.c = d;
        a(d2);
        this.e = z;
    }

    public void a(Double d) {
        this.d = d;
    }

    public final e5 s() {
        return this.b;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.b + ", startTime=" + this.c + ", endTime=" + w() + ", isSealed=" + this.e + ", duration=" + v() + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        try {
            cVar.put("session_id", this.b);
            cVar.put("start_time", this.c);
            cVar.put("is_sealed", this.e);
            if (w() != null) {
                cVar.put("end_time", w());
            }
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
        }
        return cVar;
    }

    public final long v() {
        Double w = w();
        if (w != null) {
            double doubleValue = w.doubleValue();
            long j = (long) (doubleValue - this.c);
            if (j < 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(doubleValue, this), 2, (Object) null);
            }
            return j;
        }
        return -1L;
    }

    public Double w() {
        return this.d;
    }

    public final double x() {
        return this.c;
    }

    public final boolean y() {
        return this.e;
    }

    public final e3 z() {
        return new e3(this.b, this.c, w(), this.e);
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public c5(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "sessionData");
        e5.a aVar = e5.d;
        String string = cVar.getString("session_id");
        com.amazon.aps.iva.yb0.j.e(string, "sessionData.getString(SESSION_ID_KEY)");
        this.b = aVar.a(string);
        this.c = cVar.getDouble("start_time");
        this.e = cVar.getBoolean("is_sealed");
        a(JsonUtils.getDoubleOrNull(cVar, "end_time"));
    }
}
