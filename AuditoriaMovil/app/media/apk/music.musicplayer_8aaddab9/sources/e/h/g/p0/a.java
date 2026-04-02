package e.h.g.p0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.File;
/* loaded from: classes.dex */
public abstract class a {
    public a(a aVar) {
    }

    public static a c(File file) {
        return new b(null, file);
    }

    public static a d(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public static a e(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract String f();

    public abstract Uri g();

    public abstract boolean h();

    public abstract long i();

    public abstract a[] j();
}
