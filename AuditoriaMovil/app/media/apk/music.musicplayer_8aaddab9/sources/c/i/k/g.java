package c.i.k;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g {
    public final e a;

    /* loaded from: classes.dex */
    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i2) {
            this.a = new ContentInfo.Builder(clipData, i2);
        }

        @Override // c.i.k.g.b
        public void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // c.i.k.g.b
        public void b(int i2) {
            this.a.setFlags(i2);
        }

        @Override // c.i.k.g.b
        public g build() {
            return new g(new d(this.a.build()));
        }

        @Override // c.i.k.g.b
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i2);

        g build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        public ClipData a;

        /* renamed from: b  reason: collision with root package name */
        public int f2153b;

        /* renamed from: c  reason: collision with root package name */
        public int f2154c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f2155d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f2156e;

        public c(ClipData clipData, int i2) {
            this.a = clipData;
            this.f2153b = i2;
        }

        @Override // c.i.k.g.b
        public void a(Uri uri) {
            this.f2155d = uri;
        }

        @Override // c.i.k.g.b
        public void b(int i2) {
            this.f2154c = i2;
        }

        @Override // c.i.k.g.b
        public g build() {
            return new g(new f(this));
        }

        @Override // c.i.k.g.b
        public void setExtras(Bundle bundle) {
            this.f2156e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.a = contentInfo;
        }

        @Override // c.i.k.g.e
        public int a() {
            return this.a.getSource();
        }

        @Override // c.i.k.g.e
        public ClipData b() {
            return this.a.getClip();
        }

        @Override // c.i.k.g.e
        public ContentInfo c() {
            return this.a;
        }

        @Override // c.i.k.g.e
        public int l() {
            return this.a.getFlags();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("ContentInfoCompat{");
            y.append(this.a);
            y.append("}");
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        int a();

        ClipData b();

        ContentInfo c();

        int l();
    }

    /* loaded from: classes.dex */
    public static final class f implements e {
        public final ClipData a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2157b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2158c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f2159d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f2160e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            Objects.requireNonNull(clipData);
            this.a = clipData;
            int i2 = cVar.f2153b;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i2 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f2157b = i2;
            int i3 = cVar.f2154c;
            if ((i3 & 1) == i3) {
                this.f2158c = i3;
                this.f2159d = cVar.f2155d;
                this.f2160e = cVar.f2156e;
                return;
            }
            StringBuilder y = e.a.d.a.a.y("Requested flags 0x");
            y.append(Integer.toHexString(i3));
            y.append(", but only 0x");
            y.append(Integer.toHexString(1));
            y.append(" are allowed");
            throw new IllegalArgumentException(y.toString());
        }

        @Override // c.i.k.g.e
        public int a() {
            return this.f2157b;
        }

        @Override // c.i.k.g.e
        public ClipData b() {
            return this.a;
        }

        @Override // c.i.k.g.e
        public ContentInfo c() {
            return null;
        }

        @Override // c.i.k.g.e
        public int l() {
            return this.f2158c;
        }

        public String toString() {
            String sb;
            StringBuilder y = e.a.d.a.a.y("ContentInfoCompat{clip=");
            y.append(this.a.getDescription());
            y.append(", source=");
            int i2 = this.f2157b;
            y.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            y.append(", flags=");
            int i3 = this.f2158c;
            y.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
            if (this.f2159d == null) {
                sb = "";
            } else {
                StringBuilder y2 = e.a.d.a.a.y(", hasLinkUri(");
                y2.append(this.f2159d.toString().length());
                y2.append(")");
                sb = y2.toString();
            }
            y.append(sb);
            return e.a.d.a.a.r(y, this.f2160e != null ? ", hasExtras" : "", "}");
        }
    }

    public g(e eVar) {
        this.a = eVar;
    }

    public String toString() {
        return this.a.toString();
    }
}
