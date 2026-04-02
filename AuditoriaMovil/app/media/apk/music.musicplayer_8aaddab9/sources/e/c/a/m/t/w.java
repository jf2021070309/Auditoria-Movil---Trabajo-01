package e.c.a.m.t;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import e.c.a.m.t.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, "android.resource", AppLovinEventTypes.USER_VIEWED_CONTENT)));

    /* renamed from: b  reason: collision with root package name */
    public final c<Data> f5823b;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // e.c.a.m.t.w.c
        public e.c.a.m.r.d<AssetFileDescriptor> a(Uri uri) {
            return new e.c.a.m.r.a(this.a, uri);
        }

        @Override // e.c.a.m.t.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // e.c.a.m.t.w.c
        public e.c.a.m.r.d<ParcelFileDescriptor> a(Uri uri) {
            return new e.c.a.m.r.i(this.a, uri);
        }

        @Override // e.c.a.m.t.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        e.c.a.m.r.d<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // e.c.a.m.t.w.c
        public e.c.a.m.r.d<InputStream> a(Uri uri) {
            return new e.c.a.m.r.o(this.a, uri);
        }

        @Override // e.c.a.m.t.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f5823b = cVar;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    @Override // e.c.a.m.t.n
    public n.a b(Uri uri, int i2, int i3, e.c.a.m.m mVar) {
        Uri uri2 = uri;
        return new n.a(new e.c.a.r.b(uri2), this.f5823b.a(uri2));
    }
}
