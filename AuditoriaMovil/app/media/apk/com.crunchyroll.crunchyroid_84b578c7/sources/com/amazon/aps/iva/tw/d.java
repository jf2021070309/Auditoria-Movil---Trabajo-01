package com.amazon.aps.iva.tw;

import android.content.Context;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.wv.w;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UserDownloadsStore.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.xe.c<w> implements c {

    /* compiled from: UserDownloadsStore.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.xe.a<w> {
        public a(Context context, Gson gson) {
            super(w.class, context, "user_downloads_order", gson);
        }

        @Override // com.amazon.aps.iva.xe.a
        public final String getInternalCacheableId(w wVar) {
            w wVar2 = wVar;
            j.f(wVar2, "<this>");
            return wVar2.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(new a(context, GsonHolder.getInstance()));
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.tw.c
    public final void P0(String... strArr) {
        boolean z;
        j.f(strArr, "downloadId");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        w y0 = y0();
        List I0 = x.I0(y0.c(), strArr);
        ArrayList arrayList = new ArrayList(I0.size() + strArr.length);
        arrayList.addAll(I0);
        t.e0(arrayList, strArr);
        m1(w.a(y0, arrayList));
    }

    @Override // com.amazon.aps.iva.tw.c
    public final void p(String... strArr) {
        j.f(strArr, "downloadId");
        w y0 = y0();
        m1(w.a(y0, x.I0(y0.c(), strArr)));
    }

    @Override // com.amazon.aps.iva.tw.c
    public final w y0() {
        w v = v("user_downloads_order_key");
        if (v == null) {
            return new w("user_downloads_order_key", z.b);
        }
        return v;
    }
}
