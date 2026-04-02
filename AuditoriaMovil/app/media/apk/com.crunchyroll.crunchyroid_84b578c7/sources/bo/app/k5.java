package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class k5 implements i2 {
    public static final a b = new a(null);
    private final SharedPreferences a;

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
            return "Failed to set end time to now for session json data";
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
            return "No stored open session in storage.";
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
            return "Could not create new mutable session for open session.";
        }
    }

    public k5(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context.getSharedPreferences("com.appboy.storage.session_storage" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    @Override // bo.app.i2
    public c5 a() {
        String str = "";
        if (!this.a.contains("current_open_session")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            return null;
        }
        try {
            String string = this.a.getString(this.a.getString("current_open_session", ""), "");
            if (string != null) {
                str = string;
            }
            return new c5(new com.amazon.aps.iva.if0.c(str));
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
            return null;
        }
    }

    @Override // bo.app.i2
    public void a(c5 c5Var) {
        com.amazon.aps.iva.yb0.j.f(c5Var, "session");
        String e5Var = c5Var.s().toString();
        com.amazon.aps.iva.if0.c forJsonPut = c5Var.forJsonPut();
        SharedPreferences.Editor edit = this.a.edit();
        a(forJsonPut);
        edit.putString(e5Var, forJsonPut.toString());
        if (!c5Var.y()) {
            edit.putString("current_open_session", e5Var);
        } else if (com.amazon.aps.iva.yb0.j.a(this.a.getString("current_open_session", ""), e5Var)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    @Override // bo.app.i2
    public void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "sessionId");
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(str);
        if (com.amazon.aps.iva.yb0.j.a(str, this.a.getString("current_open_session", null))) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    private final void a(com.amazon.aps.iva.if0.c cVar) {
        if (cVar.has("end_time")) {
            return;
        }
        try {
            cVar.put("end_time", DateTimeUtils.nowInSecondsPrecise());
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
    }
}
