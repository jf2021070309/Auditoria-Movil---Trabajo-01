package com.amazon.aps.iva.tw;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
/* compiled from: UserDownloadsStore.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.xe.a<b> {
    public e(Context context, Gson gson) {
        super(b.class, context, "user_downloads", gson);
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(b bVar) {
        b bVar2 = bVar;
        j.f(bVar2, "<this>");
        return bVar2.a();
    }
}
