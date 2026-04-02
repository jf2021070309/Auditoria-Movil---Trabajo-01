package com.ellation.crunchyroll.commenting.entrypoint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.hf.b;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.nu.g;
import com.amazon.aps.iva.nu.i;
import com.amazon.aps.iva.qu.c;
import com.amazon.aps.iva.qu.d;
import com.amazon.aps.iva.qu.e;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.commenting.commentscount.CommentsCountLayout;
import kotlin.Metadata;
/* compiled from: CommentsEntryPoint.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/commenting/entrypoint/CommentsEntryPoint;", "Lcom/amazon/aps/iva/hf/b;", "Lcom/amazon/aps/iva/qu/e;", "Lcom/amazon/aps/iva/qu/c;", "e", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/qu/c;", "presenter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentsEntryPoint extends b implements e {
    public final com.amazon.aps.iva.mj.a b;
    public int c;
    public FragmentManager d;
    public final m e;

    /* compiled from: CommentsEntryPoint.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<c> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c invoke() {
            Context context = this.i;
            j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            CommentsEntryPoint commentsEntryPoint = CommentsEntryPoint.this;
            j.f(commentsEntryPoint, "view");
            d dVar = new d(commentsEntryPoint, (g) com.amazon.aps.iva.ez.l.a((h) context, i.class, com.ellation.crunchyroll.commenting.entrypoint.a.h));
            com.ellation.crunchyroll.mvp.lifecycle.a.b(dVar, commentsEntryPoint);
            return dVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsEntryPoint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void U2(CommentsEntryPoint commentsEntryPoint) {
        j.f(commentsEntryPoint, "this$0");
        commentsEntryPoint.getPresenter().h();
    }

    private final c getPresenter() {
        return (c) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.hf.b
    public final void b1(FragmentManager fragmentManager, String str) {
        j.f(str, "mediaId");
        this.d = fragmentManager;
        this.c = R.id.comments_container;
        getPresenter().v(str);
        setOnClickListener(new r(this, 10));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.qu.e
    public final void n2(com.amazon.aps.iva.ez.g<Integer> gVar) {
        j.f(gVar, "commentsCount");
        ((CommentsCountLayout) this.b.c).b1(gVar);
    }

    @Override // com.amazon.aps.iva.qu.e
    public final void u6(String str) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager != null) {
            int i = this.c;
            com.amazon.aps.iva.vt.c cVar = new com.amazon.aps.iva.vt.c(str);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.d = 17498112;
            aVar.e = 17498113;
            aVar.f = 17498112;
            aVar.g = 17498113;
            com.amazon.aps.iva.vt.b.m.getClass();
            com.amazon.aps.iva.vt.b bVar = new com.amazon.aps.iva.vt.b();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = com.amazon.aps.iva.vt.b.n;
            bVar.f.b(bVar, lVarArr[2], cVar);
            bVar.e.b(bVar, lVarArr[1], Integer.valueOf(i));
            aVar.d(i, bVar, "comments", 1);
            aVar.c("comments");
            aVar.h();
            return;
        }
        j.m("fragmentManager");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsEntryPoint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comments_entry_point, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.comments_count;
        CommentsCountLayout commentsCountLayout = (CommentsCountLayout) z.u(R.id.comments_count, inflate);
        if (commentsCountLayout != null) {
            i2 = R.id.icon_comments;
            ImageView imageView = (ImageView) z.u(R.id.icon_comments, inflate);
            if (imageView != null) {
                this.b = new com.amazon.aps.iva.mj.a((ConstraintLayout) inflate, commentsCountLayout, imageView, 1);
                this.e = f.b(new a(context));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
