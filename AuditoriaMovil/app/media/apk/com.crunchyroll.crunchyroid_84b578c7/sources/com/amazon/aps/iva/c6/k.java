package com.amazon.aps.iva.c6;

import android.media.AudioDeviceInfo;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.r5.b;
import java.nio.ByteBuffer;
/* compiled from: AudioSink.java */
/* loaded from: classes.dex */
public interface k {

    /* compiled from: AudioSink.java */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public final int b;
        public final boolean c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, int r6, int r7, com.amazon.aps.iva.q5.v r8, boolean r9, java.lang.RuntimeException r10) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed "
                java.lang.String r1 = " Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = com.amazon.aps.iva.b6.x.a(r0, r4, r1, r5, r2)
                r5.append(r6)
                r5.append(r2)
                r5.append(r7)
                java.lang.String r6 = ") "
                r5.append(r6)
                r5.append(r8)
                if (r9 == 0) goto L20
                java.lang.String r6 = " (recoverable)"
                goto L22
            L20:
                java.lang.String r6 = ""
            L22:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5, r10)
                r3.b = r4
                r3.c = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.k.b.<init>(int, int, int, int, com.amazon.aps.iva.q5.v, boolean, java.lang.RuntimeException):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes.dex */
    public static final class d extends Exception {
        public d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes.dex */
    public static final class e extends Exception {
        public final int b;
        public final boolean c;
        public final com.amazon.aps.iva.q5.v d;

        public e(int i, com.amazon.aps.iva.q5.v vVar, boolean z) {
            super(c0.a("AudioTrack write failed: ", i));
            this.c = z;
            this.b = i;
            this.d = vVar;
        }
    }

    void b();

    boolean c(com.amazon.aps.iva.q5.v vVar);

    boolean d();

    k0 e();

    void f(k0 k0Var);

    void flush();

    void j(float f);

    int k(com.amazon.aps.iva.q5.v vVar);

    boolean m();

    void n(int i);

    void o();

    void p(com.amazon.aps.iva.q5.f fVar);

    void pause();

    boolean q(ByteBuffer byteBuffer, long j, int i) throws b, e;

    void r(com.amazon.aps.iva.q5.v vVar, int[] iArr) throws a;

    void reset();

    void s() throws e;

    long u(boolean z);

    void v();

    void w();

    void x(com.amazon.aps.iva.q5.h hVar);

    void y(boolean z);

    /* compiled from: AudioSink.java */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public final com.amazon.aps.iva.q5.v b;

        public a(b.C0666b c0666b, com.amazon.aps.iva.q5.v vVar) {
            super(c0666b);
            this.b = vVar;
        }

        public a(String str, com.amazon.aps.iva.q5.v vVar) {
            super(str);
            this.b = vVar;
        }
    }

    default void release() {
    }

    default void l(AudioDeviceInfo audioDeviceInfo) {
    }

    default void t(p1 p1Var) {
    }
}
