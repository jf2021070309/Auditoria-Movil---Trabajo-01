package com.braze.ui.inappmessage.views;

import android.view.View;
import com.amazon.aps.iva.p3.w0;
import kotlin.Metadata;
/* compiled from: IInAppMessageView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "Lcom/amazon/aps/iva/p3/w0;", "insets", "Lcom/amazon/aps/iva/kb0/q;", "applyWindowInsets", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "hasAppliedWindowInsets", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessageView {
    void applyWindowInsets(w0 w0Var);

    boolean getHasAppliedWindowInsets();

    View getMessageClickableView();
}
