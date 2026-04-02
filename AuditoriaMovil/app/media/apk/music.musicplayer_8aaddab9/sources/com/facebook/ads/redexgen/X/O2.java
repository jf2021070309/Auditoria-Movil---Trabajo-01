package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class O2 {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = O2.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0R> A03;
    public final WeakReference<O3> A04;
    public final WeakReference<C0869Qp> A05;
    public final WeakReference<C0927Sv> A06;

    public O2(C0927Sv c0927Sv, O3 o3, C0869Qp c0869Qp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1046Xo c1046Xo) {
        this.A06 = new WeakReference<>(c0927Sv);
        this.A04 = new WeakReference<>(o3);
        this.A05 = new WeakReference<>(c0869Qp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1046Xo.A0D());
    }

    private C0R A00() {
        C0R c0r = this.A03.get();
        if (c0r == null) {
            return new C1330de();
        }
        return c0r;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C0743Ls.A01(AnonymousClass98.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i2, String str) {
        A00().AFX(i2, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AFY();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().AFZ();
            if (this.A06.get().isShown()) {
                A00().AFa();
                new Handler(Looper.getMainLooper()).post(new C0929Sx(this.A05));
            }
            O3 o3 = this.A04.get();
            if (o3 != null) {
                new Handler(Looper.getMainLooper()).post(new O1(this, o3));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C0927Sv c0927Sv = this.A06.get();
        if (c0927Sv == null || c0927Sv.A06()) {
            A00().AFb(true);
            return;
        }
        O3 o3 = this.A04.get();
        if (o3 == null) {
            A00().AFb(true);
            return;
        }
        A00().AFb(false);
        o3.ABe();
    }
}
