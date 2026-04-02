package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class b extends com.facebook.ads.internal.view.e.a.c implements AudioManager.OnAudioFocusChangeListener {
    private WeakReference<AudioManager.OnAudioFocusChangeListener> a;
    private final com.facebook.ads.internal.view.e.b.c b;
    private final com.facebook.ads.internal.view.e.b.i c;
    private final com.facebook.ads.internal.view.e.b.k d;

    public b(Context context) {
        super(context);
        this.a = null;
        this.b = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.b.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(b.this.a == null ? null : (AudioManager.OnAudioFocusChangeListener) b.this.a.get());
            }
        };
        this.c = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.b.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(b.this.a == null ? null : (AudioManager.OnAudioFocusChangeListener) b.this.a.get());
            }
        };
        this.d = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.b.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (b.this.a == null || b.this.a.get() == null) {
                    b.this.a = new WeakReference(new AudioManager.OnAudioFocusChangeListener() { // from class: com.facebook.ads.internal.view.e.c.b.3.1
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public void onAudioFocusChange(int i) {
                            if (b.this.getVideoView() == null || i > 0) {
                                return;
                            }
                            b.this.getVideoView().a(false);
                        }
                    });
                }
                ((AudioManager) b.this.getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) b.this.a.get(), 3, 1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.d, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().b(this.c, this.b, this.d);
        }
        super.b();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (getVideoView() == null || i > 0) {
            return;
        }
        getVideoView().a(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.a == null ? null : this.a.get());
        super.onDetachedFromWindow();
    }
}
