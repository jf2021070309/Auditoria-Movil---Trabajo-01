package com.amazon.aps.iva.t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.t5.l;
import java.util.ArrayList;
/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes.dex */
public final class z implements l {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    /* compiled from: SystemHandlerWrapper.java */
    /* loaded from: classes.dex */
    public static final class a implements l.a {
        public Message a;

        public final void a() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            this.a = null;
            ArrayList arrayList = z.b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public z(Handler handler) {
        this.a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                aVar = new a();
            } else {
                aVar = (a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return aVar;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final void a() {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.amazon.aps.iva.t5.l
    public final boolean b() {
        return this.a.hasMessages(0);
    }

    @Override // com.amazon.aps.iva.t5.l
    public final a c(int i) {
        a m = m();
        m.a = this.a.obtainMessage(i);
        return m;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final a d(int i, Object obj) {
        a m = m();
        m.a = this.a.obtainMessage(i, obj);
        return m;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final Looper e() {
        return this.a.getLooper();
    }

    @Override // com.amazon.aps.iva.t5.l
    public final a f(int i, int i2, int i3) {
        a m = m();
        m.a = this.a.obtainMessage(i, i2, i3);
        return m;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final boolean g(l.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        aVar2.a = null;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar2);
            }
        }
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final a h(int i, Object obj, int i2, int i3) {
        a m = m();
        m.a = this.a.obtainMessage(i, i2, i3, obj);
        return m;
    }

    @Override // com.amazon.aps.iva.t5.l
    public final boolean i(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.amazon.aps.iva.t5.l
    public final boolean j(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.amazon.aps.iva.t5.l
    public final boolean k(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.amazon.aps.iva.t5.l
    public final void l(int i) {
        this.a.removeMessages(i);
    }
}
