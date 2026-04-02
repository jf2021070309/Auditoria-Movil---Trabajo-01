package e.h.d.w;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import java.util.List;
/* loaded from: classes2.dex */
public class b extends MediaBrowserService {
    public final d a;

    public b(Context context, d dVar) {
        attachBaseContext(context);
        this.a = dVar;
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
        a f2 = this.a.f(str, i2, bundle);
        if (f2 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(f2.f8227b, f2.a);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.a.d(str, new c<>(result));
    }
}
