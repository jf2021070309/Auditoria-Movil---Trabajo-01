package com.amazon.aps.iva.yt;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: CommentsInputPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<ProfileApiModel, q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(ProfileApiModel profileApiModel) {
        boolean z;
        String str;
        String str2;
        ProfileApiModel profileApiModel2 = profileApiModel;
        h hVar = this.h;
        String v = hVar.c.v();
        boolean z2 = false;
        if (v != null && v.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            hVar.getView().w7();
        } else {
            hVar.getView().S(v);
        }
        if (profileApiModel2 != null) {
            str = profileApiModel2.getUsername();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            i view = hVar.getView();
            a aVar = hVar.d;
            if (aVar != null) {
                view.setNoUsernameHint(aVar.b);
            } else {
                j.m("commentsInputUiModel");
                throw null;
            }
        } else {
            i view2 = hVar.getView();
            a aVar2 = hVar.d;
            if (aVar2 != null) {
                view2.U9(aVar2.c, str);
            } else {
                j.m("commentsInputUiModel");
                throw null;
            }
        }
        a aVar3 = hVar.d;
        if (aVar3 != null) {
            com.amazon.aps.iva.su.a a = aVar3.a();
            if (a != null && (str2 = a.c) != null) {
                hVar.getView().setInputText(str2);
            }
            return q.a;
        }
        j.m("commentsInputUiModel");
        throw null;
    }
}
