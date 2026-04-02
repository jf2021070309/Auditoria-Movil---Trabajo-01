package com.amazon.aps.iva.uo;

import com.amazon.aps.iva.wo.i;
import com.amazon.aps.iva.x50.t;
import com.crunchyroll.crunchyroid.R;
/* compiled from: WatchScreenAssetHeaderFactory.kt */
/* loaded from: classes2.dex */
public final class a implements d {
    public final t a;

    /* compiled from: WatchScreenAssetHeaderFactory.kt */
    /* renamed from: com.amazon.aps.iva.uo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0770a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public a(t tVar) {
        this.a = tVar;
    }

    @Override // com.amazon.aps.iva.uo.d
    public final i a(t tVar) {
        t tVar2;
        if (tVar == null) {
            tVar2 = this.a;
        } else {
            tVar2 = tVar;
        }
        int i = C0770a.a[tVar2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new i("synced_header_videos", R.string.watch_page_header_synced_videos);
            }
            throw new IllegalArgumentException("Unsupported type " + tVar);
        }
        return new i("header_next_synced_episode", R.string.watch_page_header_next_synced_episode);
    }
}
