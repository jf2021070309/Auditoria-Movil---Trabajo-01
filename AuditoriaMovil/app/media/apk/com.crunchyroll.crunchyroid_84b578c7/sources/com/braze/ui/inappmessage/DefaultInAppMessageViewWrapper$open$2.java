package com.braze.ui.inappmessage;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.o4.c;
import com.amazon.aps.iva.yb0.j;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageViewWrapper.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$2", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lcom/amazon/aps/iva/kb0/q;", "onLayoutChange", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultInAppMessageViewWrapper$open$2 implements View.OnLayoutChangeListener {
    final /* synthetic */ ViewGroup $parentViewGroup;
    final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

    public DefaultInAppMessageViewWrapper$open$2(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        this.$parentViewGroup = viewGroup;
        this.this$0 = defaultInAppMessageViewWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChange$lambda$0(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, ViewGroup viewGroup) {
        j.f(defaultInAppMessageViewWrapper, "this$0");
        j.f(viewGroup, "$parentViewGroup");
        defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(viewGroup, defaultInAppMessageViewWrapper.getInAppMessage(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        j.f(view, "view");
        this.$parentViewGroup.removeOnLayoutChangeListener(this);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new DefaultInAppMessageViewWrapper$open$2$onLayoutChange$1(i4, i2), 3, (Object) null);
        this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
        ViewGroup viewGroup = this.$parentViewGroup;
        viewGroup.post(new c(5, this.this$0, viewGroup));
    }
}
