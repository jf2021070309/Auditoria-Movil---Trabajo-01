package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public final class c {
    public static final a a = new a();

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0052c {
        void a();

        void b(int i, Object obj);
    }

    static {
        new b();
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.m8.a[], byte[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.amazon.aps.iva.m8.a[], byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r17, java.util.concurrent.Executor r18, androidx.profileinstaller.c.InterfaceC0052c r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0052c {
        @Override // androidx.profileinstaller.c.InterfaceC0052c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0052c
        public final void b(int i, Object obj) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0052c {
        @Override // androidx.profileinstaller.c.InterfaceC0052c
        public final void b(int i, Object obj) {
            if (i == 6 || i == 7 || i == 8) {
                Throwable th = (Throwable) obj;
            }
        }

        @Override // androidx.profileinstaller.c.InterfaceC0052c
        public final void a() {
        }
    }
}
