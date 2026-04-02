package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.io.File;
import kotlin.Metadata;
/* compiled from: InAppMessageBaseView.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001b\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\"\u0010\u001b\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0016\u00102\u001a\u0004\u0018\u00010/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "color", "Lcom/amazon/aps/iva/kb0/q;", "setMessageBackgroundColor", "setMessageTextColor", "Lcom/braze/enums/inappmessage/TextAlign;", "textAlign", "setMessageTextAlign", "", "text", "setMessage", "Landroid/graphics/Bitmap;", "bitmap", "setMessageImageView", "icon", "iconColor", "iconBackgroundColor", "setMessageIcon", "", "imageRetrievalSuccessful", "resetMessageMargins", "Lcom/amazon/aps/iva/p3/w0;", "insets", "applyWindowInsets", "hasAppliedWindowInsets", "Z", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "", "getMessageBackgroundObject", "()Ljava/lang/Object;", "messageBackgroundObject", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    public static final Companion Companion = new Companion(null);
    private boolean hasAppliedWindowInsets;

    /* compiled from: InAppMessageBaseView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView$Companion;", "", "()V", "getAppropriateImageUrl", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
            boolean z;
            j.f(iInAppMessageWithImage, "inAppMessage");
            String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
            if (localImageUrl != null && !m.b0(localImageUrl)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, new InAppMessageBaseView$Companion$getAppropriateImageUrl$1(localImageUrl), 2, (Object) null);
            }
            return iInAppMessageWithImage.getRemoteImageUrl();
        }
    }

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(w0 w0Var) {
        j.f(w0Var, "insets");
        setHasAppliedWindowInsets(true);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public abstract Object getMessageBackgroundObject();

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean z) {
        CharSequence text;
        String obj;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                ViewUtils.removeViewFromParent(messageImageView);
            } else {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        TextView messageIconView = getMessageIconView();
        boolean z2 = false;
        if (messageIconView != null && (text = messageIconView.getText()) != null && (obj = text.toString()) != null && m.b0(obj)) {
            z2 = true;
        }
        if (z2) {
            ViewUtils.removeViewFromParent(getMessageIconView());
        }
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setMessage(String str) {
        j.f(str, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(str);
        }
    }

    public void setMessageBackgroundColor(int i) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        j.d(messageBackgroundObject, "null cannot be cast to non-null type android.view.View");
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        j.f(str, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            j.e(context, "context");
            InAppMessageViewUtils.setIcon(context, str, i, i2, messageIconView);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        j.f(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        j.f(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessageTextColor(int i) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, i);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }
}
