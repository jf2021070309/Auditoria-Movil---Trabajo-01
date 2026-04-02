package c.i.k.m0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class e {
    public final c a;

    /* loaded from: classes.dex */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // c.i.k.m0.e.c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override // c.i.k.m0.e.c
        public void b() {
            this.a.requestPermission();
        }

        @Override // c.i.k.m0.e.c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override // c.i.k.m0.e.c
        public Object d() {
            return this.a;
        }

        @Override // c.i.k.m0.e.c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final Uri a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f2208b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f2209c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.f2208b = clipDescription;
            this.f2209c = uri2;
        }

        @Override // c.i.k.m0.e.c
        public Uri a() {
            return this.a;
        }

        @Override // c.i.k.m0.e.c
        public void b() {
        }

        @Override // c.i.k.m0.e.c
        public Uri c() {
            return this.f2209c;
        }

        @Override // c.i.k.m0.e.c
        public Object d() {
            return null;
        }

        @Override // c.i.k.m0.e.c
        public ClipDescription getDescription() {
            return this.f2208b;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public e(c cVar) {
        this.a = cVar;
    }
}
