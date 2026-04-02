package com.ss.android.downloadlib.rb;

import android.os.AsyncTask;
/* loaded from: classes3.dex */
public class ge {
    static final dr dr = new C0301ge();

    /* loaded from: classes3.dex */
    private static class dr {
        private dr() {
        }

        public <T> void dr(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: com.ss.android.downloadlib.rb.ge$ge  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0301ge extends dr {
        private C0301ge() {
            super();
        }

        @Override // com.ss.android.downloadlib.rb.ge.dr
        public <T> void dr(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, tArr);
            } catch (Throwable th) {
            }
        }
    }

    public static <T> void dr(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        dr.dr(asyncTask, tArr);
    }
}
