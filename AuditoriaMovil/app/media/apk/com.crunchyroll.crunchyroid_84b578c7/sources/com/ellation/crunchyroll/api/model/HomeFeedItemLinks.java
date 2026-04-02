package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: HomeFeedItemRaw.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks;", "", "resource", "Lcom/ellation/crunchyroll/api/model/Href;", "(Lcom/ellation/crunchyroll/api/model/Href;)V", "getResource", "()Lcom/ellation/crunchyroll/api/model/Href;", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeFeedItemLinks {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @SerializedName("resource")
    private final Href resource;

    /* compiled from: HomeFeedItemRaw.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemLinks;", ImagesContract.URL, "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final HomeFeedItemLinks create(String str) {
            j.f(str, ImagesContract.URL);
            return new HomeFeedItemLinks(new Href(str));
        }
    }

    public HomeFeedItemLinks(Href href) {
        this.resource = href;
    }

    public final Href getResource() {
        return this.resource;
    }
}
