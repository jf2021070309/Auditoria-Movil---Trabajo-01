package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
/* compiled from: InAppMessageSlideupView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001b¨\u0006+"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/amazon/aps/iva/kb0/q;", "applyInAppMessageParameters", "", "color", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "setMessageChevron", "setMessageBackgroundColor", "", "imageRetrievalSuccessful", "resetMessageMargins", "Lcom/amazon/aps/iva/p3/w0;", "insets", "applyWindowInsets", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Landroid/view/View;", "getMessageChevronView", "()Landroid/view/View;", "messageChevronView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageBackgroundObject", "messageBackgroundObject", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final View getMessageChevronView() {
        return findViewById(R$id.com_braze_inappmessage_slideup_chevron);
    }

    public final void applyInAppMessageParameters(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            inAppMessageImageView.setInAppMessageImageCropType(iInAppMessage.getCropType());
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(w0 w0Var) {
        j.f(w0Var, "insets");
        super.applyWindowInsets(w0Var);
        if (getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(w0Var) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(w0Var) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(w0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(w0Var) + marginLayoutParams.bottomMargin);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageSlideupView$applyWindowInsets$1.INSTANCE, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        CharSequence text;
        boolean z2;
        super.resetMessageMargins(z);
        TextView messageIconView = getMessageIconView();
        boolean z3 = false;
        if (messageIconView != null && (text = messageIconView.getText()) != null) {
            if (text.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = true;
            }
        }
        boolean z4 = !z3;
        if (!z && z4) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                ViewUtils.removeViewFromParent(relativeLayout);
            }
            TextView textView = (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
            if (textView != null) {
                layoutParams = textView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
            }
            textView.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        Drawable drawable;
        View messageBackgroundObject = getMessageBackgroundObject();
        if (messageBackgroundObject != null) {
            drawable = messageBackgroundObject.getBackground();
        } else {
            drawable = null;
        }
        if (drawable instanceof GradientDrawable) {
            View messageBackgroundObject2 = getMessageBackgroundObject();
            if (messageBackgroundObject2 != null) {
                InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject2, i);
                return;
            }
            return;
        }
        super.setMessageBackgroundColor(i);
    }

    public final void setMessageChevron(int i, ClickAction clickAction) {
        j.f(clickAction, "clickAction");
        if (clickAction == ClickAction.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView != null) {
                messageChevronView.setVisibility(8);
                return;
            }
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageChevronView2, i);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_slideup_container);
    }
}
