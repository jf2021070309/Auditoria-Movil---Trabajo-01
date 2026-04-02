package com.facebook.ads.internal.f;

import java.util.Map;
/* loaded from: classes2.dex */
public class d {
    private double a;
    private double b = System.currentTimeMillis() / 1000.0d;
    private String c;
    private Map<String, String> d;

    public d(double d, String str, Map<String, String> map) {
        this.a = d;
        this.c = str;
        this.d = map;
    }

    public String a() {
        return "debug_crash_report";
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public Map<String, String> e() {
        return this.d;
    }
}
