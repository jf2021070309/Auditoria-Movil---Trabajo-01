package com.braze.ui.inappmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.tb.a;
import com.amazon.aps.iva.y9.g;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001fR&\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u00108\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u0010\u001f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010?\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u00109\u0012\u0004\bB\u0010\u001f\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=¨\u0006E"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "ensureSubscribedToInAppMessageEvents", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "", "requestDisplayInAppMessage", "dismissed", "hideCurrentlyDisplayingInAppMessage", "resetAfterInAppMessageClose", "isCarryOver", "displayInAppMessage", "verifyOrientationStatus", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "()V", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "<init>", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* compiled from: BrazeInAppMessageManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "()V", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "containsPushPermissionPrompt", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            if (iInAppMessage instanceof InAppMessageHtml) {
                return ((InAppMessageHtml) iInAppMessage).isPushPrimer();
            }
            return BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                j.d(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                q qVar = q.a;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                j.d(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* compiled from: BrazeInAppMessageManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new g(this, 1);
    }

    public static final void createInAppMessageEventSubscriber$lambda$8(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent inAppMessageEvent) {
        j.f(brazeInAppMessageManager, "this$0");
        j.f(inAppMessageEvent, "event");
        IInAppMessage inAppMessage = inAppMessageEvent.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, inAppMessageEvent);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    public static final void displayInAppMessage$lambda$7(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        j.f(brazeInAppMessageManager, "this$0");
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$displayInAppMessage$14$1.INSTANCE, 3, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(brazeInAppMessageManager, BrazeLogger.Priority.E, e, BrazeInAppMessageManager$displayInAppMessage$14$2.INSTANCE);
            }
        }
    }

    public static final void ensureSubscribedToInAppMessageEvents$lambda$1(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent sdkDataWipeEvent) {
        j.f(brazeInAppMessageManager, "this$0");
        j.f(sdkDataWipeEvent, "it");
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    public static final BrazeInAppMessageManager getInstance() {
        return Companion.getInstance();
    }

    public void addInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage != null) {
            this.inAppMessageStack.push(iInAppMessage);
            requestDisplayInAppMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ee A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #1 {all -> 0x0212, blocks: (B:160:0x018b, B:175:0x01e7, B:177:0x01ee, B:163:0x0195, B:165:0x019b, B:169:0x01c0, B:170:0x01c5, B:174:0x01e3), top: B:204:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020a  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void displayInAppMessage(com.braze.models.inappmessage.IInAppMessage r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage(com.braze.models.inappmessage.IInAppMessage, boolean):void");
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        j.f(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$1.INSTANCE, 3, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$2.INSTANCE, 3, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.Companion;
        companion.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$4.INSTANCE, 2, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$5.INSTANCE, 2, (Object) null);
        a aVar = new a(this, 1);
        companion.getInstance(context).addSingleSynchronousSubscription(aVar, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = aVar;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public void registerInAppMessageManager(Activity activity) {
        BrazeConfigurationProvider brazeConfigurationProvider;
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazeInAppMessageManager$registerInAppMessageManager$1.INSTANCE, 2, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeInAppMessageManager$registerInAppMessageManager$2(activity), 2, (Object) null);
        this.mActivity = activity;
        if (this.mApplicationContext == null) {
            Context applicationContext = activity.getApplicationContext();
            this.mApplicationContext = applicationContext;
            if (applicationContext == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, BrazeInAppMessageManager$registerInAppMessageManager$3.INSTANCE, 2, (Object) null);
                return;
            }
        }
        if (this.configurationProvider == null) {
            Context context = this.mApplicationContext;
            if (context != null) {
                brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            } else {
                brazeConfigurationProvider = null;
            }
            this.configurationProvider = brazeConfigurationProvider;
        }
        IInAppMessage iInAppMessage = this.carryoverInAppMessage;
        if (iInAppMessage != null) {
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$registerInAppMessageManager$5$1.INSTANCE, 3, (Object) null);
                iInAppMessage.setAnimateIn(false);
                displayInAppMessage(iInAppMessage, true);
            }
            this.carryoverInAppMessage = null;
        } else {
            IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
            if (iInAppMessage2 != null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$registerInAppMessageManager$6$1.INSTANCE, 3, (Object) null);
                addInAppMessage(iInAppMessage2);
                this.unregisteredInAppMessage = null;
            }
        }
        Context context2 = this.mApplicationContext;
        if (context2 != null) {
            ensureSubscribedToInAppMessageEvents(context2);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation beforeInAppMessageDisplayed;
        try {
            if (this.mActivity == null) {
                if (!this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$1.INSTANCE, 2, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$2.INSTANCE, 3, (Object) null);
                }
                return false;
            } else if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$3.INSTANCE, 3, (Object) null);
                return false;
            } else if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$4.INSTANCE, 3, (Object) null);
                return false;
            } else {
                IInAppMessage pop = this.inAppMessageStack.pop();
                if (!pop.isControl()) {
                    beforeInAppMessageDisplayed = getInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$inAppMessageOperation$1.INSTANCE, 3, (Object) null);
                    beforeInAppMessageDisplayed = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
                }
                int i = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$7.INSTANCE, 3, (Object) null);
                            return false;
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$6.INSTANCE, 3, (Object) null);
                        this.inAppMessageStack.push(pop);
                        return false;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$requestDisplayInAppMessage$5.INSTANCE, 3, (Object) null);
                }
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(pop);
                return true;
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, BrazeInAppMessageManager$requestDisplayInAppMessage$8.INSTANCE);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, BrazeInAppMessageManager$resetAfterInAppMessageClose$1.INSTANCE, 2, (Object) null);
        this.inAppMessageViewWrapper = null;
        Activity activity = this.mActivity;
        Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity != null && num != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeInAppMessageManager$resetAfterInAppMessageClose$2(num), 3, (Object) null);
            ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
            this.originalOrientation = null;
        }
    }

    public void unregisterInAppMessageManager(Activity activity) {
        IInAppMessage inAppMessage;
        if (getShouldNextUnregisterBeSkipped()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeInAppMessageManager$unregisterInAppMessageManager$1(activity), 3, (Object) null);
            setShouldNextUnregisterBeSkipped(false);
            return;
        }
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazeInAppMessageManager$unregisterInAppMessageManager$2.INSTANCE, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeInAppMessageManager$unregisterInAppMessageManager$3(activity), 2, (Object) null);
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$unregisterInAppMessageManager$4.INSTANCE, 3, (Object) null);
                ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
            }
            ViewUtils.removeViewFromParent(inAppMessageView);
            if (iInAppMessageViewWrapper.isAnimatingClose()) {
                this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                inAppMessage = null;
            } else {
                inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
            }
            this.carryoverInAppMessage = inAppMessage;
            this.inAppMessageViewWrapper = null;
        } else {
            this.carryoverInAppMessage = null;
        }
        this.mActivity = null;
        this.displayingInAppMessage.set(false);
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        Activity activity = this.mActivity;
        Orientation orientation = iInAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazeInAppMessageManager$verifyOrientationStatus$1.INSTANCE, 2, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$verifyOrientationStatus$2.INSTANCE, 3, (Object) null);
        } else if (orientation == Orientation.ANY) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$verifyOrientationStatus$3.INSTANCE, 3, (Object) null);
        } else if (ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
            if (this.originalOrientation != null) {
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeInAppMessageManager$verifyOrientationStatus$4.INSTANCE, 3, (Object) null);
            this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
            ViewUtils.setActivityRequestedOrientation(activity, 14);
            return true;
        } else {
            return false;
        }
        return true;
    }
}
