package com.applovin.impl.sdk;

import android.content.Context;
/* loaded from: classes.dex */
public class h {
    private static final a a = new a("Age Restricted User", com.applovin.impl.sdk.c.d.l);
    private static final a b = new a("Has User Consent", com.applovin.impl.sdk.c.d.k);
    private static final a c = new a("\"Do Not Sell\"", com.applovin.impl.sdk.c.d.m);

    /* loaded from: classes.dex */
    public static class a {
        private final String a;
        private final com.applovin.impl.sdk.c.d<Boolean> b;

        a(String str, com.applovin.impl.sdk.c.d<Boolean> dVar) {
            this.a = str;
            this.b = dVar;
        }

        public Boolean a(Context context) {
            return (Boolean) com.applovin.impl.sdk.c.e.b(this.b, (Object) null, context);
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
        return a(a, context) + a(b, context) + a(c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.a + " - " + aVar.b(context);
    }

    private static boolean a(com.applovin.impl.sdk.c.d<Boolean> dVar, Boolean bool, Context context) {
        if (context != null) {
            Boolean bool2 = (Boolean) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, context);
            com.applovin.impl.sdk.c.e.a(dVar, bool, context);
            return bool2 == null || bool2 != bool;
        }
        r.i("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
        return false;
    }

    public static boolean a(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.l, Boolean.valueOf(z), context);
    }

    public static a b() {
        return b;
    }

    public static boolean b(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.k, Boolean.valueOf(z), context);
    }

    public static a c() {
        return c;
    }

    public static boolean c(boolean z, Context context) {
        return a(com.applovin.impl.sdk.c.d.m, Boolean.valueOf(z), context);
    }
}
