package com.fyber.inneractive.sdk.player.b;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.ak;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.videokit.R;
/* loaded from: classes.dex */
public final class c {
    public IAmraidWebViewController a;
    public UnitDisplayType b;
    public boolean c;
    private d.EnumC0045d d;
    private int e;

    public c(Context context, UnitDisplayType unitDisplayType, boolean z, int i, int i2, u uVar, com.fyber.inneractive.sdk.g.a.g gVar) {
        this.d = d.EnumC0045d.INLINE;
        this.e = d.a.a;
        this.b = unitDisplayType;
        this.c = z;
        int i3 = AnonymousClass1.a[this.b.ordinal()];
        if (i3 == 1 || i3 == 2) {
            this.e = d.a.a;
            if (z) {
                this.d = d.EnumC0045d.INTERSTITIAL;
            }
        } else {
            this.e = d.a.a;
        }
        try {
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(context, com.fyber.inneractive.sdk.util.e.a(unitDisplayType, IAConfigManager.c().a), this.d, this.e, d.e.c, true);
            this.a = iAmraidWebViewController;
            com.fyber.inneractive.sdk.m.c e = iAmraidWebViewController.e();
            int i4 = AnonymousClass1.b[gVar.ordinal()];
            if (i4 == 1) {
                e.setId(R.id.inneractive_vast_endcard_gif);
            } else if (i4 == 2) {
                e.setId(R.id.inneractive_vast_endcard_html);
            } else if (i4 == 3) {
                e.setId(R.id.inneractive_vast_endcard_iframe);
            }
            w.a().a(context, this.a.e(), this.a);
            this.a.f();
            ak a = com.fyber.inneractive.sdk.i.d.a(i, i2, uVar);
            this.a.setAdDefaultSize(a.a, a.b);
        } catch (Throwable unused) {
            this.a = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.g.a.g.values().length];
            b = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.g.a.g.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.fyber.inneractive.sdk.g.a.g.Html.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.fyber.inneractive.sdk.g.a.g.Iframe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[UnitDisplayType.values().length];
            a = iArr2;
            try {
                iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
