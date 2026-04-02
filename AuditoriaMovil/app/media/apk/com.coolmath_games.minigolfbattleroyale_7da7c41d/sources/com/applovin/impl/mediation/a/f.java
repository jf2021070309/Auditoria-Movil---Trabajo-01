package com.applovin.impl.mediation.a;
/* loaded from: classes.dex */
public class f {
    private final g a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    /* loaded from: classes.dex */
    public interface a {
        void a(f fVar);
    }

    private f(g gVar, com.applovin.impl.mediation.g gVar2, String str, String str2) {
        String str3;
        this.a = gVar;
        this.d = str;
        this.e = str2;
        if (gVar2 != null) {
            this.b = gVar2.f();
            str3 = gVar2.g();
        } else {
            str3 = null;
            this.b = null;
        }
        this.c = str3;
    }

    public static f a(g gVar, com.applovin.impl.mediation.g gVar2, String str) {
        if (gVar != null) {
            if (gVar2 != null) {
                return new f(gVar, gVar2, str, null);
            }
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static f a(g gVar, String str) {
        return b(gVar, null, str);
    }

    public static f b(g gVar, com.applovin.impl.mediation.g gVar2, String str) {
        if (gVar != null) {
            return new f(gVar, gVar2, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public g a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.a);
        sb.append(", mSdkVersion='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
