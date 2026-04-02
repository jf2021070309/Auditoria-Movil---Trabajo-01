package e.d.d.w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class r0 {
    public static WeakReference<r0> a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f7702b;

    /* renamed from: c  reason: collision with root package name */
    public n0 f7703c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f7704d;

    public r0(SharedPreferences sharedPreferences, Executor executor) {
        this.f7704d = executor;
        this.f7702b = sharedPreferences;
    }

    public synchronized q0 a() {
        String peek;
        q0 q0Var;
        n0 n0Var = this.f7703c;
        synchronized (n0Var.f7689d) {
            peek = n0Var.f7689d.peek();
        }
        Pattern pattern = q0.a;
        q0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                q0Var = new q0(split[0], split[1]);
            }
        }
        return q0Var;
    }
}
