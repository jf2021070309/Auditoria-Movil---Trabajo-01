package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CommentPreview.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fixFirstPageTotalCount", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPreview;", "page", "", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentPreviewKt {
    public static final CommentPreview fixFirstPageTotalCount(CommentPreview commentPreview, int i) {
        int max;
        j.f(commentPreview, "<this>");
        if (i == 1 && commentPreview.getComments().isEmpty()) {
            max = 0;
        } else {
            max = Math.max(commentPreview.getTotal(), commentPreview.getComments().size());
        }
        return CommentPreview.copy$default(commentPreview, null, max, 1, null);
    }
}
