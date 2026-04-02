package com.fyber.inneractive.sdk.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class a extends f {
    private com.fyber.inneractive.sdk.player.d.a a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean i() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final Bitmap j() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean k() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final String l() {
        return "media";
    }

    public a(Context context) {
        super(context);
        this.b = 0;
        this.c = 2;
        this.d = 0;
        this.e = false;
        IAlog.b("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            aVar.reset();
            this.a.release();
            this.a = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(boolean z) {
        if (b() && this.r) {
            return;
        }
        this.r = z;
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void b(boolean z) {
        if (b() || !this.r) {
            this.r = z;
            final com.fyber.inneractive.sdk.player.d.a aVar = this.a;
            if (aVar != null) {
                IAlog.b("%s unmute", aVar.c());
                aVar.d = false;
                if (aVar.a()) {
                    aVar.a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.13
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.f(aVar);
                        }
                    });
                } else {
                    IAlog.b("%s unmute called when player is not ready!", aVar.c());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int d() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            return aVar.getVideoWidth();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int e() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            return aVar.getVideoHeight();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(final int i) {
        final com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            IAlog.b("%s seek to called with = %d mPlayAfterSeek = %s", aVar.c(), Integer.valueOf(i), true);
            if (!aVar.a()) {
                IAlog.b("%s seek called when player is not ready!", aVar.c());
            } else if (aVar.b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                IAlog.b("%s seek called when player is already seeking!", aVar.c());
            } else {
                aVar.a(com.fyber.inneractive.sdk.player.enums.b.Seeking);
                aVar.c = true;
                aVar.a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.d.a.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(aVar, i);
                    }
                });
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void f() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int g() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int h() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            return aVar.getDuration();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    protected final void c(boolean z) {
        if (this.a == null) {
            IAlog.b("MediaPlayerController: creating media player", new Object[0]);
            this.a = new com.fyber.inneractive.sdk.player.d.a(this.f, this, this.l);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(String str, int i) {
        this.a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void b(int i) {
        super.b(i);
        if (i >= h()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i == this.b) {
            IAlog.b("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 == this.c) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.e = true;
            }
        } else if (this.e) {
            IAlog.b("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.d = 0;
            this.e = false;
        }
        this.b = i;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean b() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            return aVar.d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void c() {
        com.fyber.inneractive.sdk.player.d.a aVar = this.a;
        if (aVar != null) {
            aVar.pause();
        }
    }
}
