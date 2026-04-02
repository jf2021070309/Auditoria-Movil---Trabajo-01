package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import java.io.IOException;
import java.util.List;
/* compiled from: AssetSelectionController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.assetselection.AssetSelectionControllerImpl$loadAssets$2", f = "AssetSelectionController.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public h h;
    public int i;
    public final /* synthetic */ h j;

    /* compiled from: AssetSelectionController.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<y, y> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.b<com.amazon.aps.iva.hm.e> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.pe0.b<com.amazon.aps.iva.hm.e> bVar) {
            super(1);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final y invoke(y yVar) {
            y yVar2 = yVar;
            com.amazon.aps.iva.yb0.j.f(yVar2, "$this$set");
            return y.a(yVar2, new g.c(this.h, null));
        }
    }

    /* compiled from: AssetSelectionController.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<y, y> {
        public final /* synthetic */ IOException h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IOException iOException) {
            super(1);
            this.h = iOException;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final y invoke(y yVar) {
            y yVar2 = yVar;
            com.amazon.aps.iva.yb0.j.f(yVar2, "$this$set");
            return y.a(yVar2, new g.a(null, this.h));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.j = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        String str;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        h hVar2 = this.j;
        try {
            if (i != 0) {
                if (i == 1) {
                    hVar = this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                a0 a0Var = hVar2.b;
                AssetType assetType = hVar2.c;
                this.h = hVar2;
                this.i = 1;
                obj = a0Var.c0(assetType, this);
                if (obj == aVar) {
                    return aVar;
                }
                hVar = hVar2;
            }
            List list = (List) obj;
            AssetType assetType2 = hVar2.c;
            AssetType assetType3 = AssetType.AVATAR;
            com.amazon.aps.iva.hm.b bVar = hVar2.e;
            if (assetType2 == assetType3) {
                str = bVar.c;
            } else {
                str = bVar.d;
            }
            com.amazon.aps.iva.gr.n.A(hVar2.f, new a(h.N8(hVar, list, str)));
        } catch (IOException e) {
            com.amazon.aps.iva.gr.n.A(hVar2.f, new b(e));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
