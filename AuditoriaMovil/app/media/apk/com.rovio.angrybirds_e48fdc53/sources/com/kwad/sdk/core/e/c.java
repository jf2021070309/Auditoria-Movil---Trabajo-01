package com.kwad.sdk.core.e;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class c {
    public static boolean aoH = true;
    private static boolean aoI = com.kwad.sdk.core.e.a.mp.booleanValue();
    private static final com.kwad.sdk.core.e.a.b aoJ = new b();
    private static final List<com.kwad.sdk.core.e.a.b> aoK = new CopyOnWriteArrayList();
    private static com.kwad.sdk.core.e.a.a aoL;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void b(com.kwad.sdk.core.e.a.b bVar);
    }

    private static String Ba() {
        return "KSAdSDK";
    }

    private static void H(final String str, final String str2) {
        a(new a() { // from class: com.kwad.sdk.core.e.c.1
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.d(str, str2);
            }
        });
    }

    private static void I(String str, String str2) {
        if (str2.length() <= 4000) {
            H(str, str2);
            return;
        }
        H(str, str2.substring(0, 4000));
        I(str, str2.substring(4000));
    }

    public static void J(String str, String str2) {
        final String t = t(str, str2);
        a(new a() { // from class: com.kwad.sdk.core.e.c.7
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.v(c.access$000(), t, true);
            }
        });
    }

    public static void a(com.kwad.sdk.core.e.a.b bVar) {
        List<com.kwad.sdk.core.e.a.b> list = aoK;
        if (list.contains(bVar)) {
            return;
        }
        list.add(bVar);
    }

    private static void a(a aVar) {
        for (com.kwad.sdk.core.e.a.b bVar : aoK) {
            if (bVar != null) {
                try {
                    aVar.b(bVar);
                } catch (Exception e) {
                }
            }
        }
    }

    public static void a(boolean z, com.kwad.sdk.core.e.a.a aVar) {
        aoH = z;
        List<com.kwad.sdk.core.e.a.b> list = aoK;
        list.clear();
        list.add(aoJ);
        aoL = aVar;
    }

    static /* synthetic */ String access$000() {
        return Ba();
    }

    public static void cW(final String str) {
        a(new a() { // from class: com.kwad.sdk.core.e.c.6
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.v(c.access$000(), str, true);
            }
        });
    }

    public static void d(String str, String str2) {
        I(Ba(), t(str, str2));
    }

    public static void e(String str, String str2) {
        final String t = t(str, str2);
        a(new a() { // from class: com.kwad.sdk.core.e.c.11
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.e(c.access$000(), t);
            }
        });
        com.kwad.sdk.core.e.a.a aVar = aoL;
        if (aVar != null) {
            aVar.z(str2, str);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        final String t = t(str, str2 + '\n' + stackTraceString);
        a(new a() { // from class: com.kwad.sdk.core.e.c.2
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.e(c.access$000(), t);
            }
        });
        com.kwad.sdk.core.e.a.a aVar = aoL;
        if (aVar != null) {
            aVar.z(stackTraceString, str);
        }
    }

    public static void i(String str, String str2) {
        final String t = t(str, str2);
        a(new a() { // from class: com.kwad.sdk.core.e.c.8
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.i(c.access$000(), t);
            }
        });
    }

    public static void printStackTrace(final Throwable th) {
        if (th != null) {
            a(new a() { // from class: com.kwad.sdk.core.e.c.3
                @Override // com.kwad.sdk.core.e.c.a
                public final void b(com.kwad.sdk.core.e.a.b bVar) {
                    bVar.printStackTraceOnly(th);
                }
            });
        }
        if (com.kwad.sdk.core.e.a.mp.booleanValue()) {
            throw new RuntimeException(th);
        }
    }

    public static void printStackTraceOnly(final Throwable th) {
        if (th != null) {
            a(new a() { // from class: com.kwad.sdk.core.e.c.4
                @Override // com.kwad.sdk.core.e.c.a
                public final void b(com.kwad.sdk.core.e.a.b bVar) {
                    bVar.printStackTraceOnly(th);
                }
            });
        }
    }

    private static String t(String str, String str2) {
        return "[" + str + "]: " + str2 + " " + vZ();
    }

    public static void v(String str, String str2) {
        final String t = t(str, str2);
        a(new a() { // from class: com.kwad.sdk.core.e.c.5
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.v(c.access$000(), t);
            }
        });
    }

    private static String vZ() {
        int i;
        String str;
        if (aoI) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 3) {
                str = stackTrace[3].getFileName();
                i = stackTrace[3].getLineNumber();
            } else {
                i = -1;
                str = "unknown";
            }
            return "(" + str + ':' + i + ')';
        }
        return "";
    }

    public static void w(String str, String str2) {
        final String t = t(str, str2);
        a(new a() { // from class: com.kwad.sdk.core.e.c.9
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.w(c.access$000(), t);
            }
        });
    }

    public static void w(String str, Throwable th) {
        final String t = t(str, Log.getStackTraceString(th));
        a(new a() { // from class: com.kwad.sdk.core.e.c.10
            @Override // com.kwad.sdk.core.e.c.a
            public final void b(com.kwad.sdk.core.e.a.b bVar) {
                bVar.w(c.access$000(), t, com.kwad.sdk.core.e.a.mp.booleanValue());
            }
        });
    }
}
