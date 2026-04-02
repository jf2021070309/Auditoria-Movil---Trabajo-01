package e.c.a.m;

import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.u.c.w;
import java.io.FileInputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class h implements i {
    public final /* synthetic */ e.c.a.m.r.m a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.c.a.m.s.c0.b f5554b;

    public h(e.c.a.m.r.m mVar, e.c.a.m.s.c0.b bVar) {
        this.a = mVar;
        this.f5554b = bVar;
    }

    @Override // e.c.a.m.i
    public int a(ImageHeaderParser imageHeaderParser) throws IOException {
        w wVar = null;
        try {
            w wVar2 = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.f5554b);
            try {
                int c2 = imageHeaderParser.c(wVar2, this.f5554b);
                try {
                    wVar2.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return c2;
            } catch (Throwable th) {
                th = th;
                wVar = wVar2;
                if (wVar != null) {
                    try {
                        wVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
