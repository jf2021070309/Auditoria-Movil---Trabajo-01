package com.ellation.crunchyroll.api.etp.playback.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SkipEvents.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvents;", "", "mediaId", "", "intro", "Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;", "credits", "preview", "recap", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;)V", "getCredits", "()Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;", "getIntro", "getMediaId", "()Ljava/lang/String;", "getPreview", "getRecap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkipEvents {
    public static final int $stable = 0;
    @SerializedName("credits")
    private final SkipEvent credits;
    @SerializedName("intro")
    private final SkipEvent intro;
    @SerializedName("mediaId")
    private final String mediaId;
    @SerializedName("preview")
    private final SkipEvent preview;
    @SerializedName("recap")
    private final SkipEvent recap;

    public SkipEvents(String str, SkipEvent skipEvent, SkipEvent skipEvent2, SkipEvent skipEvent3, SkipEvent skipEvent4) {
        j.f(str, "mediaId");
        this.mediaId = str;
        this.intro = skipEvent;
        this.credits = skipEvent2;
        this.preview = skipEvent3;
        this.recap = skipEvent4;
    }

    public static /* synthetic */ SkipEvents copy$default(SkipEvents skipEvents, String str, SkipEvent skipEvent, SkipEvent skipEvent2, SkipEvent skipEvent3, SkipEvent skipEvent4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skipEvents.mediaId;
        }
        if ((i & 2) != 0) {
            skipEvent = skipEvents.intro;
        }
        SkipEvent skipEvent5 = skipEvent;
        if ((i & 4) != 0) {
            skipEvent2 = skipEvents.credits;
        }
        SkipEvent skipEvent6 = skipEvent2;
        if ((i & 8) != 0) {
            skipEvent3 = skipEvents.preview;
        }
        SkipEvent skipEvent7 = skipEvent3;
        if ((i & 16) != 0) {
            skipEvent4 = skipEvents.recap;
        }
        return skipEvents.copy(str, skipEvent5, skipEvent6, skipEvent7, skipEvent4);
    }

    public final String component1() {
        return this.mediaId;
    }

    public final SkipEvent component2() {
        return this.intro;
    }

    public final SkipEvent component3() {
        return this.credits;
    }

    public final SkipEvent component4() {
        return this.preview;
    }

    public final SkipEvent component5() {
        return this.recap;
    }

    public final SkipEvents copy(String str, SkipEvent skipEvent, SkipEvent skipEvent2, SkipEvent skipEvent3, SkipEvent skipEvent4) {
        j.f(str, "mediaId");
        return new SkipEvents(str, skipEvent, skipEvent2, skipEvent3, skipEvent4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipEvents)) {
            return false;
        }
        SkipEvents skipEvents = (SkipEvents) obj;
        if (j.a(this.mediaId, skipEvents.mediaId) && j.a(this.intro, skipEvents.intro) && j.a(this.credits, skipEvents.credits) && j.a(this.preview, skipEvents.preview) && j.a(this.recap, skipEvents.recap)) {
            return true;
        }
        return false;
    }

    public final SkipEvent getCredits() {
        return this.credits;
    }

    public final SkipEvent getIntro() {
        return this.intro;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final SkipEvent getPreview() {
        return this.preview;
    }

    public final SkipEvent getRecap() {
        return this.recap;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.mediaId.hashCode() * 31;
        SkipEvent skipEvent = this.intro;
        int i = 0;
        if (skipEvent == null) {
            hashCode = 0;
        } else {
            hashCode = skipEvent.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        SkipEvent skipEvent2 = this.credits;
        if (skipEvent2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = skipEvent2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SkipEvent skipEvent3 = this.preview;
        if (skipEvent3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = skipEvent3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SkipEvent skipEvent4 = this.recap;
        if (skipEvent4 != null) {
            i = skipEvent4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.mediaId;
        SkipEvent skipEvent = this.intro;
        SkipEvent skipEvent2 = this.credits;
        SkipEvent skipEvent3 = this.preview;
        SkipEvent skipEvent4 = this.recap;
        return "SkipEvents(mediaId=" + str + ", intro=" + skipEvent + ", credits=" + skipEvent2 + ", preview=" + skipEvent3 + ", recap=" + skipEvent4 + ")";
    }
}
