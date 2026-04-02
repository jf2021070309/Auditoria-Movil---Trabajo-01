package com.ironsource.mediationsdk.adunit.c.b;
/* loaded from: classes2.dex */
public final class a {
    public EnumC0086a a;
    public long b;
    public long c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0086a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(EnumC0086a enumC0086a, long j, long j2) {
        this.a = enumC0086a;
        this.b = j;
        this.c = j2;
    }

    public final boolean a() {
        return this.a == EnumC0086a.MANUAL || this.a == EnumC0086a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        return this.a == EnumC0086a.AUTOMATIC_LOAD_AFTER_CLOSE || this.a == EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
