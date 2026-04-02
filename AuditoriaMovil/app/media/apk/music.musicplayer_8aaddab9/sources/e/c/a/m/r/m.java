package e.c.a.m.r;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import e.c.a.m.r.e;
import java.io.IOException;
/* loaded from: classes.dex */
public final class m implements e<ParcelFileDescriptor> {
    public final b a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // e.c.a.m.r.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // e.c.a.m.r.e.a
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // e.c.a.m.r.e
    public void b() {
    }

    @Override // e.c.a.m.r.e
    /* renamed from: d */
    public ParcelFileDescriptor a() throws IOException {
        return this.a.a();
    }
}
