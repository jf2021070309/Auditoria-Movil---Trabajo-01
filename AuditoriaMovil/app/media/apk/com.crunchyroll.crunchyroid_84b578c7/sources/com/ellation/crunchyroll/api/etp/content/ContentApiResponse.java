package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContentApiResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u001fB'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0002\u0010\tJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000eJ@\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "D", "M", "", "data", "", "_total", "", "meta", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;)V", "Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "getMeta", "()Ljava/lang/Object;", "Ljava/lang/Object;", "total", "getTotal", "()I", "component1", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;)Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "equals", "", "other", "hashCode", "toString", "", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentApiResponse<D, M> {
    @SerializedName("total")
    private final Integer _total;
    @SerializedName("data")
    private final List<D> data;
    @SerializedName("meta")
    private final M meta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ContentApiResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\bJ3\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t0\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\t2\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t¢\u0006\u0002\u0010\u000bJ&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\fJ9\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t0\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\f2\u0006\u0010\n\u001a\u0002H\t¢\u0006\u0002\u0010\rJ.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\f2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "D", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "data", "(Ljava/lang/Object;)Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "M", "meta", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "", "(Ljava/util/List;Ljava/lang/Object;)Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "size", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final <D> ContentApiResponse<D, EmptyMeta> create(D d) {
            return new ContentApiResponse<>(f1.J(d), 1, EmptyMeta.INSTANCE);
        }

        public final <D, M> ContentApiResponse<D, M> create(D d, M m) {
            return new ContentApiResponse<>(f1.J(d), 1, m);
        }

        public final <D> ContentApiResponse<D, EmptyMeta> create(List<? extends D> list) {
            j.f(list, "data");
            return new ContentApiResponse<>(list, Integer.valueOf(list.size()), EmptyMeta.INSTANCE);
        }

        public final <D> ContentApiResponse<D, EmptyMeta> create(List<? extends D> list, int i) {
            j.f(list, "data");
            return new ContentApiResponse<>(list, Integer.valueOf(i), EmptyMeta.INSTANCE);
        }

        public final <D, M> ContentApiResponse<D, M> create(List<? extends D> list, M m) {
            j.f(list, "data");
            return new ContentApiResponse<>(list, Integer.valueOf(list.size()), m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentApiResponse(List<? extends D> list, Integer num, M m) {
        j.f(list, "data");
        this.data = list;
        this._total = num;
        this.meta = m;
    }

    private final Integer component2() {
        return this._total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentApiResponse copy$default(ContentApiResponse contentApiResponse, List list, Integer num, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = contentApiResponse.data;
        }
        if ((i & 2) != 0) {
            num = contentApiResponse._total;
        }
        if ((i & 4) != 0) {
            obj = contentApiResponse.meta;
        }
        return contentApiResponse.copy(list, num, obj);
    }

    public final List<D> component1() {
        return this.data;
    }

    public final M component3() {
        return this.meta;
    }

    public final ContentApiResponse<D, M> copy(List<? extends D> list, Integer num, M m) {
        j.f(list, "data");
        return new ContentApiResponse<>(list, num, m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentApiResponse)) {
            return false;
        }
        ContentApiResponse contentApiResponse = (ContentApiResponse) obj;
        if (j.a(this.data, contentApiResponse.data) && j.a(this._total, contentApiResponse._total) && j.a(this.meta, contentApiResponse.meta)) {
            return true;
        }
        return false;
    }

    public final List<D> getData() {
        return this.data;
    }

    public final M getMeta() {
        return this.meta;
    }

    public final int getTotal() {
        Integer num = this._total;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.data.hashCode() * 31;
        Integer num = this._total;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        M m = this.meta;
        if (m != null) {
            i = m.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        List<D> list = this.data;
        Integer num = this._total;
        M m = this.meta;
        return "ContentApiResponse(data=" + list + ", _total=" + num + ", meta=" + m + ")";
    }

    public /* synthetic */ ContentApiResponse(List list, Integer num, Object obj, int i, e eVar) {
        this(list, (i & 2) != 0 ? null : num, obj);
    }
}
