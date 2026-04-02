package com.kwad.sdk.core.c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.kwad.sdk.api.core.KSLifecycleListener;
import com.kwad.sdk.api.core.KSLifecycleObserver;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.utils.bk;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b implements c<Activity> {
    private static volatile b aoC;
    private static final List<c> mListeners = new CopyOnWriteArrayList();
    private final AtomicBoolean IW = new AtomicBoolean(false);
    private Application mApplication;

    private b() {
    }

    public static b AT() {
        if (aoC == null) {
            synchronized (b.class) {
                if (aoC == null) {
                    aoC = new b();
                }
            }
        }
        return aoC;
    }

    public static boolean AU() {
        try {
            if (bk.at(((e) ServiceProvider.get(e.class)).getApiVersion(), "3.3.26")) {
                return KSLifecycleObserver.getInstance().isEnable();
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static void a(c cVar) {
        mListeners.add(cVar);
    }

    public static void b(c cVar) {
        mListeners.remove(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void c(com.kwad.sdk.g.a<c> aVar) {
        for (c cVar : mListeners) {
            if (cVar != null) {
                aVar.accept(cVar);
            }
        }
    }

    public static Activity getCurrentActivity() {
        if (AU()) {
            return KSLifecycleObserver.getInstance().getCurrentActivity();
        }
        if (a.AR().isEnable()) {
            return a.AR().getCurrentActivity();
        }
        return null;
    }

    public static boolean isAppOnForeground() {
        if (AU()) {
            return KSLifecycleObserver.getInstance().isAppOnForeground();
        }
        if (a.AR().isEnable()) {
            return a.AR().isAppOnForeground();
        }
        return false;
    }

    public static boolean isEnable() {
        return AU() || a.AR().isEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.c.c
    /* renamed from: onActivityCreated */
    public void a(final Activity activity, final Bundle bundle) {
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: c */
            public void accept(c cVar) {
                cVar.a(activity, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.c.c
    /* renamed from: onActivityDestroyed */
    public void d(final Activity activity) {
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: c */
            public void accept(c cVar) {
                cVar.d(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.c.c
    /* renamed from: onActivityPaused */
    public void b(final Activity activity) {
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: c */
            public void accept(c cVar) {
                cVar.b(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.c.c
    /* renamed from: onActivityResumed */
    public void c(final Activity activity) {
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: c */
            public void accept(c cVar) {
                cVar.c(activity);
            }
        });
    }

    public final Application getApplication() {
        return this.mApplication;
    }

    public final void init(Context context) {
        if (this.IW.get() || context == null) {
            return;
        }
        this.IW.set(true);
        try {
            if (bk.at(((e) ServiceProvider.get(e.class)).getApiVersion(), "3.3.26")) {
                this.mApplication = KSLifecycleObserver.getInstance().getApplication();
                KSLifecycleObserver.getInstance().registerLifecycleListener(new KSLifecycleListener() { // from class: com.kwad.sdk.core.c.b.1
                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.1
                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.kwad.sdk.g.a
                            /* renamed from: c */
                            public void accept(c cVar) {
                                cVar.a(activity, bundle);
                            }
                        });
                    }

                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onActivityDestroyed(final Activity activity) {
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.4
                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.kwad.sdk.g.a
                            /* renamed from: c */
                            public void accept(c cVar) {
                                cVar.d(activity);
                            }
                        });
                    }

                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onActivityPaused(final Activity activity) {
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.3
                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.kwad.sdk.g.a
                            /* renamed from: c */
                            public void accept(c cVar) {
                                cVar.b(activity);
                            }
                        });
                    }

                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onActivityResumed(final Activity activity) {
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.2
                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.kwad.sdk.g.a
                            /* renamed from: c */
                            public void accept(c cVar) {
                                cVar.c(activity);
                            }
                        });
                    }

                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onBackToBackground() {
                        com.kwad.sdk.core.e.c.J("LifecycleHolder", "onBackToBackground");
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.6
                            private static void c(c cVar) {
                                cVar.onBackToBackground();
                            }

                            @Override // com.kwad.sdk.g.a
                            public final /* synthetic */ void accept(c cVar) {
                                c(cVar);
                            }
                        });
                    }

                    @Override // com.kwad.sdk.api.core.KSLifecycleListener
                    public final void onBackToForeground() {
                        com.kwad.sdk.core.e.c.J("LifecycleHolder", "onBackToForeground");
                        b bVar = b.this;
                        b.c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.1.5
                            private static void c(c cVar) {
                                cVar.onBackToForeground();
                            }

                            @Override // com.kwad.sdk.g.a
                            public final /* synthetic */ void accept(c cVar) {
                                c(cVar);
                            }
                        });
                    }
                });
            } else {
                com.kwad.sdk.core.e.c.J("LifecycleHolder", "init KSLifecycleObserver not support");
            }
        } catch (Throwable th) {
        }
        Application KR = l.KR();
        if (KR != null) {
            this.mApplication = KR;
            a.AR().init(this.mApplication);
            a.AR().a(this);
        }
    }

    @Override // com.kwad.sdk.core.c.c
    public final void onBackToBackground() {
        com.kwad.sdk.core.e.c.J("LifecycleHolder", "onBackToBackground old");
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.7
            private static void c(c cVar) {
                cVar.onBackToBackground();
            }

            @Override // com.kwad.sdk.g.a
            public final /* synthetic */ void accept(c cVar) {
                c(cVar);
            }
        });
    }

    @Override // com.kwad.sdk.core.c.c
    public final void onBackToForeground() {
        com.kwad.sdk.core.e.c.J("LifecycleHolder", "onBackToForeground old");
        c(new com.kwad.sdk.g.a<c>() { // from class: com.kwad.sdk.core.c.b.6
            private static void c(c cVar) {
                cVar.onBackToForeground();
            }

            @Override // com.kwad.sdk.g.a
            public final /* synthetic */ void accept(c cVar) {
                c(cVar);
            }
        });
    }
}
