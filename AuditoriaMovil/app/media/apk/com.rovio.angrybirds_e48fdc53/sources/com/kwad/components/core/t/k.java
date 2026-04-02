package com.kwad.components.core.t;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.sdk.core.config.item.o;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class k {
    private static volatile k Rr;
    private boolean Rs = false;
    private o.a Rt;
    public static final String TAG = k.class.getSimpleName();
    private static final String Rq = k.class.getName();

    private k() {
    }

    private static void B(long j) {
        String str = TAG;
        com.kwad.sdk.core.e.c.d(str, "checkBySuper end:" + (SystemClock.elapsedRealtime() - j));
    }

    private static boolean a(List<String> list, Class cls) {
        int i = 0;
        while (cls != null && !TextUtils.equals(cls.getName(), "java.lang.Object")) {
            for (String str : list) {
                if (cls.getName().contains(str)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
            i++;
            if (i >= 4) {
                break;
            }
        }
        return false;
    }

    private boolean a(List<String> list, List<String> list2) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            if (className != null) {
                for (String str : list) {
                    if (className.contains(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return a(list2, stackTrace);
    }

    private boolean a(List<String> list, StackTraceElement[] stackTraceElementArr) {
        if (list != null && !list.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = TAG;
            com.kwad.sdk.core.e.c.d(str, "checkBySuper begin:" + elapsedRealtime);
            int length = stackTraceElementArr.length;
            for (int i = 0; i < length; i++) {
                String className = stackTraceElementArr[i].getClassName();
                if (className != null && ay(className) && az(className)) {
                    try {
                        if (a(list, Class.forName(className).getSuperclass())) {
                            B(elapsedRealtime);
                            return true;
                        }
                    } catch (Throwable th) {
                    }
                    try {
                        if (className.contains("$") && a(list, Class.forName(className.substring(0, className.lastIndexOf("$"))).getSuperclass())) {
                            B(elapsedRealtime);
                            return true;
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
            B(elapsedRealtime);
        }
        return false;
    }

    private static boolean aA(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Class.forName(str) != null;
    }

    private static boolean ay(String str) {
        return (str.startsWith("android") || str.startsWith("java") || str.startsWith("dalvik") || str.startsWith("com.android") || str.contains(Rq) || !str.startsWith("androidx")) ? false : true;
    }

    private static boolean az(String str) {
        return !str.startsWith("com.kwad");
    }

    public static k qq() {
        if (Rr == null) {
            synchronized (k.class) {
                if (Rr == null) {
                    Rr = new k();
                }
            }
        }
        return Rr;
    }

    private void qs() {
        o.a aVar = this.Rt;
        if (aVar == null) {
            return;
        }
        if (!this.Rs && aVar.amT.size() > 0) {
            for (String str : this.Rt.amT) {
                boolean aA = aA(str);
                this.Rs = aA;
                if (aA) {
                    break;
                }
            }
        }
        if (this.Rs) {
            ArrayList arrayList = new ArrayList();
            if (this.Rt.amQ.size() > 0) {
                for (Map.Entry<Integer, String> entry : this.Rt.amQ.entrySet()) {
                    if (aA(entry.getValue())) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
            com.kwad.components.core.p.a.pC().a(a(this.Rt.amR, this.Rt.amS), arrayList);
        }
    }

    public final boolean a(SceneImpl sceneImpl, String str) {
        boolean a = this.Rs ? a(this.Rt.amR, this.Rt.amS) : false;
        com.kwad.components.core.p.a.pC().a(sceneImpl, a, str);
        return a;
    }

    public final void init() {
        o.a aVar = (o.a) com.kwad.sdk.core.config.d.b(com.kwad.sdk.core.config.c.akY);
        this.Rt = aVar;
        if (aVar != null) {
            qs();
        }
    }

    public final int qr() {
        o.a aVar = this.Rt;
        if (aVar != null) {
            return aVar.amU;
        }
        return 0;
    }
}
