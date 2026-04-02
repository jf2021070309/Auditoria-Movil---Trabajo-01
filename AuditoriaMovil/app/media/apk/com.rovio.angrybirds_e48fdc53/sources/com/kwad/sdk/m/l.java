package com.kwad.sdk.m;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.s;
/* loaded from: classes3.dex */
public final class l {
    private static Application aMX;

    public static Application KR() {
        checkInit();
        Application KS = KS();
        if (i.KP()) {
            aMX = (Application) i.wrapContextIfNeed(KS);
        }
        return aMX;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.Application KS() {
        /*
            android.app.Application r0 = com.kwad.sdk.m.l.aMX
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.HA()
            android.content.Context r0 = r0.getApplicationContext()
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L16
            android.app.Application r0 = (android.app.Application) r0
        L13:
            com.kwad.sdk.m.l.aMX = r0
            return r0
        L16:
            boolean r1 = at(r0)
            if (r1 == 0) goto L21
            android.content.Context r0 = com.kwad.sdk.m.i.dq(r0)
            goto L34
        L21:
            boolean r1 = com.kwad.sdk.m.j.at(r0)
            if (r1 == 0) goto L2c
            android.content.Context r0 = com.kwad.sdk.m.j.dq(r0)
            goto L34
        L2c:
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.HA()
            android.content.Context r0 = r0.getApplicationContext()
        L34:
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L3e
            r1 = r0
            android.app.Application r1 = (android.app.Application) r1
        L3b:
            com.kwad.sdk.m.l.aMX = r1
            goto L61
        L3e:
            com.kwad.sdk.core.c.b r1 = com.kwad.sdk.core.c.b.AT()
            android.app.Application r1 = r1.getApplication()
            if (r1 == 0) goto L49
            goto L3b
        L49:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L61
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            if (r1 == 0) goto L5a
            android.content.Context r1 = r1.getApplicationContext()
        L5a:
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L61
            android.app.Application r1 = (android.app.Application) r1
            goto L3b
        L61:
            android.app.Application r1 = com.kwad.sdk.m.l.aMX
            if (r1 != 0) goto L6b
            android.app.Application r1 = KT()
            com.kwad.sdk.m.l.aMX = r1
        L6b:
            android.app.Application r0 = dx(r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.m.l.KS():android.app.Application");
    }

    private static Application KT() {
        Application application = (Application) s.a("android.app.ActivityThread", "currentApplication", new Object[0]);
        return application != null ? application : (Application) s.a("android.app.AppGlobals", "getInitialApplication", new Object[0]);
    }

    public static View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return dA(context).inflate(i, viewGroup, false);
    }

    public static void a(Application application) {
        if (aMX == null) {
            aMX = application;
        }
    }

    private static void a(LayoutInflater layoutInflater) {
        s.a(layoutInflater, "mFactory", (Object) null);
        s.a(layoutInflater, "mFactory2", (Object) null);
    }

    private static boolean at(Context context) {
        return context instanceof a;
    }

    public static LayoutInflater b(Context context, Context context2) {
        LayoutInflater cloneInContext = LayoutInflater.from(dB(context)).cloneInContext(context2);
        a(cloneInContext);
        return cloneInContext;
    }

    private static void checkInit() {
        if (e.KM().Jo()) {
            return;
        }
        ServiceProvider.b(new RuntimeException("please init KSPlugin"));
    }

    public static LayoutInflater dA(Context context) {
        Context wrapContextIfNeed = wrapContextIfNeed(context);
        boolean at = j.at(wrapContextIfNeed);
        LayoutInflater from = LayoutInflater.from(wrapContextIfNeed);
        if (at) {
            a(from);
        }
        return from;
    }

    private static Context dB(Context context) {
        return context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context;
    }

    public static int ds(Context context) {
        if (!(context instanceof ContextThemeWrapper)) {
            if (context instanceof android.support.v7.view.ContextThemeWrapper) {
                return ((android.support.v7.view.ContextThemeWrapper) context).getThemeResId();
            }
            return 0;
        }
        Object f = s.f(context, "getThemeResId", new Object[0]);
        if (f != null) {
            return ((Integer) f).intValue();
        }
        return 0;
    }

    public static Activity dt(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        Context dv = dv(context);
        if (dv instanceof Activity) {
            return (Activity) dv;
        }
        com.kwad.sdk.core.c.b.AT();
        return com.kwad.sdk.core.c.b.getCurrentActivity();
    }

    private static Context du(Context context) {
        RuntimeException runtimeException;
        if (!i.KP() || at(context)) {
            if (!i.KP() && !j.at(context)) {
                boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
                runtimeException = new RuntimeException("expect ResContext in external --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish);
            }
            return context;
        }
        boolean hasInitFinish2 = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
        runtimeException = new RuntimeException("expect KSContext in external --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish2);
        ServiceProvider.b(runtimeException);
        return context;
    }

    public static Context dv(Context context) {
        checkInit();
        if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal() && !dy(context)) {
            return dw(at(context) ? i.dp(context) : j.unwrapContextIfNeed(context));
        }
        return context;
    }

    private static Context dw(Context context) {
        if (j.at(context) || (context instanceof a)) {
            boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
            ServiceProvider.b(new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish));
        }
        return context;
    }

    private static Application dx(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
        ServiceProvider.b(new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish + "--isExternal:" + ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal()));
        return null;
    }

    public static boolean dy(Context context) {
        return (at(context) || j.at(context)) ? false : true;
    }

    public static Context dz(Context context) {
        if (j.at(context)) {
            context = j.as(context);
        }
        if (context instanceof a) {
            context = ((a) context).getDelegatedContext();
        }
        if (dy(context)) {
            return context;
        }
        for (int i = 0; i < 5; i++) {
            if (j.at(context)) {
                context = j.as(context);
            }
            if (context instanceof a) {
                context = ((a) context).getDelegatedContext();
            }
            if (dy(context)) {
                return context;
            }
        }
        return context;
    }

    public static void h(Activity activity) {
        j.onDestroy(activity);
    }

    public static View inflate(Context context, int i, ViewGroup viewGroup) {
        return dA(context).inflate(i, viewGroup);
    }

    public static Context wrapContextIfNeed(Context context) {
        checkInit();
        if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal()) {
            return du(i.KP() ? i.wrapContextIfNeed(context) : j.wrapContextIfNeed(context));
        }
        return context;
    }

    public static void x(Context context, boolean z) {
        try {
            context.getSharedPreferences("kssdk_api_pref", 0).edit().putBoolean("useContextClassLoader", z).apply();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }
}
