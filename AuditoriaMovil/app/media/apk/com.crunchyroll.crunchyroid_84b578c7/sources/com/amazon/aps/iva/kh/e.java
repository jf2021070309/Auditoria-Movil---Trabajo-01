package com.amazon.aps.iva.kh;

import java.util.List;
/* compiled from: AudioLanguageOptionsProvider.kt */
/* loaded from: classes.dex */
public interface e {
    List<com.amazon.aps.iva.jh.f> getOptions();

    String getSupportedAudioLanguageTag(String str);

    String getTitleForLanguage(String str);

    String getTruncatedTitleForLanguage(String str);
}
