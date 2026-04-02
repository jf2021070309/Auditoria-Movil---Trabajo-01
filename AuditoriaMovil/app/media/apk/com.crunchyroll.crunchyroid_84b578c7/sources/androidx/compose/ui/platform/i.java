package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class i extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ WrappedComposition h;
    public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(WrappedComposition wrappedComposition, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar) {
        super(2);
        this.h = wrappedComposition;
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        boolean z;
        Set set;
        View view;
        Object obj;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            WrappedComposition wrappedComposition = this.h;
            Object tag = wrappedComposition.b.getTag(R.id.inspection_slot_table_set);
            boolean z2 = true;
            if ((tag instanceof Set) && (!(tag instanceof com.amazon.aps.iva.zb0.a) || (tag instanceof com.amazon.aps.iva.zb0.e))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                set = (Set) tag;
            } else {
                set = null;
            }
            AndroidComposeView androidComposeView = wrappedComposition.b;
            if (set == null) {
                ViewParent parent = androidComposeView.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Set) || ((obj instanceof com.amazon.aps.iva.zb0.a) && !(obj instanceof com.amazon.aps.iva.zb0.e))) {
                    z2 = false;
                }
                if (z2) {
                    set = (Set) obj;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(iVar2.u());
                iVar2.p();
            }
            x0.c(androidComposeView, new g(wrappedComposition, null), iVar2);
            l0.a(new h2[]{com.amazon.aps.iva.z0.a.a.b(set)}, com.amazon.aps.iva.v0.b.b(iVar2, -1193460702, new h(wrappedComposition, this.i)), iVar2, 56);
        }
        return q.a;
    }
}
