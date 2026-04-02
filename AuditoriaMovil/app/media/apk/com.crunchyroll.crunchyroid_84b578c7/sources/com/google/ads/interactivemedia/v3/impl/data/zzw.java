package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.n4.a;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.zzeb;
import com.google.ads.interactivemedia.v3.internal.zzef;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzeh;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzsr;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzw extends zzba {
    private final zzsr<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final zzsr<String, String> companionSlots;
    private final zzaw consentSettings;
    private final Float contentDuration;
    private final zzso<String> contentKeywords;
    private final String contentSourceId;
    private final String contentSourceUrl;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final Boolean enableNonce;
    private final String env;
    private final zzsr<String, String> extraParameters;
    private final String format;
    private final zzbc identifierInfo;
    private final Boolean isAndroidTvAdsFramework;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final zzeb marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final zzsr<String, String> platformSignals;
    private final String projectNumber;
    private final String region;
    private final zzso<zzbo> secureSignals;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final zzeg videoContinuousPlay;
    private final zzbu videoEnvironment;
    private final String videoId;
    private final zzef videoPlayActivation;
    private final zzeh videoPlayMuted;

    private zzw(zzsr<String, String> zzsrVar, String str, String str2, String str3, String str4, String str5, zzsr<String, String> zzsrVar2, Float f, zzso<String> zzsoVar, String str6, String str7, String str8, String str9, zzaw zzawVar, String str10, Boolean bool, String str11, zzso<zzbo> zzsoVar2, zzsr<String, String> zzsrVar3, String str12, zzbc zzbcVar, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str13, Float f2, zzeb zzebVar, String str14, String str15, zzbu zzbuVar, String str16, String str17, Boolean bool4, zzsr<String, String> zzsrVar4, String str18, String str19, ImaSdkSettings imaSdkSettings, Boolean bool5, Boolean bool6, Boolean bool7, String str20, Boolean bool8, Boolean bool9, Boolean bool10, Float f3, String str21, zzef zzefVar, zzeg zzegVar, zzeh zzehVar) {
        this.adTagParameters = zzsrVar;
        this.adTagUrl = str;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = zzsrVar2;
        this.contentDuration = f;
        this.contentKeywords = zzsoVar;
        this.contentSourceUrl = str6;
        this.contentTitle = str7;
        this.contentUrl = str8;
        this.contentSourceId = str9;
        this.consentSettings = zzawVar;
        this.customAssetKey = str10;
        this.enableNonce = bool;
        this.env = str11;
        this.secureSignals = zzsoVar2;
        this.extraParameters = zzsrVar3;
        this.format = str12;
        this.identifierInfo = zzbcVar;
        this.isTv = bool2;
        this.isAndroidTvAdsFramework = bool3;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamEventId = str13;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = zzebVar;
        this.msParameter = str14;
        this.network = str15;
        this.videoEnvironment = zzbuVar;
        this.networkCode = str16;
        this.oAuthToken = str17;
        this.omidAdSessionsOnStartedOnly = bool4;
        this.platformSignals = zzsrVar4;
        this.projectNumber = str18;
        this.region = str19;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool5;
        this.supportsIconClickFallback = bool6;
        this.supportsNativeNetworking = bool7;
        this.streamActivityMonitorId = str20;
        this.supportsResizing = bool8;
        this.useQAStreamBaseUrl = bool9;
        this.usesCustomVideoPlayback = bool10;
        this.vastLoadTimeout = f3;
        this.videoId = str21;
        this.videoPlayActivation = zzefVar;
        this.videoContinuousPlay = zzegVar;
        this.videoPlayMuted = zzehVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzaw consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzso<String> contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentSourceUrl() {
        return this.contentSourceUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            zzsr<String, String> zzsrVar = this.adTagParameters;
            if (zzsrVar != null ? zzsrVar.equals(zzbaVar.adTagParameters()) : zzbaVar.adTagParameters() == null) {
                String str = this.adTagUrl;
                if (str != null ? str.equals(zzbaVar.adTagUrl()) : zzbaVar.adTagUrl() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(zzbaVar.adsResponse()) : zzbaVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(zzbaVar.apiKey()) : zzbaVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(zzbaVar.assetKey()) : zzbaVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(zzbaVar.authToken()) : zzbaVar.authToken() == null) {
                                    zzsr<String, String> zzsrVar2 = this.companionSlots;
                                    if (zzsrVar2 != null ? zzsrVar2.equals(zzbaVar.companionSlots()) : zzbaVar.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(zzbaVar.contentDuration()) : zzbaVar.contentDuration() == null) {
                                            zzso<String> zzsoVar = this.contentKeywords;
                                            if (zzsoVar != null ? zzsoVar.equals(zzbaVar.contentKeywords()) : zzbaVar.contentKeywords() == null) {
                                                String str6 = this.contentSourceUrl;
                                                if (str6 != null ? str6.equals(zzbaVar.contentSourceUrl()) : zzbaVar.contentSourceUrl() == null) {
                                                    String str7 = this.contentTitle;
                                                    if (str7 != null ? str7.equals(zzbaVar.contentTitle()) : zzbaVar.contentTitle() == null) {
                                                        String str8 = this.contentUrl;
                                                        if (str8 != null ? str8.equals(zzbaVar.contentUrl()) : zzbaVar.contentUrl() == null) {
                                                            String str9 = this.contentSourceId;
                                                            if (str9 != null ? str9.equals(zzbaVar.contentSourceId()) : zzbaVar.contentSourceId() == null) {
                                                                zzaw zzawVar = this.consentSettings;
                                                                if (zzawVar != null ? zzawVar.equals(zzbaVar.consentSettings()) : zzbaVar.consentSettings() == null) {
                                                                    String str10 = this.customAssetKey;
                                                                    if (str10 != null ? str10.equals(zzbaVar.customAssetKey()) : zzbaVar.customAssetKey() == null) {
                                                                        Boolean bool = this.enableNonce;
                                                                        if (bool != null ? bool.equals(zzbaVar.enableNonce()) : zzbaVar.enableNonce() == null) {
                                                                            String str11 = this.env;
                                                                            if (str11 != null ? str11.equals(zzbaVar.env()) : zzbaVar.env() == null) {
                                                                                zzso<zzbo> zzsoVar2 = this.secureSignals;
                                                                                if (zzsoVar2 != null ? zzsoVar2.equals(zzbaVar.secureSignals()) : zzbaVar.secureSignals() == null) {
                                                                                    zzsr<String, String> zzsrVar3 = this.extraParameters;
                                                                                    if (zzsrVar3 != null ? zzsrVar3.equals(zzbaVar.extraParameters()) : zzbaVar.extraParameters() == null) {
                                                                                        String str12 = this.format;
                                                                                        if (str12 != null ? str12.equals(zzbaVar.format()) : zzbaVar.format() == null) {
                                                                                            zzbc zzbcVar = this.identifierInfo;
                                                                                            if (zzbcVar != null ? zzbcVar.equals(zzbaVar.identifierInfo()) : zzbaVar.identifierInfo() == null) {
                                                                                                Boolean bool2 = this.isTv;
                                                                                                if (bool2 != null ? bool2.equals(zzbaVar.isTv()) : zzbaVar.isTv() == null) {
                                                                                                    Boolean bool3 = this.isAndroidTvAdsFramework;
                                                                                                    if (bool3 != null ? bool3.equals(zzbaVar.isAndroidTvAdsFramework()) : zzbaVar.isAndroidTvAdsFramework() == null) {
                                                                                                        Integer num = this.linearAdSlotWidth;
                                                                                                        if (num != null ? num.equals(zzbaVar.linearAdSlotWidth()) : zzbaVar.linearAdSlotWidth() == null) {
                                                                                                            Integer num2 = this.linearAdSlotHeight;
                                                                                                            if (num2 != null ? num2.equals(zzbaVar.linearAdSlotHeight()) : zzbaVar.linearAdSlotHeight() == null) {
                                                                                                                String str13 = this.liveStreamEventId;
                                                                                                                if (str13 != null ? str13.equals(zzbaVar.liveStreamEventId()) : zzbaVar.liveStreamEventId() == null) {
                                                                                                                    Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                                    if (f2 != null ? f2.equals(zzbaVar.liveStreamPrefetchSeconds()) : zzbaVar.liveStreamPrefetchSeconds() == null) {
                                                                                                                        zzeb zzebVar = this.marketAppInfo;
                                                                                                                        if (zzebVar != null ? zzebVar.equals(zzbaVar.marketAppInfo()) : zzbaVar.marketAppInfo() == null) {
                                                                                                                            String str14 = this.msParameter;
                                                                                                                            if (str14 != null ? str14.equals(zzbaVar.msParameter()) : zzbaVar.msParameter() == null) {
                                                                                                                                String str15 = this.network;
                                                                                                                                if (str15 != null ? str15.equals(zzbaVar.network()) : zzbaVar.network() == null) {
                                                                                                                                    zzbu zzbuVar = this.videoEnvironment;
                                                                                                                                    if (zzbuVar != null ? zzbuVar.equals(zzbaVar.videoEnvironment()) : zzbaVar.videoEnvironment() == null) {
                                                                                                                                        String str16 = this.networkCode;
                                                                                                                                        if (str16 != null ? str16.equals(zzbaVar.networkCode()) : zzbaVar.networkCode() == null) {
                                                                                                                                            String str17 = this.oAuthToken;
                                                                                                                                            if (str17 != null ? str17.equals(zzbaVar.oAuthToken()) : zzbaVar.oAuthToken() == null) {
                                                                                                                                                Boolean bool4 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                                if (bool4 != null ? bool4.equals(zzbaVar.omidAdSessionsOnStartedOnly()) : zzbaVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                                    zzsr<String, String> zzsrVar4 = this.platformSignals;
                                                                                                                                                    if (zzsrVar4 != null ? zzsrVar4.equals(zzbaVar.platformSignals()) : zzbaVar.platformSignals() == null) {
                                                                                                                                                        String str18 = this.projectNumber;
                                                                                                                                                        if (str18 != null ? str18.equals(zzbaVar.projectNumber()) : zzbaVar.projectNumber() == null) {
                                                                                                                                                            String str19 = this.region;
                                                                                                                                                            if (str19 != null ? str19.equals(zzbaVar.region()) : zzbaVar.region() == null) {
                                                                                                                                                                ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                                                                if (imaSdkSettings != null ? imaSdkSettings.equals(zzbaVar.settings()) : zzbaVar.settings() == null) {
                                                                                                                                                                    Boolean bool5 = this.supportsExternalNavigation;
                                                                                                                                                                    if (bool5 != null ? bool5.equals(zzbaVar.supportsExternalNavigation()) : zzbaVar.supportsExternalNavigation() == null) {
                                                                                                                                                                        Boolean bool6 = this.supportsIconClickFallback;
                                                                                                                                                                        if (bool6 != null ? bool6.equals(zzbaVar.supportsIconClickFallback()) : zzbaVar.supportsIconClickFallback() == null) {
                                                                                                                                                                            Boolean bool7 = this.supportsNativeNetworking;
                                                                                                                                                                            if (bool7 != null ? bool7.equals(zzbaVar.supportsNativeNetworking()) : zzbaVar.supportsNativeNetworking() == null) {
                                                                                                                                                                                String str20 = this.streamActivityMonitorId;
                                                                                                                                                                                if (str20 != null ? str20.equals(zzbaVar.streamActivityMonitorId()) : zzbaVar.streamActivityMonitorId() == null) {
                                                                                                                                                                                    Boolean bool8 = this.supportsResizing;
                                                                                                                                                                                    if (bool8 != null ? bool8.equals(zzbaVar.supportsResizing()) : zzbaVar.supportsResizing() == null) {
                                                                                                                                                                                        Boolean bool9 = this.useQAStreamBaseUrl;
                                                                                                                                                                                        if (bool9 != null ? bool9.equals(zzbaVar.useQAStreamBaseUrl()) : zzbaVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                            Boolean bool10 = this.usesCustomVideoPlayback;
                                                                                                                                                                                            if (bool10 != null ? bool10.equals(zzbaVar.usesCustomVideoPlayback()) : zzbaVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                                Float f3 = this.vastLoadTimeout;
                                                                                                                                                                                                if (f3 != null ? f3.equals(zzbaVar.vastLoadTimeout()) : zzbaVar.vastLoadTimeout() == null) {
                                                                                                                                                                                                    String str21 = this.videoId;
                                                                                                                                                                                                    if (str21 != null ? str21.equals(zzbaVar.videoId()) : zzbaVar.videoId() == null) {
                                                                                                                                                                                                        zzef zzefVar = this.videoPlayActivation;
                                                                                                                                                                                                        if (zzefVar != null ? zzefVar.equals(zzbaVar.videoPlayActivation()) : zzbaVar.videoPlayActivation() == null) {
                                                                                                                                                                                                            zzeg zzegVar = this.videoContinuousPlay;
                                                                                                                                                                                                            if (zzegVar != null ? zzegVar.equals(zzbaVar.videoContinuousPlay()) : zzbaVar.videoContinuousPlay() == null) {
                                                                                                                                                                                                                zzeh zzehVar = this.videoPlayMuted;
                                                                                                                                                                                                                if (zzehVar != null ? zzehVar.equals(zzbaVar.videoPlayMuted()) : zzbaVar.videoPlayMuted() == null) {
                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> extraParameters() {
        return this.extraParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String format() {
        return this.format;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        int hashCode49;
        zzsr<String, String> zzsrVar = this.adTagParameters;
        int i = 0;
        if (zzsrVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzsrVar.hashCode();
        }
        String str = this.adTagUrl;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str2 = this.adsResponse;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str3 = this.apiKey;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str4 = this.assetKey;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        String str5 = this.authToken;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        zzsr<String, String> zzsrVar2 = this.companionSlots;
        if (zzsrVar2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = zzsrVar2.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        Float f = this.contentDuration;
        if (f == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = f.hashCode();
        }
        int i8 = (i7 ^ hashCode8) * 1000003;
        zzso<String> zzsoVar = this.contentKeywords;
        if (zzsoVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = zzsoVar.hashCode();
        }
        int i9 = (i8 ^ hashCode9) * 1000003;
        String str6 = this.contentSourceUrl;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i10 = (i9 ^ hashCode10) * 1000003;
        String str7 = this.contentTitle;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i11 = (i10 ^ hashCode11) * 1000003;
        String str8 = this.contentUrl;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i12 = (i11 ^ hashCode12) * 1000003;
        String str9 = this.contentSourceId;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i13 = (i12 ^ hashCode13) * 1000003;
        zzaw zzawVar = this.consentSettings;
        if (zzawVar == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = zzawVar.hashCode();
        }
        int i14 = (i13 ^ hashCode14) * 1000003;
        String str10 = this.customAssetKey;
        if (str10 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str10.hashCode();
        }
        int i15 = (i14 ^ hashCode15) * 1000003;
        Boolean bool = this.enableNonce;
        if (bool == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool.hashCode();
        }
        int i16 = (i15 ^ hashCode16) * 1000003;
        String str11 = this.env;
        if (str11 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str11.hashCode();
        }
        int i17 = (i16 ^ hashCode17) * 1000003;
        zzso<zzbo> zzsoVar2 = this.secureSignals;
        if (zzsoVar2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = zzsoVar2.hashCode();
        }
        int i18 = (i17 ^ hashCode18) * 1000003;
        zzsr<String, String> zzsrVar3 = this.extraParameters;
        if (zzsrVar3 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = zzsrVar3.hashCode();
        }
        int i19 = (i18 ^ hashCode19) * 1000003;
        String str12 = this.format;
        if (str12 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str12.hashCode();
        }
        int i20 = (i19 ^ hashCode20) * 1000003;
        zzbc zzbcVar = this.identifierInfo;
        if (zzbcVar == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = zzbcVar.hashCode();
        }
        int i21 = (i20 ^ hashCode21) * 1000003;
        Boolean bool2 = this.isTv;
        if (bool2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool2.hashCode();
        }
        int i22 = (i21 ^ hashCode22) * 1000003;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        if (bool3 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool3.hashCode();
        }
        int i23 = (i22 ^ hashCode23) * 1000003;
        Integer num = this.linearAdSlotWidth;
        if (num == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = num.hashCode();
        }
        int i24 = (i23 ^ hashCode24) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        if (num2 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = num2.hashCode();
        }
        int i25 = (i24 ^ hashCode25) * 1000003;
        String str13 = this.liveStreamEventId;
        if (str13 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str13.hashCode();
        }
        int i26 = (i25 ^ hashCode26) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        if (f2 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = f2.hashCode();
        }
        int i27 = (i26 ^ hashCode27) * 1000003;
        zzeb zzebVar = this.marketAppInfo;
        if (zzebVar == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = zzebVar.hashCode();
        }
        int i28 = (i27 ^ hashCode28) * 1000003;
        String str14 = this.msParameter;
        if (str14 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str14.hashCode();
        }
        int i29 = (i28 ^ hashCode29) * 1000003;
        String str15 = this.network;
        if (str15 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str15.hashCode();
        }
        int i30 = (i29 ^ hashCode30) * 1000003;
        zzbu zzbuVar = this.videoEnvironment;
        if (zzbuVar == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = zzbuVar.hashCode();
        }
        int i31 = (i30 ^ hashCode31) * 1000003;
        String str16 = this.networkCode;
        if (str16 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str16.hashCode();
        }
        int i32 = (i31 ^ hashCode32) * 1000003;
        String str17 = this.oAuthToken;
        if (str17 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str17.hashCode();
        }
        int i33 = (i32 ^ hashCode33) * 1000003;
        Boolean bool4 = this.omidAdSessionsOnStartedOnly;
        if (bool4 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = bool4.hashCode();
        }
        int i34 = (i33 ^ hashCode34) * 1000003;
        zzsr<String, String> zzsrVar4 = this.platformSignals;
        if (zzsrVar4 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = zzsrVar4.hashCode();
        }
        int i35 = (i34 ^ hashCode35) * 1000003;
        String str18 = this.projectNumber;
        if (str18 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = str18.hashCode();
        }
        int i36 = (i35 ^ hashCode36) * 1000003;
        String str19 = this.region;
        if (str19 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = str19.hashCode();
        }
        int i37 = (i36 ^ hashCode37) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        if (imaSdkSettings == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = imaSdkSettings.hashCode();
        }
        int i38 = (i37 ^ hashCode38) * 1000003;
        Boolean bool5 = this.supportsExternalNavigation;
        if (bool5 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = bool5.hashCode();
        }
        int i39 = (i38 ^ hashCode39) * 1000003;
        Boolean bool6 = this.supportsIconClickFallback;
        if (bool6 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = bool6.hashCode();
        }
        int i40 = (i39 ^ hashCode40) * 1000003;
        Boolean bool7 = this.supportsNativeNetworking;
        if (bool7 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = bool7.hashCode();
        }
        int i41 = (i40 ^ hashCode41) * 1000003;
        String str20 = this.streamActivityMonitorId;
        if (str20 == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = str20.hashCode();
        }
        int i42 = (i41 ^ hashCode42) * 1000003;
        Boolean bool8 = this.supportsResizing;
        if (bool8 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = bool8.hashCode();
        }
        int i43 = (i42 ^ hashCode43) * 1000003;
        Boolean bool9 = this.useQAStreamBaseUrl;
        if (bool9 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = bool9.hashCode();
        }
        int i44 = (i43 ^ hashCode44) * 1000003;
        Boolean bool10 = this.usesCustomVideoPlayback;
        if (bool10 == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = bool10.hashCode();
        }
        int i45 = (i44 ^ hashCode45) * 1000003;
        Float f3 = this.vastLoadTimeout;
        if (f3 == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = f3.hashCode();
        }
        int i46 = (i45 ^ hashCode46) * 1000003;
        String str21 = this.videoId;
        if (str21 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = str21.hashCode();
        }
        int i47 = (i46 ^ hashCode47) * 1000003;
        zzef zzefVar = this.videoPlayActivation;
        if (zzefVar == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = zzefVar.hashCode();
        }
        int i48 = (i47 ^ hashCode48) * 1000003;
        zzeg zzegVar = this.videoContinuousPlay;
        if (zzegVar == null) {
            hashCode49 = 0;
        } else {
            hashCode49 = zzegVar.hashCode();
        }
        int i49 = (i48 ^ hashCode49) * 1000003;
        zzeh zzehVar = this.videoPlayMuted;
        if (zzehVar != null) {
            i = zzehVar.hashCode();
        }
        return i49 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzbc identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean isAndroidTvAdsFramework() {
        return this.isAndroidTvAdsFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeb marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzso<zzbo> secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public ImaSdkSettings settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        String valueOf = String.valueOf(this.adTagParameters);
        String str = this.adTagUrl;
        String str2 = this.adsResponse;
        String str3 = this.apiKey;
        String str4 = this.assetKey;
        String str5 = this.authToken;
        String valueOf2 = String.valueOf(this.companionSlots);
        Float f = this.contentDuration;
        String valueOf3 = String.valueOf(this.contentKeywords);
        String str6 = this.contentSourceUrl;
        String str7 = this.contentTitle;
        String str8 = this.contentUrl;
        String str9 = this.contentSourceId;
        String valueOf4 = String.valueOf(this.consentSettings);
        String str10 = this.customAssetKey;
        Boolean bool = this.enableNonce;
        String str11 = this.env;
        String valueOf5 = String.valueOf(this.secureSignals);
        String valueOf6 = String.valueOf(this.extraParameters);
        String str12 = this.format;
        String valueOf7 = String.valueOf(this.identifierInfo);
        Boolean bool2 = this.isTv;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        Integer num = this.linearAdSlotWidth;
        Integer num2 = this.linearAdSlotHeight;
        String str13 = this.liveStreamEventId;
        Float f2 = this.liveStreamPrefetchSeconds;
        String valueOf8 = String.valueOf(this.marketAppInfo);
        String str14 = this.msParameter;
        String str15 = this.network;
        String valueOf9 = String.valueOf(this.videoEnvironment);
        String str16 = this.networkCode;
        String str17 = this.oAuthToken;
        Boolean bool4 = this.omidAdSessionsOnStartedOnly;
        String valueOf10 = String.valueOf(this.platformSignals);
        String str18 = this.projectNumber;
        String str19 = this.region;
        String valueOf11 = String.valueOf(this.settings);
        Boolean bool5 = this.supportsExternalNavigation;
        Boolean bool6 = this.supportsIconClickFallback;
        Boolean bool7 = this.supportsNativeNetworking;
        String str20 = this.streamActivityMonitorId;
        Boolean bool8 = this.supportsResizing;
        Boolean bool9 = this.useQAStreamBaseUrl;
        Boolean bool10 = this.usesCustomVideoPlayback;
        Float f3 = this.vastLoadTimeout;
        String str21 = this.videoId;
        String valueOf12 = String.valueOf(this.videoPlayActivation);
        String valueOf13 = String.valueOf(this.videoContinuousPlay);
        String valueOf14 = String.valueOf(this.videoPlayMuted);
        StringBuilder b = a.b("GsonAdsRequest{adTagParameters=", valueOf, ", adTagUrl=", str, ", adsResponse=");
        com.amazon.aps.iva.m80.a.c(b, str2, ", apiKey=", str3, ", assetKey=");
        com.amazon.aps.iva.m80.a.c(b, str4, ", authToken=", str5, ", companionSlots=");
        b.append(valueOf2);
        b.append(", contentDuration=");
        b.append(f);
        b.append(", contentKeywords=");
        com.amazon.aps.iva.m80.a.c(b, valueOf3, ", contentSourceUrl=", str6, ", contentTitle=");
        com.amazon.aps.iva.m80.a.c(b, str7, ", contentUrl=", str8, ", contentSourceId=");
        com.amazon.aps.iva.m80.a.c(b, str9, ", consentSettings=", valueOf4, ", customAssetKey=");
        b.append(str10);
        b.append(", enableNonce=");
        b.append(bool);
        b.append(", env=");
        com.amazon.aps.iva.m80.a.c(b, str11, ", secureSignals=", valueOf5, ", extraParameters=");
        com.amazon.aps.iva.m80.a.c(b, valueOf6, ", format=", str12, ", identifierInfo=");
        b.append(valueOf7);
        b.append(", isTv=");
        b.append(bool2);
        b.append(", isAndroidTvAdsFramework=");
        b.append(bool3);
        b.append(", linearAdSlotWidth=");
        b.append(num);
        b.append(", linearAdSlotHeight=");
        b.append(num2);
        b.append(", liveStreamEventId=");
        b.append(str13);
        b.append(", liveStreamPrefetchSeconds=");
        b.append(f2);
        b.append(", marketAppInfo=");
        b.append(valueOf8);
        b.append(", msParameter=");
        com.amazon.aps.iva.m80.a.c(b, str14, ", network=", str15, ", videoEnvironment=");
        com.amazon.aps.iva.m80.a.c(b, valueOf9, ", networkCode=", str16, ", oAuthToken=");
        b.append(str17);
        b.append(", omidAdSessionsOnStartedOnly=");
        b.append(bool4);
        b.append(", platformSignals=");
        com.amazon.aps.iva.m80.a.c(b, valueOf10, ", projectNumber=", str18, ", region=");
        com.amazon.aps.iva.m80.a.c(b, str19, ", settings=", valueOf11, ", supportsExternalNavigation=");
        b.append(bool5);
        b.append(", supportsIconClickFallback=");
        b.append(bool6);
        b.append(", supportsNativeNetworking=");
        b.append(bool7);
        b.append(", streamActivityMonitorId=");
        b.append(str20);
        b.append(", supportsResizing=");
        b.append(bool8);
        b.append(", useQAStreamBaseUrl=");
        b.append(bool9);
        b.append(", usesCustomVideoPlayback=");
        b.append(bool10);
        b.append(", vastLoadTimeout=");
        b.append(f3);
        b.append(", videoId=");
        com.amazon.aps.iva.m80.a.c(b, str21, ", videoPlayActivation=", valueOf12, ", videoContinuousPlay=");
        return f.a(b, valueOf13, ", videoPlayMuted=", valueOf14, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeg videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzbu videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzef videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeh videoPlayMuted() {
        return this.videoPlayMuted;
    }
}
