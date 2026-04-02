package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.io.Closeable;
import java.lang.reflect.Method;
/* compiled from: Misc.java */
/* loaded from: classes3.dex */
public class ao {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context == null) {
            return str2;
        }
        return UMEnvelopeBuild.imprintProperty(context, str, str2);
    }

    public static void a(Context context, String str) {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("com.uyumao.sdk.UYMManager");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("processEvent", Context.class, String.class)) == null) {
                return;
            }
            declaredMethod.invoke(cls, context, str);
        } catch (Throwable th) {
        }
    }
}
