package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.Metadata;
/* compiled from: IInAppMessageManagerListener.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "beforeInAppMessageDisplayed", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "inAppMessageCloser", "", "onInAppMessageClicked", "Lcom/braze/models/inappmessage/MessageButton;", "button", "onInAppMessageButtonClicked", "Lcom/amazon/aps/iva/kb0/q;", "onInAppMessageDismissed", "Landroid/view/View;", "inAppMessageView", "beforeInAppMessageViewOpened", "afterInAppMessageViewOpened", "beforeInAppMessageViewClosed", "afterInAppMessageViewClosed", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
    }

    default void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
    }

    default InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        return InAppMessageOperation.DISPLAY_NOW;
    }

    default void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
    }

    default void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(messageButton, "button");
        return false;
    }

    default boolean onInAppMessageClicked(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        return false;
    }

    default void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(messageButton, "button");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }

    default boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        j.f(iInAppMessage, "inAppMessage");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }
}
