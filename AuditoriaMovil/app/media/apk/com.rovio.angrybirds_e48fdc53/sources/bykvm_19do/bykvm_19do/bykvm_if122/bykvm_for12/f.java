package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.x;
import com.bytedance.msdk.adapter.util.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class f<T extends k> extends HandlerThread implements Handler.Callback {
    public String a;
    public final bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.a<T> b;
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<T> c;
    public final List<T> d;
    public long e;
    public boolean f;
    public int g;
    public Handler h;
    public final a i;
    public final b j;
    private boolean k;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static class b {
        final int a;
        final long b;
        final long c;
        final int d;
        final long e;
        final long f;

        b(int i, long j, long j2, int i2, long j3, long j4) {
            this.a = i;
            this.b = j;
            this.c = j2;
            this.d = i2;
            this.e = j3;
            this.f = j4;
        }

        public static b b() {
            Logger.d("TTMediationSDK", "AdEventThread- policy: batchSize: " + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().k() + ", routineInterval: " + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().q());
            return new b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().k(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().q(), 60000L, 5, 604800000L, 300000L);
        }

        public int a() {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.m.a) {
                return 1;
            }
            return this.a;
        }
    }

    public f(String str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.a<T> aVar, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<T> aVar2, b bVar, a aVar3) {
        super("gm_t_adevent_" + str, -4);
        this.a = "AdEventThread-【";
        this.a += str + "】";
        this.k = "V3".equals(str);
        a("tag=" + str);
        this.j = bVar;
        this.i = aVar3;
        this.b = aVar;
        this.c = aVar2;
        this.d = Collections.synchronizedList(new LinkedList());
    }

    private void a() {
        this.b.a(h(), this.d);
        this.d.clear();
    }

    private void a(int i, long j) {
        Message obtainMessage = this.h.obtainMessage();
        obtainMessage.what = i;
        this.h.sendMessageDelayed(obtainMessage, j);
    }

    private void a(T t) {
        this.b.a(h(), (int) t);
        if (this.f) {
            a("如果在容灾状态，直接返回.......mIsServerBusy=" + this.f);
            return;
        }
        a("onHandleReceivedAdEvent");
        this.d.add(t);
        a(this.d);
        if (j()) {
            a("onHandleReceivedAdEvent upload");
            f();
        }
    }

    private void a(String str) {
        Logger.i(this.a, str);
    }

    private void a(List<T> list) {
        String str;
        int a2 = this.j.a();
        if (list == null) {
            return;
        }
        if (list.size() <= a2) {
            str = "start and return, checkAndDeleteEvent local size:" + list.size() + "小于:" + a2;
        } else {
            int size = list.size() - a2;
            a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i));
            }
            list.removeAll(arrayList);
            str = "end checkAndDeleteEvent local size:" + list.size();
        }
        a(str);
    }

    private static boolean a(g gVar) {
        return gVar.d;
    }

    private void b() {
        this.f = false;
        this.b.a(h(), false);
        this.g = 0;
        this.b.a(h(), 0);
        this.h.removeMessages(4);
    }

    private void b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T t : this.d) {
                        hashSet.add(t.a());
                    }
                    for (T t2 : list) {
                        if (!hashSet.contains(t2.a())) {
                            this.d.add(t2);
                        }
                    }
                    return;
                }
            } catch (Exception e) {
                return;
            }
        }
        a("reloadCacheList adEventList is empty======");
    }

    private static boolean b(g gVar) {
        return gVar.b == 509;
    }

    private g c(List<T> list) {
        try {
            if (this.c == null) {
                this.c = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.e();
            }
        } catch (Exception e) {
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<T> aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.a(list);
    }

    private void c() {
        a(2, this.j.b);
    }

    private void d() {
        a(4, g());
    }

    private void e() {
        a("普通失败 ，触发重试机制：" + this.j.c + "毫秒后 重试.....");
        a(3, this.j.c);
    }

    private void f() {
        this.h.removeMessages(3);
        this.h.removeMessages(2);
        if (x.a(this.d)) {
            this.e = System.currentTimeMillis();
            c();
        } else if (!this.i.a()) {
            a("doRoutineUpload no net, wait retry");
            e();
        } else {
            g c = c(this.d);
            if (c != null) {
                if (c.a) {
                    a("doRoutineUpload success: " + this.d.size() + " events");
                    a();
                    o();
                    p();
                } else if (b(c)) {
                    a("doRoutineUpload serverbusy");
                    i();
                } else if (a(c)) {
                    a("服务端返回data error 抛弃数据 , 清空本次日志，重置上传状态....");
                    a();
                    o();
                } else if (this.f) {
                } else {
                    e();
                    a("doRoutineUpload net fail retry");
                }
            }
        }
    }

    private long g() {
        long j = this.j.f;
        a("服务器繁忙，" + (((this.g % 3) + 1) * j) + "毫秒后进行重试,当前重试次数：mServerBusyRetryCount=" + this.g + "，mServerBusyRetryBaseInternal=" + this.j.f);
        return ((this.g % 3) + 1) * this.j.f;
    }

    private int h() {
        return this.k ? 2 : 1;
    }

    private void i() {
        this.f = true;
        this.b.a(h(), true);
        this.d.clear();
        this.h.removeMessages(3);
        this.h.removeMessages(2);
        d();
    }

    private boolean j() {
        a("mCacheList.size():" + this.d.size() + ",mPolicy.mMaxCacheCount=" + this.j.a() + ",System.currentTimeMillis() - mLastSuccessUploadTime =" + (System.currentTimeMillis() - this.e) + ",mPolicy.mMaxCacheTime=" + this.j.b);
        return !this.f && (this.d.size() >= this.j.a() || System.currentTimeMillis() - this.e >= this.j.b);
    }

    private void k() {
        a("onHandleInitEvent 初始化日志组件.....线程优先级：" + Process.getThreadPriority(0));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.a<T> aVar = this.b;
        b bVar = this.j;
        aVar.a(2, bVar.d, bVar.e);
        this.f = this.b.a(h());
        this.g = this.b.b(h());
        if (this.f) {
            a("onHandleInitEvent serverBusy, retryCount = " + this.g);
            d();
            return;
        }
        List<T> a2 = this.b.a(h(), this.j.a(), "_id");
        if (Logger.isDebug()) {
            for (T t : a2) {
            }
        }
        b(a2);
        a("onHandleInitEvent cacheData count = " + this.d.size());
        f();
    }

    private void l() {
        if (!this.f) {
            a("onHandleRoutineRetryEvent");
            f();
            return;
        }
        a("如果在容灾状态，直接返回, 安全起见这里判断一下,mIsServerBusy=" + this.f);
    }

    private void m() {
        if (!this.f) {
            a("onHandleRoutineUploadEvent");
            f();
            return;
        }
        a("如果在容灾状态，直接返回, 安全起见这里判断一下,mIsServerBusy=" + this.f);
    }

    private void n() {
        String str;
        if (this.i.a()) {
            List<T> a2 = this.b.a(h(), this.j.a(), "_id");
            a(a2);
            StringBuilder sb = new StringBuilder();
            sb.append("数据库查询出来的size=");
            sb.append(a2 != null ? a2.size() : 0);
            a(sb.toString());
            if (x.a(a2)) {
                a("onHandleServerBusyRetryEvent, empty list start routine");
                b();
                c();
                return;
            }
            g c = c(a2);
            if (c == null) {
                return;
            }
            if (c.a) {
                a("onHandleServerBusyRetryEvent, success");
                a();
                o();
                p();
                return;
            } else if (b(c)) {
                this.g++;
                this.b.a(h(), this.g);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.a<T> aVar = this.b;
                int h = h();
                b bVar = this.j;
                aVar.a(h, a2, bVar.d, bVar.e);
                d();
                str = "onHandleServerBusyRetryEvent, serverbusy, count = " + this.g;
            } else if (a(c)) {
                a("onHandleServerBusyRetryEvent, ---》 data Error直接抛弃数据 ");
                a();
                o();
                return;
            } else {
                e();
                str = "onHandleServerBusyRetryEvent, net fail";
            }
        } else {
            a(4, this.j.c);
            str = "onHandleServerBusyRetryEvent, no net";
        }
        a(str);
    }

    private void o() {
        this.e = System.currentTimeMillis();
        b();
        c();
    }

    private void p() {
        StringBuilder sb;
        String str;
        int a2 = this.j.a() / 2;
        if (a2 < 1) {
            a2 = 1;
        }
        List<T> a3 = this.b.a(h(), a2, "_id");
        if (a3 == null || a3.size() <= 0) {
            sb = new StringBuilder();
            str = "数据库日志数量: 0, 小于batchSize/2（";
        } else {
            this.d.addAll(a3);
            if (a3.size() >= a2) {
                this.h.removeMessages(2);
                this.h.sendEmptyMessage(2);
                sb = new StringBuilder();
                sb.append("数据库日志数量: ");
                sb.append(this.d.size());
                sb.append(", 大于等于batchSize/2（");
                sb.append(a2);
                sb.append("），继续上传.");
                a(sb.toString());
            }
            sb = new StringBuilder();
            sb.append("数据库日志数量: ");
            sb.append(this.d.size());
            str = ", 小于batchSize/2（";
        }
        sb.append(str);
        sb.append(a2);
        sb.append("），停止上传，等待新产生的事件");
        a(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            a((f<T>) ((k) message.obj));
        } else if (i == 2) {
            m();
        } else if (i == 3) {
            a("routine触发失败重试.....");
            l();
        } else if (i == 4) {
            a("触发服务器繁忙重试机制.....");
            n();
        } else if (i == 5) {
            k();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        this.e = System.currentTimeMillis();
        this.h = new Handler(getLooper(), this);
    }
}
