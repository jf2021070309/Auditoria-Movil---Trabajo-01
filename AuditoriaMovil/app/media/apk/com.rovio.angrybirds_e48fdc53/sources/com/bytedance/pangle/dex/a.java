package com.bytedance.pangle.dex;

import com.bytedance.pangle.d.c;
import com.bytedance.pangle.e.b;
import com.bytedance.pangle.e.g;
import com.bytedance.pangle.util.FieldUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a {
    private static volatile int a;
    private static volatile Constructor<?> b;

    public static void a(ClassLoader classLoader, String str, int i) {
        Object obj = FieldUtils.getField(classLoader.getClass(), "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        String[] split = g.a(str, i).split(":");
        String c = c.c(str, i);
        for (String str2 : split) {
            Object native_load_direct_dex = DirectDex.native_load_direct_dex(str2);
            if (native_load_direct_dex == null) {
                native_load_direct_dex = DexFile.loadDex(str2, c + File.separator + b.a(str2), 0);
            }
            arrayList.add(a(new File(str2), native_load_direct_dex));
        }
        Object[] array = arrayList.toArray();
        Field field = FieldUtils.getField(obj.getClass(), "dexElements");
        Object[] objArr = (Object[]) field.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + array.length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        System.arraycopy(array, 0, objArr2, objArr.length, array.length);
        field.set(obj, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object a(java.io.File r11, java.lang.Object r12) {
        /*
            int r0 = com.bytedance.pangle.dex.a.a
            java.lang.reflect.Constructor<?> r1 = com.bytedance.pangle.dex.a.b
            r2 = 0
            if (r1 != 0) goto L10
            java.lang.String r3 = "dalvik.system.DexPathList$Element"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> Lf
            goto L11
        Lf:
            r3 = move-exception
        L10:
            r3 = r2
        L11:
            r4 = 8
            r5 = 4
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r1 != 0) goto L38
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r6] = r10     // Catch: java.lang.Exception -> L36
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L36
            r1[r9] = r10     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r8] = r10     // Catch: java.lang.Exception -> L36
            java.lang.Class<dalvik.system.DexFile> r10 = dalvik.system.DexFile.class
            r1[r7] = r10     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L36
            r1.setAccessible(r9)     // Catch: java.lang.Exception -> L36
            r0 = r4
            goto L38
        L36:
            r1 = move-exception
            r1 = r2
        L38:
            if (r1 != 0) goto L54
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L52
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r6] = r10     // Catch: java.lang.Exception -> L52
            java.lang.Class<java.util.zip.ZipFile> r10 = java.util.zip.ZipFile.class
            r1[r9] = r10     // Catch: java.lang.Exception -> L52
            java.lang.Class<dalvik.system.DexFile> r10 = dalvik.system.DexFile.class
            r1[r8] = r10     // Catch: java.lang.Exception -> L52
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L52
            r1.setAccessible(r9)     // Catch: java.lang.Exception -> L52
            r0 = r5
            goto L54
        L52:
            r1 = move-exception
            r1 = r2
        L54:
            if (r1 != 0) goto L70
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L6e
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r6] = r10     // Catch: java.lang.Exception -> L6e
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r9] = r10     // Catch: java.lang.Exception -> L6e
            java.lang.Class<dalvik.system.DexFile> r10 = dalvik.system.DexFile.class
            r1[r8] = r10     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L6e
            r1.setAccessible(r9)     // Catch: java.lang.Exception -> L6e
            r0 = r8
            goto L70
        L6e:
            r1 = move-exception
            r1 = r2
        L70:
            if (r1 != 0) goto L90
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L8e
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r6] = r10     // Catch: java.lang.Exception -> L8e
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L8e
            r1[r9] = r10     // Catch: java.lang.Exception -> L8e
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r1[r8] = r10     // Catch: java.lang.Exception -> L8e
            java.lang.Class<dalvik.system.DexFile> r10 = dalvik.system.DexFile.class
            r1[r7] = r10     // Catch: java.lang.Exception -> L8e
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L8e
            r1.setAccessible(r9)     // Catch: java.lang.Exception -> L8e
            r0 = r9
            goto L90
        L8e:
            r1 = move-exception
            r1 = r2
        L90:
            com.bytedance.pangle.dex.a.b = r1
            com.bytedance.pangle.dex.a.a = r0
            if (r0 == r9) goto Lab
            if (r0 == r8) goto L9e
            if (r0 == r5) goto L9e
            if (r0 == r4) goto Lab
            goto Lbc
        L9e:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r11
            r0[r9] = r2
            r0[r8] = r12
            java.lang.Object r2 = a(r1, r0)
            goto Lbc
        Lab:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r11
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r0[r9] = r11
            r0[r8] = r2
            r0[r7] = r12
            java.lang.Object r2 = a(r1, r0)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.dex.a.a(java.io.File, java.lang.Object):java.lang.Object");
    }

    private static Object a(Constructor<?> constructor, Object... objArr) {
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            return null;
        }
    }
}
