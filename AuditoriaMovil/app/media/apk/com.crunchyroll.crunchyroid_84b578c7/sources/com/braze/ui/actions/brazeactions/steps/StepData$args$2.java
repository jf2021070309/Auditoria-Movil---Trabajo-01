package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.y;
import com.amazon.aps.iva.ne0.k;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: StepData.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StepData$args$2 extends l implements a<List<? extends Object>> {
    final /* synthetic */ StepData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepData$args$2(StepData stepData) {
        super(0);
        this.this$0 = stepData;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends Object> invoke() {
        Iterator aVar;
        com.amazon.aps.iva.if0.a optJSONArray = this.this$0.getSrcJson().optJSONArray("args");
        if (optJSONArray == null) {
            aVar = y.b;
        } else {
            aVar = new u.a(s.b0(s.V(x.k0(j.T(0, optJSONArray.e())), new StepData$args$2$invoke$$inlined$iterator$1(optJSONArray)), new StepData$args$2$invoke$$inlined$iterator$2(optJSONArray)));
        }
        return s.f0(k.O(aVar));
    }
}
