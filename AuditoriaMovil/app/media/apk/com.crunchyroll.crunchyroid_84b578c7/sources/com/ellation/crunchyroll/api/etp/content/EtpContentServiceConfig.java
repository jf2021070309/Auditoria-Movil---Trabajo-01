package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: EtpContentServiceConfig.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig;", "", "playheadsUploadBatchSize", "", "playheadsGetBatchSize", "(II)V", "getPlayheadsGetBatchSize", "()I", "getPlayheadsUploadBatchSize", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpContentServiceConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @SerializedName("playheads_get_batch_size")
    private final int playheadsGetBatchSize;
    @SerializedName("playheads_upload_batch_size")
    private final int playheadsUploadBatchSize;

    /* compiled from: EtpContentServiceConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig$Companion;", "", "()V", "get", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig;", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final EtpContentServiceConfig get() {
            int i = a.a;
            a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(EtpContentServiceConfig.class, "content_api_service");
                if (c != null) {
                    return (EtpContentServiceConfig) c;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig");
            }
            j.m("instance");
            throw null;
        }
    }

    public EtpContentServiceConfig(int i, int i2) {
        this.playheadsUploadBatchSize = i;
        this.playheadsGetBatchSize = i2;
    }

    public final int getPlayheadsGetBatchSize() {
        return this.playheadsGetBatchSize;
    }

    public final int getPlayheadsUploadBatchSize() {
        return this.playheadsUploadBatchSize;
    }
}
