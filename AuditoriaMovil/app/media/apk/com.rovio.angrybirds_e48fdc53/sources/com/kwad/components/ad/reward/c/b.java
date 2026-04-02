package com.kwad.components.ad.reward.c;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    public int rA;
    public int rz;

    /* renamed from: rx  reason: collision with root package name */
    public static int f8rx = 1;
    public static int STATUS_NONE = 2;
    public static int ry = 3;

    public b() {
        this.rz = STATUS_NONE;
    }

    public b(int i) {
        this.rz = STATUS_NONE;
        this.rz = 1;
    }

    public final void L(int i) {
        this.rA = i;
    }

    public final int getType() {
        return this.rz;
    }

    public final int hb() {
        return this.rA;
    }
}
