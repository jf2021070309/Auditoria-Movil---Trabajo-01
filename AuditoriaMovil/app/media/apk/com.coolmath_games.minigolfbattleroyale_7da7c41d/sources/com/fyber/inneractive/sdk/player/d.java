package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.i.h;
import com.fyber.inneractive.sdk.i.i;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends b implements a.InterfaceC0046a {
    private static final HashMap<String, a> v = new HashMap<String, a>() { // from class: com.fyber.inneractive.sdk.player.d.1
        {
            put("[CLICKAREA]", new a() { // from class: com.fyber.inneractive.sdk.player.d.1.1
                @Override // com.fyber.inneractive.sdk.player.d.a
                public final String a(com.fyber.inneractive.sdk.player.b.f fVar, VideoClickOrigin videoClickOrigin) {
                    return videoClickOrigin.name().toLowerCase();
                }
            });
            put("[ADPLAYHEAD]", new a() { // from class: com.fyber.inneractive.sdk.player.d.1.2
                @Override // com.fyber.inneractive.sdk.player.d.a
                public final String a(com.fyber.inneractive.sdk.player.b.f fVar, VideoClickOrigin videoClickOrigin) {
                    int g;
                    if (fVar == null || (g = fVar.g()) <= 0) {
                        return "00:00:00.000";
                    }
                    long j = g;
                    long hours = TimeUnit.MILLISECONDS.toHours(j);
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(j - TimeUnit.HOURS.toMillis(hours));
                    long seconds = TimeUnit.MILLISECONDS.toSeconds((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes));
                    return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
                }
            });
        }
    };
    protected u q;
    private com.fyber.inneractive.sdk.g.a.a r;
    private com.fyber.inneractive.sdk.player.enums.a s;
    private boolean t;
    private com.fyber.inneractive.sdk.d.d u;

    /* loaded from: classes.dex */
    public interface a {
        String a(com.fyber.inneractive.sdk.player.b.f fVar, VideoClickOrigin videoClickOrigin);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void t() {
    }

    public d(Context context, com.fyber.inneractive.sdk.j.g gVar, u uVar, InneractiveAdRequest inneractiveAdRequest, q qVar) {
        super(context, uVar == null ? null : uVar.e().c, qVar != null ? qVar.i() : null);
        this.s = com.fyber.inneractive.sdk.player.enums.a.Uninitialized;
        if (gVar == null || gVar.E == null) {
            throw new IllegalArgumentException("IAVastMediaPlayerFlowManager ctor - vastData can't be null");
        }
        this.d = qVar;
        this.r = gVar.E;
        this.u = new com.fyber.inneractive.sdk.d.d(context, gVar, inneractiveAdRequest, this.d.i());
        this.e = inneractiveAdRequest;
        boolean z = true;
        if (IAlog.a <= 3) {
            IAlog.a("IAVastMediaPlayerFlowManager:ctor - got media files: ", new Object[0]);
            for (int i = 0; i < this.r.e.size(); i++) {
                m mVar = this.r.b().get(i);
                if (mVar != null) {
                    IAlog.b("IAVastMediaPlayerFlowManager(%d): %s", Integer.valueOf(i), mVar.j);
                }
            }
        }
        if (uVar != null) {
            this.q = uVar;
            if (uVar.g() != null) {
                b(uVar.g().a().booleanValue());
            }
        }
        UnitDisplayType unitDisplayType = gVar.r;
        if (inneractiveAdRequest != null && !inneractiveAdRequest.getAllowFullscreen()) {
            z = false;
        }
        int i2 = gVar.g;
        int i3 = gVar.h;
        com.fyber.inneractive.sdk.d.d dVar = this.u;
        dVar.l = unitDisplayType;
        dVar.m = z;
        dVar.n = i2;
        dVar.o = i3;
        dVar.p = uVar;
        if (qVar.i() != null) {
            com.fyber.inneractive.sdk.config.a.a.f fVar = (com.fyber.inneractive.sdk.config.a.a.f) qVar.i().a(com.fyber.inneractive.sdk.config.a.a.f.class);
            this.o = gVar.r == UnitDisplayType.INTERSTITIAL ? fVar.a("prebuffer_interstitial", 3) : fVar.a("prebuffer_rewarded", 3);
            return;
        }
        this.o = IAConfigManager.c().a.a(gVar.r != UnitDisplayType.INTERSTITIAL ? "prebuffer_rewarded" : "prebuffer_interstitial", 10, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.b, com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final void a() {
        super.a();
        com.fyber.inneractive.sdk.d.d dVar = this.u;
        if (dVar != null) {
            dVar.f = false;
            if (dVar.g != null && (dVar.g instanceof com.fyber.inneractive.sdk.m.c) && dVar.i != null) {
                com.fyber.inneractive.sdk.player.b.c cVar = dVar.i;
                if (cVar.a != null) {
                    cVar.a.c();
                    cVar.a = null;
                }
            }
            if (dVar.k != null) {
                dVar.k.c = true;
            }
            dVar.i = null;
        }
        this.u = null;
    }

    @Override // com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final void a(String str, String... strArr) {
        if (!"TRACKING_COMPLETED".equalsIgnoreCase(str)) {
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    a(VideoClickOrigin.InvalidOrigin, r.a(str2));
                }
                return;
            }
            return;
        }
        this.t = true;
    }

    @Override // com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final void a(h hVar, com.fyber.inneractive.sdk.player.b.b bVar, com.fyber.inneractive.sdk.player.e.e eVar, c.a aVar) {
        if (bVar == null) {
            aVar.dismissAd(true);
        } else if (eVar.e()) {
            if (hVar.a()) {
                aVar.dismissAd(true);
            }
        } else if (bVar.c()) {
            bVar.d(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final i a(boolean z, g gVar) {
        return z ? new com.fyber.inneractive.sdk.i.c(gVar) : new com.fyber.inneractive.sdk.i.a(gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final boolean b() {
        return this.b != null;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final View h() {
        com.fyber.inneractive.sdk.d.d dVar = this.u;
        if (dVar == null || !dVar.f) {
            return null;
        }
        return dVar.g;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final com.fyber.inneractive.sdk.player.b.c i() {
        com.fyber.inneractive.sdk.d.d dVar = this.u;
        if (dVar != null) {
            return dVar.i;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final void j() {
        if (this.r.g == null || this.u.j) {
            return;
        }
        a(this.r.g, VideoClickOrigin.COMPANION, r.EVENT_CREATIVE_VIEW);
        com.fyber.inneractive.sdk.d.d dVar = this.u;
        if (!dVar.j) {
            n.a aVar = new n.a(com.fyber.inneractive.sdk.h.m.VAST_COMPANION_DISPLAYED, dVar.b, dVar.c, dVar.d.b());
            aVar.a("companion_data", dVar.e.g.a());
            aVar.b(null);
        }
        dVar.j = true;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final com.fyber.inneractive.sdk.g.a.b n() {
        com.fyber.inneractive.sdk.g.a.a aVar = this.r;
        if (aVar != null) {
            return aVar.g;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final void a(VideoClickOrigin videoClickOrigin, r... rVarArr) {
        a(this.r, videoClickOrigin, rVarArr);
    }

    @Override // com.fyber.inneractive.sdk.player.b, com.fyber.inneractive.sdk.player.b.f.b
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        super.a(bVar);
        int i = AnonymousClass2.a[bVar.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            a(com.fyber.inneractive.sdk.player.enums.a.Completed);
        } else if (this.s.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
            a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.a
    public final void a(int i) {
        int h = this.b.h();
        int i2 = AnonymousClass2.b[this.s.ordinal()];
        if (i2 == 1) {
            if (this.b.p() != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
            }
        } else if (i2 == 2) {
            if (i > h / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
            }
        } else if (i2 == 3) {
            if (i > h / 2) {
                a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
            }
        } else if (i2 == 4 && i > (h / 4) * 3) {
            a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.d$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.a.values().length];
            b = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.a.Uninitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.a.Started.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.a.FirstQuarter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.a.MidPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.a.Completed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            a = iArr2;
            try {
                iArr2[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.b
    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        a(VideoClickOrigin.InvalidOrigin, r.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (this.p != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put("url", this.p.j);
                jSONObject.put("bitrate", this.p.f);
                jSONObject.put("mime", this.p.d);
                jSONObject.put("delivery", this.p.a);
            }
            jSONObject.put("player", this.b != null ? this.b.l() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.b("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        super.a(inneractiveVideoError, jSONObject);
    }

    @Override // com.fyber.inneractive.sdk.player.b
    protected final void k() {
        a(VideoClickOrigin.InvalidOrigin, r.EVENT_CREATIVE_VIEW);
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final String l() {
        com.fyber.inneractive.sdk.g.a.a aVar = this.r;
        if (aVar != null) {
            return aVar.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    protected final void m() {
        this.u.a();
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final void a(com.fyber.inneractive.sdk.j.i iVar, VideoClickOrigin videoClickOrigin, r... rVarArr) {
        if (rVarArr.length == 0) {
            IAlog.d("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.d("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (r rVar : rVarArr) {
                String str = rVar.w;
                IAlog.b("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a2 = iVar.a(rVar);
                if (a2 == null || a2.size() == 0) {
                    IAlog.b("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                } else {
                    arrayList.addAll(a2);
                    IAlog.b("found %d events for type: %s", Integer.valueOf(a2.size()), str);
                    for (String str2 : a2) {
                        IAlog.b("   event url: %s", str2);
                        if (!TextUtils.isEmpty(str2)) {
                            IAlog.a(IAlog.b, "%s %s %s", "VAST_EVENT", rVar.w, str2);
                            IAlog.a(IAlog.b, "Tracking URLs array: %s", "VPAID", str2);
                        }
                    }
                }
                a(arrayList, rVar, videoClickOrigin);
            }
            a(arrayList);
        }
    }

    private void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.s == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.t = false;
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_IMPRESSION, r.EVENT_START);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.t) {
            this.t = true;
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(VideoClickOrigin.InvalidOrigin, r.EVENT_REWIND);
        }
        this.s = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public final u s() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.player.a.InterfaceC0046a
    public final void a(m mVar, f fVar) {
        b(mVar, fVar);
    }

    private void a(List<String> list, r rVar, VideoClickOrigin videoClickOrigin) {
        if (rVar == r.EVENT_CLICK) {
            for (Map.Entry<String, a> entry : v.entrySet()) {
                String key = entry.getKey();
                String a2 = entry.getValue().a(this.b, videoClickOrigin);
                for (int i = 0; i < list.size(); i++) {
                    String str = list.get(i);
                    if (str.contains(key)) {
                        list.set(i, str.replace(key, a2));
                    }
                }
            }
        }
    }
}
