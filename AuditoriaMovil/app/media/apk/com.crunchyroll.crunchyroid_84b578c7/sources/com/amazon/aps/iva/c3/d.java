package com.amazon.aps.iva.c3;

import java.lang.reflect.Method;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public d(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = e.d;
            Object obj = this.c;
            Object obj2 = this.b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                e.e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
