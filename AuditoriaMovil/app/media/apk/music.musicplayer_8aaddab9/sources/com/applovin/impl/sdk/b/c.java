package com.applovin.impl.sdk.b;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f3910b;

    private c(String str, Map<String, String> map) {
        this.a = str;
        this.f3910b = map;
    }

    public static c a(String str) {
        return a(str, null);
    }

    public static c a(String str, Map<String, String> map) {
        return new c(str, map);
    }

    public Map<String, String> a() {
        return this.f3910b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PendingReward{result='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, "params='");
        y.append(this.f3910b);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
