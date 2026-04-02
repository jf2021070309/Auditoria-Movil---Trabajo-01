package com.amazon.aps.iva.dc;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.qn.d;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.ui.widget.TextAnnouncementCardView;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                TextAnnouncementCardView.c((TextAnnouncementCardView) obj2, (TextAnnouncementCard) obj, view);
                return;
            case 1:
                d.a aVar = (d.a) obj2;
                com.amazon.aps.iva.mn.b bVar = (com.amazon.aps.iva.mn.b) obj;
                int i2 = d.a.d;
                j.f(aVar, "this$0");
                j.f(bVar, "$filterOption");
                j.e(view, "it");
                aVar.c.invoke(bVar, r.p(view, null));
                return;
            case 2:
                p pVar = (p) obj2;
                CommentsInputLayout commentsInputLayout = (CommentsInputLayout) obj;
                int i3 = CommentsInputLayout.d;
                j.f(pVar, "$onPost");
                j.f(commentsInputLayout, "this$0");
                com.amazon.aps.iva.pu.j jVar = commentsInputLayout.b;
                pVar.invoke(String.valueOf(jVar.g.getText()), Boolean.valueOf(jVar.d.isChecked()));
                return;
            default:
                com.amazon.aps.iva.n00.b bVar2 = (com.amazon.aps.iva.n00.b) obj2;
                Season season = (Season) obj;
                l<Object>[] lVarArr = com.amazon.aps.iva.n00.b.f;
                j.f(bVar2, "this$0");
                j.f(season, "$season");
                bVar2.e.invoke(season);
                return;
        }
    }
}
