package e.c.a.m.u.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e.c.a.m.m;
import e.c.a.m.o;
import e.c.a.m.s.w;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public class d implements o<Uri, Drawable> {
    public final Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // e.c.a.m.o
    public boolean a(Uri uri, m mVar) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ w<Drawable> b(Uri uri, int i2, int i3, m mVar) throws IOException {
        return c(uri);
    }

    public w c(Uri uri) {
        Context context;
        int parseInt;
        String authority = uri.getAuthority();
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(this.a.getPackageName())) {
                    throw new IllegalArgumentException(e.a.d.a.a.i("Failed to obtain context or unrecognized Uri format for: ", uri), e2);
                }
                context = this.a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException(e.a.d.a.a.i("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() != 1) {
            throw new IllegalArgumentException(e.a.d.a.a.i("Unrecognized Uri format: ", uri));
        } else {
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(e.a.d.a.a.i("Unrecognized Uri format: ", uri), e3);
            }
        }
        Drawable a = a.a(this.a, context, parseInt, null);
        if (a != null) {
            return new c(a);
        }
        return null;
    }
}
