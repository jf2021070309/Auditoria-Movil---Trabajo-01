package com.amazon.aps.iva.no;
/* compiled from: WatchScreenSessionOrigin.kt */
/* loaded from: classes2.dex */
public enum a {
    SHOW_WATCH_BUTTON("showWatchButton"),
    SHOW_ITEM("showItem"),
    HOME_WATCH_BUTTON("homeWatchButton"),
    HOME_WATCHLIST_ITEM("homeWatchlistItem"),
    HOME_CONTINUE_WATCHING_ITEM("homeContinueWatchingItem"),
    SEARCH_ITEM("searchItem"),
    HISTORY_ITEM("historyItem"),
    WATCHLIST_ITEM("watchlistItem"),
    OVERFLOW_WATCH_NOW("overflowWatchNow"),
    VIDEO_SKIP_TO_NEXT("videoSkipToNext"),
    WATCH_SCREEN_SKIP_TO_NEXT("watchpageSkipToNext"),
    MATURE_WALL("matureWall"),
    PAY_WALL("payWall"),
    DEEP_LINK("deepLink");
    
    public static final C0544a Companion = new C0544a();
    private final String value;

    /* compiled from: WatchScreenSessionOrigin.kt */
    /* renamed from: com.amazon.aps.iva.no.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0544a {
    }

    a(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
