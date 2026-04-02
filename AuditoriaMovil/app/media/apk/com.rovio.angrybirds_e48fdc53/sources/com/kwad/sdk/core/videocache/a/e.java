package com.kwad.sdk.core.videocache.a;

import com.kwad.sdk.core.threads.GlobalThreadPools;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public abstract class e implements com.kwad.sdk.core.videocache.a.a {
    private final ExecutorService axg = GlobalThreadPools.CP();

    /* loaded from: classes.dex */
    class a implements Callable<Void> {
        private final File file;

        public a(File file) {
            this.file = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: Aj */
        public Void call() {
            e.this.z(this.file);
            return null;
        }
    }

    private void x(List<File> list) {
        long y = y(list);
        list.size();
        for (File file : list) {
            if (!ai(y)) {
                long length = file.length();
                if (file.delete()) {
                    y -= length;
                } else {
                    com.kwad.sdk.core.e.c.e("LruDiskUsage", "Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    private static long y(List<File> list) {
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(File file) {
        d.w(file);
        x(d.v(file.getParentFile()));
    }

    protected abstract boolean ai(long j);

    @Override // com.kwad.sdk.core.videocache.a.a
    public final void s(File file) {
        this.axg.submit(new a(file));
    }
}
