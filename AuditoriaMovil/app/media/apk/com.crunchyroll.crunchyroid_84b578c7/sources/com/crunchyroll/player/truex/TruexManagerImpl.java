package com.crunchyroll.player.truex;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.ui.d;
import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.pj.b;
import com.amazon.aps.iva.qa0.a;
import com.amazon.aps.iva.qa0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yl.b;
import com.amazon.aps.iva.yl.c;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: TruexManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/player/truex/TruexManagerImpl;", "Lcom/amazon/aps/iva/yl/c;", "Lcom/amazon/aps/iva/i5/g;", "Lcom/amazon/aps/iva/qa0/a$a;", "truex_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TruexManagerImpl implements c, g, a.InterfaceC0639a {
    public Context b;
    public final m c;
    public final com.amazon.aps.iva.yl.a d;
    public final b e;
    public final com.amazon.aps.iva.oj.a f;
    public final d g;
    public boolean h;
    public e i;

    /* compiled from: TruexManagerImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.qa0.b.values().length];
            iArr[com.amazon.aps.iva.qa0.b.AD_FETCH_COMPLETED.ordinal()] = 1;
            iArr[com.amazon.aps.iva.qa0.b.AD_STARTED.ordinal()] = 2;
            iArr[com.amazon.aps.iva.qa0.b.AD_COMPLETED.ordinal()] = 3;
            iArr[com.amazon.aps.iva.qa0.b.AD_ERROR.ordinal()] = 4;
            iArr[com.amazon.aps.iva.qa0.b.NO_ADS_AVAILABLE.ordinal()] = 5;
            iArr[com.amazon.aps.iva.qa0.b.AD_FREE_POD.ordinal()] = 6;
            iArr[com.amazon.aps.iva.qa0.b.USER_CANCEL_STREAM.ordinal()] = 7;
            iArr[com.amazon.aps.iva.qa0.b.OPT_IN.ordinal()] = 8;
            iArr[com.amazon.aps.iva.qa0.b.OPT_OUT.ordinal()] = 9;
            iArr[com.amazon.aps.iva.qa0.b.SKIP_CARD_SHOWN.ordinal()] = 10;
            iArr[com.amazon.aps.iva.qa0.b.USER_CANCEL.ordinal()] = 11;
            iArr[com.amazon.aps.iva.qa0.b.POPUP_WEBSITE.ordinal()] = 12;
            a = iArr;
        }
    }

    public TruexManagerImpl(Context context, m mVar, com.amazon.aps.iva.rj.b bVar, b bVar2, com.amazon.aps.iva.oj.a aVar, d dVar) {
        androidx.lifecycle.g lifecycle;
        this.b = context;
        this.c = mVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = aVar;
        this.g = dVar;
        com.amazon.aps.iva.k.c f = com.amazon.aps.iva.dg.b.f(context);
        if (f != null && (lifecycle = f.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x011b, code lost:
        if (r6.compareTo(com.amazon.aps.iva.ta0.b.a) <= 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    @Override // com.amazon.aps.iva.yl.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.widget.FrameLayout r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crunchyroll.player.truex.TruexManagerImpl.a(android.widget.FrameLayout, java.lang.String):void");
    }

    @Override // com.amazon.aps.iva.qa0.a.InterfaceC0639a
    public final void b(com.amazon.aps.iva.qa0.b bVar, Map<Object, Object> map) {
        int i;
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.o("TRUEX_AD_MANAGER");
        c0515a.a("Truex event " + bVar, new Object[0]);
        if (bVar == null) {
            i = -1;
        } else {
            i = a.a[bVar.ordinal()];
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i == 12 && map != null) {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) map.get(ImagesContract.URL)));
                                Context context = this.b;
                                if (context != null) {
                                    context.startActivity(intent);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        com.amazon.aps.iva.oj.a aVar = this.f;
                        if (aVar != null) {
                            aVar.b("TruexManagerImpl", b.c.a);
                            return;
                        }
                        return;
                    }
                    this.h = true;
                    return;
                }
                c();
                return;
            }
            c();
            return;
        }
        c();
    }

    public final void c() {
        d dVar = this.g;
        if (dVar != null) {
            dVar.setVisibility(0);
        }
        boolean z = this.h;
        m mVar = this.c;
        com.amazon.aps.iva.yl.a aVar = this.d;
        if (z) {
            if (aVar != null) {
                aVar.discardAdBreak();
            }
            if (mVar != null) {
                mVar.b();
                return;
            }
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onDestroy(o oVar) {
        j.f(oVar, "owner");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.o("TRUEX_AD_MANAGER");
        c0515a.a("onDestroy", new Object[0]);
        e eVar = this.i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onPause(o oVar) {
        j.f(oVar, "owner");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.o("TRUEX_AD_MANAGER");
        c0515a.a("onPause", new Object[0]);
        e eVar = this.i;
        if (eVar != null && !eVar.i) {
            eVar.i = true;
            com.amazon.aps.iva.ta0.a aVar = eVar.b;
            if (aVar != null) {
                aVar.c.onPause();
            }
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onResume(o oVar) {
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.o("TRUEX_AD_MANAGER");
        c0515a.a("onResume", new Object[0]);
        e eVar = this.i;
        if (eVar != null && eVar.i) {
            eVar.i = false;
            com.amazon.aps.iva.ta0.a aVar = eVar.b;
            if (aVar != null) {
                aVar.c.onResume();
            }
        }
    }

    @Override // com.amazon.aps.iva.yl.c
    public final void release() {
        com.amazon.aps.iva.qa0.b[] values;
        this.h = false;
        for (com.amazon.aps.iva.qa0.b bVar : com.amazon.aps.iva.qa0.b.values()) {
            e eVar = this.i;
            if (eVar != null) {
                HashMap hashMap = eVar.a;
                if (hashMap.containsKey(bVar)) {
                    List list = (List) hashMap.get(bVar);
                    list.remove(this);
                    if (list.isEmpty()) {
                        hashMap.remove(bVar);
                    }
                }
            }
        }
        e eVar2 = this.i;
        if (eVar2 != null) {
            eVar2.e();
        }
        this.b = null;
    }
}
