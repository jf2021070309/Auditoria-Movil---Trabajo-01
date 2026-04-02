package com.applovin.impl.mediation.a;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes.dex */
public class g {
    private final h a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3341b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3342c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3343d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3344e;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);
    }

    private g(h hVar, com.applovin.impl.mediation.g gVar, String str, String str2) {
        String str3;
        this.a = hVar;
        this.f3343d = str;
        this.f3344e = str2;
        if (gVar != null) {
            this.f3341b = gVar.h();
            str3 = gVar.i();
        } else {
            str3 = null;
            this.f3341b = null;
        }
        this.f3342c = str3;
    }

    public static g a(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            if (gVar != null) {
                return new g(hVar, gVar, str, null);
            }
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static g a(h hVar, String str) {
        return b(hVar, null, str);
    }

    public static g b(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            return new g(hVar, gVar, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public h a() {
        return this.a;
    }

    public String b() {
        return this.f3341b;
    }

    public String c() {
        return this.f3342c;
    }

    public String d() {
        return this.f3343d;
    }

    public String e() {
        return this.f3344e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("SignalCollectionResult{mSignalProviderSpec=");
        y.append(this.a);
        y.append(", mSdkVersion='");
        e.a.d.a.a.J(y, this.f3341b, CoreConstants.SINGLE_QUOTE_CHAR, ", mAdapterVersion='");
        e.a.d.a.a.J(y, this.f3342c, CoreConstants.SINGLE_QUOTE_CHAR, ", mSignalDataLength='");
        String str = this.f3343d;
        y.append(str != null ? str.length() : 0);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append(", mErrorMessage=");
        y.append(this.f3344e);
        y.append('}');
        return y.toString();
    }
}
