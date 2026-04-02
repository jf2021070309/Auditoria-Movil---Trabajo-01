package com.amazon.aps.iva.j40;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.rw.b;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: SyncQualityOptionsProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final List<com.amazon.aps.iva.rw.b> b = f1.K(b.a.g, b.c.g, b.C0686b.g);

    public b(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.j40.a
    public final String a(com.amazon.aps.iva.wg.b bVar) {
        j.f(bVar, "option");
        String string = this.a.getString(bVar.getTitle());
        j.e(string, "context.getString(option.title)");
        return string;
    }

    @Override // com.amazon.aps.iva.j40.a
    public final List<com.amazon.aps.iva.rw.b> getOptions() {
        return this.b;
    }
}
