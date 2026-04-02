package com.amazon.aps.iva.fh;

import android.app.Application;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
/* compiled from: AppLaunchesStore.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.xe.a<a> {
    public e(Application application, Gson gson) {
        super(a.class, application, "app_launches_store", gson);
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(a aVar) {
        a aVar2 = aVar;
        j.f(aVar2, "<this>");
        return aVar2.a();
    }
}
