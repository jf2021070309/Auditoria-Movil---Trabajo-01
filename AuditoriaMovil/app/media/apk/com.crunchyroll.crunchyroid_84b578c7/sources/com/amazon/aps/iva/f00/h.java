package com.amazon.aps.iva.f00;

import android.content.Context;
import com.amazon.aps.iva.wv.e0;
import com.amazon.aps.iva.wv.f0;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
/* compiled from: OfflinePlayableAssetUiModelFactory.kt */
/* loaded from: classes2.dex */
public final class h extends r {
    public final e0 h;
    public final com.amazon.aps.iva.m00.c<Season> i;
    public final boolean j;

    /* compiled from: OfflinePlayableAssetUiModelFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.assets.list.item.OfflinePlayableAssetUiModelFactory", f = "OfflinePlayableAssetUiModelFactory.kt", l = {39, 46}, m = "createFromAssets")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public h h;
        public h i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return h.this.b(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, com.amazon.aps.iva.at.c cVar, com.amazon.aps.iva.mt.m mVar, DurationFormatter durationFormatter, SmallDurationFormatter smallDurationFormatter, InternalDownloadsManager internalDownloadsManager, f0 f0Var, com.amazon.aps.iva.m00.d dVar, boolean z) {
        super(context, cVar, mVar, durationFormatter, smallDurationFormatter, internalDownloadsManager, false, 192);
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.yb0.j.f(smallDurationFormatter, "smallDurationFormatter");
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        this.h = f0Var;
        this.i = dVar;
        this.j = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    @Override // com.amazon.aps.iva.f00.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r31, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead> r32, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.commenting.model.Guestbook> r33, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.f00.a>> r34) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f00.h.b(java.util.List, java.util.Map, java.util.Map, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b7 -> B:31:0x00ba). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r10, com.amazon.aps.iva.ob0.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.f00.i
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.f00.i r0 = (com.amazon.aps.iva.f00.i) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            com.amazon.aps.iva.f00.i r0 = new com.amazon.aps.iva.f00.i
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.m
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.util.List r10 = r0.l
            java.util.List r10 = (java.util.List) r10
            java.lang.String r2 = r0.k
            java.util.Iterator r4 = r0.j
            java.util.List r5 = r0.i
            java.util.List r5 = (java.util.List) r5
            com.amazon.aps.iva.f00.h r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Lba
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            com.amazon.aps.iva.ab.x.i0(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L4f:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r10.next()
            r5 = r4
            com.amazon.aps.iva.f00.a r5 = (com.amazon.aps.iva.f00.a) r5
            boolean r6 = r5 instanceof com.amazon.aps.iva.f00.q
            if (r6 == 0) goto L65
            com.amazon.aps.iva.f00.q r5 = (com.amazon.aps.iva.f00.q) r5
            java.lang.String r5 = r5.h
            goto L67
        L65:
            java.lang.String r5 = ""
        L67:
            java.lang.Object r6 = r2.get(r5)
            if (r6 != 0) goto L75
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.put(r5, r6)
        L75:
            java.util.List r6 = (java.util.List) r6
            r6.add(r4)
            goto L4f
        L7b:
            java.util.Set r10 = r2.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r4 = r10
            r5 = r11
        L86:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto Ldd
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            com.amazon.aps.iva.wv.e0 r11 = r6.h
            r0.h = r6
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            r0.i = r7
            r0.j = r4
            r0.k = r2
            r7 = r10
            java.util.List r7 = (java.util.List) r7
            r0.l = r7
            r0.o = r3
            java.lang.Object r11 = r11.readItem(r2, r0)
            if (r11 != r1) goto Lba
            return r1
        Lba:
            com.ellation.crunchyroll.api.cms.model.Season r11 = (com.ellation.crunchyroll.api.cms.model.Season) r11
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)
            r2 = r2 ^ r3
            if (r2 == 0) goto Ld7
            if (r11 == 0) goto Ld7
            com.amazon.aps.iva.f00.v r2 = new com.amazon.aps.iva.f00.v
            java.lang.String r7 = r11.getId()
            com.amazon.aps.iva.m00.c<com.ellation.crunchyroll.api.cms.model.Season> r8 = r6.i
            java.lang.String r11 = r8.f(r11)
            r2.<init>(r7, r11)
            r5.add(r2)
        Ld7:
            java.util.Collection r10 = (java.util.Collection) r10
            r5.addAll(r10)
            goto L86
        Ldd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f00.h.e(java.util.ArrayList, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
