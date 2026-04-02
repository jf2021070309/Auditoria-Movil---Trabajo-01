package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.bt.c;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.expanded.mature.MatureContentEnabledMessage;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/ez/g;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "it", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.expanded.CastControllerPresenterImpl$onCreate$7", f = "CastControllerPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastControllerPresenterImpl$onCreate$7 extends i implements p<g<? extends PlayableAsset>, d<? super q>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CastControllerPresenterImpl this$0;

    /* compiled from: CastControllerPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ellation/crunchyroll/model/PlayableAsset;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/ellation/crunchyroll/model/PlayableAsset;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerPresenterImpl$onCreate$7$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.l<PlayableAsset, q> {
        final /* synthetic */ CastControllerPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CastControllerPresenterImpl castControllerPresenterImpl) {
            super(1);
            this.this$0 = castControllerPresenterImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ q invoke(PlayableAsset playableAsset) {
            invoke2(playableAsset);
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PlayableAsset playableAsset) {
            CastControllerView view;
            view = this.this$0.getView();
            view.showSnackbar(MatureContentEnabledMessage.INSTANCE);
        }
    }

    /* compiled from: CastControllerPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerPresenterImpl$onCreate$7$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        final /* synthetic */ CastControllerPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CastControllerPresenterImpl castControllerPresenterImpl) {
            super(1);
            this.this$0 = castControllerPresenterImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ q invoke(Throwable th) {
            invoke2(th);
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            CastControllerView view;
            CastControllerView view2;
            j.f(th, "it");
            view = this.this$0.getView();
            view.showSnackbar(c.b);
            view2 = this.this$0.getView();
            view2.showMatureBlockedOverlay();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerPresenterImpl$onCreate$7(CastControllerPresenterImpl castControllerPresenterImpl, d<? super CastControllerPresenterImpl$onCreate$7> dVar) {
        super(2, dVar);
        this.this$0 = castControllerPresenterImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        CastControllerPresenterImpl$onCreate$7 castControllerPresenterImpl$onCreate$7 = new CastControllerPresenterImpl$onCreate$7(this.this$0, dVar);
        castControllerPresenterImpl$onCreate$7.L$0 = obj;
        return castControllerPresenterImpl$onCreate$7;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g<? extends PlayableAsset> gVar, d<? super q> dVar) {
        return ((CastControllerPresenterImpl$onCreate$7) create(gVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            g gVar = (g) this.L$0;
            gVar.e(new AnonymousClass1(this.this$0));
            gVar.b(new AnonymousClass2(this.this$0));
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
