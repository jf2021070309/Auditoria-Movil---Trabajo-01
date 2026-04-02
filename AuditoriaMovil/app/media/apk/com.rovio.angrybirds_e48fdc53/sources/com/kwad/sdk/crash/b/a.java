package com.kwad.sdk.crash.b;

import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.crash.e;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private static boolean B(List<StackTraceElement[]> list) {
        for (StackTraceElement[] stackTraceElementArr : list) {
            if (a(stackTraceElementArr)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return false;
        }
        String[] EC = e.EB().EC();
        if (EC == null || EC.length == 0) {
            return true;
        }
        boolean z = false;
        for (String str : EC) {
            z = a(stackTraceElementArr, str);
            if (z) {
                break;
            }
        }
        if (z) {
            for (String str2 : e.EB().ED()) {
                if (b(stackTraceElementArr, str2)) {
                    return false;
                }
            }
        }
        return z;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr, String str) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            if (!TextUtils.isEmpty(className) && className.contains(str)) {
                c.d("ExceptionCollector", "CrashFilter filterTags element className=" + className + " filter tag=" + str);
                return true;
            }
        }
        return false;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArr, String str) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            if (!TextUtils.isEmpty(className) && className.contains(str)) {
                c.d("ExceptionCollector", "CrashFilter excludeTags element className=" + className + " exclude tag=" + str);
                return true;
            }
        }
        return false;
    }

    public static boolean m(Throwable th) {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(th.getStackTrace());
            th = th.getCause();
            if (th == null) {
                break;
            }
        }
        return B(arrayList);
    }
}
