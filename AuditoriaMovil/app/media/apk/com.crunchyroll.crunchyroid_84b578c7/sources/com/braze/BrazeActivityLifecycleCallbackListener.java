package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.Braze;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BrazeActivityLifecycleCallbackListener.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lcom/amazon/aps/iva/kb0/q;", "onActivityStarted", "onActivityStopped", "onActivityResumed", "onActivityPaused", "Landroid/os/Bundle;", "bundle", "onActivityCreated", "onActivitySaveInstanceState", "onActivityDestroyed", "", "forSessionHandling", "shouldHandleLifecycleMethodsInActivity", "sessionHandlingEnabled", "Z", "registerInAppMessageManager", "", "Ljava/lang/Class;", "inAppMessagingRegistrationBlocklist", "Ljava/util/Set;", "sessionHandlingBlocklist", "<init>", "(ZZLjava/util/Set;Ljava/util/Set;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.BrazeActivityLifecycleCallbackListener$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements a<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + BrazeActivityLifecycleCallbackListener.this.inAppMessagingRegistrationBlocklist;
        }
    }

    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.braze.BrazeActivityLifecycleCallbackListener$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements a<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + BrazeActivityLifecycleCallbackListener.this.sessionHandlingBlocklist;
        }
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z;
        this.registerInAppMessageManager = z2;
        b0 b0Var = b0.b;
        this.inAppMessagingRegistrationBlocklist = set == null ? b0Var : set;
        this.sessionHandlingBlocklist = set2 == null ? b0Var : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new AnonymousClass1(), 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new AnonymousClass2(), 2, (Object) null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityCreated$1(activity), 2, (Object) null);
            BrazeInAppMessageManager companion = BrazeInAppMessageManager.Companion.getInstance();
            Context applicationContext = activity.getApplicationContext();
            j.e(applicationContext, "activity.applicationContext");
            companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityPaused$1(activity), 2, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j.f(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityResumed$1(activity), 2, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        j.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        j.f(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityStarted$1(activity), 2, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            j.e(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityStopped$1(activity), 2, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            j.e(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z) {
        j.f(activity, "activity");
        Class<?> cls = activity.getClass();
        if (j.a(cls, NotificationTrampolineActivity.class)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, BrazeActivityLifecycleCallbackListener$shouldHandleLifecycleMethodsInActivity$1.INSTANCE, 2, (Object) null);
            return false;
        }
        if (z) {
            if (this.sessionHandlingBlocklist.contains(cls)) {
                return false;
            }
        } else if (this.inAppMessagingRegistrationBlocklist.contains(cls)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean r2, boolean r3, java.util.Set r4, java.util.Set r5, int r6, com.amazon.aps.iva.yb0.e r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            r0 = 1
            if (r7 == 0) goto L6
            r2 = r0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r7 = r6 & 4
            com.amazon.aps.iva.lb0.b0 r0 = com.amazon.aps.iva.lb0.b0.b
            if (r7 == 0) goto L12
            r4 = r0
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L17
            r5 = r0
        L17:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeActivityLifecycleCallbackListener.<init>(boolean, boolean, java.util.Set, java.util.Set, int, com.amazon.aps.iva.yb0.e):void");
    }
}
