package com.braze.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import kotlin.Metadata;
/* compiled from: TouchAwareSwipeDismissTouchListener.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener;", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener;", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "newTouchListener", "Lcom/amazon/aps/iva/kb0/q;", "setTouchListener", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "touchListener", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "", "token", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "callbacks", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;)V", "(Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;)V", "ITouchListener", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener touchListener;

    /* compiled from: TouchAwareSwipeDismissTouchListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "", "Lcom/amazon/aps/iva/kb0/q;", "onTouchStartedOrContinued", "onTouchEnded", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        super(view, obj, dismissCallbacks);
        j.f(view, "view");
    }

    @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        j.f(view, "view");
        j.f(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (iTouchListener = this.touchListener) != null) {
                iTouchListener.onTouchEnded();
            }
        } else {
            ITouchListener iTouchListener2 = this.touchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(ITouchListener iTouchListener) {
        j.f(iTouchListener, "newTouchListener");
        this.touchListener = iTouchListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, null, dismissCallbacks);
        j.f(view, "view");
    }
}
