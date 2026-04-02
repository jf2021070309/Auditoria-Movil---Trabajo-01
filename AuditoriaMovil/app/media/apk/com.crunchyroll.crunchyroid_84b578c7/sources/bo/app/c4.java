package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c4 {
    public static final b d = new b(null);
    private final a5 a;
    private final SharedPreferences b;
    private final SharedPreferences c;

    /* loaded from: classes.dex */
    public static final class a {
        private final String a;
        private final long b;

        public a(String str, long j) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.a = str;
            this.b = j;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "CampaignData(id=" + this.a + ", timestamp=" + this.b + ')';
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
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding push campaign to storage with uid " + this.b;
        }
    }

    public c4(Context context, String str, String str2, z1 z1Var, a5 a5Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        this.a = a5Var;
        this.b = context.getSharedPreferences("com.braze.storage.braze_push_max_storage" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        this.c = context.getSharedPreferences("com.braze.storage.braze_push_max_metadata" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        z1Var.b(d4.class, new com.amazon.aps.iva.y9.d(this, 0));
    }

    public final List a() {
        SharedPreferences sharedPreferences = this.b;
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "pushMaxPrefs");
        return a(sharedPreferences);
    }

    public static final void a(c4 c4Var, d4 d4Var) {
        com.amazon.aps.iva.yb0.j.f(c4Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(d4Var, "it");
        c4Var.b(d4Var.a());
        c4Var.a(d4Var.a());
    }

    public final long b() {
        return this.c.getLong("lastUpdateTime", -1L);
    }

    public final void b(long j) {
        this.c.edit().putLong("lastUpdateTime", j).apply();
    }

    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(str), 3, (Object) null);
        this.b.edit().putLong(str, DateTimeUtils.nowInSeconds()).apply();
    }

    public final void a(long j) {
        SharedPreferences sharedPreferences = this.b;
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "pushMaxPrefs");
        List<a> a2 = a(sharedPreferences);
        SharedPreferences.Editor edit = this.b.edit();
        for (a aVar : a2) {
            if (this.b.getLong(aVar.a(), 0L) < j) {
                edit.remove(aVar.a());
            }
        }
        edit.apply();
    }

    private final List a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        com.amazon.aps.iva.yb0.j.e(all, "this.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            com.amazon.aps.iva.yb0.j.e(key, "campaignId");
            arrayList.add(new a(key, sharedPreferences.getLong(key, 0L)));
        }
        return com.amazon.aps.iva.lb0.x.X0(arrayList);
    }
}
