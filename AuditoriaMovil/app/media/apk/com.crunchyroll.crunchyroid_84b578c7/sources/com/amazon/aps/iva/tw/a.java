package com.amazon.aps.iva.tw;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.downloading.e0;
import com.google.gson.Gson;
/* compiled from: PendingDownloadsStore.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.xe.c<e0.a> {

    /* compiled from: PendingDownloadsStore.kt */
    /* renamed from: com.amazon.aps.iva.tw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0749a extends com.amazon.aps.iva.xe.a<e0.a> {
        public C0749a(Context context, Gson gson) {
            super(e0.a.class, context, "pending_user_downloads_cache", gson);
        }

        @Override // com.amazon.aps.iva.xe.a
        public final String getInternalCacheableId(e0.a aVar) {
            e0.a aVar2 = aVar;
            j.f(aVar2, "<this>");
            return aVar2.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(new C0749a(context, GsonHolder.getInstance()));
        j.f(context, "context");
    }
}
