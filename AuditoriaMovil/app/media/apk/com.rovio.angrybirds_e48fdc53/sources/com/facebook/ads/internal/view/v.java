package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.view.a;
/* loaded from: classes2.dex */
public class v implements a {
    private final com.facebook.ads.internal.view.e.b.k a = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.v.1
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.j jVar) {
            v.this.h.a("videoInterstitalEvent", jVar);
        }
    };
    private final com.facebook.ads.internal.view.e.b.i b = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.v.2
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.h hVar) {
            v.this.h.a("videoInterstitalEvent", hVar);
        }
    };
    private final com.facebook.ads.internal.view.e.b.c c = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.v.3
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.b bVar) {
            v.this.h.a("videoInterstitalEvent", bVar);
        }
    };
    private final com.facebook.ads.internal.view.e.b.e d = new com.facebook.ads.internal.view.e.b.e() { // from class: com.facebook.ads.internal.view.v.4
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.d dVar) {
            v.this.e.finish();
        }
    };
    private final AudienceNetworkActivity e;
    private final com.facebook.ads.internal.m.c f;
    private final com.facebook.ads.internal.view.e.b g;
    private final a.InterfaceC0118a h;
    private com.facebook.ads.internal.view.e.c i;
    private int j;

    public v(final AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a) {
        this.e = audienceNetworkActivity;
        this.f = cVar;
        this.g = new com.facebook.ads.internal.view.e.b(audienceNetworkActivity);
        this.g.a(new com.facebook.ads.internal.view.e.c.b(audienceNetworkActivity));
        this.g.getEventBus().a(this.a, this.b, this.c, this.d);
        this.h = interfaceC0118a;
        this.g.setIsFullScreen(true);
        this.g.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.g.setLayoutParams(layoutParams);
        interfaceC0118a.a(this.g);
        d dVar = new d(audienceNetworkActivity);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.v.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                audienceNetworkActivity.finish();
            }
        });
        interfaceC0118a.a(dVar);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra("useNativeCtaButton");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            com.facebook.ads.internal.view.c.b bVar = new com.facebook.ads.internal.view.c.b(audienceNetworkActivity, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (com.facebook.ads.internal.q.a.v.b * 16.0f);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            bVar.setLayoutParams(layoutParams);
            bVar.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.v.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    v.this.h.a("performCtaClick");
                }
            });
            this.h.a(bVar);
        }
        this.j = intent.getIntExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, 0);
        this.i = new com.facebook.ads.internal.view.e.c(audienceNetworkActivity, this.f, this.g, intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN), intent.getBundleExtra(AudienceNetworkActivity.VIDEO_LOGGER));
        this.g.setVideoMPD(intent.getStringExtra(AudienceNetworkActivity.VIDEO_MPD));
        this.g.setVideoURI(intent.getStringExtra(AudienceNetworkActivity.VIDEO_URL));
        if (this.j > 0) {
            this.g.a(this.j);
        }
        if (intent.getBooleanExtra(AudienceNetworkActivity.AUTOPLAY, false)) {
            this.g.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    public void a(View view) {
        this.g.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        this.h.a("videoInterstitalEvent", new com.facebook.ads.internal.view.e.b.f());
        this.g.a(false);
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        this.h.a("videoInterstitalEvent", new com.facebook.ads.internal.view.e.b.g());
        this.g.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
    }

    @Override // com.facebook.ads.internal.view.a
    public void onDestroy() {
        this.h.a("videoInterstitalEvent", new com.facebook.ads.internal.view.e.b.p(this.j, this.g.getCurrentPosition()));
        this.i.b(this.g.getCurrentPosition());
        this.g.f();
        this.g.k();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0118a interfaceC0118a) {
    }
}
