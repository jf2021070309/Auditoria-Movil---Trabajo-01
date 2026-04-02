package com.amazon.aps.iva.g8;

import java.util.regex.Pattern;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Pattern> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Pattern invoke() {
        String str = this.h.e;
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
