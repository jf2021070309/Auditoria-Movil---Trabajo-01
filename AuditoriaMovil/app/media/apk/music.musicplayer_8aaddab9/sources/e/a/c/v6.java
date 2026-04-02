package e.a.c;

import com.android.music.MediaPlaybackActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public class v6 extends AdListener {
    public final /* synthetic */ MediaPlaybackActivity a;

    public v6(MediaPlaybackActivity mediaPlaybackActivity) {
        this.a = mediaPlaybackActivity;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        MediaPlaybackActivity mediaPlaybackActivity = this.a;
        boolean z = MediaPlaybackActivity.f2951c;
        mediaPlaybackActivity.A(true);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        this.a.K.b();
        this.a.K.setVisibility(8);
    }
}
