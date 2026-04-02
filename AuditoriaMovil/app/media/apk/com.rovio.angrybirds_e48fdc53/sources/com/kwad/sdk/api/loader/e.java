package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class e {
    private static final List<String> aix;

    /* loaded from: classes.dex */
    static class a extends DexClassLoader {
        private final ClassLoader aiy;

        public a(String str, String str2, String str3, ClassLoader classLoader) {
            super(str, str2, str3, classLoader);
            this.aiy = classLoader;
            new StringBuilder("pcl").append(classLoader.getClass().getName());
        }

        private static boolean bT(String str) {
            return !TextUtils.isEmpty(str) && str.startsWith("com.kwad.sdk.api");
        }

        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if (bT(str)) {
                return getParent().loadClass(str);
            }
            Class<?> findLoadedClass = findLoadedClass(str);
            if (findLoadedClass != null) {
                return findLoadedClass;
            }
            try {
                findLoadedClass = findClass(str);
            } catch (ClassNotFoundException e) {
            }
            return findLoadedClass != null ? findLoadedClass : super.loadClass(str, z);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        aix = arrayList;
        arrayList.add("com.kwad.sdk");
        arrayList.add("com.ksad");
        arrayList.add("com.kwai");
        arrayList.add("kwad.support");
        arrayList.add("android.support.rastermill");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader a(Context context, ClassLoader classLoader, String str, String str2, String str3) {
        if (t.b(context, "useContextClassLoader", false)) {
            classLoader = context.getClassLoader();
        }
        return new a(str, str2, str3, classLoader);
    }
}
