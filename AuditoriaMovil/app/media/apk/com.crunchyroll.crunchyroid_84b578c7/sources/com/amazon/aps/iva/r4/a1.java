package com.amazon.aps.iva.r4;

import android.content.Context;
import java.io.File;
/* compiled from: WidgetLayout.kt */
/* loaded from: classes.dex */
public final class a1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, String str) {
        super(0);
        this.h = context;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        return com.amazon.aps.iva.e.w.y(this.h, this.i);
    }
}
