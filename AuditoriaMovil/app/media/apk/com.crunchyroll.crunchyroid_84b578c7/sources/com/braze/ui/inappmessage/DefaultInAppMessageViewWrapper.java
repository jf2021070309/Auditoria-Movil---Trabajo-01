package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.u;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.xb.c;
import com.amazon.aps.iva.xb.d;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageViewWrapper.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 p2\u00020\u0001:\u0001pBe\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00109\u001a\u0004\u0018\u000104\u0012\b\u0010;\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010?\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J \u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u0001048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u0001048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R$\u0010;\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(\"\u0004\b=\u0010>R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010&\u001a\u0004\bG\u0010(\"\u0004\bH\u0010>R \u0010J\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR\"\u0010P\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010&\u001a\u0004\b]\u0010(\"\u0004\b^\u0010>R>\u0010b\u001a\u001e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020`0_j\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020``a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010h\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Landroid/app/Activity;", "activity", "Lcom/amazon/aps/iva/kb0/q;", "open", "close", "Landroid/view/ViewGroup;", "getParentViewGroup", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "parentViewGroup", "Landroid/view/View;", "inAppMessageView", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "addInAppMessageViewToViewGroup", "", "fallbackAccessibilityMessage", "announceForAccessibilityIfNecessary", "Landroid/view/View$OnClickListener;", "createClickListener", "createButtonClickListener", "createCloseInAppMessageClickListener", "addDismissRunnable", "", "opening", "setAndStartAnimation", "closeInAppMessageView", "finalizeViewBeforeDisplay", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "createDismissCallbacks", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "createTouchAwareListener", "Landroid/view/animation/Animation$AnimationListener;", "createAnimationListener", "Landroid/view/View;", "getInAppMessageView", "()Landroid/view/View;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "getInAppMessageViewLifecycleListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "Landroid/view/animation/Animation;", "openingAnimation", "Landroid/view/animation/Animation;", "getOpeningAnimation", "()Landroid/view/animation/Animation;", "closingAnimation", "getClosingAnimation", "clickableInAppMessageView", "getClickableInAppMessageView", "setClickableInAppMessageView", "(Landroid/view/View;)V", "", "buttonViews", "Ljava/util/List;", "getButtonViews", "()Ljava/util/List;", "setButtonViews", "(Ljava/util/List;)V", "closeButton", "getCloseButton", "setCloseButton", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageCloser", "()Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageCloser$annotations", "()V", "isAnimatingClose", "Z", "()Z", "setAnimatingClose", "(Z)V", "Ljava/lang/Runnable;", "dismissRunnable", "Ljava/lang/Runnable;", "getDismissRunnable", "()Ljava/lang/Runnable;", "setDismissRunnable", "(Ljava/lang/Runnable;)V", "previouslyFocusedView", "getPreviouslyFocusedView", "setPreviouslyFocusedView", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "viewAccessibilityFlagMap", "Ljava/util/HashMap;", "getViewAccessibilityFlagMap", "()Ljava/util/HashMap;", "setViewAccessibilityFlagMap", "(Ljava/util/HashMap;)V", "contentViewGroupParentLayout", "Landroid/view/ViewGroup;", "getContentViewGroupParentLayout", "()Landroid/view/ViewGroup;", "setContentViewGroupParentLayout", "(Landroid/view/ViewGroup;)V", "<init>", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {
    public static final Companion Companion = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final InAppMessageCloser inAppMessageCloser;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J$\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$Companion;", "", "Landroid/view/ViewGroup;", "viewGroup", "", "", "viewAccessibilityFlagMap", "Lcom/amazon/aps/iva/kb0/q;", "setAllViewGroupChildrenAsNonAccessibilityImportant", "", "resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> map) {
            j.f(map, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageViewWrapper$Companion$resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$1.INSTANCE, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (map.containsKey(Integer.valueOf(id))) {
                        Integer num = map.get(Integer.valueOf(id));
                        if (num != null) {
                            int intValue = num.intValue();
                            WeakHashMap<View, r0> weakHashMap = g0.a;
                            g0.d.s(childAt, intValue);
                        }
                    } else {
                        WeakHashMap<View, r0> weakHashMap2 = g0.a;
                        g0.d.s(childAt, 0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> map) {
            j.f(map, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageViewWrapper$Companion$setAllViewGroupChildrenAsNonAccessibilityImportant$1.INSTANCE, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    map.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.d.s(childAt, 4);
                }
            }
        }
    }

    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        j.f(iInAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        j.f(brazeConfigurationProvider, "configurationProvider");
        this.inAppMessageView = view;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.configurationProvider = brazeConfigurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view2;
        this.buttonViews = list;
        this.closeButton = view3;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        this.inAppMessageCloser = new InAppMessageCloser(this);
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        List<View> buttonViews = getButtonViews();
        if (buttonViews != null) {
            for (View view4 : buttonViews) {
                view4.setOnClickListener(createButtonClickListener());
            }
        }
    }

    public static /* synthetic */ void a(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        createButtonClickListener$lambda$4(defaultInAppMessageViewWrapper, view);
    }

    public static final void addDismissRunnable$lambda$6() {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static final w0 addInAppMessageViewToViewGroup$lambda$1(View view, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view2, w0 w0Var) {
        j.f(view, "$inAppMessageView");
        j.f(defaultInAppMessageViewWrapper, "this$0");
        if (w0Var == null) {
            return new w0(w0Var);
        }
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (!iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, defaultInAppMessageViewWrapper, BrazeLogger.Priority.V, (Throwable) null, DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$1.INSTANCE, 2, (Object) null);
            iInAppMessageView.applyWindowInsets(w0Var);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$2.INSTANCE, 3, (Object) null);
        }
        return w0Var;
    }

    public static /* synthetic */ void announceForAccessibilityIfNecessary$default(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "In app message displayed.";
            }
            defaultInAppMessageViewWrapper.announceForAccessibilityIfNecessary(str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceForAccessibilityIfNecessary");
    }

    public static /* synthetic */ void b(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        createClickListener$lambda$2(defaultInAppMessageViewWrapper, view);
    }

    public static final void createButtonClickListener$lambda$4(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        j.f(defaultInAppMessageViewWrapper, "this$0");
        j.f(view, "view");
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        j.d(inAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageImmersive");
        IInAppMessageImmersive iInAppMessageImmersive = (IInAppMessageImmersive) inAppMessage;
        if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$createButtonClickListener$1$1.INSTANCE, 3, (Object) null);
            return;
        }
        List<View> buttonViews = defaultInAppMessageViewWrapper.getButtonViews();
        if (buttonViews != null) {
            for (int i = 0; i < buttonViews.size(); i++) {
                if (view.getId() == buttonViews.get(i).getId()) {
                    defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onButtonClicked(defaultInAppMessageViewWrapper.getInAppMessageCloser(), iInAppMessageImmersive.getMessageButtons().get(i), iInAppMessageImmersive);
                    return;
                }
            }
        }
    }

    public static final void createClickListener$lambda$2(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        IInAppMessageImmersive iInAppMessageImmersive;
        List<MessageButton> messageButtons;
        j.f(defaultInAppMessageViewWrapper, "this$0");
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        if (inAppMessage instanceof IInAppMessageImmersive) {
            iInAppMessageImmersive = (IInAppMessageImmersive) inAppMessage;
        } else {
            iInAppMessageImmersive = null;
        }
        boolean z = false;
        if (iInAppMessageImmersive != null && (messageButtons = iInAppMessageImmersive.getMessageButtons()) != null && messageButtons.isEmpty()) {
            z = true;
        }
        if (z || !(defaultInAppMessageViewWrapper.getInAppMessage() instanceof IInAppMessageImmersive)) {
            defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onClicked(defaultInAppMessageViewWrapper.getInAppMessageCloser(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessage());
        }
    }

    public static final void createCloseInAppMessageClickListener$lambda$5(View view) {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new d());
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    public void addInAppMessageViewToViewGroup(ViewGroup viewGroup, IInAppMessage iInAppMessage, final View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        j.f(viewGroup, "parentViewGroup");
        j.f(iInAppMessage, "inAppMessage");
        j.f(view, "inAppMessageView");
        j.f(iInAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        iInAppMessageViewLifecycleListener.beforeOpened(view, iInAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$1.INSTANCE, 3, (Object) null);
        viewGroup.addView(view, getLayoutParams(iInAppMessage));
        if (view instanceof IInAppMessageView) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c(viewGroup);
            g0.i.u(viewGroup, new u(this) { // from class: com.amazon.aps.iva.xb.b
                public final /* synthetic */ DefaultInAppMessageViewWrapper b;

                {
                    this.b = this;
                }

                @Override // com.amazon.aps.iva.p3.u
                public final w0 onApplyWindowInsets(View view2, w0 w0Var) {
                    w0 addInAppMessageViewToViewGroup$lambda$1;
                    addInAppMessageViewToViewGroup$lambda$1 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$1(view, this.b, view2, w0Var);
                    return addInAppMessageViewToViewGroup$lambda$1;
                }
            });
        }
        if (iInAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$3.INSTANCE, 3, (Object) null);
            setAndStartAnimation(true);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$4.INSTANCE, 3, (Object) null);
        if (iInAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
            addDismissRunnable();
        }
        finalizeViewBeforeDisplay(iInAppMessage, view, iInAppMessageViewLifecycleListener);
    }

    public void announceForAccessibilityIfNecessary(String str) {
        if (getInAppMessageView() instanceof IInAppMessageImmersiveView) {
            String message = getInAppMessage().getMessage();
            if (getInAppMessage() instanceof IInAppMessageImmersive) {
                IInAppMessage inAppMessage = getInAppMessage();
                j.d(inAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageImmersive");
                String header = ((IInAppMessageImmersive) inAppMessage).getHeader();
                View inAppMessageView = getInAppMessageView();
                inAppMessageView.announceForAccessibility(header + " . " + message);
                return;
            }
            getInAppMessageView().announceForAccessibility(message);
        } else if (getInAppMessageView() instanceof InAppMessageHtmlBaseView) {
            getInAppMessageView().announceForAccessibility(str);
        }
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (getInAppMessage().getAnimateOut()) {
            setAnimatingClose(true);
            setAndStartAnimation(false);
            return;
        }
        closeInAppMessageView();
    }

    public void closeInAppMessageView() {
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$closeInAppMessageView$1.INSTANCE, 3, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
            inAppMessageHtmlBaseView = (InAppMessageHtmlBaseView) inAppMessageView;
        } else {
            inAppMessageHtmlBaseView = null;
        }
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new DefaultInAppMessageViewWrapper$closeInAppMessageView$2(this), 3, (Object) null);
            View previouslyFocusedView = getPreviouslyFocusedView();
            if (previouslyFocusedView != null) {
                previouslyFocusedView.requestFocus();
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    public Animation.AnimationListener createAnimationListener(boolean z) {
        if (z) {
            return new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                        DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewWrapper$createAnimationListener$1$onAnimationEnd$1.INSTANCE, 3, (Object) null);
                    DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                    defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            };
        }
        return new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public View.OnClickListener createButtonClickListener() {
        return new f(this, 1);
    }

    public View.OnClickListener createClickListener() {
        return new h(this, 1);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new c();
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createDismissCallbacks$1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object obj) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object obj) {
                j.f(view, "view");
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createTouchAwareListener$1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(view, "inAppMessageView");
        j.f(iInAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        if (ViewUtils.isDeviceNotInTouchMode(view)) {
            int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
        }
        announceForAccessibilityIfNecessary$default(this, null, 1, null);
        iInAppMessageViewLifecycleListener.afterOpened(view, iInAppMessage);
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public InAppMessageCloser getInAppMessageCloser() {
        return this.inAppMessageCloser;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage iInAppMessage) {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (iInAppMessage instanceof InAppMessageSlideup) {
            if (((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP) {
                i = 48;
            } else {
                i = 80;
            }
            layoutParams.gravity = i;
        }
        return layoutParams;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        j.f(activity, "activity");
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        j.e(findViewById, "activity.window.decorVie…yId(android.R.id.content)");
        return (ViewGroup) findViewById;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public boolean isAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(Activity activity) {
        j.f(activity, "activity");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, DefaultInAppMessageViewWrapper$open$1.INSTANCE, 2, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            Companion.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new DefaultInAppMessageViewWrapper$open$2(parentViewGroup, this));
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new DefaultInAppMessageViewWrapper$open$3(height), 3, (Object) null);
        addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
    }

    public void setAndStartAnimation(boolean z) {
        Animation closingAnimation;
        if (z) {
            closingAnimation = getOpeningAnimation();
        } else {
            closingAnimation = getClosingAnimation();
        }
        if (closingAnimation != null) {
            closingAnimation.setAnimationListener(createAnimationListener(z));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(closingAnimation);
        if (closingAnimation != null) {
            closingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z) {
        this.isAnimatingClose = z;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i, e eVar) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : view3);
    }
}
