package ph.gcash.cadet.stan.mamala.notella.database;

import java.lang.System;

@androidx.room.Database(entities = {ph.gcash.cadet.stan.mamala.notella.entities.Notes.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lph/gcash/cadet/stan/mamala/notella/database/NotesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "Lph/gcash/cadet/stan/mamala/notella/dao/NoteDao;", "Companion", "app_debug"})
public abstract class NotesDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable()
    private static ph.gcash.cadet.stan.mamala.notella.database.NotesDatabase notesDatabase;
    public static final ph.gcash.cadet.stan.mamala.notella.database.NotesDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ph.gcash.cadet.stan.mamala.notella.dao.NoteDao noteDao();
    
    public NotesDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lph/gcash/cadet/stan/mamala/notella/database/NotesDatabase$Companion;", "", "()V", "notesDatabase", "Lph/gcash/cadet/stan/mamala/notella/database/NotesDatabase;", "getNotesDatabase", "()Lph/gcash/cadet/stan/mamala/notella/database/NotesDatabase;", "setNotesDatabase", "(Lph/gcash/cadet/stan/mamala/notella/database/NotesDatabase;)V", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final ph.gcash.cadet.stan.mamala.notella.database.NotesDatabase getNotesDatabase() {
            return null;
        }
        
        public final void setNotesDatabase(@org.jetbrains.annotations.Nullable()
        ph.gcash.cadet.stan.mamala.notella.database.NotesDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized ph.gcash.cadet.stan.mamala.notella.database.NotesDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}