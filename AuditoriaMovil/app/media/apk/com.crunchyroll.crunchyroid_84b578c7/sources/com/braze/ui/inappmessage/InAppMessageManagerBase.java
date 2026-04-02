package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import kotlin.Metadata;
/* compiled from: InAppMessageManagerBase.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bO\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%R\u0018\u00103\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0018\u00104\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0018\u00105\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0018\u00106\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010#R\u0018\u00107\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u00109\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0011R\u0014\u0010;\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0011R\u0016\u0010>\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0014\u0010H\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "getDefaultInAppMessageViewFactory", "getInAppMessageViewFactory", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "inAppMessageManagerListener", "Lcom/amazon/aps/iva/kb0/q;", "setCustomInAppMessageManagerListener", "", "doesClickOutsideModalViewDismissInAppMessageViewField", "Z", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "()Z", "setShouldNextUnregisterBeSkipped", "(Z)V", "doesBackButtonDismissInAppMessageViewField", "Landroid/app/Activity;", "mActivity", "Landroid/app/Activity;", "getMActivity$annotations", "()V", "Landroid/content/Context;", "mApplicationContext", "Landroid/content/Context;", "getMApplicationContext$annotations", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "defaultHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageSlideupViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageModalViewFactory", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactoryField", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "defaultInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "defaultInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "customInAppMessageViewFactory", "customInAppMessageAnimationFactory", "customInAppMessageManagerListener", "customInAppMessageViewWrapperFactory", "customHtmlInAppMessageActionListener", "customControlInAppMessageManagerListener", "getDoesClickOutsideModalViewDismissInAppMessageView", "doesClickOutsideModalViewDismissInAppMessageView", "getDoesBackButtonDismissInAppMessageView", "doesBackButtonDismissInAppMessageView", "getActivity", "()Landroid/app/Activity;", "activity", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "getInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "getControlInAppMessageManagerListener", "controlInAppMessageManagerListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "htmlInAppMessageActionListener", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageViewWrapperFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactory", "<init>", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageManagerBase {
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;
    private IInAppMessageManagerListener customInAppMessageManagerListener;
    private IInAppMessageViewFactory customInAppMessageViewFactory;
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    protected Activity mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    /* compiled from: InAppMessageManagerBase.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        if (iInAppMessageManagerListener == null) {
            return this.defaultInAppMessageManagerListener;
        }
        return iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageManagerBase$getDefaultInAppMessageViewFactory$1(iInAppMessage), 2, (Object) null);
                            return null;
                        }
                        return this.inAppMessageHtmlViewFactory;
                    }
                    return this.inAppMessageHtmlFullViewFactory;
                }
                return this.inAppMessageFullViewFactory;
            }
            return this.inAppMessageModalViewFactory;
        }
        return this.inAppMessageSlideupViewFactory;
    }

    public boolean getDoesBackButtonDismissInAppMessageView() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public boolean getDoesClickOutsideModalViewDismissInAppMessageView() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        if (iHtmlInAppMessageActionListener == null) {
            return this.defaultHtmlInAppMessageActionListener;
        }
        return iHtmlInAppMessageActionListener;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        if (iInAppMessageAnimationFactory == null) {
            return this.inAppMessageAnimationFactoryField;
        }
        return iInAppMessageAnimationFactory;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        if (iInAppMessageManagerListener == null) {
            return this.defaultInAppMessageManagerListener;
        }
        return iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        if (iInAppMessageViewFactory == null) {
            return getDefaultInAppMessageViewFactory(iInAppMessage);
        }
        return iInAppMessageViewFactory;
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        if (iInAppMessageViewWrapperFactory == null) {
            return this.defaultInAppMessageViewWrapperFactory;
        }
        return iInAppMessageViewWrapperFactory;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageManagerBase$setCustomInAppMessageManagerListener$1.INSTANCE, 3, (Object) null);
        this.customInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void setShouldNextUnregisterBeSkipped(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageManagerBase$shouldNextUnregisterBeSkipped$1(z), 3, (Object) null);
        this.shouldNextUnregisterBeSkipped = z;
    }
}
