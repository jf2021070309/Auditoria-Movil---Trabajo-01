package com.amazon.aps.iva.ku;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.x50.q;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.Locale;
/* compiled from: PostCommentModule.kt */
/* loaded from: classes2.dex */
public final class q implements j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] j = {com.amazon.aps.iva.k.q.a(q.class, "postCommentViewModel", "getPostCommentViewModel()Lcom/ellation/crunchyroll/commenting/comments/post/PostCommentViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(q.class, "localCommentsViewModel", "getLocalCommentsViewModel()Lcom/ellation/crunchyroll/commenting/comments/localcomments/LocalCommentsViewModelImpl;", 0)};
    public final e a;
    public final String b;
    public final String c;
    public final TalkboxService d;
    public final com.amazon.aps.iva.xb0.a<Locale> e;
    public final com.amazon.aps.iva.ff.b f;
    public final v g;
    public final androidx.appcompat.app.e h;
    public final com.amazon.aps.iva.kb0.m i;

    public q(e eVar, com.amazon.aps.iva.pm.b bVar, String str, String str2, String str3, TalkboxService talkboxService, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "userAssetsProvider");
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        com.amazon.aps.iva.yb0.j.f(aVar, "getLocale");
        this.a = eVar;
        this.b = str;
        this.c = str2;
        this.d = talkboxService;
        this.e = aVar;
        androidx.fragment.app.h requireActivity = eVar.requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.crunchyroll.commenting.CurrentAssetProvider");
        com.amazon.aps.iva.ff.b bVar2 = (com.amazon.aps.iva.ff.b) requireActivity;
        this.f = bVar2;
        com.amazon.aps.iva.ez.f fVar = new com.amazon.aps.iva.ez.f(eVar, y.class, new p(this));
        Fragment C = eVar.getParentFragmentManager().C(str3);
        com.amazon.aps.iva.yb0.j.c(C);
        com.amazon.aps.iva.ez.f fVar2 = new com.amazon.aps.iva.ez.f(C, com.amazon.aps.iva.hu.h.class, o.h);
        LiveData<PlayableAsset> currentAsset = bVar2.getCurrentAsset();
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = j;
        y yVar = (y) fVar.getValue(this, lVarArr[0]);
        com.amazon.aps.iva.hu.h hVar = (com.amazon.aps.iva.hu.h) fVar2.getValue(this, lVarArr[1]);
        Context requireContext = eVar.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "dialog.requireContext()");
        if (q.a.a == null) {
            q.a.a = new com.amazon.aps.iva.x50.r(requireContext);
        }
        com.amazon.aps.iva.x50.r rVar = q.a.a;
        com.amazon.aps.iva.yb0.j.c(rVar);
        Context requireContext2 = eVar.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext2, "dialog.requireContext()");
        boolean c = com.amazon.aps.iva.aq.k.n(requireContext2).c();
        com.amazon.aps.iva.yb0.j.f(currentAsset, "currentAsset");
        this.g = new v(eVar, str, currentAsset, yVar, hVar, bVar, rVar, c);
        androidx.appcompat.app.e create = new MaterialAlertDialogBuilder(eVar.requireContext()).setMessage(R.string.commenting_discard_comment_prompt).setPositiveButton(R.string.commenting_keep_writing, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.commenting_discard, (DialogInterface.OnClickListener) new k()).create();
        com.amazon.aps.iva.yb0.j.e(create, "MaterialAlertDialogBuild…iss() }\n        .create()");
        this.h = create;
        this.i = com.amazon.aps.iva.kb0.f.b(new n(this));
        com.amazon.aps.iva.yb0.j.e(eVar.requireActivity(), "dialog.requireActivity()");
    }

    @Override // com.amazon.aps.iva.ku.j
    public final androidx.appcompat.app.e a() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ku.j
    public final a b() {
        return (a) this.i.getValue();
    }

    @Override // com.amazon.aps.iva.ku.j
    public final v getPresenter() {
        return this.g;
    }
}
