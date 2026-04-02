package e.d.d.w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class n0 {
    public final SharedPreferences a;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7690e;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f7689d = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final String f7687b = "topic_operation_queue";

    /* renamed from: c  reason: collision with root package name */
    public final String f7688c = ",";

    public n0(SharedPreferences sharedPreferences, String str, Executor executor) {
        this.a = sharedPreferences;
        this.f7690e = executor;
    }

    public static n0 a(SharedPreferences sharedPreferences, String str, Executor executor) {
        n0 n0Var = new n0(sharedPreferences, "topic_operation_queue", executor);
        synchronized (n0Var.f7689d) {
            n0Var.f7689d.clear();
            String string = n0Var.a.getString(n0Var.f7687b, "");
            if (!TextUtils.isEmpty(string) && string.contains(n0Var.f7688c)) {
                String[] split = string.split(n0Var.f7688c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        n0Var.f7689d.add(str2);
                    }
                }
            }
        }
        return n0Var;
    }
}
