package androidx.compose.ui.platform;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: Wrapper.android.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ WrappedComposition i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WrappedComposition wrappedComposition, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = wrappedComposition;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            AndroidComposeView androidComposeView = this.i.b;
            this.h = 1;
            Object b = androidComposeView.n.b(this);
            if (b != aVar) {
                b = q.a;
            }
            if (b == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
