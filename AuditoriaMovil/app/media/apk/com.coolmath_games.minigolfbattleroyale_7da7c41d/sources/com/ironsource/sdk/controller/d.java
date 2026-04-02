package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.w;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d {
    private static final String b = d.class.getSimpleName();
    final w.d a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(w.d dVar) {
        this.a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(String str, String str2) {
        if (this.a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = w.d.class.getDeclaredMethod(str, String.class);
        if (Build.VERSION.SDK_INT >= 17 && !declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.a, str2);
    }
}
