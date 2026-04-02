package com.kwad.library.b.c;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.kwad.library.solder.lib.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    private static final String CLAZZ_NAME = a.class.getName();
    private static final ThreadLocal<C0238a> sAutoUnWrapModelTL = new ThreadLocal<>();
    private static final List<String> sAutoUnWrapStackList = new ArrayList();
    private static final Map<String, WeakReference<Context>> sResContextCache = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.library.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0238a {
        private WeakReference<Context> afs;
        private int aft;
        private StackTraceElement[] afu;
        private int afv;
        private long afw;

        private C0238a() {
            this.afs = new WeakReference<>(null);
            this.aft = 0;
            this.afu = null;
            this.afv = 0;
        }

        /* synthetic */ C0238a(byte b) {
            this();
        }

        static /* synthetic */ int c(C0238a c0238a) {
            int i = c0238a.aft;
            c0238a.aft = i + 1;
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

        static /* synthetic */ int g(C0238a c0238a) {
            int i = c0238a.afv;
            c0238a.afv = i + 1;
            return i;
        }
    }

    private static Context a(String str, Context context) {
        Map<String, WeakReference<Context>> map = sResContextCache;
        WeakReference<Context> weakReference = map.get(str + System.identityHashCode(context));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources.Theme a(Resources.Theme theme, Resources.Theme theme2, int i, String str) {
        Resources resources;
        com.kwad.library.b.a bz = bz(str);
        if (bz == null || !bz.isLoaded() || (resources = bz.getResources()) == null) {
            return theme;
        }
        if (theme2 == null) {
            Resources.Theme newTheme = resources.newTheme();
            newTheme.applyStyle(i, true);
            return newTheme;
        }
        return theme2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources a(Resources resources, String str) {
        com.kwad.library.b.a bz = bz(str);
        if (bz == null || !bz.isLoaded()) {
            StringBuilder sb = new StringBuilder("replaceExternalResources pluginId: ");
            sb.append(str);
            sb.append(" , plugin: ");
            sb.append(bz);
            sb.append(", isLoaded(): false");
            return resources;
        }
        Resources resources2 = bz.getResources();
        StringBuilder sb2 = new StringBuilder("replaceExternalResources pluginId: ");
        sb2.append(str);
        sb2.append(", wrappedResources: ");
        sb2.append(resources2);
        return resources2 != null ? resources2 : resources;
    }

    public static LayoutInflater a(LayoutInflater layoutInflater, String str) {
        com.kwad.library.b.a bz = bz(str);
        if (bz == null || !bz.isLoaded()) {
            return layoutInflater;
        }
        Context context = layoutInflater.getContext();
        if (context instanceof b) {
            return layoutInflater;
        }
        Context g = g(context, str);
        return g instanceof b ? layoutInflater.cloneInContext(g) : layoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader a(ClassLoader classLoader, String str) {
        com.kwad.library.b.a.b vY;
        com.kwad.library.b.a bz = bz(str);
        return (bz == null || !bz.isLoaded() || (vY = bz.vY()) == null) ? classLoader : vY;
    }

    private static void a(String str, Context context, Context context2) {
        Map<String, WeakReference<Context>> map = sResContextCache;
        map.put(str + System.identityHashCode(context), new WeakReference<>(context2));
    }

    private static boolean a(String str, Context context, C0238a c0238a) {
        String str2;
        Context a = a(str, context);
        String name = a != null ? a.getClass().getName() : "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (!Arrays.equals(stackTrace, c0238a.afu)) {
            if (c0238a.afu != null) {
                c0238a.clear();
                return false;
            }
            c0238a.afu = stackTrace;
            int i = 0;
            int i2 = 0;
            while (i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                for (String str3 : getAutoUnWrapStackList()) {
                    str2 = className.contains(str3) ? "needAutoUnWrap true 命中白名单" : "needAutoUnWrap true 命中白名单";
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
        C0238a.g(c0238a);
        c0238a.afu = stackTrace;
        if (c0238a.afv < 5) {
            return false;
        }
        str2 = "needAutoUnWrap true 连续相同堆栈";
        Log.d("PluginWrapper", str2);
        return true;
    }

    private static Context as(Context context) {
        return ((b) context).getDelegatedContext();
    }

    private static boolean at(Context context) {
        return context instanceof b;
    }

    private static boolean b(String str, Context context) {
        ThreadLocal<C0238a> threadLocal = sAutoUnWrapModelTL;
        C0238a c0238a = threadLocal.get();
        if (c0238a == null) {
            threadLocal.set(new C0238a((byte) 0));
        } else if (c0238a.afs.get() != context || Math.abs(System.currentTimeMillis() - c0238a.afw) >= 150) {
            c0238a.clear();
            c0238a.afs = new WeakReference(context);
            c0238a.afw = System.currentTimeMillis();
        } else {
            C0238a.c(c0238a);
            if (c0238a.aft >= (context instanceof Application ? 15 : 5) && a(str, context, c0238a)) {
                c0238a.clear();
                return true;
            }
        }
        return false;
    }

    private static com.kwad.library.b.a bz(String str) {
        com.kwad.library.solder.lib.a.a bC = i.wi().bC(str);
        if (bC != null && bC.isLoaded() && (bC instanceof com.kwad.library.b.a)) {
            return (com.kwad.library.b.a) bC;
        }
        return null;
    }

    public static Context g(Context context, String str) {
        if (context == null) {
            return null;
        }
        com.kwad.library.b.a bz = bz(str);
        if (bz == null || !bz.isLoaded() || (context instanceof b) || b(str, context)) {
            return context;
        }
        Context a = a(str, context);
        if (a != null) {
            return a;
        }
        Context cVar = context instanceof ContextThemeWrapper ? new c((ContextThemeWrapper) context, str) : context instanceof android.support.v7.view.ContextThemeWrapper ? new d((android.support.v7.view.ContextThemeWrapper) context, str) : context instanceof ContextWrapper ? new e(context, str) : new e(context, str);
        a(str, context, cVar);
        return cVar;
    }

    private static List<String> getAutoUnWrapStackList() {
        List<String> list = sAutoUnWrapStackList;
        if (list.isEmpty()) {
            list.add("com.sensorsdata.analytics.android.sdk");
        }
        return list;
    }

    public static Context unwrapContextIfNeed(Context context) {
        if (at(context)) {
            context = as(context);
        }
        if (at(context)) {
            for (int i = 0; i < 10; i++) {
                context = as(context);
                if (!at(context)) {
                    return context;
                }
            }
            return context;
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object wrapSystemService(Object obj, String str, Context context) {
        if ("layout_inflater".equals(str) && (obj instanceof LayoutInflater)) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            return layoutInflater.getContext() instanceof b ? layoutInflater : layoutInflater.cloneInContext(context);
        }
        return obj;
    }
}
