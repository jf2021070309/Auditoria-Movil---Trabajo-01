package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.R$dimen;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppMessageButtonViewUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0007J0\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¨\u0006\u001b"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageButtonViewUtils;", "", "", "Landroid/view/View;", "buttonViews", "Lcom/braze/models/inappmessage/MessageButton;", "messageButtons", "Lcom/amazon/aps/iva/kb0/q;", "setButtons", "Landroid/widget/Button;", "button", "messageButton", "", "strokeWidth", "strokeFocusedWidth", "setButton", "Landroid/content/Context;", "context", "drawableId", "Landroid/graphics/drawable/Drawable;", "getDrawable", "newStrokeWidth", "", "isFocused", "getButtonDrawable", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageButtonViewUtils {
    public static final InAppMessageButtonViewUtils INSTANCE = new InAppMessageButtonViewUtils();

    private InAppMessageButtonViewUtils() {
    }

    public static final Drawable getButtonDrawable(Context context, MessageButton messageButton, int i, int i2, boolean z) {
        j.f(context, "context");
        j.f(messageButton, "messageButton");
        Drawable drawable = getDrawable(context, R$drawable.com_braze_inappmessage_button_background);
        drawable.mutate();
        Drawable findDrawableByLayerId = ((RippleDrawable) drawable).findDrawableByLayerId(R$id.com_braze_inappmessage_button_background_ripple_internal_gradient);
        j.d(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
        if (z) {
            i = i2;
        }
        gradientDrawable.setStroke(i, messageButton.getBorderColor());
        gradientDrawable.setColor(messageButton.getBackgroundColor());
        return drawable;
    }

    public static final Drawable getDrawable(Context context, int i) {
        j.f(context, "context");
        Drawable drawable = context.getResources().getDrawable(i);
        j.e(drawable, "context.resources.getDrawable(drawableId)");
        return drawable;
    }

    public static final void setButton(Button button, MessageButton messageButton, int i, int i2) {
        j.f(button, "button");
        j.f(messageButton, "messageButton");
        button.setText(messageButton.getText());
        button.setContentDescription(messageButton.getText());
        InAppMessageViewUtils.setTextViewColor(button, messageButton.getTextColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator(null);
        Context context = button.getContext();
        j.e(context, "button.context");
        Drawable buttonDrawable = getButtonDrawable(context, messageButton, i, i2, false);
        Context context2 = button.getContext();
        j.e(context2, "button.context");
        stateListDrawable.addState(new int[]{16842908}, getButtonDrawable(context2, messageButton, i, i2, true));
        stateListDrawable.addState(new int[]{16842910}, buttonDrawable);
        button.setBackground(stateListDrawable);
    }

    public static final void setButtons(List<? extends View> list, List<? extends MessageButton> list2) {
        j.f(list, "buttonViews");
        j.f(list2, "messageButtons");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = list.get(i);
            MessageButton messageButton = list2.get(i);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (list2.size() <= i) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                setButton((Button) view, messageButton, dimensionPixelSize, dimensionPixelSize2);
            }
        }
    }
}
