package com.kuaishou.weapon.p0;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class dn {

    /* loaded from: classes.dex */
    static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dp.a(classLoader, "pathList").get(classLoader);
            Field a = dp.a(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) a.get(obj);
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            arrayList.add(file);
            a.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* loaded from: classes.dex */
    static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dp.a(classLoader, "pathList").get(classLoader);
            Field a = dp.a(obj, "nativeLibraryDirectories");
            Collection collection = (List) a.get(obj);
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
            a.set(obj, arrayList);
            if (a.get(obj) != arrayList) {
                dp.b(obj, "nativeLibraryDirectories").set(obj, arrayList);
            }
            List list = (List) dp.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size() + 1);
            arrayList2.addAll(arrayList);
            arrayList2.addAll(list);
            Object[] objArr = (Object[]) dp.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList2, null, new ArrayList());
            Field a2 = dp.a(obj, "nativeLibraryPathElements");
            a2.set(obj, objArr);
            if (a2.get(obj) != objArr) {
                dp.b(obj, "nativeLibraryPathElements").set(obj, objArr);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dp.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) dp.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) dp.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            dp.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) dp.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* loaded from: classes.dex */
    static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dp.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) dp.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) dp.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            dp.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) dp.a(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    /* loaded from: classes.dex */
    static final class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            String path = file.getPath();
            Field a = dp.a(classLoader, "libPath");
            String valueOf = String.valueOf(a.get(classLoader));
            a.set(classLoader, TextUtils.isEmpty(valueOf) ? path : valueOf + ":" + path);
            Field a2 = dp.a(classLoader, "libraryPathElements");
            List<String> list = (List) a2.get(classLoader);
            for (String str : list) {
                if (path.equals(str)) {
                    return;
                }
            }
            list.add(path);
            a2.set(classLoader, list);
        }
    }

    public static synchronized void a(ClassLoader classLoader, File file) {
        synchronized (dn.class) {
            if (file != null) {
                if (file.exists()) {
                    if ((Build.VERSION.SDK_INT == 25 && Build.VERSION.PREVIEW_SDK_INT != 0) || Build.VERSION.SDK_INT > 25) {
                        d.b(classLoader, file);
                    } else if (Build.VERSION.SDK_INT == 24) {
                        c.b(classLoader, file);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        b.b(classLoader, file);
                    } else if (Build.VERSION.SDK_INT >= 14) {
                        a.b(classLoader, file);
                    } else {
                        e.b(classLoader, file);
                    }
                }
            }
        }
    }
}
