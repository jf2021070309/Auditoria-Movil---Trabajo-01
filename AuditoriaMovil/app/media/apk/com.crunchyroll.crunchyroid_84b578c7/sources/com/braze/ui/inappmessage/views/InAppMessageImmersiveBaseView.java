package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.amazon.aps.iva.bc.b;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppMessageImmersiveBaseView.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010#\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u00060"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "", "imageRetrievalSuccessful", "Lcom/amazon/aps/iva/kb0/q;", "resetMessageMargins", "", "numButtons", "setupDirectionalNavigation", "", "Lcom/braze/models/inappmessage/MessageButton;", "messageButtons", "setMessageButtons", "color", "setMessageCloseButtonColor", "setMessageHeaderTextColor", "", "text", "setMessageHeaderText", "Lcom/braze/enums/inappmessage/TextAlign;", "textAlign", "setMessageHeaderTextAlignment", "setFrameColor", "Landroid/view/View;", "getMessageButtonViews", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "dispatchKeyEvent", "closeButtonView", "setLargerCloseButtonClickArea", "getFrameView", "()Landroid/view/View;", "frameView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final void setLargerCloseButtonClickArea$lambda$5(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) {
        j.f(inAppMessageImmersiveBaseView, "this$0");
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        if (!isInTouchMode() && keyEvent.getKeyCode() == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract /* synthetic */ View getMessageCloseButtonView();

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        if (i == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        CharSequence charSequence;
        super.resetMessageMargins(z);
        TextView messageTextView = getMessageTextView();
        CharSequence charSequence2 = null;
        if (messageTextView != null) {
            charSequence = messageTextView.getText();
        } else {
            charSequence = null;
        }
        if (m.b0(String.valueOf(charSequence))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            charSequence2 = messageHeaderTextView.getText();
        }
        if (m.b0(String.valueOf(charSequence2))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int i) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(i));
        }
    }

    public void setLargerCloseButtonClickArea(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                ((View) parent).post(new c(view, 4, this, parent));
                return;
            }
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, InAppMessageImmersiveBaseView$setLargerCloseButtonClickArea$1.INSTANCE, 2, (Object) null);
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        j.f(list, "messageButtons");
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(list.size()), list);
    }

    public void setMessageCloseButtonColor(int i) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, i);
        }
    }

    public void setMessageHeaderText(String str) {
        j.f(str, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            messageHeaderTextView.setText(str);
        }
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        j.f(textAlign, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    public void setMessageHeaderTextColor(int i) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, i);
        }
    }

    public void setupDirectionalNavigation(int i) {
        Integer num;
        List<View> messageButtonViews = getMessageButtonViews(i);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            num = Integer.valueOf(messageCloseButtonView.getId());
        } else {
            num = null;
        }
        if (num == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, InAppMessageImmersiveBaseView$setupDirectionalNavigation$1.INSTANCE, 2, (Object) null);
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageImmersiveBaseView$setupDirectionalNavigation$2(i), 2, (Object) null);
                } else {
                    View view = messageButtonViews.get(1);
                    View view2 = messageButtonViews.get(0);
                    Integer valueOf = Integer.valueOf(view.getId());
                    Integer valueOf2 = Integer.valueOf(view2.getId());
                    view.setNextFocusLeftId(valueOf2.intValue());
                    view.setNextFocusRightId(valueOf2.intValue());
                    view.setNextFocusUpId(num.intValue());
                    view.setNextFocusDownId(num.intValue());
                    view2.setNextFocusLeftId(valueOf.intValue());
                    view2.setNextFocusRightId(valueOf.intValue());
                    view2.setNextFocusUpId(num.intValue());
                    view2.setNextFocusDownId(num.intValue());
                    messageCloseButtonView.setNextFocusUpId(valueOf.intValue());
                    messageCloseButtonView.setNextFocusDownId(valueOf.intValue());
                    messageCloseButtonView.setNextFocusRightId(valueOf.intValue());
                    messageCloseButtonView.setNextFocusLeftId(valueOf2.intValue());
                    messageCloseButtonView = view;
                    num = valueOf;
                }
            } else {
                View view3 = messageButtonViews.get(0);
                Integer valueOf3 = Integer.valueOf(view3.getId());
                view3.setNextFocusLeftId(num.intValue());
                view3.setNextFocusRightId(num.intValue());
                view3.setNextFocusUpId(num.intValue());
                view3.setNextFocusDownId(num.intValue());
                messageCloseButtonView.setNextFocusUpId(valueOf3.intValue());
                messageCloseButtonView.setNextFocusDownId(valueOf3.intValue());
                messageCloseButtonView.setNextFocusRightId(valueOf3.intValue());
                messageCloseButtonView.setNextFocusLeftId(valueOf3.intValue());
                messageCloseButtonView = view3;
                num = valueOf3;
            }
        } else {
            messageCloseButtonView.setNextFocusUpId(num.intValue());
            messageCloseButtonView.setNextFocusDownId(num.intValue());
            messageCloseButtonView.setNextFocusRightId(num.intValue());
            messageCloseButtonView.setNextFocusLeftId(num.intValue());
        }
        setNextFocusUpId(num.intValue());
        setNextFocusDownId(num.intValue());
        setNextFocusRightId(num.intValue());
        setNextFocusLeftId(num.intValue());
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new b(messageCloseButtonView, 0));
        }
    }
}
