package e.d.e.c0.a0;

import e.d.e.p;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public static Class f7807b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7808c;

    /* renamed from: d  reason: collision with root package name */
    public final Field f7809d;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f7807b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f7808c = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f7809d = field;
    }

    @Override // e.d.e.c0.a0.b
    public void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.f7808c != null && this.f7809d != null) {
            try {
                f7807b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f7808c, accessibleObject, Long.valueOf(((Long) f7807b.getMethod("objectFieldOffset", Field.class).invoke(this.f7808c, this.f7809d)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new p("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
