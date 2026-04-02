package com.amazon.aps.iva.h4;

import android.view.Choreographer;
import com.amazon.aps.iva.x.h;
import java.util.ArrayList;
/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public final class a {
    public static final ThreadLocal<a> f = new ThreadLocal<>();
    public d d;
    public final h<b, Long> a = new h<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final C0320a c = new C0320a();
    public boolean e = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: com.amazon.aps.iva.h4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0320a {
        public C0320a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j);
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final C0320a a;

        public c(C0320a c0320a) {
            this.a = c0320a;
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public final Choreographer b;
        public final Choreographer$FrameCallbackC0321a c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: com.amazon.aps.iva.h4.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0321a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0321a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0046 A[SYNTHETIC] */
            @Override // android.view.Choreographer.FrameCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    com.amazon.aps.iva.h4.a$d r10 = com.amazon.aps.iva.h4.a.d.this
                    com.amazon.aps.iva.h4.a$a r10 = r10.a
                    r10.getClass()
                    long r0 = android.os.SystemClock.uptimeMillis()
                    com.amazon.aps.iva.h4.a r10 = com.amazon.aps.iva.h4.a.this
                    r10.getClass()
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r11 = 0
                    r4 = r11
                L16:
                    java.util.ArrayList<com.amazon.aps.iva.h4.a$b> r5 = r10.b
                    int r6 = r5.size()
                    if (r4 >= r6) goto L49
                    java.lang.Object r5 = r5.get(r4)
                    com.amazon.aps.iva.h4.a$b r5 = (com.amazon.aps.iva.h4.a.b) r5
                    if (r5 != 0) goto L27
                    goto L46
                L27:
                    com.amazon.aps.iva.x.h<com.amazon.aps.iva.h4.a$b, java.lang.Long> r6 = r10.a
                    r7 = 0
                    java.lang.Object r7 = r6.getOrDefault(r5, r7)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L33
                    goto L3e
                L33:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L40
                    r6.remove(r5)
                L3e:
                    r6 = 1
                    goto L41
                L40:
                    r6 = r11
                L41:
                    if (r6 == 0) goto L46
                    r5.a(r0)
                L46:
                    int r4 = r4 + 1
                    goto L16
                L49:
                    boolean r0 = r10.e
                    if (r0 == 0) goto L61
                    int r0 = r5.size()
                L51:
                    int r0 = r0 + (-1)
                    if (r0 < 0) goto L5f
                    java.lang.Object r1 = r5.get(r0)
                    if (r1 != 0) goto L51
                    r5.remove(r0)
                    goto L51
                L5f:
                    r10.e = r11
                L61:
                    int r11 = r5.size()
                    if (r11 <= 0) goto L7d
                    com.amazon.aps.iva.h4.a$d r11 = r10.d
                    if (r11 != 0) goto L74
                    com.amazon.aps.iva.h4.a$d r11 = new com.amazon.aps.iva.h4.a$d
                    com.amazon.aps.iva.h4.a$a r0 = r10.c
                    r11.<init>(r0)
                    r10.d = r11
                L74:
                    com.amazon.aps.iva.h4.a$d r10 = r10.d
                    com.amazon.aps.iva.h4.a$d$a r11 = r10.c
                    android.view.Choreographer r10 = r10.b
                    r10.postFrameCallback(r11)
                L7d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h4.a.d.Choreographer$FrameCallbackC0321a.doFrame(long):void");
            }
        }

        public d(C0320a c0320a) {
            super(c0320a);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer$FrameCallbackC0321a();
        }
    }
}
