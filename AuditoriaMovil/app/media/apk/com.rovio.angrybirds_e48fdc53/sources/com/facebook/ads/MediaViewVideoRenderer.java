package com.facebook.ads;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.internal.q.c.d;
import com.facebook.ads.internal.view.e.b.b;
import com.facebook.ads.internal.view.e.b.c;
import com.facebook.ads.internal.view.e.b.d;
import com.facebook.ads.internal.view.e.b.e;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.i;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.k;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.m;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.q;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;
import com.facebook.ads.internal.view.n;
import com.facebook.ads.internal.view.o;
/* loaded from: classes2.dex */
public abstract class MediaViewVideoRenderer extends FrameLayout {
    private static final String d = MediaViewVideoRenderer.class.getSimpleName();
    protected NativeAd a;
    protected VideoAutoplayBehavior b;
    final n c;
    private final m e;
    private final k f;
    private final i g;
    private final q h;
    private final c i;
    private final w j;
    private final e k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public MediaViewVideoRenderer(Context context) {
        super(context);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.c = new n(context);
        a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.c = new n(context, attributeSet);
        a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.c = new n(context, attributeSet, i);
        a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new m() { // from class: com.facebook.ads.MediaViewVideoRenderer.1
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                MediaViewVideoRenderer.this.onPrepared();
            }
        };
        this.f = new k() { // from class: com.facebook.ads.MediaViewVideoRenderer.2
            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                MediaViewVideoRenderer.this.onPlayed();
            }
        };
        this.g = new i() { // from class: com.facebook.ads.MediaViewVideoRenderer.3
            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                MediaViewVideoRenderer.this.onPaused();
            }
        };
        this.h = new q() { // from class: com.facebook.ads.MediaViewVideoRenderer.4
            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                MediaViewVideoRenderer.this.onSeek();
            }
        };
        this.i = new c() { // from class: com.facebook.ads.MediaViewVideoRenderer.5
            @Override // com.facebook.ads.internal.j.f
            public void a(b bVar) {
                MediaViewVideoRenderer.this.onCompleted();
            }
        };
        this.j = new w() { // from class: com.facebook.ads.MediaViewVideoRenderer.6
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                MediaViewVideoRenderer.this.onVolumeChanged();
            }
        };
        this.k = new e() { // from class: com.facebook.ads.MediaViewVideoRenderer.7
            @Override // com.facebook.ads.internal.j.f
            public void a(d dVar) {
                MediaViewVideoRenderer.this.onError();
            }
        };
        this.n = true;
        this.o = true;
        this.c = new n(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        this.c.setEnableBackgroundVideo(shouldAllowBackgroundPlayback());
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.c);
        com.facebook.ads.internal.q.a.i.a(this.c, com.facebook.ads.internal.q.a.i.INTERNAL_AD_MEDIA);
        this.c.getEventBus().a(this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public void destroy() {
        this.c.k();
    }

    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.l) {
            Log.w(d, "disengageSeek called without engageSeek.");
            return;
        }
        this.l = false;
        if (this.m) {
            this.c.a(videoStartReason.a());
        }
        onSeekDisengaged();
    }

    public final void engageSeek() {
        if (this.l) {
            Log.w(d, "engageSeek called without disengageSeek.");
            return;
        }
        this.l = true;
        this.m = com.facebook.ads.internal.view.e.d.d.STARTED.equals(this.c.getState());
        this.c.a(false);
        onSeekEngaged();
    }

    public final int getCurrentTimeMs() {
        return this.c.getCurrentPosition();
    }

    public final int getDuration() {
        return this.c.getDuration();
    }

    public final float getVolume() {
        return this.c.getVolume();
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    public final void pause(boolean z) {
        this.c.a(z);
    }

    public final void play(VideoStartReason videoStartReason) {
        this.c.a(videoStartReason.a());
    }

    public final void seekTo(int i) {
        if (this.l) {
            this.c.a(i);
        } else {
            Log.w(d, "Seeking must be preceded by a call to engageSeek, and followed by a call to disengageSeek.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setAdEventManager(com.facebook.ads.internal.m.c cVar) {
        this.c.setAdEventManager(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public void setAutoplay(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public void setAutoplayOnMobile(boolean z) {
        this.o = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setListener(o oVar) {
        this.c.setListener(oVar);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.a = nativeAd;
        this.c.a(nativeAd.d(), nativeAd.g());
        this.c.setVideoMPD(nativeAd.c());
        this.c.setVideoURI(nativeAd.b());
        this.c.setVideoCTA(nativeAd.getAdCallToAction());
        this.c.setNativeAd(nativeAd);
        this.b = nativeAd.e();
    }

    public final void setVolume(float f) {
        this.c.setVolume(f);
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public boolean shouldAutoplay() {
        if (this.c == null || this.c.getState() == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
            return false;
        }
        return this.b == VideoAutoplayBehavior.DEFAULT ? this.n && (this.o || com.facebook.ads.internal.q.c.d.c(getContext()) == d.a.MOBILE_INTERNET) : this.b == VideoAutoplayBehavior.ON;
    }

    public void unsetNativeAd() {
        pause(false);
        this.c.a((String) null, (String) null);
        this.c.setVideoMPD(null);
        this.c.setVideoURI((Uri) null);
        this.c.setVideoCTA(null);
        this.c.setNativeAd(null);
        this.b = VideoAutoplayBehavior.DEFAULT;
        this.a = null;
    }
}
