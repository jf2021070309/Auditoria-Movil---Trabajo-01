package com.amazon.aps.iva.au;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.du.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.List;
/* compiled from: CommentsAdapterDelegate.kt */
/* loaded from: classes2.dex */
public final class b {
    public final a a;
    public final EventDispatcher<com.amazon.aps.iva.du.f> b;
    public final e c;

    public b(a aVar, EventDispatcher eventDispatcher, f fVar) {
        j.f(aVar, "adapter");
        j.f(eventDispatcher, "eventDispatcher");
        j.f(fVar, "viewTypeProvider");
        this.a = aVar;
        this.b = eventDispatcher;
        this.c = fVar;
    }

    public static com.amazon.aps.iva.fu.a c(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        switch (i) {
            case 12004:
                Context context = viewGroup.getContext();
                j.e(context, "parent.context");
                return new com.amazon.aps.iva.fu.b(new com.amazon.aps.iva.du.d(context, null, 0));
            case 12005:
                Context context2 = viewGroup.getContext();
                j.e(context2, "parent.context");
                com.amazon.aps.iva.du.d dVar = new com.amazon.aps.iva.du.d(context2, null, 0);
                dVar.setAvatarSize(R.dimen.comments_list_item_small_avatar_size);
                return new com.amazon.aps.iva.fu.b(dVar);
            case 12006:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_comment_hard_deleted_item, viewGroup, false);
                j.e(inflate, "from(parent.context)\n   …eted_item, parent, false)");
                return new com.amazon.aps.iva.fu.c(inflate);
            default:
                Context context3 = viewGroup.getContext();
                j.e(context3, "parent.context");
                com.amazon.aps.iva.du.e eVar = new com.amazon.aps.iva.du.e(context3, null, 0);
                if (i == 12002) {
                    eVar.setAvatarSize(R.dimen.comments_list_item_small_avatar_size);
                }
                return new com.amazon.aps.iva.fu.d(eVar);
        }
    }

    public final void a(com.amazon.aps.iva.fu.a aVar, int i) {
        j.f(aVar, "holder");
        x item = this.a.getItem(i);
        if (item != null) {
            aVar.b1(item, this.b);
        }
    }

    public final void b(com.amazon.aps.iva.fu.a aVar, int i, List<Object> list, com.amazon.aps.iva.xb0.a<q> aVar2) {
        j.f(aVar, "holder");
        j.f(list, "payloads");
        x item = this.a.getItem(i);
        if ((aVar instanceof com.amazon.aps.iva.fu.d) && (!list.isEmpty()) && item != null) {
            for (Object obj : list) {
                if (obj == y.LIKE_BUTTON_CHANGE) {
                    com.amazon.aps.iva.du.e eVar = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar.getClass();
                    eVar.c.r6(item, true);
                } else if (obj == y.LIKES_COUNT_CHANGE) {
                    com.amazon.aps.iva.du.e eVar2 = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar2.getClass();
                    eVar2.c.r6(item, false);
                } else if (obj == y.REPLIES_COUNT_CHANGE) {
                    com.amazon.aps.iva.du.e eVar3 = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar3.getClass();
                    com.amazon.aps.iva.du.j jVar = eVar3.c;
                    jVar.c = item;
                    jVar.getView().J1(item.k);
                } else if (obj == y.CONTEXT_MENU_CHANGE) {
                    com.amazon.aps.iva.du.e eVar4 = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar4.getClass();
                    eVar4.c.s6(item);
                } else if (obj == y.SPOILER_STATE_CHANGE) {
                    com.amazon.aps.iva.fu.d dVar = (com.amazon.aps.iva.fu.d) aVar;
                    com.amazon.aps.iva.du.e eVar5 = dVar.b;
                    eVar5.getClass();
                    eVar5.c.u6(item);
                    com.amazon.aps.iva.du.e eVar6 = dVar.b;
                    eVar6.getClass();
                    eVar6.c.s6(item);
                } else if (obj == y.SPOILER_OVERLAY_VISIBILITY_CHANGE) {
                    com.amazon.aps.iva.du.e eVar7 = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar7.getClass();
                    eVar7.c.t6(item);
                } else if (obj == y.TEXT_STATE_CHANGE) {
                    com.amazon.aps.iva.du.e eVar8 = ((com.amazon.aps.iva.fu.d) aVar).b;
                    eVar8.getClass();
                    com.amazon.aps.iva.du.j jVar2 = eVar8.c;
                    jVar2.c = item;
                    jVar2.getView().c7(item.s);
                }
            }
            return;
        }
        aVar2.invoke();
    }
}
