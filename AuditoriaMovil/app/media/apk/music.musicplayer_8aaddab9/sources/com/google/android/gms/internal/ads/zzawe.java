package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashSet;
@TargetApi(14)
/* loaded from: classes.dex */
public final class zzawe implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) zzbet.zzc().zzc(zzbjl.zzaR)).longValue();
    @VisibleForTesting
    public BroadcastReceiver zza;
    public final WeakReference<View> zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference<ViewTreeObserver> zzi;
    private zzawq zzj;
    private final com.google.android.gms.ads.internal.util.zzcc zzk = new com.google.android.gms.ads.internal.util.zzcc(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet<zzawd> zzn = new HashSet<>();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzawe(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzawq(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzb;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzt.zze().zzg(view)) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void zzh() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzawa
            private final zzawe zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    private final void zzi(Activity activity, int i2) {
        Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzb.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzm = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012d, code lost:
        r3 = true;
        r11 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(int r33) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawe.zzj(int):void");
    }

    private final int zzk(int i2) {
        return (int) (i2 / this.zzo.density);
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzawb(this);
            com.google.android.gms.ads.internal.zzt.zzx().zzb(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e2) {
                zzcgt.zzg("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e2) {
            zzcgt.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            zzcgt.zzg("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzx().zzc(this.zzd, this.zza);
            } catch (IllegalStateException e4) {
                zzcgt.zzg("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e6) {
                zzcgt.zzg("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzh();
        zzm(view);
    }

    public final void zza(zzawd zzawdVar) {
        this.zzn.add(zzawdVar);
        zzj(3);
    }

    public final void zzb(zzawd zzawdVar) {
        this.zzn.remove(zzawdVar);
    }

    public final Rect zzd(Rect rect) {
        return new Rect(zzk(rect.left), zzk(rect.top), zzk(rect.right), zzk(rect.bottom));
    }

    public final void zze(long j2) {
        this.zzk.zzb(j2);
    }

    public final void zzf() {
        this.zzk.zzb(zzc);
    }

    public final /* synthetic */ void zzg() {
        zzj(3);
    }
}
