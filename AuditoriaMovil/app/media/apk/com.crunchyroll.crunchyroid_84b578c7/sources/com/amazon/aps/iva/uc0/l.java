package com.amazon.aps.iva.uc0;

import java.lang.reflect.Member;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class l extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<Member, Boolean> {
    public static final l b = new l();

    public l() {
        super(1);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return com.amazon.aps.iva.yb0.e0.a(Member.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Member member) {
        Member member2 = member;
        com.amazon.aps.iva.yb0.j.f(member2, "p0");
        return Boolean.valueOf(member2.isSynthetic());
    }
}
