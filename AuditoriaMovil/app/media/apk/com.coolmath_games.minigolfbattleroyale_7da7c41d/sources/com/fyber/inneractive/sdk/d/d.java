package com.fyber.inneractive.sdk.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.h.ag;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.videokit.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.UnknownHostException;
/* loaded from: classes.dex */
public final class d {
    int a;
    public final InneractiveAdRequest b;
    public final com.fyber.inneractive.sdk.j.g c;
    public com.fyber.inneractive.sdk.config.a.s d;
    public com.fyber.inneractive.sdk.g.a.a e;
    public boolean f = false;
    public View g = null;
    Context h;
    public com.fyber.inneractive.sdk.player.b.c i;
    public boolean j;
    public ag k;
    public UnitDisplayType l;
    public boolean m;
    public int n;
    public int o;
    public u p;
    int q;

    public d(Context context, com.fyber.inneractive.sdk.j.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.a.s sVar) {
        this.a = 2;
        this.e = gVar.E;
        this.h = context;
        this.c = gVar;
        this.b = inneractiveAdRequest;
        this.d = sVar;
        this.a = IAConfigManager.c().a.a("companion_retry_count", 2, 0);
    }

    private void b() {
        com.fyber.inneractive.sdk.h.m mVar = com.fyber.inneractive.sdk.h.m.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.b;
        com.fyber.inneractive.sdk.j.g gVar = this.c;
        com.fyber.inneractive.sdk.config.a.s sVar = this.d;
        new n.a(mVar, inneractiveAdRequest, gVar, sVar == null ? null : sVar.b()).b(null);
    }

    public final void a() {
        boolean z;
        if (this.f) {
            return;
        }
        IAlog.b("%sloadNextVastCompanion called", IAlog.a(this));
        this.j = false;
        this.g = null;
        if (this.e == null) {
            IAlog.b("%svast data is null! Object must have already been destroyed", IAlog.a(this));
            z = false;
        } else {
            z = true;
        }
        if (this.e.f.size() == 0) {
            IAlog.e("%sgetNextIAvastCompanion - No companion ads found", IAlog.a(this));
            z = false;
        }
        if (!z) {
            IAlog.b("%sno more companion ads available.", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.g.a.a aVar = this.e;
        aVar.g = aVar.f.poll();
        com.fyber.inneractive.sdk.g.a.b bVar = aVar.g;
        IAlog.b("%sgetNextIAvastCompanion returning: %s", IAlog.a(this), bVar);
        this.q = 0;
        if (bVar != null) {
            if (bVar.a == com.fyber.inneractive.sdk.g.a.g.Static && !com.fyber.inneractive.sdk.g.a.h.Gif.equals(bVar.b)) {
                b(bVar);
            } else {
                a(bVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(final com.fyber.inneractive.sdk.g.a.b r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.d.d.a(com.fyber.inneractive.sdk.g.a.b):void");
    }

    final void b(final com.fyber.inneractive.sdk.g.a.b bVar) {
        b();
        IAlog.a(IAlog.b, "%s: %s", "COMPANION_TYPE", bVar.a.name());
        this.q++;
        this.k = new ag(new com.fyber.inneractive.sdk.h.r<ag.a>() { // from class: com.fyber.inneractive.sdk.d.d.2
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(ag.a aVar, Exception exc, boolean z) {
                ag.a aVar2 = aVar;
                d.this.g = new ImageView(d.this.h);
                d.this.g.setId(R.id.inneractive_vast_endcard_static);
                d.this.g.setContentDescription("inneractive_vast_endcard_static");
                if (exc == null && aVar2 != null && aVar2.b == null) {
                    if (aVar2.a == null || d.this.g == null) {
                        return;
                    }
                    ((ImageView) d.this.g).setImageBitmap(aVar2.a);
                    d.this.f = true;
                    return;
                }
                IAlog.b("%s Fetching companion image failed!", IAlog.a(d.this));
                if ((aVar2 != null && (aVar2.b == null || (!(exc instanceof com.fyber.inneractive.sdk.h.b) && !(exc instanceof UnknownHostException)))) || d.this.q > d.this.a) {
                    n.a aVar3 = new n.a(com.fyber.inneractive.sdk.h.l.VAST_COMPANION_FAILED_LOADING, d.this.b, d.this.c);
                    n.b a = new n.b().a("companion_data", bVar.a());
                    if (aVar2 != null && !TextUtils.isEmpty(aVar2.b)) {
                        a.a(IronSourceConstants.EVENTS_ERROR_REASON, aVar2.b);
                    }
                    aVar3.a(a);
                    aVar3.b(null);
                    d.this.a();
                    return;
                }
                IAlog.b("%sloadStaticCompanion retry", IAlog.a(this));
                d.this.b(bVar);
            }
        }, bVar.e);
        IAConfigManager.h().a(this.k);
    }
}
