package com.worldturner.medeia.types;

import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SingleOrList.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0003J2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/worldturner/medeia/types/SingleOrList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "single", "list", "", "(Ljava/lang/Object;Ljava/util/List;)V", "getList", "()Ljava/util/List;", "getSingle", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/worldturner/medeia/types/SingleOrList;", "equals", "", "other", "hashCode", "", "toString", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SingleOrList<T> {
    private final List<T> list;
    private final T single;

    public SingleOrList() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleOrList copy$default(SingleOrList singleOrList, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = singleOrList.single;
        }
        if ((i & 2) != 0) {
            list = singleOrList.list;
        }
        return singleOrList.copy(obj, list);
    }

    public final T component1() {
        return this.single;
    }

    public final List<T> component2() {
        return this.list;
    }

    public final SingleOrList<T> copy(T t, List<? extends T> list) {
        return new SingleOrList<>(t, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SingleOrList) {
                SingleOrList singleOrList = (SingleOrList) obj;
                if (!j.a(this.single, singleOrList.single) || !j.a(this.list, singleOrList.list)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final List<T> getList() {
        return this.list;
    }

    public final T getSingle() {
        return this.single;
    }

    public int hashCode() {
        int i;
        T t = this.single;
        int i2 = 0;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<T> list = this.list;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SingleOrList(single=");
        sb.append(this.single);
        sb.append(", list=");
        return a.b(sb, this.list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleOrList(T t, List<? extends T> list) {
        this.single = t;
        this.list = list;
    }

    public /* synthetic */ SingleOrList(Object obj, List list, int i, e eVar) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : list);
    }
}
