package com.amazon.aps.iva.j9;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: classes.dex */
public final class g0 {

    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final com.amazon.aps.iva.k.w a = new com.amazon.aps.iva.k.w(b.a.getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final h0 a;

        static {
            h0 mVar;
            try {
                mVar = new i0((WebViewProviderFactoryBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebViewProviderFactoryBoundaryInterface.class, g0.a()));
            } catch (ClassNotFoundException unused) {
                mVar = new com.amazon.aps.iva.hc.m();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
            a = mVar;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = s.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
}
