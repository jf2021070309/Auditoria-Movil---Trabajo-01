package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.y;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: ContainerStep.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "run", "", "Lcom/amazon/aps/iva/if0/c;", "getChildStepIterator$android_sdk_ui_release", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Ljava/util/Iterator;", "getChildStepIterator", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContainerStep extends BaseBrazeActionStep {
    public static final ContainerStep INSTANCE = new ContainerStep();

    private ContainerStep() {
        super(null);
    }

    public final Iterator getChildStepIterator$android_sdk_ui_release(StepData stepData) {
        j.f(stepData, "data");
        a jSONArray = stepData.getSrcJson().getJSONArray("steps");
        if (jSONArray == null) {
            return y.b;
        }
        return new u.a(s.b0(s.V(x.k0(com.amazon.aps.iva.aq.j.T(0, jSONArray.e())), new ContainerStep$getChildStepIterator$$inlined$iterator$1(jSONArray)), new ContainerStep$getChildStepIterator$$inlined$iterator$2(jSONArray)));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        j.f(stepData, "data");
        return stepData.getSrcJson().has("steps");
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        j.f(context, "context");
        j.f(stepData, "data");
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(stepData);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(stepData, (c) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }
}
