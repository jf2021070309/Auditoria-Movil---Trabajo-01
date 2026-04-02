package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class c extends com.facebook.ads.internal.view.e.a.c {
    private final TextView a;
    private final String b;
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n> c;

    public c(Context context, String str) {
        super(context);
        this.c = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n>() { // from class: com.facebook.ads.internal.view.e.c.c.1
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.n> a() {
                return com.facebook.ads.internal.view.e.b.n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (c.this.getVideoView() == null) {
                    return;
                }
                c.this.a.setText(c.this.a(c.this.getVideoView().getDuration() - c.this.getVideoView().getCurrentPosition()));
            }
        };
        this.a = new TextView(context);
        this.b = str;
        addView(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(long j) {
        if (j <= 0) {
            return "00:00";
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        return this.b.isEmpty() ? String.format("%02d:%02d", Long.valueOf(minutes), Long.valueOf(seconds)) : this.b.replace("{{REMAINING_TIME}}", String.format("%02d:%02d", Long.valueOf(minutes), Long.valueOf(seconds)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.c);
        }
        super.b();
    }

    public void setCountdownTextColor(int i) {
        this.a.setTextColor(i);
    }
}
