package com.applovin.impl.sdk;

import android.content.Context;
/* loaded from: classes.dex */
public class j {
    private static final a a = new a("Age Restricted User", com.applovin.impl.sdk.c.d.f3948l);

    /* renamed from: b  reason: collision with root package name */
    private static final a f4114b = new a("Has User Consent", com.applovin.impl.sdk.c.d.f3947k);

    /* renamed from: c  reason: collision with root package name */
    private static final a f4115c = new a("\"Do Not Sell\"", com.applovin.impl.sdk.c.d.f3949m);

    /* loaded from: classes.dex */
    public static class a {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.c.d<Boolean> f4116b;

        public a(String str, com.applovin.impl.sdk.c.d<Boolean> dVar) {
            this.a = str;
            this.f4116b = dVar;
        }

        public Boolean a(Context context) {
            return (Boolean) com.applovin.impl.sdk.c.e.b(this.f4116b, (Object) null, context);
        }

        public String a() {
            return this.a;
        }

        public String b(Context context) {
            Boolean a = a(context);
            return a != null ? a.toString() : "No value set";
        }
    }

    public static a a() {
        return a;
    }

    public static String a(Context context) {
        return a(a, context) + a(f4114b, context) + a(f4115c, context);
    }

    private static String a(a aVar, Context context) {
        StringBuilder y = e.a.d.a.a.y("\n");
        y.append(aVar.a);
        y.append(" - ");
        y.append(aVar.b(context));
        return y.toString();
    }

    private static boolean a(com.applovin.impl.sdk.c.d<Boolean> dVar, Boolean bool, Context context) {
        if (context != null) {
            Boolean bool2 = (Boolean) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, context);
            com.applovin.impl.sdk.c.e.a(dVar, bool, context);
            return bool2 == null || bool2 != bool;
        }
        v.i("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
        return false;
    }

    public static boolean a(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.f3948l, Boolean.valueOf(z), context);
    }

    public static a b() {
        return f4114b;
    }

    public static boolean b(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.f3947k, Boolean.valueOf(z), context);
    }

    public static a c() {
        return f4115c;
    }

    public static boolean c(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.f3949m, Boolean.valueOf(z), context);
    }
}
