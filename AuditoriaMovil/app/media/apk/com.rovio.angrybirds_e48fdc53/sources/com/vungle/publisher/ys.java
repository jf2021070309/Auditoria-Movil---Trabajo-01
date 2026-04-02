package com.vungle.publisher;

import com.moat.analytics.mobile.vng.MoatAdEventType;
import com.vungle.publisher.ji;
import com.vungle.publisher.jl;
import com.vungle.publisher.log.Logger;
import java.util.HashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class ys extends yj<jh<?, ?, ?>> {
    private static final ji.a[] i = {ji.a.play_percentage_0, ji.a.play_percentage_25, ji.a.play_percentage_50, ji.a.play_percentage_75, ji.a.play_percentage_80, ji.a.play_percentage_100};
    @Inject
    zf h;
    private int j;
    private final HashSet<ji.a> k = new HashSet<>();

    @Override // com.vungle.publisher.yj
    protected void a() {
        this.j = 0;
        this.k.clear();
    }

    public void onEvent(bd bdVar) {
        float a2 = bdVar.a();
        if (bdVar.b()) {
            a(jl.a.volumeup, Float.valueOf(a2));
        } else {
            a(jl.a.volumedown, Float.valueOf(a2));
        }
    }

    public void onEvent(y yVar) {
        a(jl.a.back);
    }

    public void onEvent(bc bcVar) {
        a(jl.a.volume, Float.valueOf(bcVar.a()));
    }

    public void onEvent(bb bbVar) {
        if (bbVar.a()) {
            a(jl.a.muted);
            a(ji.a.mute);
            return;
        }
        a(jl.a.unmuted);
        a(ji.a.unmute);
    }

    public void onEvent(ap apVar) {
        a(ji.a.postroll_view);
    }

    public void onEvent(ay ayVar) {
        a(ji.a.video_close);
        a(jl.a.close);
    }

    public void onEvent(ba baVar) {
        a(jl.a.videoreset);
    }

    public void onEvent(ab<jh<?, ?, ?>> abVar) {
        jh<?, ?, ?> b = abVar.b();
        this.f.a(b, abVar.a(), b.z());
    }

    public void onEvent(ah ahVar) {
        try {
            this.c.b(Integer.valueOf(ahVar.a()));
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error updating video duration millis", e);
        }
    }

    public void onEvent(aw awVar) {
        try {
            this.b.a(Long.valueOf(awVar.e()));
            this.b.f_();
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error updating play start millis", e);
        }
    }

    public void onEvent(ar arVar) {
        try {
            int a2 = arVar.a();
            boolean z = this.j < i.length;
            boolean z2 = arVar instanceof ai;
            if (z || z2) {
                Integer s = this.c.s();
                if (s == null) {
                    Logger.d(Logger.REPORT_TAG, "null video duration millis for " + this.c.B());
                } else if (s.intValue() == 0) {
                    Logger.w(Logger.REPORT_TAG, "video duration millis 0 for " + this.c.B());
                } else {
                    if (z) {
                        float intValue = a2 / s.intValue();
                        ji.a aVar = i[this.j];
                        r0 = intValue >= aVar.b();
                        if (r0) {
                            switch (aVar) {
                                case play_percentage_0:
                                    this.h.a(MoatAdEventType.AD_EVT_START, a2);
                                    this.eventBus.a(new aw());
                                    break;
                                case play_percentage_25:
                                    this.h.a(MoatAdEventType.AD_EVT_FIRST_QUARTILE, a2);
                                    break;
                                case play_percentage_50:
                                    this.h.a(MoatAdEventType.AD_EVT_MID_POINT, a2);
                                    break;
                                case play_percentage_75:
                                    this.h.a(MoatAdEventType.AD_EVT_THIRD_QUARTILE, a2);
                                    break;
                                case play_percentage_80:
                                    this.eventBus.a(new ax());
                                    break;
                            }
                            this.j++;
                            a(aVar);
                        }
                    }
                    if (r0 || z2) {
                        a(arVar);
                    }
                }
            }
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error handling video view progress", e);
        }
    }

    public void onEvent(aa aaVar) {
        ji.a a2 = aaVar.a();
        if (a2 == ji.a.video_click) {
            a(jl.a.cta);
        } else if (a2 == ji.a.postroll_click) {
            a(ji.a.postroll_click);
        }
        a(jl.a.download);
    }

    public void onEvent(bt btVar) {
        try {
            Logger.d(Logger.REPORT_TAG, "received play ad end");
            a(btVar);
            a(btVar.e());
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error processing ad end", e);
        }
    }

    void a(ar arVar) {
        try {
            this.b.a(Integer.valueOf(arVar.a()));
            this.b.f_();
            this.c.b(Long.valueOf(arVar.e()));
        } catch (Exception e) {
            Logger.e(Logger.REPORT_TAG, "error updating video view progress", e);
        }
    }

    private void a(ji.a aVar) {
        if (this.a == 0) {
            Logger.w(Logger.REPORT_TAG, "null ad in AdReportingHandler - cannot track event " + aVar);
        } else if (!this.k.contains(aVar)) {
            Logger.v(Logger.REPORT_TAG, "tpat event " + aVar.name());
            this.f.a(this.a, aVar, ((jh) this.a).a((jf) aVar));
            this.k.add(aVar);
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        ys a;

        public ys a(jh<?, ?, ?> jhVar) {
            this.a.a((ys) jhVar);
            return this.a;
        }
    }
}
