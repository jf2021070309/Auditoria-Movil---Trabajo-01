package e.j.d.c0;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Zip$zipFiles$2", f = "Zip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<String> f8725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, List<String> list, h.m.d<? super i0> dVar) {
        super(2, dVar);
        this.a = str;
        this.f8725b = list;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new i0(this.a, this.f8725b, dVar);
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
        i0 i0Var = new i0(this.a, this.f8725b, dVar);
        h.k kVar = h.k.a;
        i0Var.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        e.j.d.w.E0(obj);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(this.a));
        List<String> list = this.f8725b;
        try {
            byte[] bArr = new byte[Compressor.BUFFER_SIZE];
            for (String str : list) {
                FileInputStream fileInputStream = new FileInputStream(str);
                String substring = str.substring(h.t.g.j(str, "/", 0, false, 6) + 1);
                h.o.c.j.d(substring, "this as java.lang.String).substring(startIndex)");
                zipOutputStream.putNextEntry(new ZipEntry(substring));
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (-1 == read) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                e.j.d.w.p(fileInputStream, null);
            }
            zipOutputStream.finish();
            zipOutputStream.flush();
            zipOutputStream.close();
            h.k kVar = h.k.a;
            e.j.d.w.p(zipOutputStream, null);
            return kVar;
        } finally {
        }
    }
}
