package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: BaseBrazeActionStep.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "<init>", "()V", "Companion", "Lcom/braze/ui/actions/brazeactions/steps/AddToCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/AddToSubscriptionGroupStep;", "Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/LogCustomEventStep;", "Lcom/braze/ui/actions/brazeactions/steps/OpenLinkExternallyStep;", "Lcom/braze/ui/actions/brazeactions/steps/OpenLinkInWebViewStep;", "Lcom/braze/ui/actions/brazeactions/steps/RemoveFromCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/RequestPushPermissionStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetCustomUserAttributeStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetEmailSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetPushNotificationSubscriptionStep;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class BaseBrazeActionStep implements IBrazeActionStep {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BaseBrazeActionStep.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep$Companion;", "", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lcom/amazon/aps/iva/kb0/q;", "block", "runOnUser$android_sdk_ui_release", "(Lcom/braze/Braze;Lcom/amazon/aps/iva/xb0/l;)V", "runOnUser", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void runOnUser$android_sdk_ui_release(Braze braze, final l<? super BrazeUser, q> lVar) {
            j.f(braze, "<this>");
            j.f(lVar, "block");
            braze.getCurrentUser(new IValueCallback<BrazeUser>() { // from class: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1
                @Override // com.braze.events.IValueCallback
                public void onError() {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BaseBrazeActionStep$Companion$runOnUser$1$onError$1.INSTANCE, 3, (Object) null);
                }

                @Override // com.braze.events.IValueCallback
                public void onSuccess(BrazeUser brazeUser) {
                    j.f(brazeUser, "value");
                    lVar.invoke(brazeUser);
                }
            });
        }
    }

    private BaseBrazeActionStep() {
    }

    public /* synthetic */ BaseBrazeActionStep(e eVar) {
        this();
    }
}
