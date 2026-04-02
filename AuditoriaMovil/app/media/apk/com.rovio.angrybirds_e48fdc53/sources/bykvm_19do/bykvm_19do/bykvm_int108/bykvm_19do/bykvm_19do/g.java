package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.h;
import com.facebook.share.internal.ShareConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private static boolean a = false;
    private static boolean b = true;
    private static int c;
    private static List<d> d;
    private static long g;
    private static HandlerThread h;
    private static long i;
    private static long j;
    private static Handler k;
    private static int l;
    private static boolean m;
    private static volatile AtomicLong e = new AtomicLong(-1);
    private static long f = 100;
    private static volatile String n = null;
    private static volatile boolean o = false;
    private static int p = -1;
    public static long q = -1;
    public static long r = -1;
    private static int s = -1;
    private static MessageQueue t = null;
    private static Field u = null;
    private static Field v = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Printer {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
        @Override // android.util.Printer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void println(java.lang.String r17) {
            /*
                r16 = this;
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a()
                if (r0 != 0) goto L8
                goto L9a
            L8:
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r17)
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.g()
                r1 = 1
                if (r0 != 0) goto L1f
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r1)
                int r0 = android.os.Process.myTid()
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r0)
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.h()
            L1f:
                java.util.concurrent.atomic.AtomicLong r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.i()
                long r2 = r0.get()
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.q = r2
                long r2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.r
                r4 = -1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L9a
                long r2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.q
                long r4 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.r
                long r11 = r2 - r4
                r2 = 0
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 > 0) goto L41
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.k()
                goto L9a
            L41:
                r2 = 1
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 != 0) goto L59
                int r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r0 <= r1) goto L4f
                r0 = 7
                goto L60
            L4f:
                int r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r0 != r1) goto L57
                r0 = 3
                goto L60
            L57:
                r0 = 0
                goto L60
            L59:
                int r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r0 <= r1) goto L62
                r0 = 5
            L60:
                r13 = r0
                goto L6b
            L62:
                int r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r0 != r1) goto L6a
                r0 = 6
                goto L60
            L6a:
                r13 = r1
            L6b:
                long r2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.l()
                long r4 = android.os.SystemClock.uptimeMillis()
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.m()
                if (r0 != 0) goto L91
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g$d r6 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.n()
                long r7 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b()
                long r7 = r2 - r7
                long r9 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.c()
                long r9 = r4 - r9
                int r14 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                r15 = 0
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r6, r7, r9, r11, r13, r14, r15)
            L91:
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r2)
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b(r4)
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b(r1)
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a.println(java.lang.String):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements Printer {
        b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
        @Override // android.util.Printer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void println(java.lang.String r17) {
            /*
                r16 = this;
                java.util.concurrent.atomic.AtomicLong r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.i()
                long r0 = r0.get()
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.r = r0
                long r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.q
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L14
                goto L84
            L14:
                long r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.r
                long r4 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.q
                long r11 = r0 - r4
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 <= 0) goto L84
                long r0 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.l()
                long r2 = android.os.SystemClock.uptimeMillis()
                r4 = 1
                int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L38
                int r7 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r7 <= r6) goto L38
                r4 = 9
            L36:
                r13 = r4
                goto L58
            L38:
                if (r4 != 0) goto L42
                int r7 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r7 != r6) goto L42
                r4 = 2
                goto L36
            L42:
                if (r4 <= 0) goto L4c
                int r7 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r7 <= r6) goto L4c
                r4 = 4
                goto L36
            L4c:
                if (r4 <= 0) goto L57
                int r4 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                if (r4 != r6) goto L57
                r4 = 8
                goto L36
            L57:
                r13 = r5
            L58:
                boolean r4 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.m()
                if (r4 != 0) goto L77
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g$d r6 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.n()
                long r7 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b()
                long r7 = r0 - r7
                long r9 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.c()
                long r9 = r2 - r9
                int r14 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.j()
                r15 = r17
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r6, r7, r9, r11, r13, r14, r15)
            L77:
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.a(r0)
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b(r2)
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b(r5)
                r0 = -1
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.q = r0
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do.g.b.println(java.lang.String):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            g.e.set((SystemClock.uptimeMillis() - g.g) / g.f);
            long uptimeMillis = (SystemClock.uptimeMillis() - g.g) % g.f;
            if (uptimeMillis >= 95) {
                g.e.incrementAndGet();
                j = g.f << 1;
            } else {
                j = g.f;
            }
            g.k.postDelayed(this, j - uptimeMillis);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public int a;
        public int b;
        public long c;
        public long d;
        public long e;
        public boolean f;
        public String g;

        public String toString() {
            StringBuilder sb;
            String str;
            String str2;
            String str3;
            int i = this.b;
            if (i == 0) {
                sb = new StringBuilder();
                str3 = "[[[ IDLE  ]]] cost ";
            } else if (i != 1) {
                if (i == 2) {
                    sb = new StringBuilder();
                    sb.append("[[[  1 msg  ]]] cost ");
                    sb.append(this.c);
                    sb.append(" tick , mDuration：");
                    sb.append(this.d);
                    sb.append(",cpuTime:");
                    sb.append(this.e);
                    sb.append(", msg:");
                } else if (i == 3) {
                    sb = new StringBuilder();
                    str3 = "[[[ 1 msg + IDLE  ]]] cost ";
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            sb = new StringBuilder();
                            sb.append("[[[ ");
                            sb.append(this.a);
                            sb.append(" msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than");
                            sb.append(this.c - 1);
                            str2 = " ticks, , mDuration：";
                        } else if (i != 6) {
                            if (i == 7) {
                                sb = new StringBuilder();
                                sb.append("[[[ ");
                                sb.append(this.a);
                                str = " msgs + IDLE  ]]] cost 1 tick , mDuration：";
                            } else if (i == 8) {
                                sb = new StringBuilder();
                                sb.append("[[[ 1 msgs ]]] cost ");
                                sb.append(this.c);
                                sb.append(" ticks , mDuration：");
                                sb.append(this.d);
                                sb.append(" cost cpuTime:");
                            } else if (i != 9) {
                                sb = new StringBuilder();
                                sb.append("=========   UNKNOW =========  Type:");
                                sb.append(this.b);
                                sb.append(" cost ticks ");
                                sb.append(this.c);
                                sb.append(" msgs:");
                                sb.append(this.a);
                                return sb.toString();
                            } else {
                                sb = new StringBuilder();
                                sb.append("[[[ ");
                                sb.append(this.a);
                                str = " msgs ]]] cost 1 tick , mDuration：";
                            }
                            sb.append(str);
                            sb.append(this.d);
                            sb.append(" cost cpuTime:");
                            sb.append(this.e);
                            return sb.toString();
                        } else {
                            sb = new StringBuilder();
                            sb.append("[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than");
                            sb.append(this.c - 1);
                            str2 = ", , mDuration：";
                        }
                        sb.append(str2);
                        sb.append(this.d);
                        sb.append("cpuTime:");
                        sb.append(this.e);
                        return sb.toString();
                    }
                    sb = new StringBuilder();
                    sb.append("[[[ ");
                    sb.append(this.a - 1);
                    sb.append(" msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than ");
                    sb.append(this.c - 1);
                    sb.append("tick ,, mDuration：");
                    sb.append(this.d);
                    sb.append("cpuTime:");
                    sb.append(this.e);
                    sb.append(" msg:");
                }
                sb.append(this.g);
                return sb.toString();
            } else {
                sb = new StringBuilder();
                str3 = "[[[ Long IDLE  ]]] cost ";
            }
            sb.append(str3);
            sb.append(this.c);
            sb.append(" tick , mDuration：");
            sb.append(this.d);
            sb.append(",cpuTime:");
            sb.append(this.e);
            return sb.toString();
        }
    }

    private static Message a(Message message) {
        Message message2;
        Field field = v;
        Message message3 = null;
        try {
            if (field == null) {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                v = declaredField;
                declaredField.setAccessible(true);
                message2 = (Message) v.get(message);
                if (a) {
                    Log.i("LooperMonitor", "[getNextMessage] success get next msg :" + message2);
                }
            } else {
                message2 = (Message) field.get(message);
            }
            message3 = message2;
            return message3;
        } catch (Exception e2) {
            return message3;
        }
    }

    private static Message a(MessageQueue messageQueue) {
        Object obj;
        Field field = u;
        try {
            if (field == null) {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                u = declaredField;
                declaredField.setAccessible(true);
                obj = u.get(messageQueue);
            } else {
                obj = field.get(messageQueue);
            }
            return (Message) obj;
        } catch (Exception e2) {
            return null;
        }
    }

    public static JSONArray a(int i2, long j2) {
        MessageQueue r2 = r();
        JSONArray jSONArray = new JSONArray();
        if (r2 != null) {
            synchronized (r2) {
                Message a2 = a(r2);
                if (a2 != null) {
                    int i3 = 0;
                    int i4 = 0;
                    while (a2 != null && i3 < i2) {
                        i3++;
                        i4++;
                        JSONObject a3 = a(a2, j2);
                        try {
                            a3.put("id", i4);
                        } catch (JSONException e2) {
                        }
                        jSONArray.put(a3);
                        a2 = a(a2);
                    }
                }
            }
        }
        return jSONArray;
    }

    private static JSONObject a(Message message, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (message != null) {
            try {
                jSONObject.put("when", message.getWhen() - j2);
                if (message.getCallback() != null) {
                    jSONObject.put("callback", message.getCallback());
                }
                jSONObject.put("what", message.what);
                if (message.getTarget() != null) {
                    jSONObject.put("target", message.getTarget());
                } else {
                    jSONObject.put("barrier", message.arg1);
                }
                jSONObject.put("arg1", message.arg1);
                jSONObject.put("arg2", message.arg2);
                if (message.obj != null) {
                    jSONObject.put("obj", message.obj);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static void a(int i2, int i3) {
        if (b) {
            if (i2 > 10) {
                c = i2;
            }
            if (i3 > 10) {
                f = i3;
            }
            d = new ArrayList();
            u();
            a(r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(d dVar, long j2, long j3, long j4, int i2, int i3, String str) {
        dVar.e = j2;
        dVar.c = j4;
        dVar.d = j3;
        dVar.f = false;
        dVar.a = i3;
        if (str != null) {
            dVar.g = str;
        }
        dVar.b = i2;
    }

    public static JSONObject c(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, n);
            jSONObject.put("currentMessageCost", o());
            jSONObject.put("currentMessageCpu", s() - i);
            jSONObject.put("currentTick", e.get());
        } catch (Throwable th) {
            j.a(th);
        }
        return jSONObject;
    }

    static /* synthetic */ int k() {
        int i2 = l;
        l = i2 + 1;
        return i2;
    }

    static /* synthetic */ long l() {
        return s();
    }

    static /* synthetic */ d n() {
        return t();
    }

    public static long o() {
        long uptimeMillis;
        long j2;
        if (q < 0) {
            uptimeMillis = SystemClock.uptimeMillis() - g;
            j2 = r;
        } else {
            uptimeMillis = SystemClock.uptimeMillis() - g;
            j2 = q;
        }
        return uptimeMillis - (j2 * f);
    }

    public static List<d> p() {
        if (d == null) {
            return null;
        }
        o = true;
        ArrayList arrayList = new ArrayList();
        if (d.size() == c) {
            for (int i2 = s; i2 < d.size(); i2++) {
                arrayList.add(d.get(i2));
            }
            for (int i3 = 0; i3 < s; i3++) {
                arrayList.add(d.get(i3));
            }
        } else {
            arrayList.addAll(d);
        }
        o = false;
        return arrayList;
    }

    public static JSONArray q() {
        JSONArray jSONArray = new JSONArray();
        List<d> p2 = p();
        if (p2 != null) {
            int i2 = 0;
            for (d dVar : p2) {
                if (dVar != null) {
                    i2++;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("msg", dVar.g);
                        jSONObject.put("cpuDuration", dVar.e);
                        jSONObject.put("duration", dVar.d);
                        jSONObject.put("tick", dVar.c);
                        jSONObject.put("type", dVar.b);
                        jSONObject.put("count", dVar.a);
                        jSONObject.put("id", i2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public static MessageQueue r() {
        MessageQueue queue;
        if (t == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                queue = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                queue = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    t = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            t = queue;
        }
        return t;
    }

    private static long s() {
        return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.c.a(p);
    }

    private static d t() {
        int size = d.size();
        int i2 = c;
        if (size == i2) {
            int i3 = (s + 1) % i2;
            s = i3;
            return d.get(i3);
        }
        d dVar = new d();
        d.add(dVar);
        s++;
        return dVar;
    }

    public static void u() {
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.g.a(4L);
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.f.e().a();
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.f.e().b(new a());
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.f.e().a(new b());
        i = s();
        j = SystemClock.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v() {
        h = h.b();
        g = SystemClock.uptimeMillis();
        k = new Handler(h.getLooper());
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.g.a(8L);
        k.postDelayed(new c(), f);
    }
}
