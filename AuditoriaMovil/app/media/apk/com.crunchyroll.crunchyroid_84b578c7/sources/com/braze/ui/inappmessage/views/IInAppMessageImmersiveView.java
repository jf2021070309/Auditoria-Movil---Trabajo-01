package com.braze.ui.inappmessage.views;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
/* compiled from: IInAppMessageImmersiveView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "numButtons", "", "Landroid/view/View;", "getMessageButtonViews", "getMessageCloseButtonView", "()Landroid/view/View;", "messageCloseButtonView", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessageImmersiveView extends IInAppMessageView {
    List<View> getMessageButtonViews(int i);

    View getMessageCloseButtonView();
}
