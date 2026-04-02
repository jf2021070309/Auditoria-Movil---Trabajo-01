package e.c.a.m.t;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import e.c.a.m.t.n;
import java.io.InputStream;
/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0120a<Data> f5783b;

    /* renamed from: e.c.a.m.t.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0120a<Data> {
        e.c.a.m.r.d<Data> a(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0120a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // e.c.a.m.t.a.InterfaceC0120a
        public e.c.a.m.r.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new e.c.a.m.r.h(assetManager, str);
        }

        @Override // e.c.a.m.t.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0120a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // e.c.a.m.t.a.InterfaceC0120a
        public e.c.a.m.r.d<InputStream> a(AssetManager assetManager, String str) {
            return new e.c.a.m.r.n(assetManager, str);
        }

        @Override // e.c.a.m.t.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0120a<Data> interfaceC0120a) {
        this.a = assetManager;
        this.f5783b = interfaceC0120a;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return Action.FILE_ATTRIBUTE.equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // e.c.a.m.t.n
    public n.a b(Uri uri, int i2, int i3, e.c.a.m.m mVar) {
        Uri uri2 = uri;
        return new n.a(new e.c.a.r.b(uri2), this.f5783b.a(this.a, uri2.toString().substring(22)));
    }
}
