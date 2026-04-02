package com.crunchyroll.contentunavailable.fullscreen;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.c;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.e;
import com.crunchyroll.contentunavailable.ContentUnavailableLayout;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ContentUnavailableActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/contentunavailable/fullscreen/ContentUnavailableActivity;", "Lcom/amazon/aps/iva/wy/c;", "Lcom/amazon/aps/iva/yf/b;", "<init>", "()V", "content-unavailable_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContentUnavailableActivity extends c implements com.amazon.aps.iva.yf.b {
    public final m d = f.b(new a());
    public final e e = new e(this);
    public final com.amazon.aps.iva.yf.a f = new com.amazon.aps.iva.yf.a(this);

    /* compiled from: ContentUnavailableActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xf.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xf.a invoke() {
            View inflate = ContentUnavailableActivity.this.getLayoutInflater().inflate(R.layout.activity_content_unavailable, (ViewGroup) null, false);
            if (inflate != null) {
                ContentUnavailableLayout contentUnavailableLayout = (ContentUnavailableLayout) inflate;
                return new com.amazon.aps.iva.xf.a(contentUnavailableLayout, contentUnavailableLayout);
            }
            throw new NullPointerException("rootView");
        }
    }

    /* compiled from: ContentUnavailableActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ContentUnavailableActivity.this.f.getView().finish();
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m mVar = this.d;
        setContentView(((com.amazon.aps.iva.xf.a) mVar.getValue()).a);
        ContentUnavailableLayout contentUnavailableLayout = ((com.amazon.aps.iva.xf.a) mVar.getValue()).b;
        String stringExtra = getIntent().getStringExtra("media_id");
        j.c(stringExtra);
        contentUnavailableLayout.b1(stringExtra, new b());
        this.e.init();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.f);
    }

    @Override // com.amazon.aps.iva.wy.c
    public final void d() {
    }
}
