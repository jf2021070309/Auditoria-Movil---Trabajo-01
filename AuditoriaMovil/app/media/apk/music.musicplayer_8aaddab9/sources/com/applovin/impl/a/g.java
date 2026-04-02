package com.applovin.impl.a;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.q;
/* loaded from: classes.dex */
public class g {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3100b;

    private g(String str, String str2) {
        this.a = str;
        this.f3100b = str2;
    }

    public static g a(q qVar, com.applovin.impl.sdk.m mVar) {
        if (qVar != null) {
            if (mVar != null) {
                try {
                    return new g(qVar.b().get("apiFramework"), qVar.c());
                } catch (Throwable th) {
                    mVar.B().b("VastJavaScriptResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f3100b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.a;
        if (str == null ? gVar.a == null : str.equals(gVar.a)) {
            String str2 = this.f3100b;
            String str3 = gVar.f3100b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3100b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastJavaScriptResource{apiFramework='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", javascriptResourceUrl='");
        y.append(this.f3100b);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
