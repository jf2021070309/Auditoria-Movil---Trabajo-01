package com.amazon.aps.iva.z4;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.yb0.l;
import java.io.File;
/* compiled from: GlanceStateDefinition.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(0);
        this.h = context;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        return x.a0(this.h, this.i);
    }
}
