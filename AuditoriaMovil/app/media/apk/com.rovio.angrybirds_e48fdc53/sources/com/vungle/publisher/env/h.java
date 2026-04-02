package com.vungle.publisher.env;
/* loaded from: classes4.dex */
public class h implements n {
    private final String a;
    private final String b;
    private final WrapperFramework c;
    private final String d;

    public h(String str, String str2, WrapperFramework wrapperFramework, String str3) {
        this.a = str;
        this.b = str2;
        this.c = wrapperFramework;
        this.d = str3;
    }

    @Override // com.vungle.publisher.env.n
    public String a() {
        return this.a;
    }

    @Override // com.vungle.publisher.env.n
    public String b() {
        return this.b;
    }

    @Override // com.vungle.publisher.env.n
    public String c() {
        return this.d;
    }
}
