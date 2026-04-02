package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "TextTrackStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final int COLOR_UNSPECIFIED = 0;
    @KeepForSdk
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new zzds();
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;
    @SafeParcelable.Field(id = 13)
    String zza;
    @SafeParcelable.Field(getter = "getFontScale", id = 2)
    private float zzb;
    @SafeParcelable.Field(getter = "getForegroundColor", id = 3)
    private int zzc;
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 4)
    private int zzd;
    @SafeParcelable.Field(getter = "getEdgeType", id = 5)
    private int zze;
    @SafeParcelable.Field(getter = "getEdgeColor", id = 6)
    private int zzf;
    @SafeParcelable.Field(getter = "getWindowType", id = 7)
    private int zzg;
    @SafeParcelable.Field(getter = "getWindowColor", id = 8)
    private int zzh;
    @SafeParcelable.Field(getter = "getWindowCornerRadius", id = 9)
    private int zzi;
    @SafeParcelable.Field(getter = "getFontFamily", id = 10)
    private String zzj;
    @SafeParcelable.Field(getter = "getFontGenericFamily", id = 11)
    private int zzk;
    @SafeParcelable.Field(getter = "getFontStyle", id = 12)
    private int zzl;
    private c zzm;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    @TargetApi(19)
    public static TextTrackStyle fromSystemSettings(Context context) {
        CaptioningManager captioningManager;
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (PlatformVersion.isAtLeastKitKat() && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null) {
            textTrackStyle.setFontScale(captioningManager.getFontScale());
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            textTrackStyle.setBackgroundColor(userStyle.backgroundColor);
            textTrackStyle.setForegroundColor(userStyle.foregroundColor);
            int i = userStyle.edgeType;
            if (i != 1) {
                if (i != 2) {
                    textTrackStyle.setEdgeType(0);
                } else {
                    textTrackStyle.setEdgeType(2);
                }
            } else {
                textTrackStyle.setEdgeType(1);
            }
            textTrackStyle.setEdgeColor(userStyle.edgeColor);
            Typeface typeface = userStyle.getTypeface();
            if (typeface != null) {
                if (Typeface.MONOSPACE.equals(typeface)) {
                    textTrackStyle.setFontGenericFamily(1);
                } else if (Typeface.SANS_SERIF.equals(typeface)) {
                    textTrackStyle.setFontGenericFamily(0);
                } else if (Typeface.SERIF.equals(typeface)) {
                    textTrackStyle.setFontGenericFamily(2);
                } else {
                    textTrackStyle.setFontGenericFamily(0);
                }
                boolean isBold = typeface.isBold();
                boolean isItalic = typeface.isItalic();
                if (isBold && isItalic) {
                    textTrackStyle.setFontStyle(3);
                } else if (isBold) {
                    textTrackStyle.setFontStyle(1);
                } else if (isItalic) {
                    textTrackStyle.setFontStyle(2);
                } else {
                    textTrackStyle.setFontStyle(0);
                }
            }
        }
        return textTrackStyle;
    }

    private static final int zzb(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    private static final String zzc(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        c cVar = this.zzm;
        if (cVar != null) {
            z = false;
        } else {
            z = true;
        }
        c cVar2 = textTrackStyle.zzm;
        if (cVar2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((cVar == null || cVar2 == null || JsonUtils.areJsonValuesEquivalent(cVar, cVar2)) && this.zzb == textTrackStyle.zzb && this.zzc == textTrackStyle.zzc && this.zzd == textTrackStyle.zzd && this.zze == textTrackStyle.zze && this.zzf == textTrackStyle.zzf && this.zzg == textTrackStyle.zzg && this.zzh == textTrackStyle.zzh && this.zzi == textTrackStyle.zzi && CastUtils.zze(this.zzj, textTrackStyle.zzj) && this.zzk == textTrackStyle.zzk && this.zzl == textTrackStyle.zzl) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public void fromJson(c cVar) throws b {
        this.zzb = (float) cVar.optDouble("fontScale", 1.0d);
        this.zzc = zzb(cVar.optString("foregroundColor"));
        this.zzd = zzb(cVar.optString("backgroundColor"));
        if (cVar.has("edgeType")) {
            String string = cVar.getString("edgeType");
            if ("NONE".equals(string)) {
                this.zze = 0;
            } else if ("OUTLINE".equals(string)) {
                this.zze = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.zze = 2;
            } else if ("RAISED".equals(string)) {
                this.zze = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.zze = 4;
            }
        }
        this.zzf = zzb(cVar.optString("edgeColor"));
        if (cVar.has("windowType")) {
            String string2 = cVar.getString("windowType");
            if ("NONE".equals(string2)) {
                this.zzg = 0;
            } else if ("NORMAL".equals(string2)) {
                this.zzg = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.zzg = 2;
            }
        }
        this.zzh = zzb(cVar.optString("windowColor"));
        if (this.zzg == 2) {
            this.zzi = cVar.optInt("windowRoundedCornerRadius", 0);
        }
        this.zzj = CastUtils.optStringOrNull(cVar, "fontFamily");
        if (cVar.has("fontGenericFamily")) {
            String string3 = cVar.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.zzk = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.zzk = 1;
            } else if ("SERIF".equals(string3)) {
                this.zzk = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.zzk = 3;
            } else if ("CASUAL".equals(string3)) {
                this.zzk = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.zzk = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.zzk = 6;
            }
        }
        if (cVar.has("fontStyle")) {
            String string4 = cVar.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.zzl = 0;
            } else if ("BOLD".equals(string4)) {
                this.zzl = 1;
            } else if ("ITALIC".equals(string4)) {
                this.zzl = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.zzl = 3;
            }
        }
        this.zzm = cVar.optJSONObject("customData");
    }

    public int getBackgroundColor() {
        return this.zzd;
    }

    public c getCustomData() {
        return this.zzm;
    }

    public int getEdgeColor() {
        return this.zzf;
    }

    public int getEdgeType() {
        return this.zze;
    }

    public String getFontFamily() {
        return this.zzj;
    }

    public int getFontGenericFamily() {
        return this.zzk;
    }

    public float getFontScale() {
        return this.zzb;
    }

    public int getFontStyle() {
        return this.zzl;
    }

    public int getForegroundColor() {
        return this.zzc;
    }

    public int getWindowColor() {
        return this.zzh;
    }

    public int getWindowCornerRadius() {
        return this.zzi;
    }

    public int getWindowType() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), String.valueOf(this.zzm));
    }

    public void setBackgroundColor(int i) {
        this.zzd = i;
    }

    public void setCustomData(c cVar) {
        this.zzm = cVar;
    }

    public void setEdgeColor(int i) {
        this.zzf = i;
    }

    public void setEdgeType(int i) {
        if (i >= 0 && i <= 4) {
            this.zze = i;
            return;
        }
        throw new IllegalArgumentException("invalid edgeType");
    }

    public void setFontFamily(String str) {
        this.zzj = str;
    }

    public void setFontGenericFamily(int i) {
        if (i >= 0 && i <= 6) {
            this.zzk = i;
            return;
        }
        throw new IllegalArgumentException("invalid fontGenericFamily");
    }

    public void setFontScale(float f) {
        this.zzb = f;
    }

    public void setFontStyle(int i) {
        if (i >= 0 && i <= 3) {
            this.zzl = i;
            return;
        }
        throw new IllegalArgumentException("invalid fontStyle");
    }

    public void setForegroundColor(int i) {
        this.zzc = i;
    }

    public void setWindowColor(int i) {
        this.zzh = i;
    }

    public void setWindowCornerRadius(int i) {
        if (i >= 0) {
            this.zzi = i;
            return;
        }
        throw new IllegalArgumentException("invalid windowCornerRadius");
    }

    public void setWindowType(int i) {
        if (i >= 0 && i <= 2) {
            this.zzg = i;
            return;
        }
        throw new IllegalArgumentException("invalid windowType");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzm;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zza = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, getFontScale());
        SafeParcelWriter.writeInt(parcel, 3, getForegroundColor());
        SafeParcelWriter.writeInt(parcel, 4, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 5, getEdgeType());
        SafeParcelWriter.writeInt(parcel, 6, getEdgeColor());
        SafeParcelWriter.writeInt(parcel, 7, getWindowType());
        SafeParcelWriter.writeInt(parcel, 8, getWindowColor());
        SafeParcelWriter.writeInt(parcel, 9, getWindowCornerRadius());
        SafeParcelWriter.writeString(parcel, 10, getFontFamily(), false);
        SafeParcelWriter.writeInt(parcel, 11, getFontGenericFamily());
        SafeParcelWriter.writeInt(parcel, 12, getFontStyle());
        SafeParcelWriter.writeString(parcel, 13, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            cVar.put("fontScale", this.zzb);
            int i = this.zzc;
            if (i != 0) {
                cVar.put("foregroundColor", zzc(i));
            }
            int i2 = this.zzd;
            if (i2 != 0) {
                cVar.put("backgroundColor", zzc(i2));
            }
            int i3 = this.zze;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                cVar.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            cVar.put("edgeType", "RAISED");
                        }
                    } else {
                        cVar.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    cVar.put("edgeType", "OUTLINE");
                }
            } else {
                cVar.put("edgeType", "NONE");
            }
            int i4 = this.zzf;
            if (i4 != 0) {
                cVar.put("edgeColor", zzc(i4));
            }
            int i5 = this.zzg;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        cVar.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    cVar.put("windowType", "NORMAL");
                }
            } else {
                cVar.put("windowType", "NONE");
            }
            int i6 = this.zzh;
            if (i6 != 0) {
                cVar.put("windowColor", zzc(i6));
            }
            if (this.zzg == 2) {
                cVar.put("windowRoundedCornerRadius", this.zzi);
            }
            String str = this.zzj;
            if (str != null) {
                cVar.put("fontFamily", str);
            }
            switch (this.zzk) {
                case 0:
                    cVar.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    cVar.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    cVar.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    cVar.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    cVar.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    cVar.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    cVar.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i7 = this.zzl;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            cVar.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        cVar.put("fontStyle", "ITALIC");
                    }
                } else {
                    cVar.put("fontStyle", "BOLD");
                }
            } else {
                cVar.put("fontStyle", "NORMAL");
            }
            c cVar2 = this.zzm;
            if (cVar2 != null) {
                cVar.put("customData", cVar2);
            }
        } catch (b unused) {
        }
        return cVar;
    }

    @SafeParcelable.Constructor
    public TextTrackStyle(@SafeParcelable.Param(id = 2) float f, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) int i6, @SafeParcelable.Param(id = 9) int i7, @SafeParcelable.Param(id = 10) String str, @SafeParcelable.Param(id = 11) int i8, @SafeParcelable.Param(id = 12) int i9, @SafeParcelable.Param(id = 13) String str2) {
        this.zzb = f;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = i6;
        this.zzi = i7;
        this.zzj = str;
        this.zzk = i8;
        this.zzl = i9;
        this.zza = str2;
        if (str2 == null) {
            this.zzm = null;
            return;
        }
        try {
            this.zzm = new c(str2);
        } catch (b unused) {
            this.zzm = null;
            this.zza = null;
        }
    }
}
