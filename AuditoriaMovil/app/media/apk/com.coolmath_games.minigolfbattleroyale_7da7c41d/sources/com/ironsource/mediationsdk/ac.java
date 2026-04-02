package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager;", "", "()V", "calculator", "Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "init", "", "SessionCalcEventTask", "mediationsdk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class ac {
    com.ironsource.lifecycle.a a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager$SessionCalcEventTask;", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/mediationsdk/SessionCalculationManager;)V", "run", "", "mediationsdk_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    final class a extends com.ironsource.lifecycle.g {
        public a() {
        }

        @Override // com.ironsource.lifecycle.g, java.lang.Runnable
        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, this.a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ironsource.mediationsdk.a.g.v.b(new com.ironsource.mediationsdk.adunit.a.a(44, mediationAdditionalData));
        }
    }
}
