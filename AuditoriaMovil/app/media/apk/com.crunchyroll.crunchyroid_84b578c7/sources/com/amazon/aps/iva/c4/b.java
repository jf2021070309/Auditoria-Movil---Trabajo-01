package com.amazon.aps.iva.c4;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.yb0.l;
import java.io.File;
/* compiled from: PreferenceDataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.h = context;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        Context context = this.h;
        com.amazon.aps.iva.yb0.j.e(context, "applicationContext");
        return x.a0(context, this.i.a);
    }
}
