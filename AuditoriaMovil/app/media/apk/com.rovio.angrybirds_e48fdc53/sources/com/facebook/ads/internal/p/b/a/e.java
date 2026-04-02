package com.facebook.ads.internal.p.b.a;

import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class e implements com.facebook.ads.internal.p.b.a.a {
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    /* loaded from: classes2.dex */
    private class a implements Callable<Void> {
        private final File b;

        public a(File file) {
            this.b = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            e.this.b(this.b);
            return null;
        }
    }

    private void a(List<File> list) {
        long b = b(list);
        int size = list.size();
        Iterator<File> it = list.iterator();
        while (true) {
            int i = size;
            if (!it.hasNext()) {
                return;
            }
            File next = it.next();
            if (!a(next, b, i)) {
                long length = next.length();
                if (next.delete()) {
                    i--;
                    b -= length;
                    Log.i("ProxyCache", "Cache file " + next + " is deleted because it exceeds cache limit");
                } else {
                    Log.e("ProxyCache", "Error deleting file " + next + " for trimming cache");
                }
            }
            size = i;
        }
    }

    private long b(List<File> list) {
        long j = 0;
        Iterator<File> it = list.iterator();
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                return j2;
            }
            j = it.next().length() + j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) {
        d.c(file);
        a(d.b(file.getParentFile()));
    }

    @Override // com.facebook.ads.internal.p.b.a.a
    public void a(File file) {
        this.a.submit(new a(file));
    }

    protected abstract boolean a(File file, long j, int i);
}
