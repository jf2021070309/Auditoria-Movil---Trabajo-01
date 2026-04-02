package e.a.c;

import android.widget.ImageView;
import com.android.music.QueryBrowserActivity;
import e.h.g.j0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements j0.c {
    public final /* synthetic */ QueryBrowserActivity a;

    public /* synthetic */ u4(QueryBrowserActivity queryBrowserActivity) {
        this.a = queryBrowserActivity;
    }

    @Override // e.h.g.j0.c
    public final void a() {
        QueryBrowserActivity queryBrowserActivity = this.a;
        if (queryBrowserActivity.isFinishing()) {
            return;
        }
        z6.b0(queryBrowserActivity, 0, (ImageView) queryBrowserActivity.findViewById(R.id.blurred_bg_player_view), true, z6.f5234n);
    }
}
