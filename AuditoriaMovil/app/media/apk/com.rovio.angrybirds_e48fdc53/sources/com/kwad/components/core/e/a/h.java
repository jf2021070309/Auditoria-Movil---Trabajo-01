package com.kwad.components.core.e.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class h implements d {
    private static WeakReference<Window> Jr;
    private g Jo;
    private b Jp;
    private WeakReference<Activity> Jq;
    private ViewGroup ok;
    private boolean ol;
    private final com.kwad.sdk.core.c.c<Activity> xn = new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.core.e.a.h.1
        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityDestroyed */
        public final void d(Activity activity) {
            super.d(activity);
            com.kwad.sdk.core.c.b.AT();
            com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
            if (activity.equals((Activity) h.this.Jq.get())) {
                h.this.fk();
            }
        }
    };

    public static void a(Window window) {
        Jr = new WeakReference<>(window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fk() {
        g gVar;
        if (this.ol) {
            return;
        }
        this.ol = true;
        this.Jp.fj();
        ViewGroup viewGroup = this.ok;
        if (viewGroup != null && (gVar = this.Jo) != null) {
            viewGroup.removeView(gVar);
        }
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this.xn);
    }

    public static void mY() {
        WeakReference<Window> weakReference = Jr;
        if (weakReference != null) {
            weakReference.clear();
        }
        Jr = null;
    }

    public final boolean b(AdTemplate adTemplate, b bVar) {
        try {
            this.Jp = bVar;
            com.kwad.sdk.core.c.b.AT();
            Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
            if (currentActivity != null && !currentActivity.isFinishing()) {
                WeakReference<Window> weakReference = Jr;
                View findViewById = (weakReference != null ? weakReference.get() : currentActivity.getWindow()).getDecorView().findViewById(16908290);
                if (findViewById instanceof ViewGroup) {
                    this.Jq = new WeakReference<>(currentActivity);
                    this.Jo = new g(l.wrapContextIfNeed(currentActivity), adTemplate, this);
                    com.kwad.sdk.core.c.b.AT();
                    com.kwad.sdk.core.c.b.a(this.xn);
                    this.ok = (ViewGroup) findViewById;
                    this.ok.addView(this.Jo, new ViewGroup.LayoutParams(-1, -1));
                    bVar.mP();
                    return true;
                }
                return false;
            }
            com.kwad.sdk.core.e.c.d("InstalledActivateViewHelper", "showInWindow fail activity:" + currentActivity);
            return false;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.d("InstalledActivateViewHelper", "showInWindow fail error:" + th);
            com.kwad.sdk.core.e.c.printStackTrace(th);
            return false;
        }
    }

    @Override // com.kwad.components.core.e.a.d
    public final void mQ() {
        fk();
    }
}
