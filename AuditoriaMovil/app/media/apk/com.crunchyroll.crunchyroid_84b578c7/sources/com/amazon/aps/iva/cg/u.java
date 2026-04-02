package com.amazon.aps.iva.cg;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public interface u {

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public enum a {
        HOME,
        WATCHLIST,
        WATCH_SCREEN,
        SHOW_PAGE,
        SEASON,
        SEARCH,
        UPSELL_MENU,
        SIGN_UP,
        SIGN_IN,
        OFFLINE_LIBRARY,
        SIMULCAST,
        SETTINGS,
        CRUNCHYLIST,
        BROWSE,
        NONE,
        ARTIST_SCREEN,
        WATCH_MUSIC_SCREEN,
        UPGRADE_MENU
    }

    a a();

    com.amazon.aps.iva.dg.a getUri();
}
