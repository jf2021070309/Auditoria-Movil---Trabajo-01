package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CommentFlagUpdateBody.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlagUpdateBody;", "", "add", "", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlag;", "remove", "(Ljava/util/List;Ljava/util/List;)V", "getAdd", "()Ljava/util/List;", "getRemove", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFlagUpdateBody {
    public static final int $stable = 8;
    @SerializedName("add")
    private final List<CommentFlag> add;
    @SerializedName("remove")
    private final List<CommentFlag> remove;

    public CommentFlagUpdateBody() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentFlagUpdateBody copy$default(CommentFlagUpdateBody commentFlagUpdateBody, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commentFlagUpdateBody.add;
        }
        if ((i & 2) != 0) {
            list2 = commentFlagUpdateBody.remove;
        }
        return commentFlagUpdateBody.copy(list, list2);
    }

    public final List<CommentFlag> component1() {
        return this.add;
    }

    public final List<CommentFlag> component2() {
        return this.remove;
    }

    public final CommentFlagUpdateBody copy(List<? extends CommentFlag> list, List<? extends CommentFlag> list2) {
        j.f(list, "add");
        j.f(list2, "remove");
        return new CommentFlagUpdateBody(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentFlagUpdateBody)) {
            return false;
        }
        CommentFlagUpdateBody commentFlagUpdateBody = (CommentFlagUpdateBody) obj;
        if (j.a(this.add, commentFlagUpdateBody.add) && j.a(this.remove, commentFlagUpdateBody.remove)) {
            return true;
        }
        return false;
    }

    public final List<CommentFlag> getAdd() {
        return this.add;
    }

    public final List<CommentFlag> getRemove() {
        return this.remove;
    }

    public int hashCode() {
        return this.remove.hashCode() + (this.add.hashCode() * 31);
    }

    public String toString() {
        List<CommentFlag> list = this.add;
        List<CommentFlag> list2 = this.remove;
        return "CommentFlagUpdateBody(add=" + list + ", remove=" + list2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentFlagUpdateBody(List<? extends CommentFlag> list, List<? extends CommentFlag> list2) {
        j.f(list, "add");
        j.f(list2, "remove");
        this.add = list;
        this.remove = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CommentFlagUpdateBody(java.util.List r2, java.util.List r3, int r4, com.amazon.aps.iva.yb0.e r5) {
        /*
            r1 = this;
            r5 = r4 & 1
            com.amazon.aps.iva.lb0.z r0 = com.amazon.aps.iva.lb0.z.b
            if (r5 == 0) goto L7
            r2 = r0
        L7:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r3 = r0
        Lc:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.commenting.model.CommentFlagUpdateBody.<init>(java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }
}
