package com.amazon.aps.iva.p3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {
    public final e a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i) {
            this.a = com.amazon.aps.iva.b6.s0.b(clipData, i);
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final c build() {
            ContentInfo build;
            build = this.a.build();
            return new c(new d(build));
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: com.amazon.aps.iva.p3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0599c implements b {
        public final ClipData a;
        public final int b;
        public int c;
        public Uri d;
        public Bundle e;

        public C0599c(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void b(int i) {
            this.c = i;
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // com.amazon.aps.iva.p3.c.b
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = com.amazon.aps.iva.b6.o0.c(contentInfo);
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final ClipData a() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final ContentInfo b() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final int g() {
            int source;
            source = this.a.getSource();
            return source;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final int m() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        ContentInfo b();

        int g();

        int m();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements e {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public f(C0599c c0599c) {
            ClipData clipData = c0599c.a;
            clipData.getClass();
            this.a = clipData;
            int i = c0599c.b;
            if (i >= 0) {
                if (i <= 5) {
                    this.b = i;
                    int i2 = c0599c.c;
                    if ((i2 & 1) == i2) {
                        this.c = i2;
                        this.d = c0599c.d;
                        this.e = c0599c.e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", FirebaseAnalytics.Param.SOURCE, 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", FirebaseAnalytics.Param.SOURCE, 0, 5));
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final ClipData a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final ContentInfo b() {
            return null;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final int g() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.p3.c.e
        public final int m() {
            return this.c;
        }

        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    str = String.valueOf(i);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb.append(str);
            sb.append(", flags=");
            int i2 = this.c;
            if ((i2 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i2);
            }
            sb.append(valueOf);
            String str3 = "";
            if (this.d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str2);
            if (this.e != null) {
                str3 = ", hasExtras";
            }
            return defpackage.b.c(sb, str3, "}");
        }
    }

    public c(e eVar) {
        this.a = eVar;
    }

    public final String toString() {
        return this.a.toString();
    }
}
