package c.i.c;

import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class f implements Runnable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1958b;

    public f(Object obj, Object obj2) {
        this.a = obj;
        this.f1958b = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = e.f1947d;
            if (method != null) {
                method.invoke(this.a, this.f1958b, Boolean.FALSE, "AppCompat recreation");
            } else {
                e.f1948e.invoke(this.a, this.f1958b, Boolean.FALSE);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
