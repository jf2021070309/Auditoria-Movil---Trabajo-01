package com.kwad.sdk.m;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.kwad.sdk.service.ServiceProvider;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class i {
    private static final String CLAZZ_NAME = i.class.getName();
    private static final ThreadLocal<a> sAutoUnWrapModelTL = new ThreadLocal<>();
    private static final List<String> sAutoUnWrapStackList = new CopyOnWriteArrayList();
    private static final Map<Context, Context> sResContextCache = new WeakHashMap();
    private static final AtomicBoolean aMR = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        private WeakReference<Context> afs;
        private int aft;
        private StackTraceElement[] afu;
        private int afv;
        private long afw;

        private a() {
            this.afs = new WeakReference<>(null);
            this.aft = 0;
            this.afu = null;
            this.afv = 0;
        }

        /* synthetic */ a(byte b) {
            this();
        }

        static /* synthetic */ int c(a aVar) {
            int i = aVar.aft;
            aVar.aft = i + 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.afs = new WeakReference<>(null);
            this.aft = 0;
            this.afu = null;
            this.afv = 0;
            this.afw = 0L;
        }

        static /* synthetic */ int g(a aVar) {
            int i = aVar.afv;
            aVar.afv = i + 1;
            return i;
        }
    }

    public static boolean KP() {
        return aMR.get();
    }

    private static void a(final Context context, Context context2) {
        sResContextCache.put(context, context2);
        if (context instanceof Activity) {
            com.kwad.sdk.core.c.b.AT();
            com.kwad.sdk.core.c.b.a(new com.kwad.sdk.core.c.d() { // from class: com.kwad.sdk.m.i.1
                @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
                /* renamed from: onActivityDestroyed */
                public final void d(Activity activity) {
                    if (activity == context) {
                        com.kwad.sdk.core.c.b.AT();
                        com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
                        i.onDestroy(context);
                    }
                }
            });
        }
    }

    private static boolean a(Context context, a aVar) {
        String str;
        Context context2 = sResContextCache.get(context);
        String name = context2 != null ? context2.getClass().getName() : "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (!Arrays.equals(stackTrace, aVar.afu)) {
            if (aVar.afu != null) {
                aVar.clear();
                return false;
            }
            aVar.afu = stackTrace;
            int i = 0;
            int i2 = 0;
            while (i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                for (String str2 : getAutoUnWrapStackList()) {
                    if (!TextUtils.isEmpty(str2) && className.contains(str2)) {
                        str = "needAutoUnWrap true 命中白名单";
                    }
                }
                String methodName = stackTraceElement.getMethodName();
                i++;
                if (i < stackTrace.length && CLAZZ_NAME.equals(className) && "wrapContextIfNeed".equals(methodName)) {
                    StackTraceElement stackTraceElement2 = stackTrace[i];
                    if (TextUtils.equals(name, stackTraceElement2.getClassName()) && "getBaseContext".equals(stackTraceElement2.getMethodName()) && (i2 = i2 + 1) >= 5) {
                        return true;
                    }
                }
            }
            return false;
        }
        a.g(aVar);
        aVar.afu = stackTrace;
        if (aVar.afv < 5) {
            return false;
        }
        str = "needAutoUnWrap true 连续相同堆栈";
        Log.d("Wrapper", str);
        return true;
    }

    public static void bW(boolean z) {
        aMR.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dp(Context context) {
        if (context instanceof com.kwad.sdk.m.a) {
            context = ((com.kwad.sdk.m.a) context).getDelegatedContext();
        }
        if (l.dy(context)) {
            return context;
        }
        RuntimeException runtimeException = null;
        for (int i = 0; i < 10; i++) {
            if (runtimeException == null) {
                boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
                RuntimeException runtimeException2 = new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish);
                ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(runtimeException2);
                runtimeException = runtimeException2;
            }
            if (j.at(context)) {
                context = j.as(context);
            }
            if (context instanceof com.kwad.sdk.m.a) {
                context = ((com.kwad.sdk.m.a) context).getDelegatedContext();
            }
            if (l.dy(context)) {
                return context;
            }
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dq(Context context) {
        if (context instanceof Application) {
            return context;
        }
        Context applicationContext = dp(context).getApplicationContext();
        if (applicationContext instanceof Application) {
            return applicationContext;
        }
        for (int i = 0; i < 10; i++) {
            applicationContext = applicationContext.getApplicationContext();
            if (applicationContext instanceof Application) {
                return applicationContext;
            }
            if (applicationContext instanceof com.kwad.sdk.m.a) {
                applicationContext = ((com.kwad.sdk.m.a) applicationContext).getDelegatedContext();
            }
        }
        return applicationContext;
    }

    private static List<String> getAutoUnWrapStackList() {
        List<String> list = sAutoUnWrapStackList;
        if (list.isEmpty()) {
            list.add("com.sensorsdata.analytics.android.sdk");
        }
        return list;
    }

    public static void onDestroy(Context context) {
        sResContextCache.remove(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader replaceExternalClassLoader(ClassLoader classLoader) {
        ClassLoader classLoader2 = e.KM().getClassLoader();
        return classLoader2 != null ? classLoader2 : classLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources.Theme replaceTheme(Resources.Theme theme, Resources.Theme theme2, int i) {
        Resources resources = e.KM().getResources();
        if (resources != null) {
            if (theme2 == null) {
                Resources.Theme newTheme = resources.newTheme();
                newTheme.applyStyle(i, true);
                return newTheme;
            }
            return theme2;
        }
        return theme;
    }

    private static boolean returnUnWrappedContext(Context context) {
        ThreadLocal<a> threadLocal = sAutoUnWrapModelTL;
        a aVar = threadLocal.get();
        if (aVar == null) {
            threadLocal.set(new a((byte) 0));
        } else if (aVar.afs.get() != context || Math.abs(System.currentTimeMillis() - aVar.afw) >= 150) {
            aVar.clear();
            aVar.afs = new WeakReference(context);
            aVar.afw = System.currentTimeMillis();
        } else {
            a.c(aVar);
            if (aVar.aft >= (context instanceof Application ? 15 : 5) && a(context, aVar)) {
                aVar.clear();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context wrapContextIfNeed(Context context) {
        Context fVar;
        if (context == null) {
            ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new RuntimeException("KSWrapper wrapContextIfNeed context is null"));
            return null;
        } else if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal() && !(context instanceof com.kwad.sdk.m.a)) {
            if (j.at(context)) {
                context = j.unwrapContextIfNeed(context);
                if (j.at(context)) {
                    ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new RuntimeException("KSWrapper unwrapContextIfNeed fail"));
                    return context;
                }
            }
            Context context2 = sResContextCache.get(context);
            if (context2 instanceof com.kwad.sdk.m.a) {
                return context2;
            }
            if (k.dr(context)) {
                return context;
            }
            if (returnUnWrappedContext(context)) {
                ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new RuntimeException("KSWrapper returnUnWrappedContext context: " + context.getClass().getName()));
                return context;
            }
            if (context instanceof Application) {
                try {
                    fVar = new f((Application) context, new g(context, e.KM()));
                    l.a((Application) fVar);
                } catch (Throwable th) {
                    boolean hasInitFinish = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).hasInitFinish();
                    ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new RuntimeException("wrapper Application fail --context:" + context.getClass().getName() + "--initFinish:" + hasInitFinish));
                    return context;
                }
            } else {
                fVar = context instanceof ContextThemeWrapper ? new b((ContextThemeWrapper) context) : context instanceof android.support.v7.view.ContextThemeWrapper ? new c((android.support.v7.view.ContextThemeWrapper) context) : context instanceof ContextWrapper ? new d(context) : new d(context);
            }
            a(context, fVar);
            return fVar;
        } else {
            return context;
        }
    }
}
