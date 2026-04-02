package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.l;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.m;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.u;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.z;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements t {
    private final m a;

    public a(m mVar) {
        this.a = mVar;
    }

    private String a(List<l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            l lVar = list.get(i);
            sb.append(lVar.a());
            sb.append('=');
            sb.append(lVar.b());
        }
        return sb.toString();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t
    public a0 a(t.a aVar) throws IOException {
        y b = aVar.b();
        y.a f = b.f();
        z a = b.a();
        if (a != null) {
            u b2 = a.b();
            if (b2 != null) {
                f.b(DownloadUtils.CONTENT_TYPE, b2.toString());
            }
            long a2 = a.a();
            if (a2 != -1) {
                f.b(DownloadUtils.CONTENT_LENGTH, Long.toString(a2));
                f.a(DownloadUtils.TRANSFER_ENCODING);
            } else {
                f.b(DownloadUtils.TRANSFER_ENCODING, DownloadUtils.VALUE_CHUNKED);
                f.a(DownloadUtils.CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (b.a("Host") == null) {
            f.b("Host", bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(b.g(), false));
        }
        if (b.a("Connection") == null) {
            f.b("Connection", "Keep-Alive");
        }
        if (b.a("Accept-Encoding") == null && b.a("Range") == null) {
            z = true;
            f.b("Accept-Encoding", "gzip");
        }
        List<l> a3 = this.a.a(b.g());
        if (!a3.isEmpty()) {
            f.b("Cookie", a(a3));
        }
        if (b.a("User-Agent") == null) {
            f.b("User-Agent", bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.d.a());
        }
        a0 a4 = aVar.a(f.a());
        e.a(this.a, b.g(), a4.m());
        a0.a a5 = a4.p().a(b);
        if (z && "gzip".equalsIgnoreCase(a4.b("Content-Encoding")) && e.b(a4)) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.j jVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.j(a4.i().k());
            a5.a(a4.m().a().b("Content-Encoding").b(DownloadUtils.CONTENT_LENGTH).a());
            a5.a(new h(a4.b(DownloadUtils.CONTENT_TYPE), -1L, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.l.a(jVar)));
        }
        return a5.a();
    }
}
