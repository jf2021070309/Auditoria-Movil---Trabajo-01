package e.a.c;

import android.widget.ImageView;
import com.android.music.AlbumBrowserActivity;
import e.h.g.j0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements j0.c {
    public final /* synthetic */ AlbumBrowserActivity a;

    public /* synthetic */ j(AlbumBrowserActivity albumBrowserActivity) {
        this.a = albumBrowserActivity;
    }

    @Override // e.h.g.j0.c
    public final void a() {
        AlbumBrowserActivity albumBrowserActivity = this.a;
        if (albumBrowserActivity.isFinishing()) {
            return;
        }
        z6.b0(albumBrowserActivity, 0, (ImageView) albumBrowserActivity.findViewById(R.id.blurred_bg_player_view), true, z6.f5234n);
    }
}
