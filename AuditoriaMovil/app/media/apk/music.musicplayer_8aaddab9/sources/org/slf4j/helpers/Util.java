package org.slf4j.helpers;

import java.io.PrintStream;
/* loaded from: classes2.dex */
public final class Util {
    private static b SECURITY_MANAGER;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED;

    /* loaded from: classes2.dex */
    public static final class b extends SecurityManager {
        public b(a aVar) {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i2;
        b securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i3 = 0;
        while (i3 < classContext.length && !name.equals(classContext[i3].getName())) {
            i3++;
        }
        if (i3 >= classContext.length || (i2 = i3 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i2];
    }

    private static b getSecurityManager() {
        b bVar = SECURITY_MANAGER;
        if (bVar != null) {
            return bVar;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        b safeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = safeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return safeCreateSecurityManager;
    }

    public static final void report(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static final void report(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    private static b safeCreateSecurityManager() {
        try {
            return new b(null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String safeGetSystemProperty = safeGetSystemProperty(str);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("null input");
    }
}
