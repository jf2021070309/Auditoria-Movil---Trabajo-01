package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.Gender;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.google.android.gms.common.Scopes;
/* loaded from: classes.dex */
public final class l6 extends bo.app.a {
    public static final a g = new a(null);
    private final c2 b;
    private final v4 c;
    private final SharedPreferences d;
    private final SharedPreferences e;
    private String f;

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
            return "No push token available to add to attributes object.";
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
            return "Couldn't add push token to outbound json";
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
            return "Could not create custom attributes json object from preferences";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add merged custom attributes back to user object.";
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
            return "Push token cache cleared.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        public g() {
            super(1);
        }

        public final void a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "it");
            l6.this.c("user_id", str);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to load user object json from prefs with json string: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ com.amazon.aps.iva.if0.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = str;
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.b + "] value: [" + this.c + "] ";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Could not write to custom attributes json object with key: [");
            sb.append(this.b);
            sb.append("] value: [");
            return defpackage.b.b(sb, this.c, ']');
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Failed to write to user object json from prefs with key: [");
            sb.append(this.b);
            sb.append("] value: [");
            return defpackage.b.b(sb, this.c, ']');
        }
    }

    public /* synthetic */ l6(Context context, c2 c2Var, v4 v4Var, String str, String str2, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, c2Var, v4Var, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }

    private final com.amazon.aps.iva.if0.c e() {
        com.amazon.aps.iva.if0.c f2 = f();
        if (f2.has("custom")) {
            try {
                com.amazon.aps.iva.if0.c jSONObject = f2.getJSONObject("custom");
                com.amazon.aps.iva.yb0.j.e(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
            }
        }
        return new com.amazon.aps.iva.if0.c();
    }

    public final synchronized boolean c(String str) {
        return c(Scopes.EMAIL, str);
    }

    public final com.amazon.aps.iva.if0.c f() {
        String string = this.d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new com.amazon.aps.iva.if0.c();
        }
        try {
            return new com.amazon.aps.iva.if0.c(string);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new h(string));
            return new com.amazon.aps.iva.if0.c();
        }
    }

    public final synchronized void g(String str) {
        c("last_name", str);
    }

    public final synchronized boolean h(String str) {
        return c("phone", str);
    }

    public final synchronized void i(String str) {
        this.f = str;
        c("user_id", str);
    }

    public l6(Context context, c2 c2Var, v4 v4Var, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(c2Var, "pushRegistrationDataProvider");
        com.amazon.aps.iva.yb0.j.f(v4Var, "sdkEnablementProvider");
        this.b = c2Var;
        this.c = v4Var;
        this.f = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.user_cache.v3" + cacheFileSuffix, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.user_cache.push_token_store" + cacheFileSuffix, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.e = sharedPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(String str, Object obj) {
        Object obj2;
        com.amazon.aps.iva.if0.c f2 = f();
        if (obj == null) {
            try {
                obj2 = com.amazon.aps.iva.if0.c.NULL;
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new l(str, obj));
                return false;
            }
        } else {
            obj2 = obj;
        }
        f2.put(str, obj2);
        return b(f2);
    }

    public final synchronized void a(Gender gender) {
        c("gender", gender != null ? gender.forJsonPut() : null);
    }

    public final synchronized boolean b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "dateString");
        return c("dob", str);
    }

    public final synchronized void d(String str) {
        c("first_name", str);
    }

    public final synchronized void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.b, 2, (Object) null);
        this.e.edit().clear().apply();
    }

    @Override // bo.app.a
    /* renamed from: h */
    public p3 d() {
        StringUtils.ifNonEmpty(this.f, new g());
        com.amazon.aps.iva.if0.c f2 = f();
        a(f2);
        this.d.edit().clear().apply();
        return new p3(f2);
    }

    public final synchronized void a(String str) {
        c("country", str);
    }

    public final synchronized void b(NotificationSubscriptionType notificationSubscriptionType) {
        c("push_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.forJsonPut() : null);
    }

    public final synchronized void a(NotificationSubscriptionType notificationSubscriptionType) {
        c("email_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.forJsonPut() : null);
    }

    private final boolean b(com.amazon.aps.iva.if0.c cVar) {
        if (this.c.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }
        this.d.edit().putString("user_cache_attributes_object", cVar.toString()).apply();
        return true;
    }

    public final synchronized void a(AttributionData attributionData) {
        a("ab_install_attribution", attributionData != null ? attributionData.forJsonPut() : null);
    }

    public final synchronized void f(String str) {
        c("language", str);
    }

    public final synchronized boolean a(String str, Object obj) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        return b(str, obj);
    }

    public final synchronized void e(String str) {
        c("home_city", str);
    }

    public final void a(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "outboundJson");
        try {
            String a2 = this.b.a();
            if (a2 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            } else if (com.amazon.aps.iva.yb0.j.a(a2, this.e.getString("push_token", null))) {
            } else {
                cVar.put("push_token", a2);
            }
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
        }
    }

    public final boolean b(String str, Object obj) {
        Object obj2;
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.if0.c e2 = e();
        if (obj == null) {
            try {
                obj2 = com.amazon.aps.iva.if0.c.NULL;
            } catch (com.amazon.aps.iva.if0.b e3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, new k(str, obj));
                return false;
            }
        } else {
            obj2 = obj;
        }
        e2.put(str, obj2);
        return c("custom", e2);
    }

    @Override // bo.app.a
    /* renamed from: a */
    public void b(p3 p3Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(p3Var, "outboundObject");
        com.amazon.aps.iva.if0.c v = p3Var.v();
        if (z) {
            if (v.has("push_token")) {
                this.e.edit().putString("push_token", v.optString("push_token")).apply();
                return;
            }
            return;
        }
        com.amazon.aps.iva.if0.c f2 = f();
        com.amazon.aps.iva.if0.c plus = JsonUtils.plus(v, f2);
        plus.remove("push_token");
        com.amazon.aps.iva.if0.c optJSONObject = f2.optJSONObject("custom");
        com.amazon.aps.iva.if0.c optJSONObject2 = v.optJSONObject("custom");
        try {
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            plus.put("custom", JsonUtils.plus(optJSONObject2, optJSONObject));
        } else if (optJSONObject != null) {
            plus.put("custom", optJSONObject);
        } else {
            if (optJSONObject2 != null) {
                plus.put("custom", optJSONObject2);
            }
            this.d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
        }
        this.d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    public final boolean a(String str, com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.if0.c f2 = f();
        try {
            if (cVar == null) {
                f2.put(str, com.amazon.aps.iva.if0.c.NULL);
            } else {
                com.amazon.aps.iva.if0.c optJSONObject = f2.optJSONObject(str);
                if (optJSONObject != null) {
                    f2.put(str, JsonUtils.plus(optJSONObject, cVar));
                } else {
                    f2.put(str, cVar);
                }
            }
            str = b(f2);
            return str;
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new i(str, cVar));
            return false;
        }
    }
}
