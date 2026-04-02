package c.s;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
/* loaded from: classes.dex */
public final class a {
    public static final Set<File> a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2503b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f2503b = z;
    }

    public static void a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field d2 = d(obj, str);
        Object[] objArr2 = (Object[]) d2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        d2.set(obj, objArr3);
    }

    public static void b(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder y = e.a.d.a.a.y("Failed to list secondary dex dir content (");
                y.append(file.getPath());
                y.append(").");
                Log.w("MultiDex", y.toString());
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    StringBuilder y2 = e.a.d.a.a.y("Failed to delete old file ");
                    y2.append(file2.getPath());
                    Log.w("MultiDex", y2.toString());
                }
            }
            if (file.delete()) {
                file.getPath();
                return;
            }
            StringBuilder y3 = e.a.d.a.a.y("Failed to delete secondary dex dir ");
            y3.append(file.getPath());
            Log.w("MultiDex", y3.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00c7, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000b, B:10:0x0014, B:13:0x0052, B:14:0x0056, B:22:0x006a, B:28:0x0078, B:29:0x007f, B:32:0x008f, B:40:0x00b7, B:44:0x00be, B:46:0x00c0, B:31:0x0083, B:17:0x005b, B:19:0x0062, B:24:0x006c, B:34:0x009d, B:35:0x00a1, B:39:0x00a8, B:47:0x00c1), top: B:61:0x0003, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000b, B:10:0x0014, B:13:0x0052, B:14:0x0056, B:22:0x006a, B:28:0x0078, B:29:0x007f, B:32:0x008f, B:40:0x00b7, B:44:0x00be, B:46:0x00c0, B:31:0x0083, B:17:0x005b, B:19:0x0062, B:24:0x006c, B:34:0x009d, B:35:0x00a1, B:39:0x00a8, B:47:0x00c1), top: B:61:0x0003, inners: #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = c.s.a.a
            monitor-enter(r0)
            boolean r1 = r0.contains(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lb:
            r0.add(r7)     // Catch: java.lang.Throwable -> Lc7
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc7
            r2 = 20
            if (r1 <= r2) goto L4f
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r4.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = ": SDK version higher than "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = " should be backed by "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "case here: java.vm.version=\""
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lc7
            android.util.Log.w(r3, r1)     // Catch: java.lang.Throwable -> Lc7
        L4f:
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.RuntimeException -> L61 java.lang.Throwable -> Lc7
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Lc7
            if (r4 == 0) goto L5b
            goto L68
        L5b:
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> Lc7
            goto L67
        L61:
            r3 = move-exception
            java.lang.String r4 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r4, r3)     // Catch: java.lang.Throwable -> Lc7
        L67:
            r3 = r2
        L68:
            if (r3 != 0) goto L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        L6c:
            b(r6)     // Catch: java.lang.Throwable -> L70
            goto L78
        L70:
            r1 = move-exception
            java.lang.String r4 = "MultiDex"
            java.lang.String r5 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r4, r5, r1)     // Catch: java.lang.Throwable -> Lc7
        L78:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r4 = "code_cache"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> Lc7
            f(r1)     // Catch: java.io.IOException -> L83 java.lang.Throwable -> Lc7
            goto L8f
        L83:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lc7
            java.io.File r8 = r6.getFilesDir()     // Catch: java.lang.Throwable -> Lc7
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> Lc7
            f(r1)     // Catch: java.lang.Throwable -> Lc7
        L8f:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Lc7
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> Lc7
            f(r8)     // Catch: java.lang.Throwable -> Lc7
            c.s.d r9 = new c.s.d     // Catch: java.lang.Throwable -> Lc7
            r9.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lc7
            r7 = 0
            java.util.List r7 = r9.m(r6, r10, r7)     // Catch: java.lang.Throwable -> Lc2
            e(r3, r8, r7)     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lc2
            goto Lb7
        La5:
            r7 = move-exception
            if (r11 == 0) goto Lc1
            java.lang.String r11 = "MultiDex"
            java.lang.String r1 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r11, r1, r7)     // Catch: java.lang.Throwable -> Lc2
            r7 = 1
            java.util.List r6 = r9.m(r6, r10, r7)     // Catch: java.lang.Throwable -> Lc2
            e(r3, r8, r6)     // Catch: java.lang.Throwable -> Lc2
        Lb7:
            r9.close()     // Catch: java.io.IOException -> Lbb java.lang.Throwable -> Lc7
            goto Lbc
        Lbb:
            r2 = move-exception
        Lbc:
            if (r2 != 0) goto Lc0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lc0:
            throw r2     // Catch: java.lang.Throwable -> Lc7
        Lc1:
            throw r7     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r6 = move-exception
            r9.close()     // Catch: java.io.IOException -> Lc6 java.lang.Throwable -> Lc7
        Lc6:
            throw r6     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.a.c(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    public static Field d(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder B = e.a.d.a.a.B("Field ", str, " not found in ");
        B.append(obj.getClass());
        throw new NoSuchFieldException(B.toString());
    }

    public static void e(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = d(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                    }
                    Field d2 = d(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) d2.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                        arrayList.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    d2.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder B = e.a.d.a.a.B("Method ", "makeDexElements", " with parameters ");
        B.append(Arrays.asList(clsArr));
        B.append(" not found in ");
        B.append(obj.getClass());
        throw new NoSuchMethodException(B.toString());
    }

    public static void f(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder y = e.a.d.a.a.y("Failed to create dir ");
            y.append(file.getPath());
            y.append(". Parent file is null.");
            Log.e("MultiDex", y.toString());
        } else {
            StringBuilder y2 = e.a.d.a.a.y("Failed to create dir ");
            y2.append(file.getPath());
            y2.append(". parent file is a dir ");
            y2.append(parentFile.isDirectory());
            y2.append(", a file ");
            y2.append(parentFile.isFile());
            y2.append(", exists ");
            y2.append(parentFile.exists());
            y2.append(", readable ");
            y2.append(parentFile.canRead());
            y2.append(", writable ");
            y2.append(parentFile.canWrite());
            Log.e("MultiDex", y2.toString());
        }
        StringBuilder y3 = e.a.d.a.a.y("Failed to create directory ");
        y3.append(file.getPath());
        throw new IOException(y3.toString());
    }
}
