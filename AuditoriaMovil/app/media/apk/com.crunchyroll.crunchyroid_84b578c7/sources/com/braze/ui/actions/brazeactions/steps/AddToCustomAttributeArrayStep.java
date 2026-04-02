package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import kotlin.Metadata;
/* compiled from: AddToCustomAttributeArrayStep.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/AddToCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "run", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AddToCustomAttributeArrayStep extends BaseBrazeActionStep {
    public static final AddToCustomAttributeArrayStep INSTANCE = new AddToCustomAttributeArrayStep();

    private AddToCustomAttributeArrayStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        j.f(stepData, "data");
        if (!StepData.isArgCountInBounds$default(stepData, 2, null, 2, null) || !stepData.isArgString(0) || !stepData.isArgString(1)) {
            return false;
        }
        return true;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        j.f(context, "context");
        j.f(stepData, "data");
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new AddToCustomAttributeArrayStep$run$1(String.valueOf(stepData.getFirstArg()), String.valueOf(stepData.getSecondArg())));
    }
}
