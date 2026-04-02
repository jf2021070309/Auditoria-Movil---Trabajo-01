package com.amazon.aps.iva.f60;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: SmallFramedAddToWatchlistButton.kt */
/* loaded from: classes2.dex */
public final class q {

    /* compiled from: SmallFramedAddToWatchlistButton.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SmallFramedAddToWatchlistButton.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.fs.b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.fs.b bVar) {
            super(0);
            this.h = lVar;
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SmallFramedAddToWatchlistButton.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "watchlist_button");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SmallFramedAddToWatchlistButton.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ WatchlistStatus h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(WatchlistStatus watchlistStatus, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> lVar, int i, int i2) {
            super(2);
            this.h = watchlistStatus;
            this.i = fVar;
            this.j = lVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            q.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r16, com.amazon.aps.iva.a1.f r17, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> r18, com.amazon.aps.iva.o0.i r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f60.q.a(com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
