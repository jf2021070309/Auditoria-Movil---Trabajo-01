package com.amazon.aps.iva.x2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.q.c0;
/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static void a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        stackTraceElement.getMethodName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String b(int i, Context context) {
        if (i != -1) {
            try {
                i = context.getResources().getResourceEntryName(i);
                return i;
            } catch (Exception unused) {
                return c0.a("?", i);
            }
        }
        return "UNKNOWN";
    }

    public static String c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String d(int i, o oVar) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return oVar.getContext().getResources().getResourceEntryName(i);
    }
}
