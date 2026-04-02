package c.v.l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class a {
    public static final Map<String, Lock> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final File f2805b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f2806c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2807d;

    /* renamed from: e  reason: collision with root package name */
    public FileChannel f2808e;

    public a(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, e.a.d.a.a.k(str, ".lck"));
        this.f2805b = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = a;
        synchronized (map) {
            lock = map.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(absolutePath, lock);
            }
        }
        this.f2806c = lock;
        this.f2807d = z;
    }

    public void a() {
        FileChannel fileChannel = this.f2808e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f2806c.unlock();
    }
}
