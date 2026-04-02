package com.kwad.sdk.contentalliance.a.a;

import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.VideoPlayerStatus;
/* loaded from: classes.dex */
public final class b {
    public AdTemplate adTemplate;
    public com.kwad.sdk.contentalliance.a.a.a akf;
    public boolean isNoCache;
    public String manifest;
    public VideoPlayerStatus videoPlayerStatus;
    public String videoUrl;

    /* loaded from: classes.dex */
    public static class a {
        private AdTemplate adTemplate;
        private com.kwad.sdk.contentalliance.a.a.a akf;
        private boolean isNoCache = false;
        private String manifest;
        private VideoPlayerStatus videoPlayerStatus;
        private String videoUrl;

        public a(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
        }

        public a(String str) {
            this.videoUrl = str;
        }

        public final a a(VideoPlayerStatus videoPlayerStatus) {
            this.videoPlayerStatus = videoPlayerStatus;
            return this;
        }

        public final a b(com.kwad.sdk.contentalliance.a.a.a aVar) {
            this.akf = aVar;
            return this;
        }

        public final a bd(boolean z) {
            this.isNoCache = z;
            return this;
        }

        public final a cm(String str) {
            this.videoUrl = str;
            return this;
        }

        public final a cn(String str) {
            this.manifest = str;
            return this;
        }

        public final b yP() {
            return new b(this, (byte) 0);
        }
    }

    private b(a aVar) {
        this.akf = new com.kwad.sdk.contentalliance.a.a.a();
        this.isNoCache = false;
        this.adTemplate = aVar.adTemplate;
        this.videoUrl = aVar.videoUrl;
        this.manifest = aVar.manifest;
        this.videoPlayerStatus = aVar.videoPlayerStatus;
        if (aVar.akf != null) {
            this.akf.photoId = aVar.akf.photoId;
            this.akf.clickTime = aVar.akf.clickTime;
            this.akf.adStyle = aVar.akf.adStyle;
            this.akf.contentType = aVar.akf.contentType;
        }
        this.isNoCache = aVar.isNoCache;
    }

    /* synthetic */ b(a aVar, byte b) {
        this(aVar);
    }
}
