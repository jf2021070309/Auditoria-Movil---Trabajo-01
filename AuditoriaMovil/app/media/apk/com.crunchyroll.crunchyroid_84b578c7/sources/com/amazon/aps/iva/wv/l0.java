package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class l0 extends com.amazon.aps.iva.xe.a<Streams> implements k0 {
    public static final /* synthetic */ int d = 0;
    public final Context b;

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.StreamsCacheImpl", f = "DownloadModelCache.kt", l = {248, 249}, m = "readItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public l0 h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return l0.this.readItem(null, this);
        }
    }

    public l0(Context context) {
        super(Streams.class, context, "streams_cache", GsonHolder.getInstance());
        this.b = context;
    }

    public static Subtitle i(Subtitle subtitle, Subtitle subtitle2) {
        return new Subtitle(subtitle2.getId(), subtitle2.getLocalFilePath(), subtitle.getParentId(), subtitle.getFormat(), subtitle.getLocale(), null, subtitle.getUrl(), 32, null);
    }

    @Override // com.amazon.aps.iva.wv.k0
    public final Object a(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        List<? extends PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(playableAsset.getId());
        }
        Object deleteItems = deleteItems(arrayList, dVar);
        if (deleteItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItems;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Streams streams) {
        Streams streams2 = streams;
        com.amazon.aps.iva.yb0.j.f(streams2, "<this>");
        return streams2.getAssetId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00fd -> B:28:0x0100). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x018e -> B:50:0x018f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x021d -> B:69:0x0223). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(com.ellation.crunchyroll.api.cms.model.streams.Streams r30, com.amazon.aps.iva.ob0.d r31) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.l0.j(com.ellation.crunchyroll.api.cms.model.streams.Streams, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readItem(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.cms.model.streams.Streams> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.l0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.l0$a r0 = (com.amazon.aps.iva.wv.l0.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.l0$a r0 = new com.amazon.aps.iva.wv.l0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.wv.l0 r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L47
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            java.lang.Object r7 = super.readItem(r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            r6 = r5
        L47:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r7 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r7
            r2 = 0
            if (r7 == 0) goto L5a
            r0.h = r2
            r0.k = r3
            java.io.Serializable r7 = r6.j(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r2 = r7
            com.ellation.crunchyroll.api.cms.model.streams.Streams r2 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r2
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.l0.readItem(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
