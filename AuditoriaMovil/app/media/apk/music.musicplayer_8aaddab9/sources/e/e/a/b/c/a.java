package e.e.a.b.c;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public final e.e.a.b.a.a a;

    public a(e.e.a.b.a.a aVar) {
        this.a = aVar;
    }

    public void a(List<b> list) {
        FileOutputStream fileOutputStream;
        for (b bVar : list) {
            int i2 = bVar.f7932b;
            String str = bVar.f7933c;
            if (i2 == 2) {
                byte[] bArr = bVar.f7934d;
                e.e.a.b.a.b bVar2 = (e.e.a.b.a.b) this.a;
                Objects.requireNonNull(bVar2);
                if (bArr.length == 0) {
                    throw new e.e.a.a.a(String.format("%s key's value is zero bytes for saving", str));
                }
                File file = new File(bVar2.f7930c, str);
                File file2 = new File(bVar2.f7929b, e.a.d.a.a.k(str, ".bak"));
                if (file.exists()) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.renameTo(file2);
                }
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                }
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    throw new e.e.a.a.a(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (i2 == 3) {
                e.e.a.b.a.b bVar3 = (e.e.a.b.a.b) this.a;
                Objects.requireNonNull(bVar3);
                try {
                    File file3 = new File(bVar3.f7930c, str);
                    if (file3.exists()) {
                        file3.delete();
                    }
                } catch (Exception e4) {
                    throw new e.e.a.a.a(e4);
                }
            }
        }
    }
}
