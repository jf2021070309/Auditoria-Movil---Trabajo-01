package rx.internal.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* loaded from: classes4.dex */
public final class PlatformDependent {
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;
    private static final int a = b();
    private static final boolean b;

    static {
        b = a != 0;
    }

    private PlatformDependent() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isAndroid() {
        return b;
    }

    public static int getAndroidApiVersion() {
        return a;
    }

    private static int b() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, a()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    static ClassLoader a() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: rx.internal.util.PlatformDependent.1
            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public ClassLoader run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }
}
