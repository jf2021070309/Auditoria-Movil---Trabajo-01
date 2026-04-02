package gonemad.gmmp.audioengine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c.i.g.b;
import e.h.g.j1;
import e.h.g.s1;
import java.util.Objects;
/* loaded from: classes2.dex */
public class Tag {
    public static final int AUDIO_CODEC_AAC = 0;
    public static final int AUDIO_CODEC_ALAC = 1;
    public static final int AUDIO_CODEC_TYPE_FLAC = 4;
    public static final int AUDIO_CODEC_TYPE_OPUS = 3;
    public static final int AUDIO_CODEC_TYPE_VORBIS = 2;
    public static final int AUDIO_CODEC_UNKNOWN = -1;
    private static final String TAG = "Tag";
    private static boolean sSetup;
    private String m_Album;
    private String m_AlbumArtist;
    private String m_Artist;
    private int m_Bitrate;
    private int m_Channels;
    private String m_Comment;
    private String m_Composer;
    private String m_Cuesheet;
    private int m_DiscNumber;
    private boolean m_FieldsChanged;
    private Integer m_FileDescriptor;
    private String m_FileType;
    private String m_Filename;
    private String m_Genre;
    private boolean m_HasAlbumArt;
    private boolean m_IsValid;
    private int m_Length;
    private String m_Lyrics;
    private int m_Rating;
    private int m_SampleRate;
    private long m_StreamContext;
    private long m_TagContext;
    private String m_TrackName;
    private int m_TrackNo;
    private int m_Year;

    public Tag(int i2, String str) {
        this(i2, str, false);
    }

    public Tag(int i2, String str, boolean z) {
        this.m_Album = "";
        this.m_AlbumArtist = "";
        this.m_Artist = "";
        this.m_Comment = "";
        this.m_Composer = "";
        this.m_Cuesheet = "";
        this.m_Filename = "";
        this.m_Genre = "";
        this.m_IsValid = false;
        this.m_Lyrics = "";
        this.m_TrackName = "";
        ensureSetup();
        this.m_FileDescriptor = Integer.valueOf(i2);
        this.m_FileType = str;
        scanFD(i2, str, z);
        this.m_FieldsChanged = false;
    }

    public Tag(String str) {
        this(str, false);
        Object obj = j1.a;
    }

    public Tag(String str, boolean z) {
        this.m_Album = "";
        this.m_AlbumArtist = "";
        this.m_Artist = "";
        this.m_Comment = "";
        this.m_Composer = "";
        this.m_Cuesheet = "";
        this.m_Filename = "";
        this.m_Genre = "";
        this.m_IsValid = false;
        this.m_Lyrics = "";
        this.m_TrackName = "";
        ensureSetup();
        Objects.requireNonNull(str, "Filename is null");
        this.m_Filename = str;
        this.m_FileDescriptor = null;
        scan(str, z);
        this.m_FieldsChanged = false;
    }

    private native boolean commit(String str);

    private native boolean commitFD(int i2, String str);

    private static void ensureSetup() {
        if (sSetup) {
            return;
        }
        try {
            AudioEngine.setup(true);
            AudioEngine.loadLibraries();
            sSetup = true;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
            Objects.requireNonNull(b.f2069b);
        }
    }

    private native byte[] getAlbumArt(String str);

    public static int getAudioCodec(String str) {
        ensureSetup();
        return getAudioCodecType(str);
    }

    private static native int getAudioCodecType(String str);

    private native boolean hasAlbumArt(String str);

    private native void scan(String str, boolean z);

    private native void scanFD(int i2, String str, boolean z);

    public native void close();

    public void finalize() {
        try {
            super.finalize();
            close();
        } catch (Throwable unused) {
        }
    }

    public String getAlbum() {
        return this.m_Album;
    }

    public Bitmap getAlbumArt() {
        try {
            byte[] albumArt = getAlbumArt(this.m_Filename);
            if (albumArt != null) {
                return BitmapFactory.decodeByteArray(albumArt, 0, albumArt.length);
            }
            return null;
        } catch (Exception e2) {
            s1.l(e2, true);
            return null;
        } catch (OutOfMemoryError e3) {
            s1.l(e3, true);
            return null;
        }
    }

    public byte[] getAlbumArtRaw() {
        return getAlbumArt(this.m_Filename);
    }

    public String getAlbumArtist() {
        return this.m_AlbumArtist;
    }

    public String getArtist() {
        return this.m_Artist;
    }

    public int getBitrate() {
        return this.m_Bitrate;
    }

    public int getChannelCount() {
        return this.m_Channels;
    }

    public String getComment() {
        return this.m_Comment;
    }

    public String getComposer() {
        return this.m_Composer;
    }

    public String getCuesheet() {
        return this.m_Cuesheet;
    }

    public Integer getDiscNumber() {
        int i2 = this.m_DiscNumber;
        if (i2 == -1) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public String getFilename() {
        return this.m_Filename;
    }

    public String getGenre() {
        return this.m_Genre;
    }

    public int getLength() {
        return this.m_Length;
    }

    public String getLyrics() {
        return this.m_Lyrics;
    }

    public int getRating() {
        return Math.max(this.m_Rating, 0);
    }

    public int getSampleRate() {
        return this.m_SampleRate;
    }

    public String getTrackName() {
        return this.m_TrackName;
    }

    public int getTrackNo() {
        return this.m_TrackNo;
    }

    public int getYear() {
        return this.m_Year;
    }

    public boolean hasAlbumArt() {
        return this.m_HasAlbumArt;
    }

    public boolean isValid() {
        return this.m_IsValid;
    }

    public boolean save() {
        if (this.m_FieldsChanged) {
            Integer num = this.m_FileDescriptor;
            return num == null ? commit(this.m_Filename) : commitFD(num.intValue(), this.m_FileType);
        }
        return false;
    }

    public void setAlbum(String str) {
        this.m_Album = str;
        this.m_FieldsChanged = true;
    }

    public void setAlbumArtist(String str) {
        this.m_AlbumArtist = str;
        this.m_FieldsChanged = true;
    }

    public void setArtist(String str) {
        this.m_Artist = str;
        this.m_FieldsChanged = true;
    }

    public void setComment(String str) {
        this.m_Comment = str;
        this.m_FieldsChanged = true;
    }

    public void setDiscNumber(int i2) {
        this.m_DiscNumber = i2;
        this.m_FieldsChanged = true;
    }

    public void setGenre(String str) {
        this.m_Genre = str;
        this.m_FieldsChanged = true;
    }

    public void setRating(int i2) {
        this.m_Rating = i2;
        this.m_FieldsChanged = true;
    }

    public void setTrackName(String str) {
        this.m_TrackName = str;
        this.m_FieldsChanged = true;
    }

    public void setTrackNo(int i2) {
        this.m_TrackNo = i2;
        this.m_FieldsChanged = true;
    }

    public void setYear(int i2) {
        this.m_Year = i2;
        this.m_FieldsChanged = true;
    }
}
