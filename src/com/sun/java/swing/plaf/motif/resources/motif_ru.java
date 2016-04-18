/* This file is encoded as UTF-8 */

package com.sun.java.swing.plaf.motif.resources;

import java.util.ListResourceBundle;

/**
 * <p>Resource bundle for the Motif Look and Feel with "ru" locale.</p>
 * <p>Composed using "motif.properties" and "motif_ja.properties" files from
 * "com.sun.java.swing.plaf.motif.resources" package of OpenJDK 8 as
 * prototypes.</p>
 * <p>Currently, the following components need this for support:</p>
 * <ul>
 * <li>FileChooser</li>
 * </ul>
 * <p>MNEMONIC NOTE</p>
 * <p>Refer to the note in basic_ru.java for a description as to what the
 * mnemonics correspond to and how to calculate them.</p>
 * 
 * @author Steve Wilson
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class motif_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // ############ FILE CHOOSER STRINGS #############
//            { "FileChooser.acceptAllFileFilter.textAndMnemonic", "*" }, // *
            { "FileChooser.cancelButton.textAndMnemonic", "Отмена" }, // Cancel
            { "FileChooser.saveButton.textAndMnemonic", "Сохранить" }, // Save
            { "FileChooser.openButton.textAndMnemonic", "Открыть" }, // OK
            { "FileChooser.saveDialogTitle.textAndMnemonic", "Сохранить" }, // Save
            { "FileChooser.openDialogTitle.textAndMnemonic", "Открыть" }, // Open
            { "FileChooser.updateButton.textAndMnemonic", "Обновить" }, // Update
            { "FileChooser.helpButton.textAndMnemonic", "Помощь" }, // Help
            { "FileChooser.pathLabel.textAndMnemonic", "Введите путь или название папки (&P):" }, // Enter &path or folder name:
            { "FileChooser.filterLabel.textAndMnemonic", "Тип файла (&R)" }, // Filte&r
            { "FileChooser.foldersLabel.textAndMnemonic", "Папки (&L)" }, // Fo&lders
            { "FileChooser.filesLabel.textAndMnemonic", "Файлы (&I)" }, // F&iles
            { "FileChooser.enterFileNameLabel.textAndMnemonic", "Введите имя файла (&N):" }, // E&nter file name:
            { "FileChooser.enterFolderNameLabel.textAndMnemonic", "Введите имя папки:" }, // Enter folder name:

            { "FileChooser.cancelButtonToolTip.textAndMnemonic", "Отменить выбор файла." }, // Abort file chooser dialog.
            { "FileChooser.saveButtonToolTip.textAndMnemonic", "Сохранить выбранный файл." }, // Save selected file.
            { "FileChooser.openButtonToolTip.textAndMnemonic", "Открыть выбранный файл." }, // Open selected file.
            { "FileChooser.updateButtonToolTip.textAndMnemonic", "Обновить содержимое каталога." }, // Update directory listing.
            { "FileChooser.helpButtonToolTip.textAndMnemonic", "Вызов справки." }, // FileChooser help.
        };
    }
}
