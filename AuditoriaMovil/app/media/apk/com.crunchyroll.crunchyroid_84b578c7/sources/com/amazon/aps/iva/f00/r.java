package com.amazon.aps.iva.f00;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.commenting.model.Guestbook;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PlayableAssetUiModelFactory.kt */
/* loaded from: classes2.dex */
public class r {
    public final com.amazon.aps.iva.at.a a;
    public final com.amazon.aps.iva.mt.l b;
    public final DurationFormatter c;
    public final SmallDurationFormatter d;
    public final com.amazon.aps.iva.fg.c e;
    public final int f;
    public final boolean g;

    /* compiled from: PlayableAssetUiModelFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.assets.list.item.PlayableAssetUiModelFactory", f = "PlayableAssetUiModelFactory.kt", l = {81}, m = "create")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public r h;
        public PlayableAsset i;
        public String j;
        public List k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public com.amazon.aps.iva.ot.a q;
        public List r;
        public LabelUiModel s;
        public int t;
        public int u;
        public int v;
        public boolean w;
        public /* synthetic */ Object x;
        public int z;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.x = obj;
            this.z |= Integer.MIN_VALUE;
            return r.this.a(null, null, null, 0, this);
        }
    }

    /* compiled from: PlayableAssetUiModelFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.assets.list.item.PlayableAssetUiModelFactory", f = "PlayableAssetUiModelFactory.kt", l = {53}, m = "createFromAssets$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public r h;
        public Map i;
        public Map j;
        public List k;
        public Collection l;
        public Iterator m;
        public List n;
        public Collection o;
        public int p;
        public /* synthetic */ Object q;
        public int s;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.q = obj;
            this.s |= Integer.MIN_VALUE;
            return r.c(r.this, null, null, null, this);
        }
    }

    public r(Context context, com.amazon.aps.iva.at.c cVar, com.amazon.aps.iva.mt.m mVar, DurationFormatter durationFormatter, SmallDurationFormatter smallDurationFormatter, InternalDownloadsManager internalDownloadsManager, boolean z, int i) {
        int i2;
        if ((i & 64) != 0) {
            i2 = context.getResources().getInteger(R.integer.empty_assets_cards_count);
        } else {
            i2 = 0;
        }
        z = (i & 128) != 0 ? false : z;
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.yb0.j.f(smallDurationFormatter, "smallDurationFormatter");
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        this.a = cVar;
        this.b = mVar;
        this.c = durationFormatter;
        this.d = smallDurationFormatter;
        this.e = internalDownloadsManager;
        this.f = i2;
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f5 -> B:30:0x00fd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(com.amazon.aps.iva.f00.r r18, java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r19, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead> r20, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.commenting.model.Guestbook> r21, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.f00.a>> r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f00.r.c(com.amazon.aps.iva.f00.r, java.util.List, java.util.Map, java.util.Map, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.ellation.crunchyroll.model.PlayableAsset r34, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead> r35, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.commenting.model.Guestbook> r36, int r37, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.f00.a> r38) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f00.r.a(com.ellation.crunchyroll.model.PlayableAsset, java.util.Map, java.util.Map, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public Object b(List<? extends PlayableAsset> list, Map<String, Playhead> map, Map<String, Guestbook> map2, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.f00.a>> dVar) {
        return c(this, list, map, map2, dVar);
    }

    public Object d(List<? extends PlayableAsset> list, Map<String, Playhead> map, Map<String, Guestbook> map2, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.f00.a>> dVar) {
        return b(list, map, map2, dVar);
    }
}
