package com.amazon.aps.iva.ut;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.bx.e;
import com.amazon.aps.iva.fm.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.commenting.commentscount.compact.CommentsCountCompactLayout;
import java.util.Locale;
/* compiled from: CommentingFeatureImpl.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ff.a, b, com.amazon.aps.iva.ut.a {
    public static b f;
    public static com.amazon.aps.iva.ut.a g;
    public static com.amazon.aps.iva.iu.c h;
    public final TalkboxService a;
    public final com.amazon.aps.iva.xb0.a<Locale> b;
    public final com.amazon.aps.iva.pm.a c;
    public final l<Fragment, com.amazon.aps.iva.iu.a> d;
    public final l<Fragment, com.amazon.aps.iva.lu.b> e;

    /* compiled from: CommentingFeatureImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.hf.a {
        @Override // com.amazon.aps.iva.hf.a
        public final void Oa(com.amazon.aps.iva.xb0.a<q> aVar) {
            aVar.invoke();
        }
    }

    public c(TalkboxService talkboxService, com.amazon.aps.iva.bx.a aVar, g gVar, com.amazon.aps.iva.bx.c cVar, e eVar) {
        this.a = talkboxService;
        this.b = aVar;
        this.c = gVar;
        this.d = cVar;
        this.e = eVar;
    }

    @Override // com.amazon.aps.iva.ff.a, com.amazon.aps.iva.ut.a
    public final com.amazon.aps.iva.hf.a a(FragmentManager fragmentManager) {
        com.amazon.aps.iva.ku.e k = r.k(fragmentManager);
        if (k == null) {
            return new a();
        }
        return k;
    }

    @Override // com.amazon.aps.iva.ut.b
    public final com.amazon.aps.iva.pm.a b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ut.b
    public final l<Fragment, com.amazon.aps.iva.lu.b> c() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ut.b
    public final l<Fragment, com.amazon.aps.iva.iu.a> d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ff.a
    public final boolean e(FragmentManager fragmentManager) {
        if (fragmentManager.C("comments") != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ff.a
    public final CommentsCountCompactLayout f(ViewGroup viewGroup) {
        j.f(viewGroup, "view");
        Context context = viewGroup.getContext();
        j.e(context, "view.context");
        CommentsCountCompactLayout commentsCountCompactLayout = new CommentsCountCompactLayout(context, null, 6, 0);
        viewGroup.addView(commentsCountCompactLayout);
        return commentsCountCompactLayout;
    }

    @Override // com.amazon.aps.iva.ff.a
    public final void g(FragmentManager fragmentManager) {
        Dialog dialog;
        com.amazon.aps.iva.ku.e k = r.k(fragmentManager);
        if (k != null && (dialog = k.getDialog()) != null) {
            dialog.show();
        }
    }

    @Override // com.amazon.aps.iva.ut.b
    public final com.amazon.aps.iva.xb0.a<Locale> getGetLocale() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ut.b
    public final TalkboxService getTalkboxService() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ff.a
    public final void h(FragmentManager fragmentManager) {
        Dialog dialog;
        com.amazon.aps.iva.ku.e k = r.k(fragmentManager);
        if (k != null && (dialog = k.getDialog()) != null) {
            dialog.hide();
        }
    }

    public final com.amazon.aps.iva.iu.c i() {
        com.amazon.aps.iva.iu.c cVar = h;
        if (cVar != null) {
            return cVar;
        }
        j.m("pendingStateHandler");
        throw null;
    }
}
