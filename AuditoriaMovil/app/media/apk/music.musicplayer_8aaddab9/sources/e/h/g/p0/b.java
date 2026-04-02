package e.h.g.p0;

import android.net.Uri;
import android.util.Log;
import e.h.g.q0;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class b extends a {
    public File a;

    public b(a aVar, File file) {
        super(aVar);
        this.a = file;
    }

    public static boolean k(File file) {
        File[] r = q0.r(file);
        boolean z = true;
        if (r != null) {
            for (File file2 : r) {
                if (file2.isDirectory()) {
                    z &= k(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // e.h.g.p0.a
    public boolean a() {
        k(this.a);
        return this.a.delete();
    }

    @Override // e.h.g.p0.a
    public boolean b() {
        return this.a.exists();
    }

    @Override // e.h.g.p0.a
    public String f() {
        return this.a.getName();
    }

    @Override // e.h.g.p0.a
    public Uri g() {
        return Uri.fromFile(this.a);
    }

    @Override // e.h.g.p0.a
    public boolean h() {
        return this.a.isDirectory();
    }

    @Override // e.h.g.p0.a
    public long i() {
        return this.a.length();
    }

    @Override // e.h.g.p0.a
    public a[] j() {
        ArrayList arrayList = new ArrayList();
        File[] r = q0.r(this.a);
        if (r != null) {
            for (File file : r) {
                arrayList.add(new b(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }
}
