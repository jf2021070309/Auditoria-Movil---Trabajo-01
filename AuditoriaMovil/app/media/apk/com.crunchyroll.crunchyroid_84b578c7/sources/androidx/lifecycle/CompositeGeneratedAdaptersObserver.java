package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: CompositeGeneratedAdaptersObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements j {
    public final d[] b;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.b = dVarArr;
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        new HashMap();
        d[] dVarArr = this.b;
        for (d dVar : dVarArr) {
            dVar.a();
        }
        for (d dVar2 : dVarArr) {
            dVar2.a();
        }
    }
}
