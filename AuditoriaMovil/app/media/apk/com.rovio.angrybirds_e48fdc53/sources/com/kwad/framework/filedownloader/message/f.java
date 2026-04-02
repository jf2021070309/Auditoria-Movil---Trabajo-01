package com.kwad.framework.filedownloader.message;

import com.kwad.framework.filedownloader.download.d;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.a;
import com.kwad.framework.filedownloader.message.d;
import com.kwad.framework.filedownloader.message.h;
import java.io.File;
/* loaded from: classes.dex */
public class f {
    public static MessageSnapshot a(byte b, com.kwad.framework.filedownloader.d.c cVar, d.a aVar) {
        MessageSnapshot c0235d;
        int id = cVar.getId();
        if (b != -4) {
            if (b == -3) {
                return cVar.tg() ? new d.b(id, false, cVar.getTotal()) : new h.b(id, false, (int) cVar.getTotal());
            }
            if (b == -1) {
                c0235d = cVar.tg() ? new d.C0235d(id, cVar.vp(), aVar.getException()) : new h.d(id, (int) cVar.vp(), aVar.getException());
            } else if (b == 1) {
                return cVar.tg() ? new d.f(id, cVar.vp(), cVar.getTotal()) : new h.f(id, (int) cVar.vp(), (int) cVar.getTotal());
            } else if (b == 2) {
                String filename = cVar.sW() ? cVar.getFilename() : null;
                return cVar.tg() ? new d.c(id, aVar.uU(), cVar.getTotal(), cVar.vq(), filename) : new h.c(id, aVar.uU(), (int) cVar.getTotal(), cVar.vq(), filename);
            } else if (b == 3) {
                return cVar.tg() ? new d.g(id, cVar.vp()) : new h.g(id, (int) cVar.vp());
            } else if (b != 5) {
                if (b != 6) {
                    String b2 = com.kwad.framework.filedownloader.f.f.b("it can't takes a snapshot for the task(%s) when its status is %d,", cVar, Byte.valueOf(b));
                    com.kwad.framework.filedownloader.f.d.d(f.class, "it can't takes a snapshot for the task(%s) when its status is %d,", cVar, Byte.valueOf(b));
                    IllegalStateException illegalStateException = aVar.getException() != null ? new IllegalStateException(b2, aVar.getException()) : new IllegalStateException(b2);
                    return cVar.tg() ? new d.C0235d(id, cVar.vp(), illegalStateException) : new h.d(id, (int) cVar.vp(), illegalStateException);
                }
                return new MessageSnapshot.b(id);
            } else {
                c0235d = cVar.tg() ? new d.h(id, cVar.vp(), aVar.getException(), aVar.te()) : new h.C0236h(id, (int) cVar.vp(), aVar.getException(), aVar.te());
            }
            return c0235d;
        }
        throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("please use #catchWarn instead %d", Integer.valueOf(id)));
    }

    public static MessageSnapshot a(int i, long j, long j2, boolean z) {
        return j2 > 2147483647L ? z ? new d.i(i, j, j2) : new d.j(i, j, j2) : z ? new h.i(i, (int) j, (int) j2) : new h.j(i, (int) j, (int) j2);
    }

    public static MessageSnapshot a(int i, long j, Throwable th) {
        return j > 2147483647L ? new d.C0235d(i, j, th) : new h.d(i, (int) j, th);
    }

    public static MessageSnapshot a(int i, File file, boolean z) {
        long length = file.length();
        return length > 2147483647L ? z ? new d.a(i, true, length) : new d.b(i, true, length) : z ? new h.a(i, true, (int) length) : new h.b(i, true, (int) length);
    }

    public static MessageSnapshot e(com.kwad.framework.filedownloader.a aVar) {
        return aVar.tg() ? new d.e(aVar.getId(), aVar.sY(), aVar.sZ()) : new h.e(aVar.getId(), aVar.getSmallFileSoFarBytes(), aVar.getSmallFileTotalBytes());
    }

    public static MessageSnapshot t(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.ta() == -3) {
            return new a.C0234a(messageSnapshot);
        }
        throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.ta())));
    }
}
