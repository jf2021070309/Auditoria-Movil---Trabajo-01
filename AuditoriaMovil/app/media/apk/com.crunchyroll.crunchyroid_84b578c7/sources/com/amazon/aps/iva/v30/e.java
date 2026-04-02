package com.amazon.aps.iva.v30;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.search.SearchItemsContainer;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import com.ellation.crunchyroll.model.search.SearchResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: SearchResultDetailInteractor.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.a implements d {
    public final EtpContentService b;
    public final com.amazon.aps.iva.at.d c;
    public final com.amazon.aps.iva.yh.c d;
    public List<? extends com.amazon.aps.iva.s30.h> e = z.b;
    public int f;
    public int g;

    /* compiled from: SearchResultDetailInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SearchItemsContainerType.values().length];
            try {
                iArr[SearchItemsContainerType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* compiled from: SearchResultDetailInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailInteractorImpl", f = "SearchResultDetailInteractor.kt", l = {64}, m = FirebaseAnalytics.Event.SEARCH)
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public e h;
        public SearchItemsContainerType i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return e.this.c1(null, null, this);
        }
    }

    public e(EtpContentService etpContentService, com.amazon.aps.iva.at.f fVar, com.amazon.aps.iva.yh.d dVar) {
        this.b = etpContentService;
        this.c = fVar;
        this.d = dVar;
    }

    public final List<com.amazon.aps.iva.s30.h> C(SearchResponse searchResponse) {
        boolean z;
        if (searchResponse == null) {
            return z.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : searchResponse.getPanelsContainers()) {
            if (((SearchItemsContainer) obj).getType() == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<Panel> items = ((SearchItemsContainer) it.next()).getItems();
            ArrayList arrayList3 = new ArrayList(r.Y(items));
            for (Panel panel : items) {
                arrayList3.add(com.amazon.aps.iva.s30.i.b(panel));
            }
            t.d0(arrayList2, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it2 = searchResponse.getMusicItemsContainers().iterator();
        while (it2.hasNext()) {
            List<MusicAsset> items2 = ((SearchItemsContainer) it2.next()).getItems();
            ArrayList arrayList5 = new ArrayList(r.Y(items2));
            for (MusicAsset musicAsset : items2) {
                arrayList5.add(com.amazon.aps.iva.s30.i.a(musicAsset, this.c, this.d));
            }
            t.d0(arrayList4, arrayList5);
        }
        return x.L0(arrayList4, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v28 */
    @Override // com.amazon.aps.iva.v30.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(java.lang.String r15, com.ellation.crunchyroll.model.search.SearchItemsContainerType r16, com.amazon.aps.iva.ez.j r17, com.amazon.aps.iva.ez.j r18, com.amazon.aps.iva.ob0.d r19) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v30.e.U0(java.lang.String, com.ellation.crunchyroll.model.search.SearchItemsContainerType, com.amazon.aps.iva.ez.j, com.amazon.aps.iva.ez.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // com.amazon.aps.iva.v30.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(java.lang.String r9, com.ellation.crunchyroll.model.search.SearchItemsContainerType r10, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.s30.h>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.v30.e.b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.v30.e$b r0 = (com.amazon.aps.iva.v30.e.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.v30.e$b r0 = new com.amazon.aps.iva.v30.e$b
            r0.<init>(r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.j
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.l
            r7 = 1
            if (r1 == 0) goto L34
            if (r1 != r7) goto L2c
            com.ellation.crunchyroll.model.search.SearchItemsContainerType r10 = r6.i
            com.amazon.aps.iva.v30.e r9 = r6.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L4f
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r8.b
            r3 = 20
            r4 = 0
            java.lang.String r5 = r10.getKey()
            r6.h = r8
            r6.i = r10
            r6.l = r7
            r2 = r9
            java.lang.Object r11 = r1.search(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4e
            return r0
        L4e:
            r9 = r8
        L4f:
            com.ellation.crunchyroll.model.search.SearchResponse r11 = (com.ellation.crunchyroll.model.search.SearchResponse) r11
            r0 = 20
            r9.f = r0
            java.util.List r0 = r9.C(r11)
            r9.e = r0
            int[] r0 = com.amazon.aps.iva.v30.e.a.a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 0
            if (r10 != r7) goto L82
            java.util.List r10 = r11.getMusicItemsContainers()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L70:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9e
            java.lang.Object r11 = r10.next()
            com.ellation.crunchyroll.model.search.SearchItemsContainer r11 = (com.ellation.crunchyroll.model.search.SearchItemsContainer) r11
            int r11 = r11.getTotalCount()
            int r0 = r0 + r11
            goto L70
        L82:
            java.util.List r10 = r11.getPanelsContainers()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L8c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9e
            java.lang.Object r11 = r10.next()
            com.ellation.crunchyroll.model.search.SearchItemsContainer r11 = (com.ellation.crunchyroll.model.search.SearchItemsContainer) r11
            int r11 = r11.getTotalCount()
            int r0 = r0 + r11
            goto L8c
        L9e:
            r9.g = r0
            java.util.List<? extends com.amazon.aps.iva.s30.h> r9 = r9.e
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v30.e.c1(java.lang.String, com.ellation.crunchyroll.model.search.SearchItemsContainerType, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
