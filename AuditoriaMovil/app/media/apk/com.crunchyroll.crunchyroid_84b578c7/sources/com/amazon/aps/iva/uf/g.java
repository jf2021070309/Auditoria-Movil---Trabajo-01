package com.amazon.aps.iva.uf;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.uf.a;
import com.amazon.aps.iva.uf.b;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: RatingControlsPresenter.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.b<c> implements f {
    public final com.amazon.aps.iva.sf.b b;
    public e c;
    public com.amazon.aps.iva.uf.b d;

    /* compiled from: RatingControlsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {

        /* compiled from: RatingControlsPresenter.kt */
        /* renamed from: com.amazon.aps.iva.uf.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0766a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.DISLIKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.LIKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.NOT_RATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b.c cVar;
            int i;
            e eVar;
            g gVar = g.this;
            com.amazon.aps.iva.uf.b bVar = gVar.d;
            h hVar = null;
            if (bVar != null) {
                if (bVar instanceof b.c) {
                    cVar = (b.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    hVar = cVar.a;
                }
                if (hVar == null) {
                    i = -1;
                } else {
                    i = C0766a.a[hVar.ordinal()];
                }
                if (i != 1) {
                    if ((i == 2 || i == 3) && (eVar = gVar.c) != null) {
                        eVar.B6(a.C0764a.a);
                    }
                } else {
                    e eVar2 = gVar.c;
                    if (eVar2 != null) {
                        eVar2.B6(a.c.a);
                    }
                }
                gVar.getView().performHapticFeedback();
                return q.a;
            }
            j.m("state");
            throw null;
        }
    }

    /* compiled from: RatingControlsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {

        /* compiled from: RatingControlsPresenter.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.LIKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.DISLIKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.NOT_RATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b.c cVar;
            int i;
            e eVar;
            g gVar = g.this;
            com.amazon.aps.iva.uf.b bVar = gVar.d;
            h hVar = null;
            if (bVar != null) {
                if (bVar instanceof b.c) {
                    cVar = (b.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    hVar = cVar.a;
                }
                if (hVar == null) {
                    i = -1;
                } else {
                    i = a.a[hVar.ordinal()];
                }
                if (i != 1) {
                    if ((i == 2 || i == 3) && (eVar = gVar.c) != null) {
                        eVar.B6(a.b.a);
                    }
                } else {
                    e eVar2 = gVar.c;
                    if (eVar2 != null) {
                        eVar2.B6(a.c.a);
                    }
                }
                gVar.getView().performHapticFeedback();
                return q.a;
            }
            j.m("state");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, com.amazon.aps.iva.sf.b bVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        this.b = bVar;
        this.c = null;
    }

    @Override // com.amazon.aps.iva.uf.f
    public final void Q5() {
        this.b.G(new a());
    }

    public final void q6() {
        getView().ah();
        getView().Bh();
        getView().Q1(new com.amazon.aps.iva.j50.d("—", 0, false, false, 7));
        getView().a9(new com.amazon.aps.iva.j50.d("—", 0, false, false, 7));
    }

    @Override // com.amazon.aps.iva.uf.f
    public final void y1() {
        this.b.G(new b());
    }
}
