package com.kuaishou.weapon.p0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public class cz {
    private static volatile cz b;
    private Context a;
    private Application.ActivityLifecycleCallbacks c;
    private boolean d;

    private cz(Context context) {
        this.a = context;
    }

    public static cz a(Context context) {
        if (b == null) {
            synchronized (cz.class) {
                if (b == null) {
                    b = new cz(context);
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Context context = this.a;
            if (context == null) {
                return;
            }
            h a = h.a(context, "re_po_rt");
            if (a.b(de.w, 0) == 0) {
                return;
            }
            final int[] iArr = {0};
            final int[] iArr2 = {a.b(de.k, 1)};
            if (this.a instanceof Application) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.kuaishou.weapon.p0.cz.2
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        try {
                            int[] iArr3 = iArr;
                            iArr3[0] = iArr3[0] + 1;
                            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cz.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (iArr[0] < 20 && iArr2[0] <= 0) {
                                        ((Application) cz.this.a).unregisterActivityLifecycleCallbacks(cz.this.c);
                                        return;
                                    }
                                    int[] iArr4 = iArr2;
                                    iArr4[0] = iArr4[0] - 1;
                                    cw.a(cz.this.a).a(106);
                                    dc.a(cz.this.a).a(106);
                                    da.a(cz.this.a).a(106, 0);
                                    cx.a(cz.this.a).a(106);
                                    cy.a(cz.this.a).a(106);
                                    dd.a(cz.this.a).a(106);
                                }
                            });
                        } catch (Throwable th) {
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                    }
                };
                this.c = activityLifecycleCallbacks;
                ((Application) this.a).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        } catch (Throwable th) {
        }
    }

    public void a() {
        try {
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cz.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        h a = h.a(cz.this.a, "re_po_rt");
                        boolean e = a.e("a1_p_s_p_s");
                        boolean e2 = a.e("a1_p_s_p_s_c_b");
                        if ((e || e2) && !cz.this.d) {
                            cz.this.d = true;
                            cz.this.b();
                        }
                    } catch (Throwable th) {
                    }
                }
            });
        } catch (Throwable th) {
        }
    }
}
