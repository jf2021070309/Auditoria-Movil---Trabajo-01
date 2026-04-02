package com.amazon.aps.iva.ku;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentFlag;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPostBody;
import java.util.List;
import java.util.Locale;
/* compiled from: PostCommentInteractor.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.a implements h {
    public final TalkboxService b;
    public final com.amazon.aps.iva.xb0.a<Locale> c;

    public i(TalkboxService talkboxService, com.amazon.aps.iva.xb0.a<Locale> aVar) {
        this.b = talkboxService;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.ku.h
    public final Object r(String str, String str2, boolean z, String str3, com.amazon.aps.iva.ob0.d<? super Comment> dVar) {
        List list;
        if (z) {
            list = f1.J(CommentFlag.SPOILER);
        } else {
            list = z.b;
        }
        String languageTag = this.c.invoke().toLanguageTag();
        com.amazon.aps.iva.yb0.j.e(languageTag, "getLocale().toLanguageTag()");
        return this.b.postComment(str, new CommentPostBody(str2, languageTag, list, str3), dVar);
    }
}
