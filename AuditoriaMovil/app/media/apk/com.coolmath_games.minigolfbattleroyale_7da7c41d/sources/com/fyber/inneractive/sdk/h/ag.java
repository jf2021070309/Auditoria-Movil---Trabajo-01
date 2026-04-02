package com.fyber.inneractive.sdk.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class ag extends ab<a> {
    private final String a;

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return 0;
    }

    public ag(r<a> rVar, String str) {
        super(rVar, new f());
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.GET;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.fyber.inneractive.sdk.h.ag$a] */
    @Override // com.fyber.inneractive.sdk.h.y
    public final w<a> a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        List<String> list;
        x xVar = new x();
        ?? aVar = new a();
        if (inputStream != null) {
            if (map != null) {
                try {
                    list = map.get("Content-Length");
                } catch (Exception e) {
                    IAlog.c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
                    aVar.b = e.getMessage();
                } catch (OutOfMemoryError e2) {
                    IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e2.getMessage());
                    if (aVar.a != null) {
                        aVar.a.recycle();
                    }
                    aVar.b = e2.getMessage();
                }
            } else {
                list = null;
            }
            int a2 = list != null ? com.fyber.inneractive.sdk.util.q.a(list.get(0), -1) : -1;
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap decodeStream = atomicInteger.get() == a2 ? BitmapFactory.decodeStream(new BufferedInputStream(inputStream) { // from class: com.fyber.inneractive.sdk.util.aa.1
                @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
                public final synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
                    int read;
                    read = super.read(bArr, i2, i3);
                    if (read != -1) {
                        atomicInteger.getAndAdd(read);
                    }
                    return read;
                }

                @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
                public final synchronized long skip(long j) throws IOException {
                    long skip;
                    skip = super.skip(j);
                    atomicInteger.addAndGet((int) skip);
                    return skip;
                }

                @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
                public final synchronized void reset() throws IOException {
                    atomicInteger.set(0);
                    super.reset();
                }
            }) : null;
            if (decodeStream != null && com.fyber.inneractive.sdk.util.aa.a(decodeStream)) {
                aVar.a = decodeStream;
                IAlog.b("SimpleImageLoader: Got a valid bitmap %s", this.a);
            }
            IAlog.b("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
            aVar.b = "Got an invalid bitmap";
        }
        xVar.a = aVar;
        return xVar;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.b;
    }

    /* loaded from: classes.dex */
    public static class a {
        public Bitmap a = null;
        public String b = null;

        a() {
        }
    }
}
