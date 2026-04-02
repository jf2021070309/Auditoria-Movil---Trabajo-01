package e.a.c;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.provider.MediaStore;
import android.util.SparseIntArray;
import android.widget.SectionIndexer;
import ch.qos.logback.classic.Level;
import java.text.Collator;
/* loaded from: classes.dex */
public class m6 extends DataSetObserver implements SectionIndexer {
    public final CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public int f5122b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f5123c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f5124d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f5125e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5126f;

    /* renamed from: g  reason: collision with root package name */
    public final Collator f5127g;

    public m6(Cursor cursor, int i2, CharSequence charSequence) {
        this.f5123c = cursor;
        this.f5122b = i2;
        this.a = charSequence;
        int length = charSequence.length();
        this.f5126f = length;
        this.f5125e = new String[length];
        for (int i3 = 0; i3 < this.f5126f; i3++) {
            this.f5125e[i3] = Character.toString(this.a.charAt(i3));
        }
        this.f5124d = new SparseIntArray(this.f5126f);
        if (cursor != null) {
            cursor.registerDataSetObserver(this);
        }
        Collator collator = Collator.getInstance();
        this.f5127g = collator;
        collator.setStrength(0);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i2) {
        int i3;
        int i4;
        SparseIntArray sparseIntArray = this.f5124d;
        Cursor cursor = this.f5123c;
        if (cursor == null || this.a == null || i2 <= 0) {
            return 0;
        }
        int i5 = this.f5126f;
        if (i2 >= i5) {
            i2 = i5 - 1;
        }
        int position = cursor.getPosition();
        int count = cursor.getCount();
        try {
            char charAt = this.a.charAt(i2);
            String ch2 = Character.toString(charAt);
            int i6 = sparseIntArray.get(charAt, Level.ALL_INT);
            if (Integer.MIN_VALUE == i6) {
                i3 = count;
            } else if (i6 >= 0) {
                return i6;
            } else {
                i3 = -i6;
            }
            int abs = (i2 <= 0 || (i4 = sparseIntArray.get(this.a.charAt(i2 + (-1)), Level.ALL_INT)) == Integer.MIN_VALUE) ? 0 : Math.abs(i4);
            int i7 = (i3 + abs) / 2;
            while (i7 < i3) {
                cursor.moveToPosition(i7);
                String string = cursor.getString(this.f5122b);
                if (string != null) {
                    String keyFor = MediaStore.Audio.keyFor(string);
                    int compareTo = keyFor.startsWith(ch2) ? 0 : keyFor.compareTo(MediaStore.Audio.keyFor(ch2));
                    if (compareTo == 0) {
                        if (abs == i7) {
                            break;
                        }
                    } else if (compareTo < 0) {
                        int i8 = i7 + 1;
                        if (i8 >= count) {
                            break;
                        }
                        abs = i8;
                        i7 = (abs + i3) / 2;
                    }
                    i3 = i7;
                    i7 = (abs + i3) / 2;
                } else if (i7 == 0) {
                    break;
                } else {
                    i7--;
                }
            }
            count = i7;
            sparseIntArray.put(charAt, count);
            cursor.moveToPosition(position);
            return count;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i2) {
        for (int i3 = 0; i3 < this.f5125e.length; i3++) {
            if (getPositionForSection(i3) >= i2) {
                return i3;
            }
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return this.f5125e;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        this.f5124d.clear();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        this.f5124d.clear();
    }
}
