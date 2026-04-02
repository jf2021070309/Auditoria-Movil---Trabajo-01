package com.kwad.sdk.api.loader;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.kwad.sdk.api.core.ResContext;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class Wrapper {
    private static final int COUNT_LIMIT_AUTO_UN_WRAP = 5;
    private static final int COUNT_LIMIT_AUTO_UN_WRAP_APPLICATION = 15;
    private static final int COUNT_LIMIT_SAME_STACK_TRACE = 5;
    private static final String METHOD_GET_BASE_CONTEXT = "getBaseContext";
    private static final String METHOD_WRAP_CONTEXT = "wrapContextIfNeed";
    private static final String TAG = "Wrapper";
    private static final int TIMELINE_MINIWRAP = 150;
    private static final String CLAZZ_NAME = Wrapper.class.getName();
    private static final ThreadLocal<a> sAutoUnWrapModelTL = new ThreadLocal<>();
    private static final List<String> sAutoUnWrapStackList = new CopyOnWriteArrayList();
    private static Map<Context, Context> sResContextCache = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
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

    private static List<String> getAutoUnWrapStackList() {
        List<String> list = sAutoUnWrapStackList;
        if (list.isEmpty()) {
            list.add("com.sensorsdata.analytics.android.sdk");
        }
        return list;
    }

    private static boolean needAutoUnWrap(Context context, a aVar) {
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
                if (i < stackTrace.length && CLAZZ_NAME.equals(className) && METHOD_WRAP_CONTEXT.equals(methodName)) {
                    StackTraceElement stackTraceElement2 = stackTrace[i];
                    if (TextUtils.equals(name, stackTraceElement2.getClassName()) && METHOD_GET_BASE_CONTEXT.equals(stackTraceElement2.getMethodName()) && (i2 = i2 + 1) >= 5) {
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
        Log.d(TAG, str);
        return true;
    }

    public static void onDestroy(Context context) {
        if (context == null) {
            return;
        }
        sResContextCache.remove(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader replaceExternalClassLoader(ClassLoader classLoader) {
        ClassLoader externalClassLoader = Loader.get().getExternalClassLoader();
        return externalClassLoader != null ? externalClassLoader : classLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources replaceExternalResources(Resources resources) {
        Resources externalResource = Loader.get().getExternalResource();
        return externalResource != null ? externalResource : resources;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources.Theme replaceTheme(Resources.Theme theme, Resources.Theme theme2, int i) {
        Resources.Theme theme3 = (Resources.Theme) com.kwad.sdk.api.c.c("WRT", theme, theme2, Integer.valueOf(i));
        if (theme3 != null) {
            return theme3;
        }
        Resources externalResource = Loader.get().getExternalResource();
        if (externalResource != null) {
            if (theme2 == null) {
                Resources.Theme newTheme = externalResource.newTheme();
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
            if (aVar.aft >= (context instanceof Application ? 15 : 5) && needAutoUnWrap(context, aVar)) {
                aVar.clear();
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static Context unwrapContextIfNeed(Context context) {
        Context context2 = (Context) com.kwad.sdk.api.c.c("URC", context);
        if (context2 != null) {
            return context2;
        }
        ResContext resContext = context instanceof ResContext ? (ResContext) context : null;
        Context context3 = context;
        while (context3 instanceof ContextWrapper) {
            if (context3 instanceof Activity) {
                return context3;
            }
            if (context3 instanceof ResContext) {
                resContext = (ResContext) context3;
                context3 = resContext.getDelegatedContext();
            } else {
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        return resContext != null ? resContext.getDelegatedContext() : context;
    }

    public static Context wrapContextIfNeed(Context context) {
        Context context2 = (Context) com.kwad.sdk.api.c.c("WRC", context);
        if (context2 != null) {
            return context2;
        }
        if (Loader.get().isExternalLoaded()) {
            if (context == null) {
                return null;
            }
            if ((context instanceof ResContext) || returnUnWrappedContext(context)) {
                return context;
            }
            if (context instanceof ContextThemeWrapper) {
                Context context3 = sResContextCache.get(context);
                if (context3 == null) {
                    n nVar = new n((ContextThemeWrapper) context);
                    sResContextCache.put(context, nVar);
                    return nVar;
                }
                return context3;
            } else if (context instanceof android.support.v7.view.ContextThemeWrapper) {
                Context context4 = sResContextCache.get(context);
                if (context4 == null) {
                    o oVar = new o((android.support.v7.view.ContextThemeWrapper) context);
                    sResContextCache.put(context, oVar);
                    return oVar;
                }
                return context4;
            } else if (context instanceof ContextWrapper) {
                Context context5 = sResContextCache.get(context);
                if (context5 == null) {
                    p pVar = new p(context);
                    sResContextCache.put(context, pVar);
                    return pVar;
                }
                return context5;
            } else {
                Context context6 = sResContextCache.get(context);
                if (context6 == null) {
                    p pVar2 = new p(context);
                    sResContextCache.put(context, pVar2);
                    return pVar2;
                }
                return context6;
            }
        }
        return context;
    }

    @Deprecated
    public static LayoutInflater wrapInflaterIfNeed(LayoutInflater layoutInflater) {
        LayoutInflater layoutInflater2 = (LayoutInflater) com.kwad.sdk.api.c.c("WRI", layoutInflater);
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        if (Loader.get().isExternalLoaded()) {
            Context context = layoutInflater.getContext();
            if (context instanceof ResContext) {
                return layoutInflater;
            }
            Context wrapContextIfNeed = wrapContextIfNeed(context);
            return wrapContextIfNeed instanceof ResContext ? layoutInflater.cloneInContext(wrapContextIfNeed) : layoutInflater;
        }
        return layoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object wrapSystemService(Object obj, String str, Context context) {
        if ("layout_inflater".equals(str) && (obj instanceof LayoutInflater)) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            return layoutInflater.getContext() instanceof ResContext ? layoutInflater : layoutInflater.cloneInContext(context);
        }
        return obj;
    }
}
