package com.kwad.components.core.g;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.offline.api.core.imageplayer.IImagePlayer;
import com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements IImagePlayer {
    private c KK = new c();

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void destroy() {
        this.KK.destroy();
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final FrameLayout getImagePlayerView(Context context) {
        return this.KK.getImagePlayerView(context);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void pause() {
        this.KK.pause();
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void play() {
        this.KK.play();
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void prepareToPlay() {
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void registerMediaPlayStateListener(OfflineMediaPlayStateListener offlineMediaPlayStateListener) {
        this.KK.c(com.kwad.components.core.n.b.c.d.a(offlineMediaPlayStateListener));
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void resume() {
        this.KK.resume();
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setDuration(long j) {
        this.KK.v(j * 1000);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setEnableCache(boolean z) {
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setHorizontalGravity(int i) {
        this.KK.setHorizontalGravity(i);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setImageResize(int i) {
        c cVar;
        ImageView.ScaleType scaleType;
        if (i == 0) {
            cVar = this.KK;
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (i == 1) {
            cVar = this.KK;
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            this.KK.setImageScaleType(ImageView.ScaleType.CENTER);
            return;
        } else {
            cVar = this.KK;
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        cVar.setImageScaleType(scaleType);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setRadius(float f, float f2, float f3, float f4) {
        this.KK.setRadius(f, f2, f3, f4);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setURLs(List<String> list) {
        this.KK.setURLs(list);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setVerticalGravity(int i) {
        this.KK.setVerticalGravity(i);
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void stop() {
        this.KK.stop();
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void unregisterMediaPlayStateListener(OfflineMediaPlayStateListener offlineMediaPlayStateListener) {
        this.KK.d(com.kwad.components.core.n.b.c.d.a(offlineMediaPlayStateListener));
    }
}
