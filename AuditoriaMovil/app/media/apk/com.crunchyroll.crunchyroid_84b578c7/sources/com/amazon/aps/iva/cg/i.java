package com.amazon.aps.iva.cg;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.cg.b;
import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.cg.u;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: DeepLinkDataManager.kt */
/* loaded from: classes.dex */
public final class i implements h {
    public final f a;
    public final d b;
    public final com.amazon.aps.iva.xb0.l<String, Boolean> c;
    public final g0 d;
    public q e;

    /* compiled from: DeepLinkDataManager.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.a.values().length];
            try {
                iArr[u.a.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.a.WATCHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.a.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.a.UPSELL_MENU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.a.WATCH_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.a.SHOW_PAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.a.ARTIST_SCREEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.a.WATCH_MUSIC_SCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u.a.SEASON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u.a.OFFLINE_LIBRARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u.a.SIGN_UP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[u.a.SIGN_IN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[u.a.SIMULCAST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[u.a.CRUNCHYLIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[u.a.SETTINGS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[u.a.BROWSE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[u.a.UPGRADE_MENU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[u.a.NONE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            a = iArr;
        }
    }

    public i(g gVar, e eVar, StartupActivity.c cVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        this.a = gVar;
        this.b = eVar;
        this.c = cVar;
        this.d = lifecycleCoroutineScopeImpl;
    }

    @Override // com.amazon.aps.iva.cg.h
    public final void a(q qVar) {
        this.e = qVar;
    }

    @Override // com.amazon.aps.iva.cg.h
    public final void b(u uVar) {
        p aVar;
        int i = a.a[uVar.a().ordinal()];
        g0 g0Var = this.d;
        switch (i) {
            case 1:
                c(new p.e(uVar.getUri(), ((z) uVar).d));
                return;
            case 2:
                c(new p.q(uVar.getUri()));
                return;
            case 3:
                c(new p.i(uVar.getUri()));
                return;
            case 4:
                c(new p.C0173p(uVar.getUri()));
                return;
            case 5:
            case 6:
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new l(this, (a0) uVar, null), 3);
                return;
            case 7:
                com.amazon.aps.iva.cg.a aVar2 = (com.amazon.aps.iva.cg.a) uVar;
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new j(new k(aVar2, this, null), this, aVar2, null), 3);
                return;
            case 8:
                b0 b0Var = (b0) uVar;
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new j(new m(b0Var, this, null), this, b0Var, null), 3);
                return;
            case 9:
                a0 a0Var = (a0) uVar;
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new j(new n(this, a0Var, null), this, a0Var, null), 3);
                return;
            case 10:
                c(new p.h(uVar.getUri()));
                return;
            case 11:
                c(new p.m(uVar.getUri()));
                return;
            case 12:
                c(new p.l(uVar.getUri()));
                return;
            case 13:
                c(new p.n(uVar.getUri()));
                return;
            case 14:
                c(new p.c(uVar.getUri()));
                return;
            case 15:
                c0 c0Var = (c0) uVar;
                c(new p.k(c0Var.c, c0Var.d));
                return;
            case 16:
                b bVar = (b) uVar;
                int i2 = b.a.a[bVar.d.ordinal()];
                com.amazon.aps.iva.dg.a aVar3 = bVar.c;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            aVar = new p.b.c(aVar3);
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    } else {
                        aVar = new p.b.C0172b(aVar3, bVar.e);
                    }
                } else {
                    aVar = new p.b.a(aVar3);
                }
                c(aVar);
                return;
            case 17:
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new o(this, new p.o(uVar.getUri()), null), 3);
                return;
            case 18:
                q qVar = this.e;
                if (qVar != null) {
                    qVar.T0(p.d.b.b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(p pVar) {
        q qVar = this.e;
        if (qVar != null) {
            qVar.T0(pVar);
        }
    }
}
