package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Fl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0587Fl {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;
    @Nullable
    public final FY A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0586Fk> A03;

    public C0587Fl() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0587Fl(CopyOnWriteArrayList<C0586Fk> copyOnWriteArrayList, int i2, @Nullable FY fy, long j2) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = fy;
        this.A02 = j2;
    }

    private long A00(long j2) {
        long A01 = AG.A01(j2);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j3 + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C0587Fl A02(int i2, @Nullable FY fy, long j2) {
        return new C0587Fl(this.A03, i2, fy, j2);
    }

    public final void A03() {
        IJ.A04(this.A01 != null);
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0577Fb(this, listenerAndHandler.A01));
        }
    }

    public final void A04() {
        IJ.A04(this.A01 != null);
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0578Fc(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        IJ.A04(this.A01 != null);
        Iterator<C0586Fk> it = this.A03.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (hasNext) {
                C0586Fk listenerAndHandler = it.next();
                A01(listenerAndHandler.A00, new RunnableC0583Fh(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A06(int i2, @Nullable Format format, int i3, @Nullable Object obj, long j2) {
        A0C(new C0589Fn(1, i2, format, i3, obj, A00(j2), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0590Fo interfaceC0590Fo) {
        IJ.A03((handler == null || interfaceC0590Fo == null) ? false : true);
        this.A03.add(new C0586Fk(handler, interfaceC0590Fo));
    }

    public final void A08(C0588Fm c0588Fm, C0589Fn c0589Fn) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk next = it.next();
            A01(next.A00, new RunnableC0581Ff(this, next.A01, c0588Fm, c0589Fn));
        }
    }

    public final void A09(C0588Fm c0588Fm, C0589Fn c0589Fn) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk next = it.next();
            A01(next.A00, new RunnableC0580Fe(this, next.A01, c0588Fm, c0589Fn));
        }
    }

    public final void A0A(C0588Fm c0588Fm, C0589Fn c0589Fn) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk next = it.next();
            A01(next.A00, new RunnableC0579Fd(this, next.A01, c0588Fm, c0589Fn));
        }
    }

    public final void A0B(C0588Fm c0588Fm, C0589Fn c0589Fn, IOException iOException, boolean z) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0582Fg(this, listenerAndHandler.A01, c0588Fm, c0589Fn, iOException, z));
        }
    }

    public final void A0C(C0589Fn c0589Fn) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk next = it.next();
            A01(next.A00, new RunnableC0585Fj(this, next.A01, c0589Fn));
        }
    }

    public final void A0D(InterfaceC0590Fo interfaceC0590Fo) {
        Iterator<C0586Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0586Fk next = it.next();
            if (next.A01 == interfaceC0590Fo) {
                this.A03.remove(next);
            }
        }
    }

    public final void A0E(C0636Hi c0636Hi, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4) {
        A0A(new C0588Fm(c0636Hi, j4, 0L, 0L), new C0589Fn(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0F(C0636Hi c0636Hi, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6) {
        A08(new C0588Fm(c0636Hi, j4, j5, j6), new C0589Fn(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0G(C0636Hi c0636Hi, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6) {
        A09(new C0588Fm(c0636Hi, j4, j5, j6), new C0589Fn(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0H(C0636Hi c0636Hi, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z) {
        A0B(new C0588Fm(c0636Hi, j4, j5, j6), new C0589Fn(i2, i3, format, i4, obj, A00(j2), A00(j3)), iOException, z);
    }
}
