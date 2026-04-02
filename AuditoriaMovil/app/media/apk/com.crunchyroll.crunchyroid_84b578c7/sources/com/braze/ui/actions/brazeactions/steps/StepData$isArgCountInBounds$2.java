package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.ec0.j;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
import kotlin.Metadata;
/* compiled from: StepData.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StepData$isArgCountInBounds$2 extends l implements a<String> {
    final /* synthetic */ j $rangedArgCount;
    final /* synthetic */ StepData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepData$isArgCountInBounds$2(j jVar, StepData stepData) {
        super(0);
        this.$rangedArgCount = jVar;
        this.this$0 = stepData;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        List args;
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(this.$rangedArgCount);
        sb.append(" arguments. Got: ");
        args = this.this$0.getArgs();
        sb.append(args);
        return sb.toString();
    }
}
