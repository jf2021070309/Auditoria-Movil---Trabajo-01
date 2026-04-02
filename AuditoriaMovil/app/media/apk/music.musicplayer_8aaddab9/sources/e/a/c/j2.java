package e.a.c;

import com.android.music.MediaPlaybackActivity;
import e.h.g.j0;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements j0.b {
    public final /* synthetic */ MediaPlaybackActivity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s6 f5101b;

    public /* synthetic */ j2(MediaPlaybackActivity mediaPlaybackActivity, s6 s6Var) {
        this.a = mediaPlaybackActivity;
        this.f5101b = s6Var;
    }

    @Override // e.h.g.j0.b
    public final void a() {
        MediaPlaybackActivity mediaPlaybackActivity = this.a;
        s6 s6Var = this.f5101b;
        Objects.requireNonNull(mediaPlaybackActivity);
        try {
            int h2 = s6Var.h();
            if (h2 == 0) {
                s6Var.u(1);
                if (s6Var.g() == 1) {
                    s6Var.t(2);
                    mediaPlaybackActivity.G();
                }
                z6.Z(z6.E(R.string.shuffle_on_notif), 0);
            } else if (h2 == 1 || h2 == 2) {
                s6Var.u(0);
                z6.Z(z6.E(R.string.shuffle_off_notif), 0);
            }
            mediaPlaybackActivity.G();
            mediaPlaybackActivity.H();
            e.h.g.j1.n(500, new e.h.g.r0());
            mediaPlaybackActivity.G();
            mediaPlaybackActivity.H();
        } catch (Exception e2) {
            e.h.g.s1.l(e2, true);
        }
    }
}
