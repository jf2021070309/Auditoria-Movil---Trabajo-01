package com.amazon.aps.iva.js;
/* compiled from: SortProperties.kt */
/* loaded from: classes2.dex */
public enum i0 {
    DATE_ADDED_TO_FEED("DateAddedToFeed"),
    DATE_WATCHED("DateWatched"),
    DATE_CONTENT_UPDATED("DateContentUpdated"),
    ALPHABETICAL("Alphabetical");
    
    private final String value;

    i0(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
