package e.c.a.m.t;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import e.c.a.m.t.n;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // e.c.a.m.t.o
        public n<String, AssetFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // e.c.a.m.t.o
        public n<String, ParcelFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // e.c.a.m.t.o
        public n<String, InputStream> b(r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a b(String str, int i2, int i3, e.c.a.m.m mVar) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile == null || !this.a.a(fromFile)) {
            return null;
        }
        return this.a.b(fromFile, i2, i3, mVar);
    }
}
