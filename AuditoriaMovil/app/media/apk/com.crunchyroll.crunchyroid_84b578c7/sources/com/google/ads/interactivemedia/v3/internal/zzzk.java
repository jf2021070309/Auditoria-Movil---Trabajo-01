package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzzk {
    public static final zzzk zzc;

    static {
        zzzk zzzjVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            zzzjVar = new zzzg(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    zzzjVar = new zzzh(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    zzzjVar = new zzzi(declaredMethod3);
                }
            } catch (Exception unused3) {
                zzzjVar = new zzzj();
            }
        }
        zzc = zzzjVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(Class cls) {
        String zzb = zzyl.zzb(cls);
        if (zzb == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(zzb));
    }

    public abstract Object zza(Class cls) throws Exception;
}
