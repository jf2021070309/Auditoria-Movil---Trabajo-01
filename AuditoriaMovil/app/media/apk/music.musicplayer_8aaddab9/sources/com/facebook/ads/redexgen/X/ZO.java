package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;
/* loaded from: assets/audience_network.dex */
public final class ZO extends C03866m {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public ZO(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC03956v A0G() {
        return new ZP(this);
    }

    public final InterfaceC03956v A0H() {
        return new ZS(this);
    }

    public final InterfaceC03956v A0I() {
        return new ZR(this);
    }

    public final InterfaceC03956v A0J() {
        return new ZT(this);
    }

    public final InterfaceC03956v A0K() {
        return new ZQ(this);
    }
}
