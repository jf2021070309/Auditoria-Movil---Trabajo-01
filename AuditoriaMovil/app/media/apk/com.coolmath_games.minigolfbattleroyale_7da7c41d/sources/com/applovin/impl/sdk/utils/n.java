package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.r;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class n {
    private final com.applovin.impl.sdk.k a;
    private String b;
    private final String c;
    private final String d;

    public n(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.c = a(com.applovin.impl.sdk.c.d.g, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.f, (Object) null, kVar.J()));
        this.d = a(com.applovin.impl.sdk.c.d.h, (String) kVar.a(com.applovin.impl.sdk.c.b.W));
        a(d());
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, this.a.J());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, this.a.J());
        return str;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        String str = (String) kVar.a(com.applovin.impl.sdk.c.d.i);
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
            kVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.i, (com.applovin.impl.sdk.c.d<String>) valueOf);
            return valueOf;
        }
        return str;
    }

    private String d() {
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            this.a.b(com.applovin.impl.sdk.c.d.e);
        }
        String str = (String) this.a.a(com.applovin.impl.sdk.c.d.e);
        if (StringUtils.isValidString(str)) {
            r z = this.a.z();
            z.b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            return str;
        }
        return null;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.e, (com.applovin.impl.sdk.c.d<String>) str);
        }
        this.b = str;
        Bundle bundle = new Bundle();
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.a.af().a(bundle, "user_info");
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}
