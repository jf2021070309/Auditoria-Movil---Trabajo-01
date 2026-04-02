package com.kwad.framework.filedownloader.f;

import android.content.Context;
import com.kwad.framework.filedownloader.exception.PathConflictException;
import com.kwad.framework.filedownloader.y;
import java.io.File;
/* loaded from: classes.dex */
public final class c {
    private static Context aeT;

    /* loaded from: classes.dex */
    public interface a {
        int H(long j);
    }

    /* loaded from: classes.dex */
    public interface b {
        com.kwad.framework.filedownloader.a.b ba(String str);
    }

    /* renamed from: com.kwad.framework.filedownloader.f.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0233c {
        com.kwad.framework.filedownloader.b.a vQ();
    }

    /* loaded from: classes.dex */
    public interface d {
        int f(String str, String str2, boolean z);

        int g(String str, String str2, boolean z);
    }

    /* loaded from: classes.dex */
    public interface e {
        com.kwad.framework.filedownloader.e.a c(File file);
    }

    public static boolean a(int i, long j, String str, String str2, y yVar) {
        int l;
        if (str2 == null || str == null || (l = yVar.l(str, i)) == 0) {
            return false;
        }
        com.kwad.framework.filedownloader.message.e.vj().s(com.kwad.framework.filedownloader.message.f.a(i, j, new PathConflictException(l, str, str2)));
        return true;
    }

    public static boolean a(int i, com.kwad.framework.filedownloader.d.c cVar, y yVar, boolean z) {
        if (yVar.a(cVar)) {
            com.kwad.framework.filedownloader.message.e.vj().s(com.kwad.framework.filedownloader.message.f.a(i, cVar.vp(), cVar.getTotal(), z));
            return true;
        }
        return false;
    }

    public static boolean a(int i, String str, boolean z, boolean z2) {
        if (!z && str != null) {
            File file = new File(str);
            if (file.exists()) {
                com.kwad.framework.filedownloader.message.e.vj().s(com.kwad.framework.filedownloader.message.f.a(i, file, z2));
                return true;
            }
        }
        return false;
    }

    public static void ao(Context context) {
        aeT = context;
    }

    public static Context vP() {
        return aeT;
    }
}
