package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.v;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class o {
    private final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private String f4373b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4374c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4375d;

    public o(com.applovin.impl.sdk.m mVar) {
        this.a = mVar;
        this.f4374c = a(com.applovin.impl.sdk.c.d.f3943g, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.f3942f, (Object) null, mVar.L()));
        this.f4375d = a(com.applovin.impl.sdk.c.d.f3944h, (String) mVar.a(com.applovin.impl.sdk.c.b.ad));
        a(d());
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, this.a.L());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, this.a.L());
        return str;
    }

    public static String a(com.applovin.impl.sdk.m mVar) {
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f3945i;
        String str = (String) mVar.a(dVar);
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
            mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) valueOf);
            return valueOf;
        }
        return str;
    }

    private String d() {
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dz)).booleanValue()) {
            this.a.b(com.applovin.impl.sdk.c.d.f3941e);
        }
        String str = (String) this.a.a(com.applovin.impl.sdk.c.d.f3941e);
        if (StringUtils.isValidString(str)) {
            v B = this.a.B();
            B.b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            return str;
        }
        return null;
    }

    public String a() {
        return this.f4373b;
    }

    public void a(String str) {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dz)).booleanValue()) {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f3941e, (com.applovin.impl.sdk.c.d<String>) str);
        }
        this.f4373b = str;
        Bundle bundle = new Bundle();
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.a.ag().a(bundle, "user_info");
    }

    public String b() {
        return this.f4374c;
    }

    public String c() {
        return this.f4375d;
    }
}
