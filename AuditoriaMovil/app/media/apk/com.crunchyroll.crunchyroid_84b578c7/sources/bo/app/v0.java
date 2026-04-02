package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class v0 {
    public static final a b = new a(null);
    private static final long c = TimeUnit.DAYS.toMillis(7);
    private final SharedPreferences a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final String a(p1 p1Var) {
            com.amazon.aps.iva.yb0.j.f(p1Var, "event");
            String a = y3.j.a(p1Var);
            return p1Var.c() + a;
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Map.Entry b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map.Entry entry) {
            super(0);
            this.b = entry;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get expiration time. Deleting entry: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Event already seen in cache. Ignoring duplicate: " + this.b;
        }
    }

    public v0(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.event_data_validator" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        a();
    }

    private final boolean b(String str) {
        return this.a.contains(str);
    }

    public boolean a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        if (p1Var.c() != a1.PUSH_CLICKED) {
            return true;
        }
        a();
        String a2 = b.a(p1Var);
        if (b(a2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(p1Var), 3, (Object) null);
            return false;
        }
        a(DateTimeUtils.nowInMilliseconds() + c, a2);
        return true;
    }

    private final void a(String str) {
        this.a.edit().remove(str).apply();
    }

    public final void a(long j, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "eventKey");
        this.a.edit().putLong(str, j).apply();
    }

    public final void a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            try {
                Object value = entry.getValue();
                com.amazon.aps.iva.yb0.j.d(value, "null cannot be cast to non-null type kotlin.Long");
                if (nowInMilliseconds >= ((Long) value).longValue()) {
                    String key = entry.getKey();
                    com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                    a(key);
                }
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new b(entry));
                String key2 = entry.getKey();
                com.amazon.aps.iva.yb0.j.e(key2, "entry.key");
                a(key2);
            }
        }
    }
}
