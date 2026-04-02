package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: ShowPageAnalytics.kt */
/* loaded from: classes2.dex */
public final class p implements o {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> b;
    public final com.amazon.aps.iva.ls.a c;
    public com.amazon.aps.iva.fs.c d;

    /* compiled from: ShowPageAnalytics.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.x50.t.values().length];
            try {
                iArr[com.amazon.aps.iva.x50.t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public p(com.amazon.aps.iva.x50.t tVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.ls.a aVar2;
        this.b = aVar;
        int i = a.a[tVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                aVar2 = com.amazon.aps.iva.ls.a.MOVIE;
            } else {
                throw new IllegalArgumentException("Unsupported resource type " + tVar);
            }
        } else {
            aVar2 = com.amazon.aps.iva.ls.a.SERIES;
        }
        this.c = aVar2;
        this.d = (com.amazon.aps.iva.fs.c) aVar.invoke();
    }

    @Override // com.amazon.aps.iva.l40.o
    public final void b() {
        this.d = this.b.invoke();
    }

    @Override // com.amazon.aps.iva.l40.o
    public final com.amazon.aps.iva.ls.a b1() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.l40.o
    public final void c1(ContentContainer contentContainer) {
        com.amazon.aps.iva.ls.a aVar = this.c;
        float a2 = this.d.a();
        com.amazon.aps.iva.ks.e eVar = null;
        if (contentContainer != null) {
            com.amazon.aps.iva.xb0.l lVar = com.amazon.aps.iva.e.w.e;
            if (lVar != null) {
                eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480);
            } else {
                com.amazon.aps.iva.yb0.j.m("getChannelById");
                throw null;
            }
        }
        this.a.c(defpackage.i.s(aVar, a2, eVar, null, null, new com.amazon.aps.iva.is.a[0], 24));
    }
}
