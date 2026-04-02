package com.amazon.aps.iva.ja0;

import android.net.Uri;
import com.amazon.aps.iva.fa0.c;
import com.amazon.aps.iva.fa0.d;
import com.amazon.aps.iva.fa0.f;
import com.amazon.aps.iva.fa0.g;
import com.amazon.aps.iva.fa0.h;
import com.amazon.aps.iva.fa0.i;
import com.amazon.aps.iva.ga0.o;
import com.amazon.aps.iva.ka0.c0;
import com.amazon.aps.iva.ka0.u;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.p0.e;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.yb0.j;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
/* compiled from: MuxImaAdsListener.kt */
/* loaded from: classes4.dex */
public final class b implements AdErrorEvent.AdErrorListener, AdEvent.AdEventListener {
    public final e a;
    public final AdEvent.AdEventListener b;
    public final AdErrorEvent.AdErrorListener c;
    public boolean d;
    public boolean e;

    /* compiled from: MuxImaAdsListener.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            try {
                iArr[AdEvent.AdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdEvent.AdEventType.AD_PERIOD_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdEvent.AdEventType.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdEvent.AdEventType.FIRST_QUARTILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdEvent.AdEventType.MIDPOINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdEvent.AdEventType.THIRD_QUARTILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdEvent.AdEventType.COMPLETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdEvent.AdEventType.AD_PERIOD_ENDED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdEvent.AdEventType.PAUSED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdEvent.AdEventType.RESUMED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public b(e eVar, com.amazon.aps.iva.rj.b bVar, com.amazon.aps.iva.rj.b bVar2) {
        this.a = eVar;
        this.b = bVar;
        this.c = bVar2;
    }

    public final void a(com.amazon.aps.iva.fa0.e eVar, Ad ad) {
        c(eVar, ad);
        com.amazon.aps.iva.ka0.a b = b();
        if (b != null) {
            b.b.a(eVar);
        }
    }

    public final com.amazon.aps.iva.ka0.a b() {
        c0 c0Var = (c0) ((com.amazon.aps.iva.xb0.a) this.a.b).invoke();
        if (c0Var != null) {
            return (com.amazon.aps.iva.ka0.a) c0Var.h.getValue();
        }
        return null;
    }

    public final void c(com.amazon.aps.iva.fa0.e eVar, Ad ad) {
        boolean z;
        l0 l0Var;
        b0.g gVar;
        b0.a aVar;
        Uri uri;
        o oVar = new o();
        com.amazon.aps.iva.ga0.a aVar2 = new com.amazon.aps.iva.ga0.a();
        com.amazon.aps.iva.ka0.a b = b();
        if (b != null && b.a.g == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && ad != null) {
            String adId = ad.getAdId();
            if (adId != null) {
                oVar.b("xpladid", adId);
            }
            String creativeId = ad.getCreativeId();
            if (creativeId != null) {
                oVar.b("xplcrid", creativeId);
            }
            c0 c0Var = (c0) ((com.amazon.aps.iva.xb0.a) this.a.b).invoke();
            String str = null;
            if (c0Var != null) {
                l0Var = (l0) c0Var.d;
            } else {
                l0Var = null;
            }
            if (l0Var != null) {
                b0 r = l0Var.r();
                if (r != null && (gVar = r.c) != null && (aVar = gVar.e) != null && (uri = aVar.b) != null) {
                    str = uri.toString();
                }
                if (str != null) {
                    aVar2.b("dtaur", str);
                }
            }
            String adId2 = ad.getAdId();
            if (adId2 != null) {
                aVar2.b("did", adId2);
            }
            String creativeId2 = ad.getCreativeId();
            if (creativeId2 != null) {
                aVar2.b("dcrid", creativeId2);
            }
            String universalAdIdValue = ad.getUniversalAdIdValue();
            if (universalAdIdValue != null) {
                aVar2.b("dunid", universalAdIdValue);
            }
        }
        eVar.e = oVar;
        eVar.c = aVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        j.f(adErrorEvent, "adErrorEvent");
        d dVar = new d(null);
        c(dVar, null);
        com.amazon.aps.iva.ka0.a b = b();
        if (b != null) {
            b.b.a(dVar);
        }
        this.c.onAdError(adErrorEvent);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        l0 l0Var;
        u uVar;
        com.amazon.aps.iva.ka0.a b;
        j.f(adEvent, "adEvent");
        c0 c0Var = (c0) ((com.amazon.aps.iva.xb0.a) this.a.b).invoke();
        if (c0Var != null) {
            l0Var = (l0) c0Var.d;
        } else {
            l0Var = null;
        }
        if (l0Var != null) {
            boolean z = true;
            switch (a.a[adEvent.getType().ordinal()]) {
                case 2:
                case 3:
                    Ad ad = adEvent.getAd();
                    com.amazon.aps.iva.ka0.a b2 = b();
                    if (b2 != null) {
                        uVar = b2.a.c;
                    } else {
                        uVar = null;
                    }
                    if (com.amazon.aps.iva.lb0.o.N(new u[]{u.PLAY, u.PLAYING}, uVar) && (b = b()) != null) {
                        b.a.c();
                    }
                    this.d = false;
                    com.amazon.aps.iva.ka0.a b3 = b();
                    if (b3 != null) {
                        y yVar = b3.a;
                        yVar.getClass();
                        yVar.c = u.PLAYING_ADS;
                    }
                    if (!l0Var.k0() && l0Var.a() == 0) {
                        this.e = true;
                        break;
                    } else {
                        a(new com.amazon.aps.iva.fa0.b(null, 0), ad);
                        a(new i(null), ad);
                        break;
                    }
                    break;
                case 4:
                    Ad ad2 = adEvent.getAd();
                    if (this.d) {
                        a(new i(null), ad2);
                    } else {
                        this.d = true;
                    }
                    a(new com.amazon.aps.iva.fa0.j(null), ad2);
                    break;
                case 5:
                    a(new f(null), adEvent.getAd());
                    break;
                case 6:
                    a(new g(null), adEvent.getAd());
                    break;
                case 7:
                    a(new c(null, 1), adEvent.getAd());
                    break;
                case 8:
                    a(new c(null, 0), adEvent.getAd());
                    break;
                case 9:
                case 10:
                    a(new com.amazon.aps.iva.fa0.a(null, 0), adEvent.getAd());
                    if (!l0Var.k0() || l0Var.h() != 3) {
                        z = false;
                    }
                    com.amazon.aps.iva.ka0.a b4 = b();
                    if (b4 != null) {
                        y yVar2 = b4.a;
                        yVar2.getClass();
                        yVar2.c = u.FINISHED_PLAYING_ADS;
                        if (yVar2.t) {
                            yVar2.f();
                        }
                        if (z) {
                            yVar2.e();
                            break;
                        }
                    }
                    break;
                case 11:
                    if (l0Var.k0() || l0Var.a() != 0) {
                        a(new h(null), adEvent.getAd());
                        break;
                    }
                    break;
                case 12:
                    Ad ad3 = adEvent.getAd();
                    if (this.e) {
                        a(new com.amazon.aps.iva.fa0.b(null, 0), ad3);
                        a(new i(null), ad3);
                        this.e = false;
                        break;
                    } else {
                        a(new i(null), ad3);
                        a(new com.amazon.aps.iva.fa0.j(null), ad3);
                        break;
                    }
            }
        }
        this.b.onAdEvent(adEvent);
    }
}
