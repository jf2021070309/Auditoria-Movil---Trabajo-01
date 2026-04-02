package e.a.c;

import android.widget.ImageView;
import com.android.music.ArtistAlbumBrowserActivity;
import e.h.g.j0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final /* synthetic */ class u implements j0.c {
    public final /* synthetic */ ArtistAlbumBrowserActivity a;

    public /* synthetic */ u(ArtistAlbumBrowserActivity artistAlbumBrowserActivity) {
        this.a = artistAlbumBrowserActivity;
    }

    @Override // e.h.g.j0.c
    public final void a() {
        ArtistAlbumBrowserActivity artistAlbumBrowserActivity = this.a;
        if (artistAlbumBrowserActivity.isFinishing()) {
            return;
        }
        z6.b0(artistAlbumBrowserActivity, 0, (ImageView) artistAlbumBrowserActivity.findViewById(R.id.blurred_bg_player_view), true, z6.f5234n);
    }
}
