package com.sun.java.swing.plaf.gtk.resources;

import java.util.ListResourceBundle;

/**
 * <p>An extra resource bundle for the GTK+ Look and Feel with "en" locale.
 * Contains keys that were not defined by the original default resource bundle,
 * though used by GTK+ in OpenJDK 8, so having been assigned arbitrarily
 * here.</p>
 * 
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class gtk_en extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // extra items that were not present in the original
            // com.sun.java.swing.plaf.gtk.resources.gtk class, though used by
            // com.sun.java.swing.plaf.gtk.GTKFileChooserUI class
            { "FileChooser.newFolderButtonToolTip.textAndMnemonic", "Create a new folder in the currently selected one" },
            { "FileChooser.deleteFileButtonToolTip.textAndMnemonic", "Delete currently selected file" },
            { "FileChooser.renameFileButtonToolTip.textAndMnemonic", "Rename currently selected file" },
        };
    }
}
