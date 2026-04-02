package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: SetCustomUserAttributeStep.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetCustomUserAttributeStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "run", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SetCustomUserAttributeStep extends BaseBrazeActionStep {
    public static final SetCustomUserAttributeStep INSTANCE;
    private static final String TAG;

    static {
        SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep();
        INSTANCE = setCustomUserAttributeStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setCustomUserAttributeStep);
    }

    private SetCustomUserAttributeStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        j.f(stepData, "data");
        if (!StepData.isArgCountInBounds$default(stepData, 2, null, 2, null) || !stepData.isArgString(0) || stepData.getSecondArg() == null) {
            return false;
        }
        return true;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        j.f(context, "context");
        j.f(stepData, "data");
        Object secondArg = stepData.getSecondArg();
        if (secondArg == null) {
            return;
        }
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new SetCustomUserAttributeStep$run$1(stepData, secondArg));
    }
}
