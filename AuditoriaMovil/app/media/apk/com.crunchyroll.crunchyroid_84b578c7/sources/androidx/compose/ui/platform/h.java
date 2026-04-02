package androidx.compose.ui.platform;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class h extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ WrappedComposition h;
    public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(WrappedComposition wrappedComposition, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar) {
        super(2);
        this.h = wrappedComposition;
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            d.a(this.h.b, this.i, iVar2, 8);
        }
        return q.a;
    }
}
