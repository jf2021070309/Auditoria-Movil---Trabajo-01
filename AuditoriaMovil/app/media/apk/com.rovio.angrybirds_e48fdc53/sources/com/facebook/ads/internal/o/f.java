package com.facebook.ads.internal.o;
/* loaded from: classes2.dex */
class f {
    private final a a;
    private final com.facebook.ads.internal.h.c b;
    private final String c;
    private final String d;
    private final String e;

    /* loaded from: classes2.dex */
    enum a {
        UNKNOWN,
        ERROR,
        ADS
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar) {
        this(aVar, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar, com.facebook.ads.internal.h.c cVar, String str, String str2, String str3) {
        this.a = aVar;
        this.b = cVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public com.facebook.ads.internal.h.c a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.e;
    }
}
