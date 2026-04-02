package com.amazon.aps.iva.m6;

import android.net.Uri;
import android.util.SparseArray;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x5.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: DefaultDownloaderFactory.java */
/* loaded from: classes.dex */
public final class b implements p {
    public static final SparseArray<Constructor<? extends o>> c;
    public final c.a a;
    public final Executor b;

    static {
        SparseArray<Constructor<? extends o>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, b(com.amazon.aps.iva.f6.b.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(com.amazon.aps.iva.i6.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public b(c.a aVar, ExecutorService executorService) {
        this.a = aVar;
        executorService.getClass();
        this.b = executorService;
    }

    public static Constructor<? extends o> b(Class<?> cls) {
        try {
            return cls.asSubclass(o.class).getConstructor(b0.class, c.a.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    public final o a(m mVar) {
        List<p0> emptyList;
        int J = g0.J(mVar.c, mVar.d);
        Executor executor = this.b;
        c.a aVar = this.a;
        String str = mVar.g;
        Uri uri = mVar.c;
        if (J != 0 && J != 1 && J != 2) {
            if (J == 4) {
                b0.b bVar = new b0.b();
                bVar.b = uri;
                bVar.g = str;
                return new s(bVar.a(), aVar, executor);
            }
            throw new IllegalArgumentException(c0.a("Unsupported type: ", J));
        }
        Constructor<? extends o> constructor = c.get(J);
        if (constructor != null) {
            b0.b bVar2 = new b0.b();
            bVar2.b = uri;
            List<p0> list = mVar.e;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            bVar2.f = emptyList;
            bVar2.g = str;
            try {
                return constructor.newInstance(bVar2.a(), aVar, executor);
            } catch (Exception e) {
                throw new IllegalStateException(c0.a("Failed to instantiate downloader for content type ", J), e);
            }
        }
        throw new IllegalStateException(c0.a("Module missing for content type ", J));
    }
}
