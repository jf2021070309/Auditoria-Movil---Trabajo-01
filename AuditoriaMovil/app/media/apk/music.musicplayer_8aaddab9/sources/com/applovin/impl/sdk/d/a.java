package com.applovin.impl.sdk.d;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3960b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f3961c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3962d;

    public a(String str, String str2) {
        this(str, str2, null, false);
    }

    public a(String str, String str2, Map<String, String> map, boolean z) {
        this.a = str;
        this.f3960b = str2;
        this.f3961c = map;
        this.f3962d = z;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f3960b;
    }

    public Map<String, String> c() {
        return this.f3961c;
    }

    public boolean d() {
        return this.f3962d;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AdEventPostback{url='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", backupUrl='");
        e.a.d.a.a.J(y, this.f3960b, CoreConstants.SINGLE_QUOTE_CHAR, ", headers='");
        y.append(this.f3961c);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append(", shouldFireInWebView='");
        y.append(this.f3962d);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
