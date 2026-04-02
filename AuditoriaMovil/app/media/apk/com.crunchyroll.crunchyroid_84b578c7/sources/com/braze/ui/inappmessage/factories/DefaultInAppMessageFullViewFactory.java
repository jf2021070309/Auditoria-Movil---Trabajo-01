package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.Orientation;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageFullViewFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageFullViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getAppropriateFullView", "isGraphic", "", "resetLayoutParamsIfAppropriate", "view", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageFullViewFactory implements IInAppMessageViewFactory {
    public static final Companion Companion = new Companion(null);

    /* compiled from: DefaultInAppMessageFullViewFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageFullViewFactory$Companion;", "", "()V", "BUTTONS_PRESENT_SCROLLVIEW_EXCESS_HEIGHT_VALUE_IN_DP", "", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$4(View view, InAppMessageFullView inAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        j.f(inAppMessageFullView, "$view");
        j.f(inAppMessageFull, "$inAppMessageFull");
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = inAppMessageFullView.findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        if (!inAppMessageFull.getMessageButtons().isEmpty()) {
            j.e(context, "applicationContext");
            i += (int) ViewUtils.convertDpToPixels(context, 64.0d);
        }
        ViewUtils.setHeightOnViewLayoutParams(view2, Math.min(view2.getHeight(), height - i));
        view2.requestLayout();
        ImageView messageImageView = inAppMessageFullView.getMessageImageView();
        if (messageImageView != null) {
            messageImageView.requestLayout();
        }
    }

    private final boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage iInAppMessage, InAppMessageFullView inAppMessageFullView) {
        RelativeLayout.LayoutParams layoutParams;
        if (!ViewUtils.isRunningOnTablet(activity) || iInAppMessage.getOrientation() == Orientation.ANY) {
            return false;
        }
        int longEdge = inAppMessageFullView.getLongEdge();
        int shortEdge = inAppMessageFullView.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        if (iInAppMessage.getOrientation() == Orientation.LANDSCAPE) {
            layoutParams = new RelativeLayout.LayoutParams(longEdge, shortEdge);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(shortEdge, longEdge);
        }
        layoutParams.addRule(13, -1);
        View messageBackgroundObject = inAppMessageFullView.getMessageBackgroundObject();
        if (messageBackgroundObject != null) {
            messageBackgroundObject.setLayoutParams(layoutParams);
            return true;
        }
        return true;
    }

    @SuppressLint({"InflateParams"})
    public final InAppMessageFullView getAppropriateFullView(Activity activity, boolean z) {
        j.f(activity, "activity");
        if (z) {
            View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            j.d(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
            return (InAppMessageFullView) inflate;
        }
        View inflate2 = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_full, (ViewGroup) null);
        j.d(inflate2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
        return (InAppMessageFullView) inflate2;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        j.f(activity, "activity");
        j.f(iInAppMessage, "inAppMessage");
        final Context applicationContext = activity.getApplicationContext();
        final InAppMessageFull inAppMessageFull = (InAppMessageFull) iInAppMessage;
        boolean z = false;
        boolean z2 = inAppMessageFull.getImageStyle() == ImageStyle.GRAPHIC;
        final InAppMessageFullView appropriateFullView = getAppropriateFullView(activity, z2);
        appropriateFullView.createAppropriateViews(activity, inAppMessageFull, z2);
        String appropriateImageUrl = InAppMessageBaseView.Companion.getAppropriateImageUrl(inAppMessageFull);
        if (appropriateImageUrl == null || appropriateImageUrl.length() == 0) {
            z = true;
        }
        if (!z) {
            Braze.Companion companion = Braze.Companion;
            j.e(applicationContext, "applicationContext");
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateFullView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.NO_BOUNDS);
            }
        }
        View frameView = appropriateFullView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(null);
        }
        appropriateFullView.setMessageBackgroundColor(inAppMessageFull.getBackgroundColor());
        Integer frameColor = inAppMessageFull.getFrameColor();
        if (frameColor != null) {
            appropriateFullView.setFrameColor(frameColor.intValue());
        }
        appropriateFullView.setMessageButtons(inAppMessageFull.getMessageButtons());
        appropriateFullView.setMessageCloseButtonColor(inAppMessageFull.getCloseButtonColor());
        if (!z2) {
            String message = inAppMessageFull.getMessage();
            if (message != null) {
                appropriateFullView.setMessage(message);
            }
            appropriateFullView.setMessageTextColor(inAppMessageFull.getMessageTextColor());
            String header = inAppMessageFull.getHeader();
            if (header != null) {
                appropriateFullView.setMessageHeaderText(header);
            }
            appropriateFullView.setMessageHeaderTextColor(inAppMessageFull.getHeaderTextColor());
            appropriateFullView.setMessageHeaderTextAlignment(inAppMessageFull.getHeaderTextAlign());
            appropriateFullView.setMessageTextAlign(inAppMessageFull.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(inAppMessageFull.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateFullView.getMessageImageView();
            j.d(messageImageView2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
        }
        appropriateFullView.setLargerCloseButtonClickArea(appropriateFullView.getMessageCloseButtonView());
        resetLayoutParamsIfAppropriate(activity, inAppMessageFull, appropriateFullView);
        appropriateFullView.setupDirectionalNavigation(inAppMessageFull.getMessageButtons().size());
        final View findViewById = appropriateFullView.findViewById(R$id.com_braze_inappmessage_full_scrollview);
        if (findViewById != null) {
            final View findViewById2 = appropriateFullView.findViewById(R$id.com_braze_inappmessage_full_all_content_parent);
            findViewById.post(new Runnable() { // from class: com.amazon.aps.iva.yb.a
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInAppMessageFullViewFactory.createInAppMessageView$lambda$4(findViewById2, appropriateFullView, inAppMessageFull, applicationContext, findViewById);
                }
            });
        }
        return appropriateFullView;
    }
}
