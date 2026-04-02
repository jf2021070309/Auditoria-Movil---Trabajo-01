package com.google.android.gms.cast.tv.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaMetadataModifier {
    private final Map zza = new HashMap();
    private List zzb;
    private Integer zzc;

    public void clear() {
        this.zza.clear();
        this.zzb = null;
    }

    public Calendar getDate(String str) {
        Object obj;
        MediaMetadata.throwIfWrongType(str, 4);
        zzj zzjVar = (zzj) this.zza.get(str);
        Preconditions.checkNotNull(zzjVar);
        obj = zzjVar.zzb;
        return (Calendar) obj;
    }

    public Double getDouble(String str) {
        Object obj;
        MediaMetadata.throwIfWrongType(str, 3);
        zzj zzjVar = (zzj) this.zza.get(str);
        Preconditions.checkNotNull(zzjVar);
        obj = zzjVar.zzb;
        return (Double) obj;
    }

    public List<WebImage> getImages() {
        return this.zzb;
    }

    public Integer getInt(String str) {
        Object obj;
        MediaMetadata.throwIfWrongType(str, 2);
        zzj zzjVar = (zzj) this.zza.get(str);
        Preconditions.checkNotNull(zzjVar);
        obj = zzjVar.zzb;
        return (Integer) obj;
    }

    public Integer getMediaType() {
        return this.zzc;
    }

    public String getString(String str) {
        Object obj;
        MediaMetadata.throwIfWrongType(str, 1);
        zzj zzjVar = (zzj) this.zza.get(str);
        Preconditions.checkNotNull(zzjVar);
        obj = zzjVar.zzb;
        return (String) obj;
    }

    public Long getTimeMillis(String str) {
        Object obj;
        MediaMetadata.throwIfWrongType(str, 5);
        zzj zzjVar = (zzj) this.zza.get(str);
        Preconditions.checkNotNull(zzjVar);
        obj = zzjVar.zzb;
        return (Long) obj;
    }

    public boolean hasOverrideForKey(String str) {
        return this.zza.containsKey(str);
    }

    public MediaMetadataModifier putDate(String str, Calendar calendar) {
        MediaMetadata.throwIfWrongType(str, 4);
        this.zza.put(str, new zzj(4, calendar));
        return this;
    }

    public MediaMetadataModifier putDouble(String str, Double d) {
        MediaMetadata.throwIfWrongType(str, 3);
        this.zza.put(str, new zzj(3, d));
        return this;
    }

    public MediaMetadataModifier putInt(String str, Integer num) {
        MediaMetadata.throwIfWrongType(str, 2);
        this.zza.put(str, new zzj(2, num));
        return this;
    }

    public MediaMetadataModifier putString(String str, String str2) {
        MediaMetadata.throwIfWrongType(str, 1);
        this.zza.put(str, new zzj(1, str2));
        return this;
    }

    public MediaMetadataModifier putTimeMillis(String str, Long l) {
        MediaMetadata.throwIfWrongType(str, 5);
        this.zza.put(str, new zzj(5, l));
        return this;
    }

    public MediaMetadataModifier removeOverride(String str) {
        this.zza.remove(str);
        return this;
    }

    public MediaMetadataModifier setImages(List<WebImage> list) {
        this.zzb = list;
        return this;
    }

    public MediaMetadataModifier setMediaType(Integer num) {
        this.zzc = num;
        return this;
    }

    public final void zza(MediaMetadata mediaMetadata) {
        int i;
        Object obj;
        Integer num = this.zzc;
        if (num != null) {
            mediaMetadata.getWriter().setMediaType(num.intValue());
        }
        for (Map.Entry entry : this.zza.entrySet()) {
            String str = (String) entry.getKey();
            i = ((zzj) entry.getValue()).zza;
            obj = ((zzj) entry.getValue()).zzb;
            if (obj == null) {
                mediaMetadata.getWriter().remove(str);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            mediaMetadata.putTimeMillis(str, ((Long) obj).longValue());
                        } else {
                            mediaMetadata.putDate(str, (Calendar) obj);
                        }
                    } else {
                        mediaMetadata.putDouble(str, ((Double) obj).doubleValue());
                    }
                } else {
                    mediaMetadata.putInt(str, ((Integer) obj).intValue());
                }
            } else {
                mediaMetadata.putString(str, (String) obj);
            }
        }
        List<WebImage> list = this.zzb;
        if (list != null) {
            mediaMetadata.clearImages();
            for (WebImage webImage : list) {
                mediaMetadata.addImage(webImage);
            }
        }
    }

    public final void zzb(MediaMetadata mediaMetadata) {
        clear();
        this.zzc = Integer.valueOf(mediaMetadata.getMediaType());
        for (String str : mediaMetadata.keySet()) {
            int typeForKey = MediaMetadata.getTypeForKey(str);
            if (typeForKey != 0) {
                if (typeForKey != 1) {
                    if (typeForKey != 2) {
                        if (typeForKey != 3) {
                            if (typeForKey != 4) {
                                if (typeForKey == 5) {
                                    putTimeMillis(str, Long.valueOf(mediaMetadata.getTimeMillis(str)));
                                }
                            } else {
                                putDate(str, mediaMetadata.getDate(str));
                            }
                        } else {
                            putDouble(str, Double.valueOf(mediaMetadata.getDouble(str)));
                        }
                    } else {
                        putInt(str, Integer.valueOf(mediaMetadata.getInt(str)));
                    }
                } else {
                    putString(str, mediaMetadata.getString(str));
                }
            } else {
                Object rawValue = mediaMetadata.getWriter().getRawValue(str);
                if (rawValue != null) {
                    if (rawValue instanceof String) {
                        putString(str, (String) rawValue);
                    } else if (rawValue instanceof Integer) {
                        putInt(str, (Integer) rawValue);
                    } else if (rawValue instanceof Double) {
                        putDouble(str, (Double) rawValue);
                    }
                }
            }
        }
        if (!mediaMetadata.getImages().isEmpty()) {
            setImages(mediaMetadata.getImages());
        }
    }
}
