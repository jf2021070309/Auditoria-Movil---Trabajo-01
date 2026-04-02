package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public abstract class d<T extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> {
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a a;
    private Queue<T> b = new ConcurrentLinkedQueue();
    private String c;

    public d(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a aVar, Queue<String> queue, String str) {
        this.c = "EventMemoryCacheManager";
        this.a = aVar;
        this.c = str;
    }

    public void a(int i, List<T> list) {
        synchronized (this) {
            if (i == -1 || i == 200 || i == 509) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d(this.c + " memory size：" + this.b.size());
            } else {
                this.b.addAll(list);
            }
        }
    }

    public void a(T t) {
        Queue<T> queue = this.b;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public boolean a(int i, int i2) {
        boolean z;
        synchronized (this) {
            int size = this.b.size();
            int b = this.a.b();
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d(this.c + " size:" + size + " cacheCount:" + b + " message:" + i);
            z = false;
            if (i != 2 && i != 1) {
                if (size < b) {
                }
            }
            z = !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.d() ? true : true;
        }
        return z;
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> b(int i, int i2) {
        ArrayList arrayList;
        synchronized (this) {
            if (a(i, i2)) {
                arrayList = new ArrayList(this.a.b());
                do {
                    T poll = this.b.poll();
                    if (poll == null) {
                        break;
                    }
                    arrayList.add(poll);
                } while (arrayList.size() != this.a.a());
            } else {
                arrayList = null;
            }
        }
        return arrayList;
    }
}
