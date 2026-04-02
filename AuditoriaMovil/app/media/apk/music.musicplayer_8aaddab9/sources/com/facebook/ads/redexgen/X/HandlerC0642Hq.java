package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import ch.qos.logback.classic.Level;
import com.facebook.ads.redexgen.X.InterfaceC0643Hr;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Hq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0642Hq<T extends InterfaceC0643Hr> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    @Nullable
    public InterfaceC0641Hp<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C0969Um A09;

    static {
        A04();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-112, -125, -73, -64, -57, -110, -116, -81, -95, -92, -108, -95, -77, -85, -76, -38, -39, -76, -53, -78, -54, -46, -44, -41, -34, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, -39, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -58, -58, -61, -58, 116, -64, -61, -75, -72, -67, -62, -69, 116, -57, -56, -58, -71, -75, -63, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -19, -26, -13, -23, -15, -18, -13, -20, -91, -15, -12, -26, -23, -91, -24, -12, -14, -11, -15, -22, -7, -22, -23, -117, -92, -101, -82, -90, -101, -103, -86, -101, -102, 86, -101, -82, -103, -101, -90, -86, -97, -91, -92, 86, -94, -91, -105, -102, -97, -92, -99, 86, -87, -86, -88, -101, -105, -93, -46, -43, -57, -54, -96, -94, -55, -46, -39, -92};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hp != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hr> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public HandlerC0642Hq(C0969Um c0969Um, Looper looper, T loadable, InterfaceC0641Hp<T> interfaceC0641Hp, int i2, long j2) {
        super(looper);
        this.A09 = c0969Um;
        this.A05 = loadable;
        this.A01 = interfaceC0641Hp;
        this.A03 = i2;
        this.A04 = j2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, (int) Level.TRACE_INT);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private void A02() {
        ExecutorService executorService;
        HandlerC0642Hq handlerC0642Hq;
        this.A02 = null;
        executorService = this.A09.A02;
        handlerC0642Hq = this.A09.A00;
        executorService.execute(handlerC0642Hq);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A05(int i2) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i2) {
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A06(long j2) {
        HandlerC0642Hq handlerC0642Hq;
        handlerC0642Hq = this.A09.A00;
        IJ.A04(handlerC0642Hq == null);
        this.A09.A00 = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3x();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ABC(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what != 4) {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.ABC(this.A05, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.A01.ABC(this.A05, elapsedRealtime, j2, false);
                } else if (i2 == 2) {
                    try {
                        this.A01.ABE(this.A05, elapsedRealtime, j2);
                    } catch (RuntimeException e2) {
                        Log.e(A01(6, 8, 48), A01(77, 44, 117), e2);
                        this.A09.A01 = new C0647Hv(e2);
                    }
                } else if (i2 != 3) {
                } else {
                    this.A02 = (IOException) message.obj;
                    int ABF = this.A01.ABF(this.A05, elapsedRealtime, j2, this.A02);
                    if (ABF != 3) {
                        if (ABF == 2) {
                            return;
                        }
                        this.A00 = ABF == 1 ? 1 : this.A00 + 1;
                        A06(A00());
                        return;
                    }
                    this.A09.A01 = this.A02;
                }
            } else {
                throw ((Error) message.obj);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hr> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 48);
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0673Iv.A02(A01(156, 10, 86) + this.A05.getClass().getSimpleName() + A01(0, 6, 68));
                                try {
                                    this.A05.A8m();
                                } finally {
                                    C0673Iv.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (InterruptedException unused) {
                            IJ.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (OutOfMemoryError e2) {
                        Log.e(A01, A01(14, 32, 85), e2);
                        if (!this.A08) {
                            obtainMessage(3, new C0647Hv(e2)).sendToTarget();
                        }
                    }
                } catch (Error e3) {
                    Log.e(A01, A01(46, 31, 68), e3);
                    if (!this.A08) {
                        obtainMessage(4, e3).sendToTarget();
                    }
                    throw e3;
                }
            } catch (IOException e4) {
                if (!this.A08) {
                    obtainMessage(3, e4).sendToTarget();
                }
            } catch (Exception e5) {
                Log.e(A01, A01(121, 35, 38), e5);
                if (!this.A08) {
                    obtainMessage(3, new C0647Hv(e5)).sendToTarget();
                }
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
