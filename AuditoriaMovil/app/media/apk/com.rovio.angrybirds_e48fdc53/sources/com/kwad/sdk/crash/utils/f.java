package com.kwad.sdk.crash.utils;

import android.os.Build;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        abstract Object Fl();

        abstract void println(Object obj);
    }

    /* loaded from: classes.dex */
    static class b extends a {
        private final PrintWriter aBZ;

        b(PrintWriter printWriter) {
            super((byte) 0);
            this.aBZ = printWriter;
        }

        @Override // com.kwad.sdk.crash.utils.f.a
        final Object Fl() {
            return this.aBZ;
        }

        @Override // com.kwad.sdk.crash.utils.f.a
        final void println(Object obj) {
            this.aBZ.println(obj);
        }
    }

    private static void a(Throwable th, a aVar) {
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        synchronized (aVar.Fl()) {
            aVar.println(th);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                aVar.println("\tat " + stackTraceElement);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable th2 : th.getSuppressed()) {
                    a(th2, aVar, "Suppressed: ", "\t", newSetFromMap);
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                a(cause, aVar, "Caused by: ", "", newSetFromMap);
            }
        }
    }

    private static void a(Throwable th, a aVar, String str, String str2, Set<Throwable> set) {
        Throwable[] suppressed;
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            aVar.println(str2 + str + th);
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                aVar.println(str2 + "\tat " + stackTrace[i]);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable th2 : th.getSuppressed()) {
                    a(th2, aVar, "Suppressed: ", str2 + "\t", set);
                }
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            str = "Caused by: ";
        }
        aVar.println("\t[CIRCULAR REFERENCE:" + th + "]");
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a(th, new b(printWriter));
    }
}
