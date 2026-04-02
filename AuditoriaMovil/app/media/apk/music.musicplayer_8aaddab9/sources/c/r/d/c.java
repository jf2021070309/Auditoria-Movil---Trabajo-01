package c.r.d;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import c.i.c.i;
import c.i.c.j;
import c.i.c.n;
import c.i.c.o;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class c extends n {

    /* renamed from: b  reason: collision with root package name */
    public int[] f2501b = null;

    /* renamed from: c  reason: collision with root package name */
    public MediaSessionCompat.Token f2502c;

    @Override // c.i.c.n
    public void b(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(((o) iVar).f1986b, b.b(b.a(), this.f2501b, this.f2502c));
        }
    }

    @Override // c.i.c.n
    public RemoteViews g(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        int min = Math.min(this.a.f1973b.size(), 5);
        RemoteViews c2 = c(false, min <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media, false);
        c2.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                c2.addView(R.id.media_actions, j(this.a.f1973b.get(i2)));
            }
        }
        c2.setViewVisibility(R.id.cancel_action, 8);
        return c2;
    }

    @Override // c.i.c.n
    public RemoteViews h(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        RemoteViews c2 = c(false, R.layout.notification_template_media, true);
        int size = this.a.f1973b.size();
        int[] iArr = this.f2501b;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c2.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                if (i2 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                }
                c2.addView(R.id.media_actions, j(this.a.f1973b.get(this.f2501b[i2])));
            }
        }
        c2.setViewVisibility(R.id.end_padder, 0);
        c2.setViewVisibility(R.id.cancel_action, 8);
        return c2;
    }

    public final RemoteViews j(j jVar) {
        boolean z = jVar.f1968k == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), (int) R.layout.notification_media_action);
        remoteViews.setImageViewResource(R.id.action0, jVar.f1966i);
        if (!z) {
            remoteViews.setOnClickPendingIntent(R.id.action0, jVar.f1968k);
        }
        a.a(remoteViews, R.id.action0, jVar.f1967j);
        return remoteViews;
    }

    public c k(MediaSessionCompat.Token token) {
        this.f2502c = token;
        return this;
    }

    public c l(int... iArr) {
        this.f2501b = iArr;
        return this;
    }
}
