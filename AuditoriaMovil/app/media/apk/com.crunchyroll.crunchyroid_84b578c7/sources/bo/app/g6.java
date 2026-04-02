package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class g6 implements q2 {
    public static final a g = new a(null);
    private final String b;
    private final h2 c;
    private final boolean d;
    private d6 e;
    private final List f;

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
        final /* synthetic */ l2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l2 l2Var) {
            super(0);
            this.c = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action " + g6.this.getId() + " not eligible to be triggered by " + this.c.d() + " event. Current device time outside triggered action time window.";
        }
    }

    public g6(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        String string = cVar.getString("id");
        com.amazon.aps.iva.yb0.j.e(string, "json.getString(ID)");
        this.b = string;
        this.c = new r4(cVar);
        com.amazon.aps.iva.if0.a jSONArray = cVar.getJSONArray("trigger_condition");
        if (jSONArray.e() > 0) {
            arrayList.addAll(e6.a.a(jSONArray));
        }
        this.d = cVar.optBoolean("prefetch", true);
    }

    private final boolean v() {
        if (this.c.p() != -1 && DateTimeUtils.nowInSeconds() >= this.c.p()) {
            return false;
        }
        return true;
    }

    private final boolean w() {
        if (this.c.a() != -1 && DateTimeUtils.nowInSeconds() <= this.c.a()) {
            return false;
        }
        return true;
    }

    private final boolean x() {
        if (w() && v()) {
            return true;
        }
        return false;
    }

    @Override // bo.app.q2
    public void a(d6 d6Var) {
        this.e = d6Var;
    }

    @Override // bo.app.q2
    public d6 b() {
        return this.e;
    }

    @Override // bo.app.q2
    public final boolean d() {
        return this.d;
    }

    @Override // bo.app.q2
    public final String getId() {
        return this.b;
    }

    @Override // bo.app.q2
    public final h2 n() {
        return this.c;
    }

    public com.amazon.aps.iva.if0.c u() {
        com.amazon.aps.iva.if0.c cVar;
        try {
            cVar = (com.amazon.aps.iva.if0.c) this.c.forJsonPut();
        } catch (com.amazon.aps.iva.if0.b unused) {
        }
        if (cVar != null) {
            cVar.put("id", this.b);
            com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
            for (k2 k2Var : this.f) {
                aVar.put(k2Var.forJsonPut());
            }
            cVar.put("trigger_condition", aVar);
            cVar.put("prefetch", this.d);
            return cVar;
        }
        return null;
    }

    @Override // bo.app.q2
    public boolean b(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "event");
        if (!x()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(l2Var), 3, (Object) null);
            return false;
        }
        Iterator it = this.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((k2) it.next()).a(l2Var)) {
                break;
            } else {
                i++;
            }
        }
        return i != -1;
    }
}
