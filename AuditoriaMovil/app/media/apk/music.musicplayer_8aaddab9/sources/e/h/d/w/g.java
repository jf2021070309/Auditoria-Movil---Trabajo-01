package e.h.d.w;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.List;
/* loaded from: classes2.dex */
public class g {
    public static Field a;

    /* loaded from: classes2.dex */
    public static class a extends e {
        public a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            ((c) this.a).c(str, new b(result), bundle);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public MediaBrowserService.Result a;

        public b(MediaBrowserService.Result result) {
            this.a = result;
        }
    }

    /* loaded from: classes2.dex */
    public interface c extends f {
        void c(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.w("MBSCompatApi24", e2);
        }
    }
}
