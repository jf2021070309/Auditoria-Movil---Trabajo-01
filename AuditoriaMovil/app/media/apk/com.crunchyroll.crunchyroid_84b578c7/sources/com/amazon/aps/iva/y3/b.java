package com.amazon.aps.iva.y3;

import android.content.Context;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.File;
/* compiled from: DataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<File> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ c<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c<Object> cVar) {
        super(0);
        this.h = context;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final File invoke() {
        Context context = this.h;
        j.e(context, "applicationContext");
        return w.y(context, this.i.a);
    }
}
