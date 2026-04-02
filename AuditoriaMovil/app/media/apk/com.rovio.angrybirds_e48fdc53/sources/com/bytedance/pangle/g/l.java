package com.bytedance.pangle.g;

import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
/* loaded from: classes.dex */
final class l implements k {
    private static final long a = Os.sysconf(OsConstants._SC_PAGESIZE);
    private final FileDescriptor b;
    private final long c;
    private final long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(FileDescriptor fileDescriptor, long j, long j2) {
        this.b = fileDescriptor;
        this.c = j;
        this.d = j2;
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.pangle.g.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.bytedance.pangle.g.j r19, long r20, int r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.l.a(com.bytedance.pangle.g.j, long, int):void");
    }
}
