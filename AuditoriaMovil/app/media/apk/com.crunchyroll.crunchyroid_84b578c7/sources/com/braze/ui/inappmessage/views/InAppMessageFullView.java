package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.bc.a;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppMessageFullView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0016\u0010)\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0016\u00105\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010(R\u0014\u00108\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006A"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Landroid/app/Activity;", "activity", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "inAppMessage", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "inAppMessageImageView", "Lcom/amazon/aps/iva/kb0/q;", "setInAppMessageImageViewAttributes", "Lcom/amazon/aps/iva/p3/w0;", "windowInsets", "Landroid/view/View;", "closeButtonView", "applyDisplayCutoutMarginsToCloseButton", "contentAreaView", "applyDisplayCutoutMarginsToContentArea", "", "isGraphic", "createAppropriateViews", "", "color", "setMessageBackgroundColor", "numButtons", "", "getMessageButtonViews", "imageRetrievalSuccessful", "resetMessageMargins", "insets", "applyWindowInsets", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Z", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "getFrameView", "()Landroid/view/View;", "frameView", "getMessageCloseButtonView", "messageCloseButtonView", "getMessageClickableView", "messageClickableView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "getMessageBackgroundObject", "messageBackgroundObject", "getLongEdge", "()I", "longEdge", "getShortEdge", "shortEdge", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(w0 w0Var, View view) {
        if (view.getLayoutParams() != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(w0Var) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(w0Var) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(w0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(w0Var) + marginLayoutParams.bottomMargin);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageFullView$applyDisplayCutoutMarginsToCloseButton$1.INSTANCE, 3, (Object) null);
    }

    private final void applyDisplayCutoutMarginsToContentArea(w0 w0Var, View view) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageFullView$applyDisplayCutoutMarginsToContentArea$1.INSTANCE, 3, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(w0Var) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(w0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(w0Var) + marginLayoutParams.bottomMargin);
    }

    public static final void resetMessageMargins$lambda$2$lambda$1(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        j.f(inAppMessageFullView, "this$0");
        j.f(view, "$msgClickableView");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, inAppMessageFullView, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageFullView$resetMessageMargins$1$1$1.INSTANCE, 3, (Object) null);
        view.performClick();
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
        if (ViewUtils.isRunningOnTablet(activity)) {
            float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
            if (iInAppMessageImmersive.getImageStyle() == ImageStyle.GRAPHIC) {
                iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
                return;
            } else {
                iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
                return;
            }
        }
        iInAppMessageImageView.setCornersRadiusPx(0.0f);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(w0 w0Var) {
        boolean z;
        j.f(w0Var, "insets");
        super.applyWindowInsets(w0Var);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(w0Var, messageCloseButtonView);
        }
        if (this.isGraphic) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
            boolean z2 = true;
            if (findViewById != null && findViewById.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j.e(findViewById, "singleButtonParent");
                applyDisplayCutoutMarginsToContentArea(w0Var, findViewById);
                return;
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById2 == null || findViewById2.getVisibility() != 0) {
                z2 = false;
            }
            if (z2) {
                j.e(findViewById2, "dualButtonParent");
                applyDisplayCutoutMarginsToContentArea(w0Var, findViewById2);
                return;
            }
            return;
        }
        View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(w0Var, findViewById3);
        }
    }

    public void createAppropriateViews(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, boolean z) {
        j.f(activity, "activity");
        j.f(iInAppMessageImmersive, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, iInAppMessageImmersive, inAppMessageImageView);
        }
        this.isGraphic = z;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i != 1) {
            if (i == 2) {
                View findViewById = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_dual_one);
                View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_button_dual_two);
                if (findViewById2 != null) {
                    arrayList.add(findViewById2);
                }
                if (findViewById3 != null) {
                    arrayList.add(findViewById3);
                }
            }
        } else {
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_full_button_single_one);
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        View findViewById = findViewById(R$id.com_braze_inappmessage_full_header_text);
        j.e(findViewById, "findViewById(R.id.com_br…message_full_header_text)");
        return (TextView) findViewById;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        View findViewById = findViewById(R$id.com_braze_inappmessage_full_message);
        j.e(findViewById, "findViewById(R.id.com_br…nappmessage_full_message)");
        return (TextView) findViewById;
    }

    public int getShortEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(R$id.com_braze_inappmessage_full_text_layout).setOnClickListener(new a(0, this, messageClickableView));
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
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, i);
        } else if (this.isGraphic) {
            super.setMessageBackgroundColor(i);
        } else {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_all_content_parent);
            j.e(findViewById, "findViewById(R.id.com_br…_full_all_content_parent)");
            InAppMessageViewUtils.setViewBackgroundColor(findViewById, i);
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent);
            j.e(findViewById2, "findViewById(R.id.com_br…nd_button_content_parent)");
            InAppMessageViewUtils.setViewBackgroundColor(findViewById2, i);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }
}
