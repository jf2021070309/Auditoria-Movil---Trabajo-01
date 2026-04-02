package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.braze.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppMessageModalView.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0014J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0016\u00104\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0016\u00106\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0016\u0010:\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006C"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "", "imageRetrievalSuccessful", "Lcom/amazon/aps/iva/kb0/q;", "resetMessageMargins", "", "color", "setMessageBackgroundColor", "numButtons", "", "Landroid/view/View;", "getMessageButtonViews", "changed", "left", "top", "right", "bottom", "onLayout", "Landroid/content/Context;", "context", "Lcom/braze/models/inappmessage/InAppMessageModal;", "inAppMessage", "applyInAppMessageParameters", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "inAppMessageImageView", "setInAppMessageImageViewAttributes", "resizeGraphicFrameIfAppropriate", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "getInAppMessageImageView", "()Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "setInAppMessageImageView", "(Lcom/braze/ui/inappmessage/views/InAppMessageImageView;)V", "Lcom/braze/models/inappmessage/InAppMessageModal;", "getInAppMessage", "()Lcom/braze/models/inappmessage/InAppMessageModal;", "setInAppMessage", "(Lcom/braze/models/inappmessage/InAppMessageModal;)V", "getFrameView", "()Landroid/view/View;", "frameView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "getMessageClickableView", "messageClickableView", "getMessageCloseButtonView", "messageCloseButtonView", "getMessageIconView", "messageIconView", "Landroid/graphics/drawable/Drawable;", "getMessageBackgroundObject", "()Landroid/graphics/drawable/Drawable;", "messageBackgroundObject", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private InAppMessageModal inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void c(InAppMessageModalView inAppMessageModalView, View view) {
        resetMessageMargins$lambda$0(inAppMessageModalView, view);
    }

    public static final void resetMessageMargins$lambda$0(InAppMessageModalView inAppMessageModalView, View view) {
        j.f(inAppMessageModalView, "this$0");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, inAppMessageModalView, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageModalView$resetMessageMargins$1$1.INSTANCE, 3, (Object) null);
        View messageClickableView = inAppMessageModalView.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    public static final void resizeGraphicFrameIfAppropriate$lambda$2(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        j.f(inAppMessageModalView, "this$0");
        double min = Math.min(inAppMessageModalView.getMeasuredWidth() - i, i2);
        double min2 = Math.min(inAppMessageModalView.getMeasuredHeight() - i, i3);
        double d2 = min / min2;
        View findViewById = inAppMessageModalView.findViewById(R$id.com_braze_inappmessage_modal_graphic_bound);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d >= d2) {
                layoutParams2.width = (int) min;
                layoutParams2.height = (int) (min / d);
            } else {
                layoutParams2.width = (int) (d * min2);
                layoutParams2.height = (int) min2;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessageModal) {
        j.f(context, "context");
        j.f(inAppMessageModal, "inAppMessage");
        this.inAppMessage = inAppMessageModal;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessageModal, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessageModal);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_modal_frame);
    }

    public final InAppMessageModal getInAppMessage() {
        return this.inAppMessage;
    }

    public final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i != 1) {
            if (i == 2) {
                View findViewById = findViewById(R$id.com_braze_inappmessage_modal_button_layout_dual);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                View findViewById2 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_one);
                View findViewById3 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_two);
                if (findViewById2 != null) {
                    arrayList.add(findViewById2);
                }
                if (findViewById3 != null) {
                    arrayList.add(findViewById3);
                }
            }
        } else {
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R$id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_message);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Context context = getContext();
        j.e(context, "this.context");
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal_text_layout);
        if (findViewById != null) {
            findViewById.setOnClickListener(new k(this, 2));
        }
    }

    public void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessageModal) {
        Bitmap bitmap;
        j.f(context, "context");
        if (inAppMessageModal == null || (bitmap = inAppMessageModal.getBitmap()) == null || inAppMessageModal.getImageStyle() != ImageStyle.GRAPHIC) {
            return;
        }
        final double width = bitmap.getWidth() / bitmap.getHeight();
        Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_margin);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_width);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_height);
        post(new Runnable() { // from class: com.amazon.aps.iva.bc.c
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageModalView.resizeGraphicFrameIfAppropriate$lambda$2(InAppMessageModalView.this, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
            }
        });
    }

    public final void setInAppMessage(InAppMessageModal inAppMessageModal) {
        this.inAppMessage = inAppMessageModal;
    }

    public final void setInAppMessageImageView(InAppMessageImageView inAppMessageImageView) {
        this.inAppMessageImageView = inAppMessageImageView;
    }

    public void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        j.f(context, "context");
        j.f(iInAppMessageImmersive, "inAppMessage");
        j.f(iInAppMessageImageView, "inAppMessageImageView");
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (iInAppMessageImmersive.getImageStyle() == ImageStyle.GRAPHIC) {
            iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal);
        j.e(findViewById, "findViewById(R.id.com_braze_inappmessage_modal)");
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById, i);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            return messageClickableView.getBackground();
        }
        return null;
    }
}
