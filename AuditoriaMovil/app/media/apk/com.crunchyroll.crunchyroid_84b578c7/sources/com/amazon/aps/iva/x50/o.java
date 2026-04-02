package com.amazon.aps.iva.x50;

import android.os.Bundle;
/* compiled from: Extras.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, CharSequence> {
    public final /* synthetic */ Bundle h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Bundle bundle) {
        super(1);
        this.h = bundle;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(String str) {
        String str2 = str;
        Object obj = this.h.get(str2);
        return str2 + "=" + obj;
    }
}
