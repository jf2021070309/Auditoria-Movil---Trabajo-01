package com.crunchyroll.datadog;

import android.content.Context;
import com.amazon.aps.iva.bd.c;
import com.amazon.aps.iva.ec.d;
import com.amazon.aps.iva.yb0.j;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.datadog.android.glide.DatadogGlideModule;
import kotlin.Metadata;
/* compiled from: DatadogGlideModuleWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/datadog/DatadogGlideModuleWrapper;", "Lcom/amazon/aps/iva/bd/c;", "datadog_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatadogGlideModuleWrapper implements c {
    public final DatadogGlideModule a = new DatadogGlideModule(null, 0.0f, 3, null);

    @Override // com.amazon.aps.iva.bd.b
    public final void applyOptions(Context context, b bVar) {
        j.f(context, "context");
        this.a.applyOptions(context, bVar);
    }

    @Override // com.amazon.aps.iva.bd.f
    public final void registerComponents(Context context, a aVar, d dVar) {
        j.f(aVar, "glide");
        this.a.registerComponents(context, aVar, dVar);
    }
}
