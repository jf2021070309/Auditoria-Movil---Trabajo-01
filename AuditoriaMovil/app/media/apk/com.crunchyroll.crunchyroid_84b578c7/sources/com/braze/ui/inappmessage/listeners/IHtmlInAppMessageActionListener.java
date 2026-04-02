package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.inappmessage.IInAppMessage;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
/* compiled from: IHtmlInAppMessageActionListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", ImagesContract.URL, "Landroid/os/Bundle;", "queryBundle", "Lcom/amazon/aps/iva/kb0/q;", "onCloseClicked", "", "onNewsfeedClicked", "onCustomEventFired", "onOtherUrlAction", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
    }

    default boolean onCustomEventFired(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        return false;
    }

    default boolean onNewsfeedClicked(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        return false;
    }

    default boolean onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        return false;
    }
}
