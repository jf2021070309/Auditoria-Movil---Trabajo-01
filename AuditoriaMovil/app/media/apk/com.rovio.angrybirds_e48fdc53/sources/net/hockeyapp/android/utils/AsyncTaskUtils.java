package net.hockeyapp.android.utils;

import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class AsyncTaskUtils {
    private static Executor a;

    public static void execute(AsyncTask<Void, ?, ?> asyncTask) {
        if (Build.VERSION.SDK_INT <= 12) {
            asyncTask.execute(new Void[0]);
        } else {
            asyncTask.executeOnExecutor(a != null ? a : AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public static Executor getCustomExecutor() {
        return a;
    }

    public static void setCustomExecutor(Executor executor) {
        a = executor;
    }
}
