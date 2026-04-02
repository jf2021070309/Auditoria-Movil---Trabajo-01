package com.amazon.aps.iva.qa0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.a6.g1;
import com.amazon.aps.iva.a6.i1;
import com.truex.adrenderer.web.TruexWebView;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class e extends f {
    public com.amazon.aps.iva.ta0.a b;
    public final Context c;
    public String e;
    public c f;
    public final Handler d = new Handler(Looper.getMainLooper());
    public Boolean g = null;
    public boolean h = false;
    public boolean i = false;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.AD_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.AD_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.USER_CANCEL_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.AD_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.NO_ADS_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.OPT_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.OPT_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.USER_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.AD_FREE_POD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[b.SKIP_CARD_SHOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[b.XTENDED_VIEW_STARTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[b.POPUP_WEBSITE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public e(Context context) {
        this.c = context;
    }

    public final void d(String str) {
        if (!this.h) {
            return;
        }
        e();
        HashMap hashMap = new HashMap();
        if (!str.isEmpty()) {
            hashMap.put("errorMessage", str);
        }
        this.d.post(new g1(8, this, hashMap));
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        this.h = false;
        com.amazon.aps.iva.ta0.a aVar = this.b;
        if (aVar != null) {
            TruexWebView truexWebView = aVar.c;
            if (truexWebView != null) {
                aVar.c = null;
                aVar.d.post(new i1(5, aVar, truexWebView));
            }
            this.b = null;
        }
    }
}
