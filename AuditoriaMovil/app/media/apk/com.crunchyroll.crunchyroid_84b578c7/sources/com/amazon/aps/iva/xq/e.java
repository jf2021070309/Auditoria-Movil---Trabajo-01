package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.eq.a;
import com.amazon.aps.iva.fr.a;
import com.amazon.aps.iva.fr.b;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: RumEventExt.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: RumEventExt.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[com.amazon.aps.iva.sq.h.values().length];
            iArr[com.amazon.aps.iva.sq.h.BEACON.ordinal()] = 1;
            iArr[com.amazon.aps.iva.sq.h.FETCH.ordinal()] = 2;
            iArr[com.amazon.aps.iva.sq.h.XHR.ordinal()] = 3;
            iArr[com.amazon.aps.iva.sq.h.DOCUMENT.ordinal()] = 4;
            iArr[com.amazon.aps.iva.sq.h.IMAGE.ordinal()] = 5;
            iArr[com.amazon.aps.iva.sq.h.JS.ordinal()] = 6;
            iArr[com.amazon.aps.iva.sq.h.FONT.ordinal()] = 7;
            iArr[com.amazon.aps.iva.sq.h.CSS.ordinal()] = 8;
            iArr[com.amazon.aps.iva.sq.h.MEDIA.ordinal()] = 9;
            iArr[com.amazon.aps.iva.sq.h.NATIVE.ordinal()] = 10;
            iArr[com.amazon.aps.iva.sq.h.UNKNOWN.ordinal()] = 11;
            iArr[com.amazon.aps.iva.sq.h.OTHER.ordinal()] = 12;
            a = iArr;
            int[] iArr2 = new int[com.amazon.aps.iva.sq.e.values().length];
            iArr2[com.amazon.aps.iva.sq.e.NETWORK.ordinal()] = 1;
            iArr2[com.amazon.aps.iva.sq.e.SOURCE.ordinal()] = 2;
            iArr2[com.amazon.aps.iva.sq.e.CONSOLE.ordinal()] = 3;
            iArr2[com.amazon.aps.iva.sq.e.LOGGER.ordinal()] = 4;
            iArr2[com.amazon.aps.iva.sq.e.AGENT.ordinal()] = 5;
            iArr2[com.amazon.aps.iva.sq.e.WEBVIEW.ordinal()] = 6;
            b = iArr2;
            int[] iArr3 = new int[com.amazon.aps.iva.tq.a.values().length];
            iArr3[com.amazon.aps.iva.tq.a.ANDROID.ordinal()] = 1;
            iArr3[com.amazon.aps.iva.tq.a.BROWSER.ordinal()] = 2;
            iArr3[com.amazon.aps.iva.tq.a.REACT_NATIVE.ordinal()] = 3;
            iArr3[com.amazon.aps.iva.tq.a.FLUTTER.ordinal()] = 4;
            c = iArr3;
            int[] iArr4 = new int[com.amazon.aps.iva.sq.d.values().length];
            iArr4[com.amazon.aps.iva.sq.d.TAP.ordinal()] = 1;
            iArr4[com.amazon.aps.iva.sq.d.SCROLL.ordinal()] = 2;
            iArr4[com.amazon.aps.iva.sq.d.SWIPE.ordinal()] = 3;
            iArr4[com.amazon.aps.iva.sq.d.CLICK.ordinal()] = 4;
            iArr4[com.amazon.aps.iva.sq.d.BACK.ordinal()] = 5;
            iArr4[com.amazon.aps.iva.sq.d.CUSTOM.ordinal()] = 6;
            d = iArr4;
            int[] iArr5 = new int[a.b.values().length];
            iArr5[a.b.NETWORK_ETHERNET.ordinal()] = 1;
            iArr5[a.b.NETWORK_WIFI.ordinal()] = 2;
            iArr5[a.b.NETWORK_WIMAX.ordinal()] = 3;
            iArr5[a.b.NETWORK_BLUETOOTH.ordinal()] = 4;
            iArr5[a.b.NETWORK_2G.ordinal()] = 5;
            iArr5[a.b.NETWORK_3G.ordinal()] = 6;
            iArr5[a.b.NETWORK_4G.ordinal()] = 7;
            iArr5[a.b.NETWORK_5G.ordinal()] = 8;
            iArr5[a.b.NETWORK_MOBILE_OTHER.ordinal()] = 9;
            iArr5[a.b.NETWORK_CELLULAR.ordinal()] = 10;
            iArr5[a.b.NETWORK_OTHER.ordinal()] = 11;
            iArr5[a.b.NETWORK_NOT_CONNECTED.ordinal()] = 12;
            e = iArr5;
            int[] iArr6 = new int[com.amazon.aps.iva.aq.h.values().length];
            iArr6[com.amazon.aps.iva.aq.h.MOBILE.ordinal()] = 1;
            iArr6[com.amazon.aps.iva.aq.h.TABLET.ordinal()] = 2;
            iArr6[com.amazon.aps.iva.aq.h.TV.ordinal()] = 3;
            iArr6[com.amazon.aps.iva.aq.h.DESKTOP.ordinal()] = 4;
            f = iArr6;
        }
    }

    public static final a.n a(com.amazon.aps.iva.aq.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        int i = a.f[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return a.n.OTHER;
                    }
                    return a.n.DESKTOP;
                }
                return a.n.TV;
            }
            return a.n.TABLET;
        }
        return a.n.MOBILE;
    }

    public static final b.f b(com.amazon.aps.iva.eq.a aVar) {
        boolean z;
        b.z zVar;
        List J;
        b.c cVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        a.b bVar = a.b.NETWORK_NOT_CONNECTED;
        a.b bVar2 = aVar.a;
        if (bVar2 != bVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            zVar = b.z.CONNECTED;
        } else {
            zVar = b.z.NOT_CONNECTED;
        }
        switch (a.e[bVar2.ordinal()]) {
            case 1:
                J = f1.J(b.r.ETHERNET);
                break;
            case 2:
                J = f1.J(b.r.WIFI);
                break;
            case 3:
                J = f1.J(b.r.WIMAX);
                break;
            case 4:
                J = f1.J(b.r.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                J = f1.J(b.r.CELLULAR);
                break;
            case 11:
                J = f1.J(b.r.OTHER);
                break;
            case 12:
                J = z.b;
                break;
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
        String str = aVar.b;
        String str2 = aVar.g;
        if (str2 == null && str == null) {
            cVar = null;
        } else {
            cVar = new b.c(str2, str);
        }
        return new b.f(zVar, J, cVar);
    }

    public static final b.k c(com.amazon.aps.iva.aq.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        int i = a.f[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return b.k.OTHER;
                    }
                    return b.k.DESKTOP;
                }
                return b.k.TV;
            }
            return b.k.TABLET;
        }
        return b.k.MOBILE;
    }

    public static final b.p d(com.amazon.aps.iva.sq.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        switch (a.b[eVar.ordinal()]) {
            case 1:
                return b.p.NETWORK;
            case 2:
                return b.p.SOURCE;
            case 3:
                return b.p.CONSOLE;
            case 4:
                return b.p.LOGGER;
            case 5:
                return b.p.AGENT;
            case 6:
                return b.p.WEBVIEW;
            default:
                throw new com.amazon.aps.iva.kb0.h();
        }
    }
}
