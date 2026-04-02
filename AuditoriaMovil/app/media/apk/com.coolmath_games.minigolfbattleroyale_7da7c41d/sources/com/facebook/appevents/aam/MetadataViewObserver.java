package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* compiled from: MetadataViewObserver.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processedText", "", "", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalFocusChanged", "", "oldView", "Landroid/view/View;", "newView", "process", ViewHierarchyConstants.VIEW_KEY, "processEditText", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "startTracking", "stopTracking", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Set<String> processedText;
    private final Handler uiThreadHandler;
    public static final Companion Companion = new Companion(null);
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();

    @JvmStatic
    public static final void startTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.startTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    @JvmStatic
    public static final void stopTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.stopTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$processEditText(MetadataViewObserver metadataViewObserver, View view) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.processEditText(view);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void startTracking() {
        View rootView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true) || (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) == null) {
                return;
            }
            ViewTreeObserver observer = rootView.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(observer, "observer");
            if (observer.isAlive()) {
                observer.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void stopTracking() {
        View rootView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver observer = rootView.getViewTreeObserver();
                Intrinsics.checkNotNullExpressionValue(observer, "observer");
                if (observer.isAlive()) {
                    observer.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (view != null) {
            try {
                process(view);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (view2 != null) {
            process(view2);
        }
    }

    private final void process(final View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            runOnUIThread(new Runnable() { // from class: com.facebook.appevents.aam.MetadataViewObserver$process$runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (!CrashShieldHandler.isObjectCrashing(this) && (view instanceof EditText)) {
                            MetadataViewObserver.access$processEditText(MetadataViewObserver.this, view);
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void processEditText(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            }
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = StringsKt.trim((CharSequence) obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                List<String> list = null;
                for (MetadataRule metadataRule : MetadataRule.Companion.getRules()) {
                    String preNormalize = Companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (!(metadataRule.getValRule().length() > 0) || MetadataMatcher.matchValue(preNormalize, metadataRule.getValRule())) {
                        if (!MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                            if (list == null) {
                                list = MetadataMatcher.getAroundViewIndicators(view);
                            }
                            if (MetadataMatcher.matchIndicator(list, metadataRule.getKeyRules())) {
                                Companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                            }
                        } else {
                            Companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                        }
                    }
                }
                InternalAppEventsLogger.Companion.setInternalUserData(hashMap);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(mainLooper, "Looper.getMainLooper()");
            if (currentThread == mainLooper.getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: MetadataViewObserver.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J,\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "preNormalize", "", SDKConstants.PARAM_KEY, "value", "putUserData", "", "userData", "startTrackingActivity", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startTrackingActivity(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new MetadataViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) obj);
        }

        @JvmStatic
        public final void stopTrackingActivity(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().get(Integer.valueOf(hashCode));
            if (metadataViewObserver != null) {
                MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(hashCode));
                MetadataViewObserver.access$stopTracking(metadataViewObserver);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String preNormalize(String str, String str2) {
            if (Intrinsics.areEqual("r2", str)) {
                return new Regex("[^\\d.]").replace(str2, "");
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
            if (r8.equals("r5") != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
            if (r8.equals("r4") != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
            r9 = new kotlin.text.Regex("[^a-z]+").replace(r9, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void putUserData(java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8, java.lang.String r9) {
            /*
                r6 = this;
                int r0 = r8.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L63;
                    case 3586: goto L4b;
                    case 3587: goto L42;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L88
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L88
                r0 = r9
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r4 = "-"
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r1 = kotlin.text.StringsKt.contains$default(r0, r5, r3, r2, r1)
                if (r1 == 0) goto L88
                kotlin.text.Regex r9 = new kotlin.text.Regex
                r9.<init>(r4)
                java.util.List r9 = r9.split(r0, r3)
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r9 = r9.toArray(r0)
                if (r9 == 0) goto L3a
                java.lang.String[] r9 = (java.lang.String[]) r9
                r9 = r9[r3]
                goto L88
            L3a:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
                r7.<init>(r8)
                throw r7
            L42:
                java.lang.String r0 = "r5"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L88
                goto L53
            L4b:
                java.lang.String r0 = "r4"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L88
            L53:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r9 = r0.replace(r9, r1)
                goto L88
            L63:
                java.lang.String r0 = "r3"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L88
                java.lang.String r0 = "m"
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r9, r0, r3, r2, r1)
                if (r4 != 0) goto L87
                java.lang.String r4 = "b"
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r9, r4, r3, r2, r1)
                if (r4 != 0) goto L87
                java.lang.String r4 = "ge"
                boolean r9 = kotlin.text.StringsKt.startsWith$default(r9, r4, r3, r2, r1)
                if (r9 == 0) goto L84
                goto L87
            L84:
                java.lang.String r9 = "f"
                goto L88
            L87:
                r9 = r0
            L88:
                r7.put(r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.aam.MetadataViewObserver.Companion.putUserData(java.util.Map, java.lang.String, java.lang.String):void");
        }
    }
}
