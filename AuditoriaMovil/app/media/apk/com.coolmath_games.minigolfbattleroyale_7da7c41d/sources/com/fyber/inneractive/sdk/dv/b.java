package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
/* loaded from: classes.dex */
public final class b extends com.fyber.inneractive.sdk.d.b<f, a> implements c {
    private boolean g = !l.c("com.google.android.gms.ads.InterstitialAd");

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.b
    public final String b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.d.b
    public final void a() {
        a cVar;
        if (this.b != 0 && ((f) this.b).e() != null) {
            if (this.a != null) {
                boolean muteVideo = this.a.getMuteVideo();
                try {
                    MobileAds.setAppMuted(muteVideo);
                    MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
                } catch (Throwable unused) {
                }
            }
            UnitDisplayType unitDisplayType = ((f) this.b).r;
            QueryInfo queryInfo = ((f) this.b).e().a;
            int i = AnonymousClass1.a[unitDisplayType.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    cVar = new com.fyber.inneractive.sdk.dv.a.a(g(), this.e, (f) this.b);
                } else if (i != 4) {
                    cVar = null;
                } else if (this.g) {
                    cVar = new com.fyber.inneractive.sdk.dv.e.a(g(), this.e, (f) this.b);
                } else {
                    cVar = new com.fyber.inneractive.sdk.dv.e.b(g(), this.e, (f) this.b);
                }
            } else if (this.g) {
                cVar = new com.fyber.inneractive.sdk.dv.d.b(g(), this.e, (f) this.b);
            } else {
                cVar = new com.fyber.inneractive.sdk.dv.d.c(g(), this.e, (f) this.b);
            }
            this.c = cVar;
            if (queryInfo != null && this.c != 0) {
                ((a) this.c).a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((f) this.b).a)).build(), this);
                return;
            } else {
                d();
                return;
            }
        }
        d();
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.c
    public final void c() {
        super.h();
    }

    @Override // com.fyber.inneractive.sdk.dv.c
    public final void d() {
        a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}
