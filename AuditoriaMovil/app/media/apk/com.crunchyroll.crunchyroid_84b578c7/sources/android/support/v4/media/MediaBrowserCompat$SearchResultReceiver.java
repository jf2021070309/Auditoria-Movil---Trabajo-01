package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import com.amazon.aps.iva.d.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends b {
    @Override // com.amazon.aps.iva.d.b
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            MediaSessionCompat.a(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
            throw null;
        }
        throw null;
    }
}
