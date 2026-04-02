package com.kwad.library.solder.lib.ext;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(ClassLoader classLoader, File file) {
            Object obj = com.kwad.library.solder.lib.ext.e.c(classLoader, "pathList").get(classLoader);
            Field c = com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) c.get(obj);
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            arrayList.add(file);
            c.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* loaded from: classes.dex */
    static final class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(ClassLoader classLoader, File file) {
            Object obj = com.kwad.library.solder.lib.ext.e.c(classLoader, "pathList").get(classLoader);
            Field c = com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryDirectories");
            Collection collection = (List) c.get(obj);
            if (collection == null) {
                collection = new ArrayList(2);
            }
            ArrayList<File> arrayList = new ArrayList(collection);
            for (File file2 : arrayList) {
                if (file.equals(file2)) {
                    return;
                }
            }
            arrayList.add(file);
            c.set(obj, arrayList);
            if (c.get(obj) != arrayList) {
                com.kwad.library.solder.lib.ext.e.d(obj, "nativeLibraryDirectories").set(obj, arrayList);
            }
            List list = (List) com.kwad.library.solder.lib.ext.e.c(obj, "systemNativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size() + 1);
            arrayList2.addAll(arrayList);
            arrayList2.addAll(list);
            Object[] objArr = (Object[]) com.kwad.library.solder.lib.ext.e.b(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList2, null, new ArrayList());
            Field c2 = com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryPathElements");
            c2.set(obj, objArr);
            if (c2.get(obj) != objArr) {
                com.kwad.library.solder.lib.ext.e.d(obj, "nativeLibraryPathElements").set(obj, objArr);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(ClassLoader classLoader, File file) {
            Object obj = com.kwad.library.solder.lib.ext.e.c(classLoader, "pathList").get(classLoader);
            List<File> list = (List) com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) com.kwad.library.solder.lib.ext.e.c(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryPathElements").set(obj, (Object[]) com.kwad.library.solder.lib.ext.e.b(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* renamed from: com.kwad.library.solder.lib.ext.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0241d {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(ClassLoader classLoader, File file) {
            Object obj = com.kwad.library.solder.lib.ext.e.c(classLoader, "pathList").get(classLoader);
            List<File> list = (List) com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) com.kwad.library.solder.lib.ext.e.c(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            com.kwad.library.solder.lib.ext.e.c(obj, "nativeLibraryPathElements").set(obj, (Object[]) com.kwad.library.solder.lib.ext.e.b(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    /* loaded from: classes.dex */
    static final class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(ClassLoader classLoader, File file) {
            String path = file.getPath();
            Field c = com.kwad.library.solder.lib.ext.e.c(classLoader, "libPath");
            String valueOf = String.valueOf(c.get(classLoader));
            c.set(classLoader, TextUtils.isEmpty(valueOf) ? path : valueOf + ":" + path);
            Field c2 = com.kwad.library.solder.lib.ext.e.c(classLoader, "libraryPathElements");
            List<String> list = (List) c2.get(classLoader);
            for (String str : list) {
                if (path.equals(str)) {
                    return;
                }
            }
            list.add(path);
            c2.set(classLoader, list);
        }
    }

    public static synchronized void c(ClassLoader classLoader, File file) {
        synchronized (d.class) {
            if (file != null) {
                if (file.exists()) {
                    if ((Build.VERSION.SDK_INT == 25 && Build.VERSION.PREVIEW_SDK_INT != 0) || Build.VERSION.SDK_INT > 25) {
                        C0241d.d(classLoader, file);
                        return;
                    } else if (Build.VERSION.SDK_INT == 24) {
                        c.d(classLoader, file);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        b.d(classLoader, file);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 14) {
                        a.d(classLoader, file);
                        return;
                    } else {
                        e.d(classLoader, file);
                        return;
                    }
                }
            }
            com.kwad.library.solder.lib.a.e("Sodler.ShareLibraryLoader", String.format("installNativeLibraryPath, folder %s is illegal", file));
        }
    }
}
