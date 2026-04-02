package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.models.inappmessage.IInAppMessage;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
/* compiled from: IInAppMessageWebViewClientListener.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", ImagesContract.URL, "Landroid/os/Bundle;", "queryBundle", "Lcom/amazon/aps/iva/kb0/q;", "onCloseAction", "onNewsfeedAction", "onCustomEventAction", "onOtherUrlAction", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessageWebViewClientListener {
    void onCloseAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onCustomEventAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onNewsfeedAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle);
}
