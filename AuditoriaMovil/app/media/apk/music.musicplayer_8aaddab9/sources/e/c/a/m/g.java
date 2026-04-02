package e.c.a.m;

import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.u.c.w;
import java.io.FileInputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class g implements j {
    public final /* synthetic */ e.c.a.m.r.m a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.c.a.m.s.c0.b f5553b;

    public g(e.c.a.m.r.m mVar, e.c.a.m.s.c0.b bVar) {
        this.a = mVar;
        this.f5553b = bVar;
    }

    @Override // e.c.a.m.j
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        w wVar = null;
        try {
            w wVar2 = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.f5553b);
            try {
                ImageHeaderParser.ImageType b2 = imageHeaderParser.b(wVar2);
                try {
                    wVar2.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return b2;
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
