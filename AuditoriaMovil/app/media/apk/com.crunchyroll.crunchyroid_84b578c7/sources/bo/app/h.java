package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.app.l0;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class h {
    private final l0 a;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error while retrieving disk for key " + this.b + " diskKey " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get bitmap from disk cache for key " + this.b + " diskKey " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to load image from disk cache: " + this.b + '/' + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error while producing output stream or compressing bitmap for key " + this.b + " diskKey " + this.c;
        }
    }

    public h(File file, int i, int i2, long j) {
        l0 a2 = l0.a(file, i, i2, j);
        com.amazon.aps.iva.yb0.j.e(a2, "open(directory, appVersion, valueCount, maxSize)");
        this.a = a2;
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final void a(String str, Bitmap bitmap) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        String c2 = c(str);
        try {
            l0.c a2 = this.a.a(c2);
            OutputStream a3 = a2.a(0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, a3);
            a3.flush();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.a60.b.k(a3, null);
            a2.b();
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new d(str, c2));
        }
    }

    public final Bitmap b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        String c2 = c(str);
        try {
            l0.d b2 = this.a.b(c2);
            Bitmap decodeStream = BitmapFactory.decodeStream(b2.a(0));
            com.amazon.aps.iva.a60.b.k(b2, null);
            return decodeStream;
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeLogger.brazelog(this, BrazeLogger.Priority.E, th, new b(str, c2));
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(str, c2), 3, (Object) null);
            return null;
        }
    }

    public final boolean a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        String c2 = c(str);
        try {
            l0.d b2 = this.a.b(c2);
            boolean z = b2 != null;
            com.amazon.aps.iva.a60.b.k(b2, null);
            return z;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new a(str, c2));
            return false;
        }
    }
}
