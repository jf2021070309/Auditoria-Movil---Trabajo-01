package com.kwad.sdk.core.diskcache;

import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.utils.av;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class ApkCacheManager {
    private Future afS;
    private File amW;
    private final ExecutorService amX;
    private final Callable<Void> amY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum Holder {
        INSTANCE;
        
        private ApkCacheManager mInstance = new ApkCacheManager((byte) 0);

        Holder() {
        }

        final ApkCacheManager getInstance() {
            return this.mInstance;
        }
    }

    private ApkCacheManager() {
        this.amX = GlobalThreadPools.CY();
        this.amY = new Callable<Void>() { // from class: com.kwad.sdk.core.diskcache.ApkCacheManager.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: Aj */
            public Void call() {
                synchronized (ApkCacheManager.class) {
                    if (ApkCacheManager.this.amW != null && ApkCacheManager.this.amW.exists() && !ApkCacheManager.this.Ah()) {
                        ApkCacheManager apkCacheManager = ApkCacheManager.this;
                        for (File file : apkCacheManager.n(apkCacheManager.amW)) {
                            if (file.getName().endsWith(".apk")) {
                                ApkCacheManager.this.h(file);
                                if (ApkCacheManager.this.Ah()) {
                                    return null;
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }
            }
        };
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return;
        }
        try {
            this.amW = av.cM(((e) ServiceProvider.get(e.class)).getContext());
        } catch (Throwable th) {
        }
    }

    /* synthetic */ ApkCacheManager(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Ah() {
        File file = this.amW;
        if (file == null || !file.exists()) {
            return false;
        }
        File[] listFiles = this.amW.listFiles();
        if (listFiles.length > 5) {
            return listFiles.length <= 10 && l(this.amW) <= 400;
        }
        return true;
    }

    public static ApkCacheManager getInstance() {
        return Holder.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (!file.isDirectory()) {
                if (file.exists()) {
                    file.delete();
                    return;
                }
                return;
            }
            for (File file2 : file.listFiles()) {
                h(file2);
            }
            file.delete();
        } catch (Exception e) {
        }
    }

    private int l(File file) {
        return (int) ((((float) m(file)) / 1000.0f) / 1000.0f);
    }

    private long m(File file) {
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                j += listFiles[i].isDirectory() ? m(listFiles[i]) : listFiles[i].length();
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<File> n(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        arrayList.addAll(Arrays.asList(listFiles));
        r(arrayList);
        return arrayList;
    }

    private void r(List<File> list) {
        Collections.sort(list, new Comparator<File>() { // from class: com.kwad.sdk.core.diskcache.ApkCacheManager.2
            private static int c(File file, File file2) {
                if (file.lastModified() >= file2.lastModified()) {
                    return file.lastModified() == file2.lastModified() ? 0 : 1;
                }
                return -1;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                return c(file, file2);
            }
        });
    }

    public final void Ai() {
        File file = this.amW;
        if (file == null || !file.exists()) {
            return;
        }
        Future future = this.afS;
        if (future == null || future.isDone()) {
            this.afS = this.amX.submit(this.amY);
        }
    }
}
