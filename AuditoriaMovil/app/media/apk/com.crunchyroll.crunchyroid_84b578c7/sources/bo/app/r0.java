package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.DateTimeUtils;
/* loaded from: classes.dex */
public final class r0 {
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

    public r0(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("persistent.com.braze.requests.metadata.last_req_at", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    private final long a(boolean z) {
        return z ? 2L : 1L;
    }

    public final void b(q4 q4Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(q4Var, "target");
        this.a.edit().putLong(a(q4Var.c()), a(z)).apply();
    }

    public final long a(q4 q4Var) {
        com.amazon.aps.iva.yb0.j.f(q4Var, "target");
        String str = "uri-" + q4Var.c().hashCode();
        long j = this.a.getLong(str, 0L);
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.a.edit().putLong(str, nowInMilliseconds).apply();
        return Math.min(nowInMilliseconds - j, 7200000L);
    }

    public final long a(q4 q4Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(q4Var, "target");
        String a2 = a(q4Var.c());
        long j = this.a.getLong(a2, a(z));
        this.a.edit().putLong(a2, 1 + j).apply();
        return j;
    }

    private final String a(String str) {
        return "uri-at-" + str.hashCode();
    }
}
