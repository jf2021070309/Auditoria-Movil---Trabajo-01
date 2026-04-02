package com.amazon.aps.iva.q30;

import android.content.Context;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.gson.Gson;
/* compiled from: RecentSearchesCache.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.xe.c<b> implements g {

    /* compiled from: RecentSearchesCache.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.xe.a<b> {
        public a(Context context, Gson gson) {
            super(b.class, context, "recent_search_cache", gson);
        }

        @Override // com.amazon.aps.iva.xe.a
        public final String getInternalCacheableId(b bVar) {
            String id;
            b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "<this>");
            Panel c = bVar2.c();
            if (c == null || (id = c.getId()) == null) {
                MusicAsset b = bVar2.b();
                if (b != null) {
                    return b.getId();
                }
                return "";
            }
            return id;
        }
    }

    public h(Context context) {
        super(new a(context, new Gson()));
    }
}
