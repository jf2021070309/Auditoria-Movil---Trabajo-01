package e.h.d.w;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;
/* loaded from: classes2.dex */
public class e extends b {
    public e(Context context, f fVar) {
        super(context, fVar);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        ((f) this.a).a(str, new c<>(result));
    }
}
