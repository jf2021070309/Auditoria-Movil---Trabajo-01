package com.amazon.aps.iva.js;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: PanelContextTypeProperty.kt */
/* loaded from: classes2.dex */
public enum v {
    SEARCH(FirebaseAnalytics.Event.SEARCH),
    BROWSE("browse"),
    GENRE_BROWSE("genreBrowse"),
    SUBGENRE_BROWSE("subgenreBrowse"),
    WATCHLIST("watchlist"),
    HISTORY("history"),
    SIMULCAST("simulcast");
    
    private final String value;

    v(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
